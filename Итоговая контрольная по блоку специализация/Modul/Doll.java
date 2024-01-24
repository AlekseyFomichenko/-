package Modul;

/** 
 * Класс-наследник игрушки Toy
*/
public class Doll extends Toy{

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - Название игрушки
     * @param frequency - Частота выпадения
     */
    public Doll(String name, Integer frequency) {
        super(name, frequency);
    }
}
