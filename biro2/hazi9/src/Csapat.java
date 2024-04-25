import java.util.ArrayList;
import java.util.List;

public class Csapat {

    private final Jatek celJatek;
    private final int maxLetszam;
    private List<Jatekos> jatekosok;


    public Csapat(Jatek celJatek, int maxLetszam) {
        this.celJatek = celJatek;
        this.maxLetszam = maxLetszam;
//        jatekosok = new ArrayList<>(maxLetszam);
    }

    public void jatekostHozzaad (Jatekos jatekos) {
        if (jatekos.getKedvenc() != celJatek) {
            throw new IllegalArgumentException("Ezt a jatekost nem lehet a csapathoz adni!");
        }

        if (jatekosok.size() == maxLetszam) {
            throw new IndexOutOfBoundsException("Ide mar nem fer jatekos!");
        }

        jatekosok.add(jatekos);
    }
}
