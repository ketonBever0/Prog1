import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] rawFiles = new String[]{"file.csv", "imgProj.ps", "READ.ME", "excel.csv", "meresek.csv"};
        List<String> files = new ArrayList<String>(List.of(rawFiles));

        for (String file : files) {
            if (file.endsWith(".csv")) {
                int pos = file.indexOf(".csv");
                System.out.println(file.substring(0, pos));
            }
        }


    }
}