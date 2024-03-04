public class Sarkany {

    public int eletero;
    public boolean ehes;


    public Sarkany() {
        this.eletero = 100;
        this.ehes = true;
    }

    public Sarkany(int eletero, boolean ehes) {
        setEletero(eletero);
        setEhes(ehes);
    }


    public int getEletero() {
        return eletero;
    }

    public boolean isEhes() {
        return ehes;
    }

    public void setEletero(int eletero) {
        if (eletero <= 0) {
            this.eletero = 0;
            System.err.println("megolted a sarkanyt\n");
            return;
        }
        this.eletero = eletero;
    }

    public void setEhes(boolean ehes) {
        if (this.eletero < 50) {
            this.ehes = true;
        } else {
            this.ehes = ehes;
        }
    }

    public String toString() {
        return String.format("A sarkany eletereje %d, es jelenleg %s ehes.", this.eletero, this.ehes ? "rettenetesen" : "veletlenul nem");
    }

    public boolean vajonElMeg() {
        return this.eletero > 0;
    }

    public void eszik(int etel) {
        if (etel <= 0) {
            System.err.println("en a helyedben nem eheztetnek egy sarkanyt");
            return;
        }
        this.eletero += etel;
    }

    public int harcol(int[] ellenfelekElete) {

        if (!this.ehes) return 0;

        int legyozottEllenfel = 0;
        for (int i : ellenfelekElete) {

            this.eletero -= (int) Math.floor((double) i / 2);

            if (this.eletero <= 0) return legyozottEllenfel;

            legyozottEllenfel++;
        }

        return legyozottEllenfel;

    }



}
