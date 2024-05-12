import java.util.*;

public class Bolt extends Vallalkozas {

    private final boolean nagyE;
    private Map<Termek, Integer> keszlet = new TreeMap<>(); //  termék és mennyiség

    public Bolt(boolean nagyE) {
        this.nagyE = nagyE;
    }

    public Integer[] getTermek(String keresendo) {
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            if (termek.getKey().getNeve().equals(keresendo))
                return new Integer[]{termek.getKey().getAr(), termek.getValue()};
        }
        return new Integer[]{null, null};
    }

    public void beszallitas(String neve, int mennyit) {

        Iterator<Map.Entry<Termek, Integer>> it = keszlet.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Termek, Integer> termek = it.next();
            if (termek.getKey().getNeve().equals(neve)) {
                termek.setValue(termek.getValue() + mennyit);
                return;
            }
        }
        keszlet.put(new Termek(neve, 1000), mennyit);
    }

    public void arvaltozas(String neve, int minimum, int ajanlott) {

        int ujAr = this.nagyE ? minimum : ajanlott;

        Iterator<Map.Entry<Termek, Integer>> it = keszlet.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Termek, Integer> termek = it.next();
            if (termek.getKey().getNeve().equals(neve)) {
                if (termek.getValue() > 0) termek.getKey().setAr(ujAr);
                return;
            }
        }

    }

    public String[] listaz(boolean arAlapjan) {
        List<Termek> rendezett = new ArrayList<>(keszlet.keySet());
        if (arAlapjan) {
            rendezett.sort(Termek.arRendezo);
        } else {
            Collections.sort(rendezett);
        }
        String[] nevek = new String[rendezett.size()];
        for (int i = 0; i < rendezett.size(); i++) {
            nevek[i] = rendezett.get(i).getNeve();
        }
        return nevek;
    }

    public boolean eladas (Vasarlo ki, Map<String, Integer> kosar) {

        int osszAr = 0;
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            for (Map.Entry<String, Integer> kosarbeli : kosar.entrySet()) {
                if (termek.getKey().getNeve().equals(kosarbeli.getKey())) {
                    osszAr += termek.getKey().getAr() * (kosarbeli.getValue() > termek.getValue() ? termek.getValue() : kosarbeli.getValue());
                    break;
                }
            }
        }

        if (osszAr > ki.getPenz()) return false;

        boolean siker = true;
        int vetelAr = 0;
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            for (Map.Entry<String, Integer> kosarbeli : kosar.entrySet()) {
                if (termek.getKey().getNeve().equals(kosarbeli.getKey())) {
                    if (kosarbeli.getValue() <= termek.getValue()) {
                        termek.setValue(termek.getValue() - kosarbeli.getValue());
                        vetelAr += termek.getKey().getAr() * kosarbeli.getValue();
                    } else siker = false;
                    break;
                }
            }
        }
        ki.penztKolt(vetelAr);
        return siker;
    }


    //  belső osztályra is szükség van
    private static class Termek implements Comparable<Termek> {
        private final String neve;
        private int ar;


        public Termek(String neve, int ar) {
            this.neve = neve;
            this.ar = ar;
        }

        public String getNeve() {
            return neve;
        }

        public int getAr() {
            return ar;
        }

        public void setAr(int ar) {
            this.ar = ar;
        }

        @Override
        public int compareTo(Termek o) {
            return this.neve.compareTo(o.getNeve());
        }

        public static Comparator<Termek> arRendezo = Comparator.comparingInt(t -> t.ar);

    }

}