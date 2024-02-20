public class KovetelmenySzamito {

    public KovetelmenySzamito() {
    }
    
    public static String teljesites(double doga1, double doga2, double doga3, double doga4, double zh, int hazik) {

        double osszPont = doga1 + doga2 + doga3 + doga4 + zh + hazik;
        System.out.println(osszPont);
        return (hazik >=1 && (doga1 + doga2 + doga3 + doga4) >= 10 && zh >= 17 && osszPont >= 50) ?
                "sikeres"
                :
                "sikertelen";

    }

}
