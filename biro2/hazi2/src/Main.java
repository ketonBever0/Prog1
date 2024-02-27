public class Main {
    public static void main(String[] args) {

        Kutya k1 = new Kutya("Károly");
        Kutya k2 = new Kutya("Lujza", "laZac", "kenyér");

        for (String i : k1.kedvencEtelek) System.out.println(i);

//        System.out.println(k.szereti("lazaC"));
        k1.ehesenNez();

        System.out.println(k1.odajon("laroly"));

        k2.eszik("kenyér");

        k1.farokCsovalas();
        k1.ehesenNez();
        k2.ehesenNez();
        k2.ehesenNez();

        System.out.println("K1: " + k1.ehseg + " " + k1.jokedv);
        System.out.println("K2: " + k2.ehseg + " " + k2.jokedv);

        Kutya melikEszik = Kutya.kutyaEtetes(k2, k1, "lazac");

        System.out.println(melikEszik == null ? "egyik se" : melikEszik.nev);


    }
}