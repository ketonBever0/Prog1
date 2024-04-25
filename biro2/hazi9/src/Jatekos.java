import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jatekos {

    private String nev;
    private Jatek kedvenc;
    private Map<Jatek, Integer> eddigJatszott = new HashMap<>();


    public Jatekos(String nev) {
        this.nev = nev;
    }

    public void jatszik(Jatek mit, int mennyit) throws NemSzeretiException {
        boolean van = true;
        if (this.kedvenc != null) {
            for (int i = 0; i < this.kedvenc.getGenre().length; i++) {
                van = false;

                for (int j = 0; j < mit.getGenre().length; j++) {
                    if (this.kedvenc.getGenre()[i] != null &&
                            mit.getGenre()[j] != null &&
                            this.kedvenc.getGenre()[i].equals(mit.getGenre()[j])) {
                        van = true;
                        break;
                    }
//                    if (van) break;
                }
            }
            if (!van) throw new NemSzeretiException(mit);
        }


        if (eddigJatszott.containsKey(mit)) {
            eddigJatszott.put(mit, eddigJatszott.get(mit) + mennyit);
        } else {
            eddigJatszott.put(mit, mennyit);
        }

        for (Map.Entry<Jatek, Integer> ez : eddigJatszott.entrySet()) {
            if (ez.getValue() > eddigJatszott.get(kedvenc)) {
                kedvenc = ez.getKey();
            }
        }

    }

    public Jatek getKedvenc() {
        return kedvenc;
    }

    public String getNev() {
        return nev;
    }
}
