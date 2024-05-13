import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Vasarlo implements Kozos {

    public final String nev;
    protected String igazolvanySzam;
    private int penz;


    public Vasarlo(String nev, String igazolvanySzam) {
        this.nev = nev;
        this.igazolvanySzam = igazolvanySzam;
        this.penz = 0;
    }

    @Override
    public void penztKolt(int mennyit) {
        if (getPenz() < mennyit) {
            throw new NincsElegPenzException("Nincs eleg penz!");
        }
        this.penz -= mennyit;
    }

    public int getPenz() {
        return penz;
    }

    public void vagyontKiszamit(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String sor = br.readLine();
            while (sor != null) {
                String[] adat = sor.split(";");
                this.penz += adat[1].equals("BEVETEL") ? Integer.parseInt(adat[2]) : -Integer.parseInt(adat[2]);
                sor = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }


}
