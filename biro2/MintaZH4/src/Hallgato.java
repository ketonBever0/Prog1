
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
        return this.teljesitesek.values().stream().mapToInt(Integer::intValue).max().getAsInt();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(keresztNev, csaladNev, neptun, teljesitesek);
//    }

    @Override
    public int compareTo(Hallgato masik) {
        OptionalInt teljesites = this.teljesitesek.values().stream().mapToInt(Integer::intValue).max();
        OptionalInt masikTeljesites = masik.teljesitesek.values().stream().mapToInt(Integer::intValue).max();

        if (teljesites.isPresent() && masikTeljesites.isPresent()) {
            int teljesitesValue = teljesites.getAsInt();
            int masikTeljesitesValue = masikTeljesites.getAsInt();

            if (teljesitesValue != masikTeljesitesValue) {
                return Integer.compare(masikTeljesitesValue, teljesitesValue);
            } else {
                return this.neptun.compareTo(masik.neptun);
            }
        } else {
            return teljesites.isPresent() ? -1 : masikTeljesites.isPresent() ? 1 : 0;
        }

    }

}
