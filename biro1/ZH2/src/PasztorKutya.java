import java.util.Arrays;

public class Pasztorkutya extends Pasztor {

    private int gyorsasag = 1;


    public Pasztorkutya(int keritesPosX, int keritesPosY, Birka[] birkai) {
        super(keritesPosX, keritesPosY, birkai);
    }

    public Pasztorkutya(int keritesPosX, int keritesPosY, Birka[] birkai, int gyorsasag) {
        super(keritesPosX, keritesPosY, birkai);
        this.gyorsasag = gyorsasag;
    }

    public void setKutyaja(Pasztorkutya kutyaja) {

    }


    public int terel() {

        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ". Ő egy " + this.gyorsasag + " gyorsaságú pásztorkutya.";
    }
}
