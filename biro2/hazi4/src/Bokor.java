public class Bokor {

    private String fajta;
    private int forma;
    private double suruseg;


    public Bokor(String fajta, double suruseg) {
        setFajta(fajta);
        setSuruseg(suruseg);
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getFajta() {
        return fajta;
    }

    public void setForma(int forma) {
        if (forma >= 0 && forma <= 4) {
            this.forma = forma;
        }
    }

    public double getSuruseg() {
        return suruseg;
    }

    public void setSuruseg(double suruseg) {
        if (suruseg > 100) {
            this.suruseg = 100;
        } else if (suruseg < 0) {
            this.suruseg = 0;
        } else {
            this.suruseg = suruseg;
        }
    }


    public void nyiras(SovenyvagoOllo ollo) {
        if (ollo.vag(ollo.getElesseg())) {
            setForma(2);
        }
    }

    public String forma() {

        switch (this.forma) {
            case 0: return "cserje";
            case 1: return "bokor";
            case 2: return "formara nyirt";
            case 3: return "kisse elburjanzott";
            case 4: return "teljesen elburjanzott";
            default: return "helytelen érték";
        }

    }

    public void novekedes() {
        setForma(this.forma != 4 ? this.forma + 1 : this.forma);
    }

}
