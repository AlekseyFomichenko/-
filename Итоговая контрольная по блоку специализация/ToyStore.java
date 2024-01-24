import java.util.PriorityQueue;

import Modul.Toy;
/*
 * Класс игрового автомата
 */
public class ToyStore {
    //region fields

    PriorityQueue<Toy> tPriorityQueue;
    
    //endregion

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param tPriorityQueue - очередь с приоритетом
     */
    public ToyStore() {
        this.tPriorityQueue = new PriorityQueue<>();
    }

    /** 
     * Функция получения и удаления игрушки из очереди
     * @return возвращает экземпляр игрушки
     */
    public Toy get() {
        return tPriorityQueue.poll();
    }

    /** 
     * Функция загрузки игрушки в очередь
     * @param toy - игрушка
     */
    public void put(Toy toy) {
        tPriorityQueue.add(toy);
    }
}
