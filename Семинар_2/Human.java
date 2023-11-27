package Семинар_2;

public class Human extends Actor{
    
    public Human(String name){
        super(name);
    }
    
    @Override
    public String getName(){
        return super.name;
    }

    @Override
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder){
        super.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder){
        super.isTakeOrder = isTakeOrder;
    }

    
}
