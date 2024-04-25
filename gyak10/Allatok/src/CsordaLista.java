import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsordaLista {

    //lista - mint egy rugalmasabb tomb
    public List<Allat> tagok = new ArrayList<Allat>();
    //ArrayList vagy LinkedList konkret megvalositasok

    public CsordaLista() {
        tagok = new ArrayList<>();
    }

    public void tagotHozzaad(Allat kit) {
        //hozzadni siman az .add vieslkedessel tudok
        tagok.add(kit);
    }

    public void tagotHozzaadIde(Allat kit, int hova) {
        //ilyenkor beszurja oda (nem csereli)
        tagok.add(hova,kit);
    }


    public void tagotKidob(Allat kit) {
        //torles - .remove - torli a megadott elem legelso elofordulasat
        tagok.remove(kit);
    }

    public void tagotKidobMind(Allat kit) {
        //contains - benne van-e
        while(tagok.contains(kit)) tagok.remove(kit);
    }

    public void csordaHang() {
        for(Allat egyTag : tagok) {
            System.out.print(egyTag.hangotAd() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String eredmeny = "A csorda tagjai: ";
        for(int i=0;i<tagok.size();i++) {
            //Az i. elem lekerese:
            eredmeny+=tagok.get(i)+"\n";
        }
        return eredmeny;
    }

}
