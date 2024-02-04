package entrypoint;

import handler.concrete.GeneralManager;
import handler.concrete.HeadChef;
import handler.concrete.PurchasingManager;
import model.PurchaseOrder;

/**
 * Entry point, acts as the client participant
 */
public class Program {
    public static void main(String[] args) {
        //Create the chain links
        var jennifer = new HeadChef();
        var mitchell = new PurchasingManager();
        var olivia = new GeneralManager();

        //Create the chain
        jennifer.setSupervisor(mitchell);
        mitchell.setSupervisor(olivia);

        //Generate and process purchase orders
        var purchaseOrder = new PurchaseOrder(1, 20, 69, "Spices");
        jennifer.processRequest(purchaseOrder);

        purchaseOrder = new PurchaseOrder(2, 300, 1389, "Fresh Veggies");
        jennifer.processRequest(purchaseOrder);

        purchaseOrder = new PurchaseOrder(3, 500, 4823.99, "Beef");
        jennifer.processRequest(purchaseOrder);
    }
}
