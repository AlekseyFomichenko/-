package Modul;

/** 
 * Класс-наследник игрушки Toy
*/
public class ErectorSet extends Toy{

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - Название игрушки
     * @param frequency - Частота выпадения
     */
    public ErectorSet(String name, Integer frequency) {
        super(name, frequency);
    }
}
