public class HotDrink extends BottleOfWater{
    
    private int temprature;
    public HotDrink(String name, int cost, int volume, int temprature){
        super(name, cost, volume);
        this.temprature = temprature;
    }

    public int getTemp(){
        return temprature;
    }

    public void setTemp(int temprature){
        this.temprature = temprature;
    }

    @Override
    public String toString(){
        return "BottleOfWater {" +
                "name = " + super.getName() +        
                "; cost = " + super.getCost() +
                "; volume = " + super.getVolume() +
                "; temprature = " + temprature + '}';
    }
}
