import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BestPriceFinder {

    private Map<String, String> bestBuys;


    public BestPriceFinder() {
        bestBuys = new HashMap<>();
    }


    public void addProduct(Product product, String shop) {
        bestBuys.put(product.getName(), shop);
    }

    public String getShopFor(String product) {
        if (!bestBuys.containsKey(product)) return null;
        return bestBuys.get(product);
    }

    public void printBestBuys() {
        for (Map.Entry<String, String> bestBuy : bestBuys.entrySet()) {
            System.out.printf("Buy %s at %s.%n", bestBuy.getKey(), bestBuy.getValue());
        }
    }

    public int deleteShop(String shop) {
        int count = 0;
        for (Map.Entry<String, String> bestBuy : bestBuys.entrySet()) {
            if (Objects.equals(bestBuy.getValue(), shop)) {
                bestBuys.remove(bestBuy.getKey());
                count++;
            }
        }
        return count;
    }

}
