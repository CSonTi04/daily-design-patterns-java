package colleague;

import mediator.Mediator;

/**
 * Colleague participant
 */
public abstract class ConcessionStand {
    protected Mediator mediator;

    protected ConcessionStand(Mediator mediator) {
        this.mediator = mediator;
    }

}
