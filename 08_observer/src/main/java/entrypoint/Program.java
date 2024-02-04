package entrypoint;

import observer.concrete.ConcreteRestaurant;
import subject.concrete.Carrots;

public class Program {
    public static void main(String[] args) {
        // Create carrots and attach restaurants
        Carrots carrots = new Carrots(0.82);
        carrots.attach(new ConcreteRestaurant("Mackay's", 0.77));
        carrots.attach(new ConcreteRestaurant("Johnny's Sports Bar", 0.74));
        carrots.attach(new ConcreteRestaurant("Salad Kingdom", 0.75));

        // Fluctuating carrot prices will notify subscribing restaurants
        carrots.setPricePerPound(0.79);
        carrots.setPricePerPound(0.76);
        carrots.setPricePerPound(0.74);
        carrots.setPricePerPound(0.81);

    }
}
