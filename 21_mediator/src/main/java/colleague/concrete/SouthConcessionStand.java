package colleague.concrete;

import colleague.ConcessionStand;
import mediator.Mediator;

/**
 * Concrete colleague participant
 */
public class SouthConcessionStand extends ConcessionStand {
    public SouthConcessionStand(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("South Concession Stand sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void notify(String message) {
        System.out.println("South Concession Stand gets message: " + message);
    }
}
