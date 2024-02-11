package entrypoint;

import colleague.concrete.NorthConcessionStand;
import colleague.concrete.SouthConcessionStand;
import mediator.concrete.ConcessionMediator;

public class Program {
    public static void main(String[] args) {
        var mediator = new ConcessionMediator();
        var leftKitchen = new NorthConcessionStand(mediator);
        var rightKitchen = new SouthConcessionStand(mediator);

        mediator.setNorthConcessionStand(leftKitchen);
        mediator.setSouthConcessionStand(rightKitchen);

        leftKitchen.send("Can you send some popcorn?");
        rightKitchen.send("Sure thing, Kenny's on his way.");

        rightKitchen.send("Do you have any extra hot dogs? We've had a rush on them over here.");
        leftKitchen.send("Just a couple, we'll send Kenny back with them.");
    }
}
