public class Zeneszam implements BesorolassalRendelkezo {

    private String eloado;
    private String szamCim;
    private String szoveg;

    public Zeneszam(String eloado, String szamCim, String szoveg) {
        this.eloado = eloado;
        this.szamCim = szamCim;
        this.szoveg = szoveg;
    }

    public String getEloado() {
        return eloado;
    }

    public String getSzamCim() {
        return szamCim;
    }

    @Override
    public int getKorhatarBesorolas() {
        int korhatarBesorolas = 0;
        String[] szavak = this.szoveg.split(" ");
        for (String szo : szavak) {
            if (szo.equals("xeierirg") || szo.equals("kuoulzz") ||
                    szo.equals("pqtruei") || szo.equals("fktilop") ||
                    szo.equals("kxre") || szo.equals("eifei") ||
                    szo.equals("csozrox")) korhatarBesorolas++;
        }
        return korhatarBesorolas;
    }
}
