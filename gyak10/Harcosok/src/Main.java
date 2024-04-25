import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Harcos> spartaiak = new LinkedList<Harcos>();

        while (true) {
            System.out.print("Név: ");
            String ujNev = sc.nextLine();
            while (ujNev.isEmpty()) ujNev = sc.nextLine();
            if (ujNev.equals("end")) break;
            System.out.print("Erő: ");
            double ujEro = sc.nextDouble();
            System.out.print("Szint: ");
            int ujSzint = sc.nextInt();

            Harcos ujHarcos = new Harcos(ujNev, ujEro, ujSzint);
            spartaiak.add(ujHarcos);



        }

        System.out.println("\n\nAz összes harcosunk:");
        for (Harcos harcos : spartaiak) {
            System.out.println(harcos);
        }

        System.out.println("Harc!");
        Harcos vajda = null;
//        for (Harcos kihivo : spartaiak) {
//            if (kihivo.getEro() * kihivo.getSzint() >
//            vajda.getEro() * vajda.getSzint()) {
//                vajda = kihivo;
//            }
//        }

        Set<Harcos> csatater = new TreeSet<>(spartaiak);

        for (Harcos kihivo : csatater) {
            vajda = kihivo;
            break;
        }

        assert vajda != null;
        System.out.printf("A győztes %s!", vajda.getNev());

    }
}