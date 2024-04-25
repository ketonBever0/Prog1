import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Az absztrakt osztalyokat nem lehet peldanyositani
        //Allat allatom = new Allat("Dezső",10,2);
        //System.out.println(allatom);

        Allat[] allatok = new Allat[10];
        allatok[0] = new Medve("Jeges",5,0.7);
        allatok[1] = new Csirke("Dezső",2,0.95);

        for(Allat egyAllat : allatok) {
            if(egyAllat != null) System.out.println(egyAllat);
        }

        System.out.println("\nMindenki hangot ad!");
        for(int i=0;i<allatok.length;i++) {
            if(allatok[i] != null)
                System.out.println(allatok[i].hangotAd());
        }


        //kollekciok
        CsordaLista csorda1 = new CsordaLista();
        csorda1.tagotHozzaad(allatok[0]);
        csorda1.tagotHozzaad(allatok[1]);
        csorda1.tagotHozzaad(allatok[0]);
        csorda1.tagotHozzaad(new Medve("Ursula",12,0.5));
        csorda1.tagotHozzaad(new Csirke("Lord Cluck",10,0.9));
        csorda1.tagotHozzaad(new Oroszlan("Szonja",12,0.8));
        csorda1.tagotHozzaad(new Csirke("Lord Cluck",1,1));

        System.out.println(csorda1);

        //csorda1.tagotKidob(allatok[0]);

        System.out.println(csorda1);

        //Halmaz - set - mint a matematikai halmaz
        //elemeket tarol, nincsenek rendezve
        //itt nem ertelmezett az index
        //minden elemet egyszer tud tartalmazni
        Set<Allat> novenyevok = new TreeSet<>();
        Set<Allat> ragadozok = new TreeSet<>();
        //megvalositasai a HashSet es TreeSet
        //a parancsai mint a listanak
        for(Allat egyAllat : csorda1.tagok) {
            if(egyAllat instanceof Novenyevo) novenyevok.add(egyAllat);
            if(egyAllat instanceof Ragadozo) ragadozok.add(egyAllat);
        }

        //tobbfelekepp bejarhatjuk a halmazokat is
        //elemenkent - forEach
        System.out.println("Az összes növényevőnk: ");
        for(Allat egyAllat : novenyevok) {
            System.out.println(egyAllat);
        }

        //indexenkent nem lehet, mert nincsenek sorrendben
        //for(int i=0;i<novenyevok.size();i++) System.out.println(novenyevok[i]);

        //iterator - ez is sorban bejarja
        Iterator<Allat> ragadozoIterator = ragadozok.iterator();
        System.out.println("\n\nAz összes ragadozónk:");
        while(ragadozoIterator.hasNext()) {
            Allat egyAllat = ragadozoIterator.next();
            System.out.println(egyAllat);
        }

        //Map - asszociativ tomb
        //kulcs - ertek parok
        Map<String, Integer> elofordulasSzamok = new HashMap<>();
        //A ket megvalositasa HashMap es TreeMap
        for(Allat egyAllat : csorda1.tagok) {
            if(elofordulasSzamok.containsKey(egyAllat.getNev())) {
                //itt a getbe nem szamot, hanem a kulcs tipusat irjuk
                int eddigiSzama = elofordulasSzamok.get(egyAllat.getNev());
                eddigiSzama++;
                //put-al tudjuk hozzaadni
                //ez felulirja ami eddig ott volt
                elofordulasSzamok.put(egyAllat.getNev(), eddigiSzama);
            }
            else {
                elofordulasSzamok.put(egyAllat.getNev(),1);
            }
        }

        //bejarjuk
        //csinalhatunk belole halmazt igy, ezt bejarhatjuk:
        //elofordulasSzamok.keySet();

        System.out.println("\n\nNév szerint az állatok száma:");
        for(Map.Entry<String, Integer> egyElofordulas : elofordulasSzamok.entrySet()) {
            System.out.println(egyElofordulas.getKey() + ": "
                    + egyElofordulas.getValue());
        }

    }

}
