import java.util.Arrays;

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
        e1.setNem(false);
        e1.szulEv = 1985;
        e1.setNem(Ember.FERFI);

        System.out.println(e1.nev + " egy " +
                ((e1.isNem()) ? "nő" : "férfi") + ", akinek születési éve " +
                e1.szulEv);

        Ember e2 = new Ember("Kata", Ember.NO, 2000);
        System.out.println(e2.nev + " egy " +
                ((e2.isNem()) ? "nő" : "férfi") + ", akinek születési éve " +
                e2.szulEv);
        //Ha szovegkent probaljuk kezelni az objektumot, azt irja ki, amit a
        //toString visszaadott
        System.out.println("Ember2: " + e2);

        Ember e3 = new Ember("Sándor", false, 199);
        System.out.println(e3);

        System.out.println(e1.emberSzam + " darab emberem van.");
        System.out.println(Ember.emberSzam + " darab emberem van.");
        //a statikus tulajdonsag az osztallyal is hivaztkozhato


        Macska m1 = new Macska("Garfield", "Narancs");
        Macska m2 = new Macska("Lukrécia", "Fekete", true);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(e1.etet(m1));

        e1.setMacskai(new Macska[] {m2, m1});
        System.out.println(Arrays.toString(e1.getMacskai()));

    }

}
