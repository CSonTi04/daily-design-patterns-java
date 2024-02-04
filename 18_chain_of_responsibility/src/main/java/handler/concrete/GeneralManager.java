package handler.concrete;

import handler.Approver;
import model.PurchaseOrder;

public class GeneralManager extends Approver {
    @Override
    public void processRequest(PurchaseOrder purchaseOrder) {
        if (purchaseOrder.getPrice() < 10000) {
            System.out.println(this.getClass().getSimpleName() + " approved purchase order " + purchaseOrder.getNumber());
        } else {
            System.out.println("Purchase order " + purchaseOrder.getNumber() + " requires an executive board meeting!");
        }
    }
}
