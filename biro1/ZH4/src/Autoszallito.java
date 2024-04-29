
import java.util.Map;

/**
 * Autoszallito osztaly
 */
public class Autoszallito implements Comparable<Autoszallito> {
    /**
     * Az autoszallito keresztneve, a peldaban csak egy darab lehet.
     */
    private String keresztNev;
    /**
     * Az autoszallito csaladneve.
     */
    private String csaladNev;
    /**
     * Az autoszallito autojanak rendszama.
     */
    private String rendszam;

    /**
     * Az elszallitott autok az alabbi formatumban:
     * - a kulcs az elszallitott auto rendszama, a hozzatartozo ertek pedig az elszallitott auto tomege
     * - Pelda kulcs: "XYZ-001", ertek 1 (teljesitesek.put("XYZ-001", 1))
     */
    private Map<String, Integer> elszallitottAutok;

    public Autoszallito(String keresztNev, String csaladNev, String rendszam, Map<String, Integer> elszallitottAutok) {
        this.keresztNev = keresztNev;
        this.csaladNev = csaladNev;
        this.rendszam = rendszam;
        this.elszallitottAutok = elszallitottAutok;
    }

    @Override
    public String toString() {
        return "Autoszallito{" +
                "keresztNev='" + keresztNev + '\'' +
                ", csaladNev='" + csaladNev + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", elszallitott autok=" + elszallitottAutok +
                '}';
    }

    /**
     * A teljesitesek lekerese
     *
     * @return
     */
    public Map<String, Integer> getElszallitottAutok() {
        return elszallitottAutok;
    }

    public int osszTomeg() {
        int ossz = 0;
        for (int tomeg : this.elszallitottAutok.values()) {
            ossz += tomeg;
        }
        return ossz;
    }

    @Override
    public int compareTo(Autoszallito other) {
//        int thisSum = 0;
//        for (int tomeg : this.elszallitottAutok.values()) {
//            thisSum += tomeg;
//        }
//
//        int otherSum = 0;
//        for (int tomeg : other.elszallitottAutok.values()) {
//            otherSum += tomeg;
//        }

        int thisSum = this.elszallitottAutok.values().stream().mapToInt(Integer::intValue).sum();
        int otherSum = other.elszallitottAutok.values().stream().mapToInt(Integer::intValue).sum();


        if (thisSum > otherSum) return 1;
        else if (thisSum < otherSum) return -1;
        else return this.rendszam.compareTo(other.rendszam);
    }
}
