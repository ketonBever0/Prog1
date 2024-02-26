public class ZH1 {

    public static void main (String[] args) {

        String probaString = "kacsa";
        String eredmeny = atalakit(probaString);
        System.out.println(eredmeny);

    }

    /**
     * Készíts egy metódust, amely paraméterében kap egy sztringet! Készíts egy új sztringet,
     * ami annyiban tér el ettől az eredeti sztringtől, hogy minden 'e' betű helyére 'a' betű kerül!
     * Figyelj arra, hogy ellenőrizd, a sztring nem NULL-e, azaz érvényes objektumra mutatat-e?
     * A visszatérési értéke a metódusnak legyen a módosított szöveg, vagy null, amennyiben az eredeti paraméter is NULL volt.
     */



    public static String atalakit(String str) {
        if (str == null) return null;

            String eredmeny = "";
        for (char i : str.toCharArray()) {

            if (i == 'e') i = 'a';
            eredmeny += i;

        }

        return eredmeny;

    }

    /**
	Egy egyenes országút mentén a városok a megadott távolságokban követik
	egymást. Az egyik városban tüzijátékot szeretnénk rendezni. Melyik
	városban célszerű megrendezni az eseményt, ha arra törekszünk, hogy az
	minél több városból látható legyen? Feltesszük, hogy a látványosság csak
	a rendező város megadott sugarú környezetében látható.
	Több optimális megoldás esetén az a város nyer, amelyiket az országúton
	haladva először elérjük. A tav nevű tömbben találhatóak a városok közötti
	távolságok úgy, hogy tav[i] az i. es i+1. város távolságát jelenti.
	A latotav pedig azt a távolságot
	jelenti, ahonnan még látható az esemény. A visszatérési érték legyen a
	megoldásnak tekinthető város sorszama 0-tól indexelve.
	*/

    public static int tuzijatek(int tav[], int latotav) {
        int db, resztav, i, j, maxvar=0, maxdb=0;
        for (i = 0; i < tav.length; i++) {
            db=1;
            resztav=0;
            for(j=i-1; j>=0; j--) {
                if(resztav+tav[j]<=latotav) {
                    resztav+=tav[j];
                    db++;
                } else {
                    break;
                }
            }
            resztav=0;
            for(j=i; j<tav.length-1; j++) {
                if(resztav+tav[j]<=latotav) {
                    resztav+=tav[j];
                    db++;
                } else {
                    break;
                }
            }
            if (maxdb < db) {
                maxdb  = db;
                maxvar = i;
            }
        }
        return maxvar;
    }
}
