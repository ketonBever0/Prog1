import java.io.*;
import java.util.*;

public class Main {

    //throws - bejelentjuk, hogy dobhat ilyen hibat
    public static String[] fajlbolOlvas(String fajlneve) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fajlneve));
        String egySor = br.readLine();
        List<String> sorok = new ArrayList<>();
        while (egySor != null) { //null ha a vegere ertunk
            sorok.add(egySor);
            egySor = br.readLine();
        }
        //a readert mindig be kell zarni!
        br.close();

        String[] eredmeny = new String[sorok.size()];
        for (int i = 0; i < eredmeny.length; i++) {
            eredmeny[i] = sorok.get(i);
        }
        return eredmeny;
    }

    public static void fajlbaIr(String fajlNev, String mit, boolean hozzaIr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fajlNev, hozzaIr));
        bw.write(mit);
        bw.close();
    }

    public static void main(String[] args) {


        String[] fajlbolJott = new String[0];
        try {
            fajlbolJott = fajlbolOlvas("src/harcosokbe.txt");
        } catch (IOException e) {
//            System.err.println("Fájl nem található!");

            return;
        }

        List<Harcos> harcosok = new LinkedList<>();

        while (harcosok.size() < fajlbolJott.length) {
            String[] db = fajlbolJott[harcosok.size()].split(";");
            if (db.length != 3) continue;

            String ujnev = db[0];
            double ujero = Double.parseDouble(db[1]);
            int ujszint = Integer.parseInt(db[2]);
            Harcos ujHarcos = new Harcos(ujnev, ujero, ujszint);
            harcosok.add(ujHarcos);
        }

        System.out.println("\n\nAz összes harcosunk: ");
        for (Harcos egyHarcos : harcosok) {
            System.out.println(egyHarcos);
        }

        System.out.println("\nA csata elkezdődött!");
//        Harcos gyoztes = harcosok.get(0);
//        for(Harcos kihivo : harcosok) {
//            if(kihivo.getEro()*kihivo.getSzint() >
//            gyoztes.getEro()*gyoztes.getSzint()) {
//                gyoztes = kihivo;
//            }
//        }

        Set<Harcos> csatater = new TreeSet<>(harcosok);
        Harcos gyoztes = null;
        for (Harcos kihivo : csatater) {
            gyoztes = kihivo;
            break;
        }
        assert gyoztes != null;
        System.out.println("A csata győztese " + gyoztes.getNev() + "!");

        try {
            fajlbaIr("src/csataeredmeny.txt", "A csata győztese: " + gyoztes.getNev() + "!\n", true);
        } catch (IOException ignored) {
            System.err.println("A fájl nem hozható létre!");
        }

    }

}
