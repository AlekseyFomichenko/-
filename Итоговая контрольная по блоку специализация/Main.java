import Modul.*;

/** 
 * Класс Main
 * @autor Алексей Фомиченко
*/
public class Main {

    public static void main(String[] args) {
        
        // Инициализируем экземпляр класса Автомат, содержащий очередь и методы загрузки и выдачи игрушек
        ToyStore toyStore = new ToyStore();

        // Создаём экземпляры игрушек
        Toy erToy = new ErectorSet("Конструктор", 5);
        Toy rToy = new Robot("Робот", 2);
        Toy dToy = new Doll("Кукла", 6);

        // Загружаем в очередь
        toyStore.put(erToy);
        toyStore.put(rToy);
        toyStore.put(dToy);
        
        // Создаём файл
        Saving.createFile();

        // Вызываем метод Get и записываем результат в файл
        int count = 0;
        while (count++ != 10) {
            Saving.save(toyStore.get());
        }
    }
}