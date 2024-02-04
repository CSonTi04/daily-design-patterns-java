package handler.concrete;

import handler.Approver;
import model.PurchaseOrder;

public class PurchasingManager extends Approver {
    @Override
    public void processRequest(PurchaseOrder purchaseOrder) {
        if (purchaseOrder.getPrice() < 2500) {
            System.out.println(this.getClass().getSimpleName() + " approved purchase order " + purchaseOrder.getNumber());
        } else if (supervisor != null) {
            supervisor.processRequest(purchaseOrder);
        }
    }
}
