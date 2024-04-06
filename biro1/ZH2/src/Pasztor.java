import java.lang.reflect.Array;
import java.util.Arrays;

public class Pasztor {

    private int keritesPosX;
    private int keritesPosY;
    protected Birka[] birkai;
    protected Pasztorkutya kutyaja;


    public Pasztor(int keritesPosX, int keritesPosY, Birka[] birkai) {
        this.keritesPosX = keritesPosX;
        this.keritesPosY = keritesPosY;
        this.birkai = birkai;
    }

    public Pasztor(int keritesPosX, int keritesPosY, Birka[] birkai, Pasztorkutya kutyaja) {
        this.keritesPosX = keritesPosX;
        this.keritesPosY = keritesPosY;
        this.birkai = birkai;
        this.kutyaja = kutyaja;
    }

    public int getKeritesPosX() {
        return keritesPosX;
    }

    public int getKeritesPosY() {
        return keritesPosY;
    }

    public Birka[] getBirkai() {
        return birkai;
    }

    public void setKeritesPosX(int keritesPosX) {
        this.keritesPosX = keritesPosX;
        if (this.kutyaja != null) kutyaja.setKeritesPosX(this.keritesPosX);
        if (this.kutyaja != null) kutyaja.setKeritesPosY(this.keritesPosY);
    }

    public void setKeritesPosY(int keritesPosY) {
        this.keritesPosY = keritesPosY;
    }

    public void setBirkai(Birka[] birkai) {
        this.birkai = birkai;
    }

    public void setKutyaja(Pasztorkutya kutyaja) {
        kutyaja.setKeritesPosX(this.keritesPosX);
        kutyaja.setKeritesPosY(this.keritesPosY);
        kutyaja.setBirkai(this.birkai);
        this.kutyaja = kutyaja;
    }

    public final int birkakKeritesenBelul() {
        int sum = 0;

        for (int i = 0; i < this.birkai.length; i++) {
            if (this.birkai[i].getPosX() == this.keritesPosX && this.birkai[i].getPosY() == this.keritesPosY) sum++;
        }

        return sum;

    }

    public void terel(Birka kit) {

        if (this.keritesPosX != kit.getPosX()) {
            if (this.keritesPosX < kit.getPosX()) kit.setPosX(kit.getPosX() - 1);
            else kit.setPosX(kit.getPosX() + 1);
        }

        if (this.keritesPosY != kit.getPosY()) {
            if (this.keritesPosY < kit.getPosY()) kit.setPosY(kit.getPosY() - 1);
            else kit.setPosY(kit.getPosY() + 1);
        }

    }

    public int terel() {

        int joHelyen = this.birkakKeritesenBelul();
        boolean tereltMar = false;

        Birka[] joHelyenLevok = new Birka[joHelyen];

        int j = 0;
        for (int i = 0; i < this.birkai.length; i++) {
            if (tereltMar && this.kutyaja == null) break;
            if (this.birkai[i].getPosX() == this.keritesPosX && this.birkai[i].getPosY() == this.keritesPosY) {
                joHelyenLevok[j] = this.birkai[i];
                j++;
            }




        }

        return joHelyen;
    }

    @Override
    public String toString() {
        return "A kerítés koordinátái " + this.keritesPosX + "," + this.keritesPosY + ", birkái: " + Arrays.toString(birkai);
    }
}
