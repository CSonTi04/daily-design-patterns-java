package colleague.concrete;

import colleague.ConcessionStand;
import mediator.Mediator;

/**
 * Concrete colleague participant
 */

public class NorthConcessionStand extends ConcessionStand {
    public NorthConcessionStand(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("North Concession Stand sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void notify(String message) {
        System.out.println("North Concession Stand gets message: " + message);
    }
}
