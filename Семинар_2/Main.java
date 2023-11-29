package Семинар_2;

public class Main {
    public static void main(String[] args) {

        Market Auchan = new Market();
        Human bro = new Human("Nikita");
        Human dude = new Human("Danila");

        Auchan.acceptToMarket(bro);
        // Auchan.update();
        Auchan.acceptToMarket(dude);
        Auchan.update();

    }
}
