

import java.util.*;

public class Zh4 {
    public static Collection<Autoszallito> rendez(Autoszallito[] autoszallitok) {
        if (autoszallitok == null || autoszallitok.length == 0) return new TreeSet<>();
        return new TreeSet<>(List.of(autoszallitok));
    }

    public static void furakTorlese(List<Autoszallito> autoszallitok) {
        Iterator<Autoszallito> it = autoszallitok.iterator();
        while (it.hasNext()) {
            Autoszallito szallito = it.next();
            OptionalDouble atlag = szallito.getElszallitottAutok().values().stream().mapToDouble(Integer::doubleValue).average();
            if (atlag.isPresent() && atlag.getAsDouble() < 100) it.remove();
        }
    }

    /**
     * A main metodusban kedved szerint kiprobalhatod a programod, tesztelheted, amihez felhasznalhatod
     * a mar adott autoszallitokat, de ujakat is keszithetsz.
     * A main atirasa egyaltalan nem befolyasolja a kiertekeles menetet!
     *
     * @param args
     */
    public static void main(String[] args) {
        Autoszallito autoszallito1 = new Autoszallito("Istvan", "Kiss", "SZ-TE-001", new HashMap<String, Integer>(){{put("BME-002",100); put("BME-003",200); put("BME-004",50);}});
        Autoszallito autoszallito2 = new Autoszallito("Bela", "Nagy", "SED-001", new HashMap<String, Integer>(){{put("DIP-001",121); put("DIP-002",322); put("GJA-303",530);}});
        Autoszallito autoszallito3 = new Autoszallito("Kati", "Samu", "KA-TI-002", new HashMap<String, Integer>(){{put("BE-LA-212",524); put("JA-NI-001",325);}});

        Autoszallito[] autoszallitok = new Autoszallito[]{autoszallito1, autoszallito2, autoszallito3};
        Collection<Autoszallito> rendezett = rendez(autoszallitok);
        for (Autoszallito a : rendezett) {
            System.out.println(a); // Eredmenyek kiirasa
        }
    }
}