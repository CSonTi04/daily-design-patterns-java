package mediator.concrete;

import colleague.ConcessionStand;
import colleague.concrete.NorthConcessionStand;
import colleague.concrete.SouthConcessionStand;
import mediator.Mediator;

public class ConcessionMediator implements Mediator {
    private NorthConcessionStand northConcessionStand;
    private SouthConcessionStand southConcessionStand;

    public void setNorthConcessionStand(NorthConcessionStand northConcessionStand) {
        this.northConcessionStand = northConcessionStand;
    }

    public void setSouthConcessionStand(SouthConcessionStand southConcessionStand) {
        this.southConcessionStand = southConcessionStand;
    }

    @Override
    public void sendMessage(String message, ConcessionStand sender) {
        if (sender == northConcessionStand) {
            southConcessionStand.notify(message);
        } else {
            northConcessionStand.notify(message);
        }
    }
}
