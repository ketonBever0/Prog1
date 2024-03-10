import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Nyomozo ny1 = new Nyomozo(new String[]{"Károly", "Bajnok", "Károly", "Petrus", "Petrus", "Károly", "Laca"}, new int[]{2, 5, 6, 3, 9, 12, 52});

//        System.out.println(Arrays.toString(ny1.nyomok));
//        System.out.println(ny1.nyomotFelhasznal(2));
//        System.out.println(Arrays.toString(ny1.nyomok));
//
//        System.out.println(Arrays.toString(ny1.gyanusitottak));
//        System.out.println(ny1.felmentoBizonyitek("Petrus"));
//        System.out.println(Arrays.toString(ny1.gyanusitottak));
//
//        System.out.println();
//        System.out.println(Arrays.toString(ny1.gyanusitottak));
//        ny1.inditek();
//        System.out.println(Arrays.toString(ny1.gyanusitottak));
//
//        System.out.println();
//        System.out.println(Arrays.toString(ny1.nyomok));
//        ny1.nyomokatRendez();
//        System.out.println(Arrays.toString(ny1.nyomok));


        ny1.alibikEliminalasa();


    }
}