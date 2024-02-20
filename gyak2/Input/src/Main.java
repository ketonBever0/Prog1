import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Írj be egy számot: ");


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();
        System.out.println(number);

        System.out.printf("Add meg a neved: ");
        String name = sc.nextLine();
        System.out.println(name);


        String adminName = "Admin";
        int adminPassword = 69;

        boolean isAdmin = (number == adminPassword) && (name.equals(adminName));

        if (isAdmin) {
            System.out.println("Üdvözöllek az admin felületen!");
        } else {
            System.err.println("Nem vagy admin!");
        }


    }
}