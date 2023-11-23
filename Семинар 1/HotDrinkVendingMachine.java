import java.util.ArrayList;
import java.util.List;


public class HotDrinkVendingMachine implements VendingMachine{
    
    private List<Product> drinkList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> drinkList){
        this.drinkList = drinkList;
    }

    @Override
    public Product getProduct(String name){
        for (Product item : drinkList) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Product geProduct(String name, int volume, int temprature){
        for (Product item : drinkList) {
            if (item.getName().equals(name) && 
            ((BottleOfWater)item).getVolume() == volume && 
            ((HotDrink)item).getTemp() == temprature)
            {
                return item;
            }
        }
        return null;
    }
}
