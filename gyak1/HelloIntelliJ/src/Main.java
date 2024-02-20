//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello Java!");

        Kenguru k1 = new Kenguru("Kanga", true, "female", 59, 15, 39.99);
//        Kenguru k2 = new Kenguru("Johnny", true, "male", 69, 70, 23.05);

        System.out.printf("Név: %s\nVan-e zsebe: %s\n", k1.name, k1.hasPockets ? "Van" : "Nincs");

        String greeting = "Hello";
        String name = "Károly";

        System.out.println(String.format("%s %s!", greeting, name));

        int sum = 0;
        for (int i = 0; i < args.length; i++) {

            try{
                sum += Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        System.out.println(String.format("Paraméterek összege: %d", sum));



    }
}