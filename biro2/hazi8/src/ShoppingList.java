import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingList {

    private List<Product> items;


    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public int countProducts() {
        return items.size();
    }

    public Product getProduct(int index) {
        if (items.size() <= index || index < 0) return null;
        else return items.get(index);
    }

    public void printProducts() {
        for (Product item : items) {
            System.out.println(item.getName());
        }
    }

    public void delete(Product product) {
        items.remove(product);
    }

    public int deleteUnimportant() {
        int count = 0;
        Iterator<Product> it = items.iterator();
        while (it.hasNext()) {
            if (!it.next().isImportant()) {
                it.remove();
                count++;
            }
        }
        return count;
    }
}
