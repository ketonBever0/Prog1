import java.io.*;
import java.util.List;
import java.util.Map;

public class Csapat {

    private String neve;
    private Map<String, List<Jatekos>> jatekosok;
    private String poziciok;


    public Csapat(String neve) {
        this.neve = neve;
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

    public void beolvas (File fajlnev) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fajlnev));


    }

    public List<String> hianyzoPoziciok () {

    }

    public float atlag (String melyikAtlag) {

    }
}
