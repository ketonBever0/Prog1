
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;

/**
 * Hallgato osztaly
 */
public class Hallgato implements Comparable<Hallgato> {
    /**
     * A hallgato keresztneve, a peldaban csak egy darab lehet.
     */
    private String keresztNev;
    /**
     * A hallgato csaladneve.
     */
    private String csaladNev;
    /**
     * A hallgato Neptun kodja.
     */
    private String neptun;

    /**
     * Hallgatoi teljesitesek az alabbi formatumban:
     * - a kulcs a tantargy neve, a hozza tartozo ertel pedig a hallgato osztalyzata
     * - Pelda kulcs: "Programozas 1.", ertek 5 (teljesitesek.put("Programozas 1.", 5))
     */
    private Map<String, Integer> teljesitesek;

    public Hallgato(String keresztNev, String csaladNev, String neptun, Map<String, Integer> teljesitesek) {
        this.keresztNev = keresztNev;
        this.csaladNev = csaladNev;
        this.neptun = neptun;
        this.teljesitesek = teljesitesek;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "keresztNev='" + keresztNev + '\'' +
                ", csaladNev='" + csaladNev + '\'' +
                ", neptun='" + neptun + '\'' +
                ", teljesitesek=" + teljesitesek +
                '}';
    }

    /**
     * A teljesitesek lekerese
     *
     * @return
     */
    public Map<String, Integer> getTeljesitesek() {
        return teljesitesek;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hallgato hallgato = (Hallgato) o;
        return Objects.equals(keresztNev, hallgato.keresztNev) && Objects.equals(csaladNev, hallgato.csaladNev) && Objects.equals(neptun, hallgato.neptun) && Objects.equals(teljesitesek, hallgato.teljesitesek);
    }

    public int legjobb () {
        if (this.teljesitesek.isEmpty()) return 0;
        int max = 0;
        for (Map.Entry<String, Integer> teljesites : teljesitesek.entrySet()) {
            if (teljesites.getValue() > max) max = teljesites.getValue();
        }
        return max;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(keresztNev, csaladNev, neptun, teljesitesek);
//    }

    @Override
    public int compareTo(Hallgato masik) {
        if (this.legjobb() > masik.legjobb()) return -1;
        else if (this.legjobb() < masik.legjobb()) return 1;
        else return this.neptun.compareTo(masik.neptun);
    }

}
