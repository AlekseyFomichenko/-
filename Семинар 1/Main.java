import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater("qwe", 123, 100));
        productList.add(new BottleOfWater("asd", 200, 350));
        productList.add(new BottleOfWater("fgh", 150, 150));
        productList.add(new BottleOfWater("uyt", 654, 750));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("qwe"));

        productList.add(new HotDrink("poi", 133, 300, 70));
        productList.add(new HotDrink("iuy", 654, 300, 95));
        productList.add(new HotDrink("jhg", 404, 300, 50));
        productList.add(new HotDrink("hgf", 454, 300, 80));
        productList.add(new HotDrink("lkj", 321, 500, 70));

        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine();
        vendingMachine2.initProduct(productList);
        System.out.println(vendingMachine2.getProduct("iuy"));
    }
}
