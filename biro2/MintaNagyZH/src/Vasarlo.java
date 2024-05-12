import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Vasarlo implements Kozos {

    public final String nev;
    protected String igazolvanySzam;
    private int penz;


    public Vasarlo(String nev, String igazolvanySzam) {
        this.nev = nev;
        this.igazolvanySzam = igazolvanySzam;
        this.penz = 0;
    }

    public void penztKolt(int mennyit) {
        if (this.penz < mennyit) throw new NincsElegPenzException("Nincs eleg penz!");
        this.penz -= mennyit;
    }

    public void vagyontKiszamit (String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int vagyon = this.penz;
            String sor = br.readLine();
            while(sor != null) {
                String[] adat = sor.split(";");
                String tipus = adat[1];
                int ertek = Integer.parseInt(adat[2]);
                vagyon += tipus.equals("BEVETEL") ? ertek : -ertek;

                sor = br.readLine();
            }

            this.penz = vagyon;
            br.close();

        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }

    }

    public int getPenz() {
        return penz;
    }
}
