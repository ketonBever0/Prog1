public class VideoMagno implements BesorolassalRendelkezo {

    public static void lejatszas(BesorolassalRendelkezo lejatszando, int maxEletkor) {

        if (lejatszando.getKorhatarBesorolas() > maxEletkor) {
            System.out.println("Sajnalom, de a korhatar miatt ezt nem jatszhatom le.");
            return;
        }

        if (lejatszando instanceof Sorozat) {
            System.out.printf("Lejatszasra kerult a(z) %s cimu sorozat.\n", ((Sorozat) lejatszando).nev);
            return;
        }

        if (lejatszando instanceof Zeneszam) {
            System.out.printf("Meghallgattuk a kovetkezo szamot: %s - %s\n", ((Zeneszam) lejatszando).getEloado(), ((Zeneszam) lejatszando).getSzamCim());
        }

    }


    @Override
    public int getKorhatarBesorolas() {
        return -1;
    }
}
