package Modul;

/** 
 * Класс игрушки. Описывает поля и методы любой игрушки
*/
public abstract class Toy implements Comparable<Toy>{
    //region fields

    private final Integer id;
    private String name;
    private Integer frequency;
    static Integer count = 0;

    //endregion

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - Название игрушки
     * @param frequency - Частота выпадения
     */
    public Toy(String name, Integer frequency) {
        this.id = ++count;
        this.name = name;
        this.frequency = frequency;
    }

    //region Getters

    public String getName() {
        return name;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public Integer getId() {
        return id;
    }

    //endregion

    /** 
     * Переопределение toString() для понятной записи результата в файл
     * @return возвращает строку с параметрами выпаденной игрушки
     */
    @Override
    public String toString() {
        return String.format("id toy: %d | name toy: %s | frequency toy: %d ", id, name, frequency);
    }

    /** 
     * Метод создания правила для выпадения из очереди
     * @param toy - игрушка
     */
    @Override
    public int compareTo(Toy toy) {
        if (frequency < toy.getFrequency()) {
            return 1;
        }
        if (frequency == toy.getFrequency()) {
            return 0;
        }
        return -1;
    }

    
}
