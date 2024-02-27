

public class Kutya {

    String nev;
    String[] kedvencEtelek;
    short ehseg;
    long jokedv;



    public Kutya(String nev) {
        this.nev = nev;
        this.kedvencEtelek = new String[]{"csirke", "sajt", "lazac"};
    }

    public Kutya(String nev, String... kedvencEtelek) {
        this.nev = nev;
        this.kedvencEtelek = kedvencEtelek;
    }

    public static Kutya kutyaEtetes(Kutya elso, Kutya masodik, String etel) {

        if (elso.szereti(etel) && masodik.szereti(etel)) {
            double elsoKE = Math.sqrt(((double) elso.ehseg / 2.0) * ((double) elso.jokedv / 3.0));
            double masodikKE = Math.sqrt(((double) masodik.ehseg / 2.0) * ((double) masodik.jokedv / 3.0));

            return elsoKE < masodikKE ? masodik : elso;

        } else if (elso.szereti(etel)) {
            return elso;
        } else if (masodik.szereti(etel)) {
            return masodik;
        }

        return null;
    }

    public boolean szereti(String etel) {

//        String[] kisbetus = new String[this.kedvencEtelek.length];

        for (String i : this.kedvencEtelek) {
            if (i.equalsIgnoreCase(etel)) return true;
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
//        System.out.println("jokedv");
        return this;
    }

    public void ehesenNez() {
        this.ehseg++;
        System.out.println("Vau!");
    }

    public boolean odajon(String nev) {


        if (this.nev.length() == nev.length()) {
            int kulombsegek = 0;
            for (int i = 0; i < nev.length(); i++) {
                if (!this.nev.toLowerCase().substring(i, i + 1).equals(nev.toLowerCase().substring(i, i + 1))) {
                    kulombsegek++;
                    if (kulombsegek == 3) return false;
                }
            }
            return true;
        }

        return false;

    }

}
