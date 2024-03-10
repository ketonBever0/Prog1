public class Nyomozo {

    public String nev;
    public String[] gyanusitottak;
    public int[] nyomok;


    public Nyomozo(String[] gyanusitottak, int[] nyomok) {
        this.nev = "Columbo";
        setGyanusitottak(gyanusitottak);
        setNyomok(nyomok);
    }

    public Nyomozo(String nev, String[] gyanusitottak, int[] nyomok) {
        this.nev = nev;
        setGyanusitottak(gyanusitottak);
        setNyomok(nyomok);
    }

    public String[] getGyanusitottak() {
        return gyanusitottak;
    }

    public void setGyanusitottak(String[] gyanusitottak) {
        this.gyanusitottak = gyanusitottak;
    }

    public int[] getNyomok() {
        return nyomok;
    }

    public void setNyomok(int[] nyomok) {
        this.nyomok = nyomok;
    }

    public boolean nyomotFelhasznal(int index) {

        boolean sikerult = false;

        for (int i = 0; i < this.nyomok.length; i++) {
            if (i == index) sikerult = true;
        }

        if (!sikerult) return false;

        int[] megMaradtNyomok = new int[this.nyomok.length - 1];

        int j = 0;
        for (int i = 0; i < this.nyomok.length; i++) {
            if (i == index) continue;
            megMaradtNyomok[j] = this.nyomok[i];
            j++;
        }

        this.nyomok = megMaradtNyomok;

        return sikerult;

    }

    public boolean felmentoBizonyitek(String kit) {

        boolean van = false;

        for (int i = this.gyanusitottak.length - 1; i >= 0; i--) {
            if (this.gyanusitottak[i].equals(kit)) {
                van = true;
                break;
            };
        }

        if (!van) return false;

        String[] forditvaGyanusitottak = new String[this.gyanusitottak.length];

        for (int i = this.gyanusitottak.length - 1, j = 0; i >= 0 && j < forditvaGyanusitottak.length; i--, j++) {
            forditvaGyanusitottak[j] = this.gyanusitottak[i];
        }

        boolean kiveve = false;
        String[] megMaradtGyanusitottak = new String[this.gyanusitottak.length - 1];

        int j = 0;
        for (int i = 0; i < forditvaGyanusitottak.length; i++) {
            if (forditvaGyanusitottak[i].equals(kit) && !kiveve) {
                kiveve = true;
                continue;
            }
//            System.out.println(String.format("%d %s - %d", i, forditvaGyanusitottak[i], j));
            megMaradtGyanusitottak[j] = forditvaGyanusitottak[i];
            j++;
        }

        String[] forditvaMegMaradtGyanusitottak = new String[megMaradtGyanusitottak.length];

        j = 0;
        for (int i = megMaradtGyanusitottak.length - 1; i >= 0 && j < forditvaMegMaradtGyanusitottak.length; i--, j++) {
            forditvaMegMaradtGyanusitottak[j] = megMaradtGyanusitottak[i];
        }

        this.gyanusitottak = forditvaMegMaradtGyanusitottak;

        return van;
    }

    public void inditek() {

        String[] ujGyanusitottak = new String[this.gyanusitottak.length];

        int j = 0;
        for (int i = 0; i < gyanusitottak.length; i++) {
            if (i == 0) {
                continue;
            }
            ujGyanusitottak[j] = gyanusitottak[i];
            j++;
        }

        ujGyanusitottak[ujGyanusitottak.length - 1] = gyanusitottak[0];

        this.gyanusitottak = ujGyanusitottak;

    }

    public void nyomokatRendez() {

        int[] ujNyomok = new int[this.nyomok.length];

        for (int i = this.nyomok.length - 1, j = 0; i >= 0; i--, j++) {
            ujNyomok[j] = nyomok[i];
        }

        nyomok = ujNyomok;

    }

    public void alibikEliminalasa() {

        if (this.nyomok.length < 3) return;
        int ujMeret = this.nyomok.length;
        for (int i = 0; i < this.nyomok.length; i++) {

            if ((i + 1) % 3 == 0) {
                ujMeret--;
//                System.out.println(i + " " + nyomok[i]);
            }

//            System.out.println(ujMeret);

        }

        int[] ujNyomok = new int[ujMeret];
        for (int i = 0, j = 0; j < ujMeret; i++) {
            if ((i + 1) % 3 == 0) continue;

            ujNyomok[j] = this.nyomok[i];
            j++;

        }

        this.nyomok = ujNyomok;

    }

    public boolean bajbanVan() {

        if (felmentoBizonyitek(this.nev)) {
            return true;
        }

        return false;
    }

    public String nyomozas() {


        return "";
    }


}
