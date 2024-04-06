public class Birka {

    private int posX;
    private int posY;
    public String nev;


    public Birka(String nev, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.nev = nev;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return this.nev +
                "[" + this.posX +
                "," + this.posY +
                "]";
    }
}
