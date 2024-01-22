/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        ToyStore toyStore = new ToyStore();

        Toy erToy = new ErectorSet("Конструктор", 2);
        Toy rToy = new Robot("Робот", 2);
        Toy dToy = new Doll("Кукла", 6);

        toyStore.put(dToy);
        toyStore.put(rToy);
        toyStore.put(erToy);

        Saving.createFile();

        int count = 0;
        while (count++ != 10) {
            Saving.save(toyStore.get());
        }
    }
}