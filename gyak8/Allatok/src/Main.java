public class Main {
    public static void main(String[] args) {


        Allat[] allatok = new Allat[10];

        allatok[0] = new Medve("Jeges", 5, 0.7);
        allatok[1] = new Csirke("Dezső", 2, 0.9);

        for (Allat egy : allatok) {
            if(egy != null) System.out.println(egy);
        }

        System.out.println("\nMindenki hangot ad!");
        for (Allat egy : allatok) {
            if (egy != null) System.out.println(egy.hangotAd());
        }

        CsordaTomb cs1 = new CsordaTomb();
        cs1.tagotHozzaad(allatok[0]);
        cs1.tagotHozzaad(allatok[1]);
        cs1.tagotHozzaad(allatok[2]);

        System.out.println(cs1);

        cs1.tagotKidob(allatok[2]);


    }
}