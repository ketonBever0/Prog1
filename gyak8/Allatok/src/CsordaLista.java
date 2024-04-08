import java.util.ArrayList;
import java.util.Arrays;

public class CsordaLista {
    public ArrayList<Allat> tagok;


    public CsordaLista() {
        tagok = new ArrayList<Allat>();
    }

    public void tagotHozzaad(Allat kit) {
        tagok.add(kit);
    }

    public void tagotKidob(Allat kit) {
        tagok.remove(kit);
    }

    public void tagotKidobMind(Allat kit) {
        while (tagok.contains(kit)) this.tagotKidob(kit);
    }

    public void csordaHangotAd() {
        for (Allat tag : tagok) {
            System.out.println(tag.hangotAd() + " ");
        }
    }

    @Override
    public String toString() {
        String eredmeny = "A csorda tagjai:\n";
        for (int i = 0; i < tagok.size(); i++) {
            eredmeny += tagok.get(i) + "\n";
        }
        return eredmeny;
    }

}
