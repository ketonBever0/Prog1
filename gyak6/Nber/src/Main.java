public class Main {

    public static void main(String[] args) {
        //objektum deklaracioja
        Ember e1;
        //ilyenkor az erteke alapbol null
        //peldanyositom:
        e1 = new Ember();
        //new - foglalj memoriat
        //Ember() - konstruktor - ez intezi a memoriafoglalast

        e1.nev = "Károly";
        e1.setNem(Ember.FERFI);
        e1.szulEv = 1985;

        System.out.println(e1.nev + " egy " +
                ((e1.isNem())?"nő":"férfi") + ", akinek születési éve " +
                e1.szulEv);

        Ember e2 = new Ember("Kata",Ember.NO,2000);
        System.out.println(e2.nev + " egy " +
                ((e2.isNem())?"nő":"férfi") + ", akinek születési éve " +
                e2.szulEv);
        //Ha szovegkent probaljuk kezelni az objektumot, azt irja ki, amit a
        //toString visszaadott
        System.out.println("Ember2: " + e2);

        Ember e3 = new Ember("Sándor",Ember.FERFI,199);
        System.out.println(e3);

        System.out.println(e1.emberSzam + " darab emberem van.");
        System.out.println(Ember.emberSzam + " darab emberem van.");
        //a statikus tulajdonsag az osztallyal is hivaztkozhato

        //Jonnek a macskak
        Macska macs = new Macska("Garfield","Narancs");
        Macska lukrecia = new Macska("Lukrécia",
                "Fekete",true);
        System.out.println(macs);
        System.out.println(lukrecia);
        System.out.println(e1.etet(macs));

        Macska[] cicak = new Macska[100];
        cicak[0] = lukrecia;
        e1.setMacskai(cicak);
        for(int i=0;i<e1.getMacskai().length;i++) {
            if(e1.getMacskai()[i] != null)
                System.out.print(e1.getMacskai()[i] + ", ");
        }

        System.out.println();

        //  jönnek a szupermanek


        Superman szupi = new Superman("Csaba", Ember.FERFI, 1924, 15);
        szupi.macskai = e1.macskai;
        System.out.println(szupi);

        Ember bela = new Superman("Béla", Ember.FERFI, 2000);
//        Az Ember mindig tud Supermant is tárolni

        System.out.println("\nAz összes emberünk");
        Ember[] emberek = new Ember[10];
        emberek[0] = e1;
        emberek[1] = e2;
        emberek[2] = e3;
        emberek[3] = szupi;
        emberek[4] = bela;

        for (int i = 0; i < Ember.emberSzam; i++) {
            System.out.println(emberek[i]);
            if (emberek[i] instanceof Superman) {
                ((Superman) emberek[i]).vilagmegmentes();
            }
        }



    }

}
