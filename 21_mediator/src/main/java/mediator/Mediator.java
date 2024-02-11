package mediator;

import colleague.ConcessionStand;

/**
 * Mediator participant
 */
public interface Mediator {
    void sendMessage(String message, ConcessionStand sender);
}
