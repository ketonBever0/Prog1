public class SovenyvagoOllo {

    private double elesseg;


    public double getElesseg() {
        return elesseg;
    }

    public SovenyvagoOllo() {
        this.elesseg = 100.0;
    }

    public boolean vag(double suruseg) {
        if (this.elesseg >= suruseg) {
            this.elesseg -= suruseg;
            return true;
        } else {
            return false;
        }
    }

    public void elez() {

        if (this.elesseg < 85) this.elesseg += 15;
        else this.elesseg += 100 - this.elesseg;

    }


}
