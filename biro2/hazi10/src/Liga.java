import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Liga {

    private List<Csapat> csapatok = new ArrayList<>();
    private List<Meccs> meccsek = new ArrayList<>();


    public Liga(String directoryName) {
        File dr = new File(directoryName);
        File[] dir = dr.listFiles();
        if (dir != null) {
            for (File child : dir) {
                String fn = child.getName();
                if (fn.endsWith(".csv")) {
                    int pos = fn.indexOf(".csv");
                    csapatok.add(new Csapat(fn.substring(0, pos)));
                }
            }
        }

    }

    public Liga(List<Csapat> csapatok) {
        this.csapatok = csapatok;
    }

    public List<Csapat> getCsapatok() {
        return csapatok;
    }

    public List<Meccs> getMeccsek() {
        return meccsek;
    }

    public List<Csapat> hianyosCsapatok() {
        List<Csapat> hianyzok = new ArrayList<>();

        for (Csapat csapat : csapatok) {
            if (!csapat.hianyzoPoziciok().isEmpty()) {
                hianyzok.add(csapat);
            }
        }
        return hianyzok;
    }

    public int csapatokKizarasa() {
        int kizartakSzama = 0;
        Iterator<Csapat> it = csapatok.iterator();
        while (it.hasNext()) {
            it.remove();
            kizartakSzama++;
        }
        return kizartakSzama;
    }

    public Csapat jatek() {

        while (csapatok.size() > 1) {
            for (int i = 0; i < csapatok.size(); i += 2) {
                if (i < csapatok.size() - 1) {
                    meccsek.add(new Meccs(csapatok.get(i), csapatok.get(i + 1)));
                }
            }

            List<Csapat> ujCsapatok = new ArrayList<>();
            for (Meccs meccs : meccsek) {
                ujCsapatok.add(ujCsapatok.size() - 1, meccs.gyoztes());
            }
            csapatok = ujCsapatok;
        }


        return csapatok.get(0);

    }

    public void eredmenyTabla() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(".csv"));
            bw.write("ElsoCsapat;MasodikCsapat;GyoztesCsapat\n");

            while (csapatok.size() > 1) {
                for (int i = 0; i < csapatok.size(); i += 2) {
                    if (i < csapatok.size() - 1) {
                        Csapat elso = csapatok.get(i), masodik = csapatok.get(i + 1);
                        meccsek.add(new Meccs(elso, masodik));
                        bw.write(elso.getNeve() + ";" + masodik.getNeve() + ";");
                    }
                }

                List<Csapat> ujCsapatok = new ArrayList<>();
                for (Meccs meccs : meccsek) {
                    Csapat gyoztes = meccs.gyoztes();
                    ujCsapatok.add(ujCsapatok.size() - 1, gyoztes);
                    bw.write(gyoztes.getNeve() + "\n");
                }
                csapatok = ujCsapatok;
            }

            bw.close();
        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
