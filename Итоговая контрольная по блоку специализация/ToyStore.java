import java.util.PriorityQueue;

public class ToyStore {
    PriorityQueue<Toy> tPriorityQueue;

    public ToyStore() {
        tPriorityQueue = new PriorityQueue<>();
    }

    public Integer get(){ // должен возвращать id игрушки
        // Нужно реализовать метод, который будет вытягивать игрушку из очереди, но не удалять её оттуда.
        // Использовать метод rule()
        return 0;
    }
    
    public void put(Toy toy){
        tPriorityQueue.add(toy);
    }

    private void rule(){
        // Также нужно задать здесь правило вытягивания из очереди
    }
}
