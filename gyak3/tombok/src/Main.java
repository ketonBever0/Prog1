import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hány elemű tömböt szeretnénk:");

        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        Random rnd = new Random();

        int[] arr = new int[arrSize];   //  new kell és a mérete

        /*for (int i = 0; i < arrSize; i++) {
            arr[i] = rnd.nextInt(1000) + 1;
        }

        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i]);
        }*/

        //  forEach-el ugyanaz
        for (int i : arr) {
            arr[i] = rnd.nextInt(1000) + 1;
            System.out.println(arr[i]);

        }

        System.out.println(elsoEgeszGyok(arr) == 0 ? "\nNincs négyzetszám." : "\n" + elsoEgeszGyok(arr));


    }

    //  static: nem kell, hogy példánya legyen az adott osztálynak ahhoz, hogy tudjuk használni
    public static int elsoEgeszGyok(int[] numbers) {
        //  meghatározzuk az első egész gyökös számot
        //  gyökvonás

        double gyok = 0;
        for (int i : numbers) {
            gyok = Math.sqrt(i);

            int toInt = (int) gyok;

            if (toInt == gyok) {
                return toInt;
            }

        }

        return 0;

    }

}