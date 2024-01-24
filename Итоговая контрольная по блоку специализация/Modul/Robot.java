package Modul;

/** 
 * Класс-наследник игрушки Toy
*/
public class Robot extends Toy{

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - Название игрушки
     * @param frequency - Частота выпадения
     */
    public Robot(String name, Integer frequency) {
        super(name, frequency);
    }
}
