package handler;

import model.PurchaseOrder;

/**
 * Handler participant
 */
public abstract class Approver {
    protected Approver supervisor;

    public void setSupervisor(Approver supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void processRequest(PurchaseOrder purchaseOrder);
}
