package handler.concrete;

import handler.Approver;
import model.PurchaseOrder;

/**
 * Concrete handler participant
 */
public class HeadChef extends Approver {
    @Override
    public void processRequest(PurchaseOrder purchaseOrder) {
        if (purchaseOrder.getPrice() < 1000) {
            System.out.println(this.getClass().getSimpleName() + " approved purchase order " + purchaseOrder.getNumber());
        } else if (supervisor != null) {
            supervisor.processRequest(purchaseOrder);
        }
    }
}
