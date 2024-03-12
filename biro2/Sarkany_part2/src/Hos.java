public class Hos extends Ember {

    private int tamadas;
    private int sikerSzam;


    public Hos(String nev, int eletEro, int tamadas, int sikerSzam) {
        super.nev = nev;
        super.setEletEro(eletEro);
        this.tamadas = Math.max(tamadas, 0);
        setSikerSzam(sikerSzam);
    }

    public int getTamadas() {
        return tamadas;
    }

    public int getSikerSzam() {
        return sikerSzam;
    }

    public void setSikerSzam(int sikerSzam) {
        if (sikerSzam < this.sikerSzam) return;
        this.sikerSzam = Math.max(sikerSzam, 0);
    }

    public String toString() {
        return String.format("%s Ez az ember egy sarkanyolo hos, tamadasa %d, es eddig %d darab sarkanyt olt meg.",
                super.toString(),
                this.tamadas,
                this.sikerSzam);
    }

    public void gyogyul(int mennyivel) {
        super.eletEro += mennyivel;
    }

    public void edzes() {
        if (super.eletEro > 0) this.tamadas++;
    }

    public boolean erosebb(Hos[] hosok) {

        for (int i = 0; i < hosok.length; i++) {
            if (this.tamadas == hosok[i].tamadas) {
                if (this.eletEro < hosok[i].eletEro) return false;
            } else if (this.tamadas < hosok[i].tamadas) return false;
        }

        return true;
    }

}
