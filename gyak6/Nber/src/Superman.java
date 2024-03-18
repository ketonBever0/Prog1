//  extends - utána lévő osztágy gyereke
//  final - meddő
public final class Superman extends Ember {

    private int szuperero;
    Kepesseg kepessege = Kepesseg.LATHATATLANSAG;



    public Superman(String nev, boolean nem, int evszam) {
        //  super - szülő objektum (itt Ember)
        super(nev, nem, evszam);
        this.szuperero = 0;

//        ez lejjebb nem működne, mert a szülőt a jelenlegi osztály adattagok előtt kell meghívni
//        super(nev, nem, evszam);
//        this.szuperero = 0;
    }

    public Superman(String nev, boolean nem, int evszam, int szuperero) {
        super(nev, nem, evszam);
        this.szuperero = szuperero;
    }

//    itt nem hívna a super()-t
//    public Superman(int szuperero) {
//        this.szuperero = szuperero;
//    }


//    final - nem felüldefiniálható
    public final boolean vilagmegmentes() {
        System.out.println("A világ veszélyben van!");
        if (this.szuperero > 0) {
            System.out.println(String.format("%s ismét megmentette a világot, szuperereje csökent. Köszönjük Szuperman!", this.nev));
            this.szuperero--;
            return true;
        } else {
            System.out.println(String.format("%s elfáradt, elment aludni. A világ elpusztult :(", super.nev));
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s Ő egyébként SUPERMAN! Szuperereje %d.", super.toString(), this.szuperero);
    }
}
