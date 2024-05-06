public abstract class Jarmu {

    protected String celallomas;
    protected int indulas;
    protected int keses;
    protected Utas[] utasok;


    public Jarmu(String celallomas, int indulasiOra, int indulasiPerc, int kapacitas) {
        this.celallomas = celallomas;
        this.indulas = indulasiOra;
        this.keses = 0;
    }
}
