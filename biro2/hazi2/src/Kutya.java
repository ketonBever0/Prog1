import java.util.Arrays;

public class Kutya {

    String nev;
    String[] kedvencEtelek;
    short ehseg;
    long jokedv;


    /*public Kutya(String nev, String[] kedvencEtelek, short ehseg, long jokedv) {
        this.nev = nev;
        this.kedvencEtelek = kedvencEtelek;
        this.ehseg = ehseg;
        this.jokedv = jokedv;
    }*/

    public Kutya(String nev) {
        this.nev = nev;
        this.kedvencEtelek = new String[]{"csirke", "sajt", "lazac"};
    }

    public Kutya(String nev, String... kedvencEtelek) {
        this.nev = nev;
        this.kedvencEtelek = kedvencEtelek;
    }

    public Kutya kutyaEtetes(Kutya elso, Kutya masodik, String etel) {



        return null;
    }

    public boolean szereti(String etel) {

        String[] kisbetus = new String[this.kedvencEtelek.length];

        int j = 0;
        for (String i : this.kedvencEtelek) {
            kisbetus[j] = i.toLowerCase();
            j++;
        }

        for (String i : this.kedvencEtelek) {
            if (etel.equals(i)) return true;
        }

        return false;

    }

    public void eszik(String etel) {

        if (!szereti(etel)) {
            ehesenNez();
            return;
        }

         if (ehseg != 0) ehseg--;

         if (ehseg == 0) farokCsovalas();

    }

    public Kutya farokCsovalas() {
        this.jokedv++;
        return this;
    }

    public void ehesenNez() {
        this.ehseg++;
        System.out.println("Vau!");
    }

    public boolean odajon(String nev) {

        int thisLen = this.nev.length();
        int nevLen = nev.length();

        if (thisLen == nevLen) {
            int kulombsegek = 0;
            for (int i = 0; i < nev.length(); i++) {
                if (!this.nev.substring(i, i + 1).equals(nev.substring(i, i + 1))){
                        kulombsegek++;
                        if (kulombsegek == 2) return false;
                }
                return true;
            }
        }

        return false;

    }

}
