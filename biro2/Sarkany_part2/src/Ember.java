public class Ember {

    protected String nev;
    protected int eletEro;


    public Ember() {
        this.nev = "ismeretlen";
        setEletEro(10);
    }

    public Ember(String nev, int eletEro) {
        this.nev = nev;
        setEletEro(5);
    }


    public String getNev() {
        return nev;
    }

    public int getEletEro() {
        return eletEro;
    }

    public void setEletEro(int ujEletEro) {
        this.eletEro = Math.max(ujEletEro, 0);
    }

    public String toString() {
        return String.format("Emberunk neve %s, es jelenleg %s.",
                getNev(),
                getEletEro() == 0 ? "halott" : getEletEro() >= 1 && getEletEro() <= 10 ? "atlagos az allapota" : "majd kicsattan az egeszsegtol"
        );
    }

    public boolean vajonElMeg() {
        return eletEro > 0;
    }

    public void gyogyul(int mennyivel) {
        if (this.eletEro == 0) System.err.println("Sajnalom, elkestetek.");
        else this.eletEro += mennyivel;
    }

}
