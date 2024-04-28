

import java.util.*;

public class Zh4 {
    public static Collection<Hallgato> rendez(Hallgato[] hallgatok) {

        if (hallgatok == null || hallgatok.length == 0) {
            return Collections.emptyList();
        }

        List<Hallgato> hallgatoList = Arrays.asList(hallgatok);

        Collections.sort(hallgatoList);
        return hallgatoList;

    }

    public static void teljesitesNelkuliekTorlese(List<Hallgato> hallgatok) {

        hallgatok.removeIf(hallgato -> hallgato.getTeljesitesek().isEmpty());

    }

    /**
     * A main metodusban kedved szerint kiprobalhatod a programod, tesztelheted, amihez felhasznalhatod
     * a mar adott hallgatokat, de ujakat is keszithetsz.
     * A main atirasa egyaltalan nem befolyasolja a kiertekeles menetet!
     *
     * @param args
     */
    public static void main(String[] args) {
        Hallgato hallgato1 = new Hallgato("Bela", "Kiss", "NGRSPJ", new HashMap<String, Integer>() {{
            put("Kalkulus", 5);
            put("Diszkret matek", 4);
            put("Programozas alapjai", 3);
        }});
        Hallgato hallgato2 = new Hallgato("Bela", "Abraham", "XGRSPJ", new HashMap<String, Integer>() {{
            put("Kalkulus", 4);
            put("Diszkret matek", 4);
            put("Programozas alapjai", 4);
        }});
        Hallgato hallgato3 = new Hallgato("Inez", "Mikola", "JRRAGS", new HashMap<String, Integer>() {{
            put("Algoritmusok", 5);
            put("Diszkret matek", 4);
        }});

        Hallgato[] hallgatok = new Hallgato[]{hallgato1, hallgato2, hallgato3};
        rendez(hallgatok);
        for (Hallgato adottHallgato : hallgatok) {
            System.out.println(adottHallgato); // Eredmenyek kiirasa
        }
    }


}