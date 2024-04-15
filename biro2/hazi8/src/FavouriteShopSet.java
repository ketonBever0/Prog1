import java.util.Set;
import java.util.TreeSet;

public class FavouriteShopSet {

    private Set<String> shops;


    public FavouriteShopSet() {
        shops = new TreeSet<>();
    }

    public void addShop(String shop) {
        shops.add(shop);
    }

    public int countShops() {
        return shops.size();
    }

    public boolean isFavourite(String shop) {
        return shops.contains(shop);
    }

    public void printShops () {
        for (String shop : shops) {
            System.out.println(shop);
        }
    }

    public void delete(String shop) {
        shops.remove(shop);
    }


}
