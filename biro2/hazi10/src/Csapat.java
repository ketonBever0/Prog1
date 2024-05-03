import java.io.*;
import java.util.*;

public class Csapat {

    private String neve;
    private Map<String, List<Jatekos>> jatekosok;
    private static String poziciok = "Starting Pitcher, First Baseman, Shortstop, Third Baseman, Designated Hitter, Catcher, Second Baseman, Relief Pitcher, Outfielder";


    public Csapat(String neve) {
        this.neve = neve;
        this.jatekosok = new TreeMap<>();
    }

    public String getNeve() {
        return neve;
    }

    public Map<String, List<Jatekos>> getJatekosok() {
        return jatekosok;
    }

    public void setJatekosok(Map<String, List<Jatekos>> jatekosok) {
        this.jatekosok = jatekosok;
    }

    public void beolvas(File fajlnev) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fajlnev));
            String sor = br.readLine();

            while (sor != null) {
                String[] mezok = sor.split(";");

                if (this.jatekosok.containsKey(mezok[1])) {
                    this.jatekosok.get(mezok[1]).add(new Jatekos(mezok[0], Integer.parseInt(mezok[2]), Integer.parseInt(mezok[3]), Integer.parseInt(mezok[4])));
                } else {
                    this.jatekosok.put(mezok[1], new ArrayList<>());
                    this.jatekosok.get(mezok[1]).add(new Jatekos(mezok[0], Integer.parseInt(mezok[2]), Integer.parseInt(mezok[3]), Integer.parseInt(mezok[4])));
                }

                sor = br.readLine();
            }
        } catch (Exception e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }


    }

    public List<String> hianyzoPoziciok() {

        List<String> kell = new ArrayList<>();
        String[] osszes = poziciok.split(", ");
        for (String pozicio : osszes) {
            for (Map.Entry<String, List<Jatekos>> ez : this.jatekosok.entrySet()) {
                if (pozicio.equals(ez.getKey())) {
                    if (ez.getValue().isEmpty()) kell.add(ez.getKey());
                }
            }
        }
        return kell;
    }

    public float atlag(String melyikAtlag) {
        if (!melyikAtlag.equals("magassag") && !melyikAtlag.equals("suly")) return 0;

        int ossz = 0, szam = 0;

        for (Map.Entry<String, List<Jatekos>> pozicio : this.jatekosok.entrySet()) {
            for (Jatekos jatekos : pozicio.getValue()) {
                if (melyikAtlag.equals("magassag")) {
                    ossz += jatekos.getMagassag();
                } else {
                    ossz += jatekos.getSuly();
                }
                szam++;
            }
        }
        return (float) ossz / szam;
    }
}
