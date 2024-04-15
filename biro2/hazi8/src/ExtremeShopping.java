import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtremeShopping {

    private Map<String, List<Product>> extremeList;


    public ExtremeShopping() {
        extremeList = new HashMap<>();
    }

    public void addShoppingList(String shop, List<Product> productList) {
        extremeList.put(shop, productList);
    }

    public void printShoppingLists() {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, List<Product>> entry : extremeList.entrySet()) {
            str.append(entry.getKey()).append("\n");
            for (int i = 0; i < entry.getValue().size(); i++) {
                str.append(entry.getValue().get(i)).append(i < entry.getValue().size() - 1 ? " " : "");
            }
            str.append("\n");
        }
        System.out.println(str);
    }


}
