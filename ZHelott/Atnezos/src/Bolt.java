import java.util.*;

public class Bolt extends Vallalkozas {

    private final boolean nagyE;
    private Map<Termek, Integer> keszlet;


    public Bolt(boolean nagyE) {
        this.nagyE = nagyE;
    }

    public Integer[] termekLekerdezes(String mit) {
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            if (termek.getKey().getNeve().equals(mit)) return new Integer[]{termek.getKey().getAr(), termek.getValue()};
        }
        return new Integer[]{null, null};
    }

    public void brszallitas(String mit, int mennyit) {
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            if (termek.getKey().getNeve().equals(mit)) {
                termek.setValue(termek.getValue() + mennyit);
                return;
            }
        }
        keszlet.put(new Termek(mit, 1000), mennyit);
    }

    public void arModositas(String minek, int minimum, int ajanlott) {
        for (Map.Entry<Termek, Integer> termek : keszlet.entrySet()) {
            if (termek.getKey().getNeve().equals(minek)) {
                termek.getKey().setAr(this.nagyE ? minimum : ajanlott);
            }
        }
    }

    public String[] listaz(boolean arAlapjan) {
        List<Termek> rendezett = new ArrayList<>(keszlet.keySet());
        if (arAlapjan) {
            rendezett.sort(Termek.ArRendezo);
        } else {
            Collections.sort(rendezett);
        }
        String[] nevek = new String[rendezett.size()];
        for (int i = 0; i < nevek.length; i++) {
            nevek[i] = rendezett.get(i).getNeve();
        }
        return nevek;
    }

    public boolean eladas(Vasarlo ki, Map<String, Integer> kosar) {
        int osszertek = 0;
        return false;
    }


    public static class Termek implements Comparable<Termek> {

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

        public static Comparator<Termek> ArRendezo = Comparator.comparing(Termek::getAr);
    }
}
