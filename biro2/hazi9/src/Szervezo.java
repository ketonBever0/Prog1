import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Szervezo {

    private List<Jatekos> jatekosok = new ArrayList<>();
    private List<Csapat> csapatok = new ArrayList<>();


    public void addJatekos (Jatekos kit) {
        if (kit != null) jatekosok.add(kit);
    }

    public void addCsapat (Csapat melyiket) {
        if (melyiket != null) csapatok.add(melyiket);
    }

    public void gyakoroltat(Map<Jatek, Integer> mibolMennit) {
        for (Jatekos jatekos : jatekosok) {
            if (jatekos == null) continue;
            int szereti = 0;
            for (Map.Entry<Jatek, Integer> mivel : mibolMennit.entrySet()) {
                try {
                    jatekos.jatszik(mivel.getKey(), mivel.getValue());
                    szereti++;
                } catch (NemSzeretiException ignored) {
                }
            }
            if (szereti == 0) {
                throw new SecurityException("Az egyik jatekos tul valogatos.");
            }
        }
    }

    public void beoszt() throws Exception {
        for (Jatekos jatekos : jatekosok) {
            if (jatekos == null) break;
            int hozzaadva = 0, talaltCsapat = 0, beteltCsapat = 0;
            for (Csapat csapat : csapatok) {
                if (csapat == null) break;
                try {
                    csapat.jatekostHozzaad(jatekos);
                    hozzaadva++;
                } catch (IllegalArgumentException ignored) {
                    talaltCsapat++;
                } catch (IndexOutOfBoundsException ignored) {
                    beteltCsapat++;
                }
            }

            if (hozzaadva == 0 && talaltCsapat > 0 && beteltCsapat > 0) {
                throw new Exception("Az egyik jatekosnak nem sikerult megfelelo csapatot talalni.");
            }

            if (hozzaadva == 0) {
                throw new Exception("Az egyik jatekosnak nem sikerult megfelelo csapatot talalni.");
            }
        }
    }
}
