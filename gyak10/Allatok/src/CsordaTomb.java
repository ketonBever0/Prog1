import java.util.Arrays;

public class CsordaTomb {

    public Allat[] tagok;
    public int allatokSzama = 0;

    public CsordaTomb() {
        tagok = new Allat[100];
        allatokSzama = 0;
    }

    public void tagotHozzaad(Allat kit) {
        tagok[allatokSzama] = kit;
        allatokSzama++;
    }

    public void tagotKidob(Allat kit) {
        int torolt = 0;
        for(int i=0;i<allatokSzama;i++) {
            if(tagok[i].equals(kit)) {
                torolt++;
            }
            if(i+torolt < allatokSzama+1)
                tagok[i] = tagok[i+torolt];
            allatokSzama--;
        }
        for(int i=allatokSzama;i<tagok.length;i++) {
            tagok[i] = null;
        }
    }

    @Override
    public String toString() {
        return "CsordaTomb{" +
                "tagok=" + Arrays.toString(tagok) +
                ", allatokSzama=" + allatokSzama +
                '}';
    }
}
