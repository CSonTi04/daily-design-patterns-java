package receiver;

import command.OrderCommand;
import model.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver participant
 */
public class FastFoodOrder {
    private List<MenuItem> currentItems;

    public FastFoodOrder() {
        this.currentItems = new ArrayList<>();
    }

    public List<MenuItem> getCurrentItems() {
        return currentItems;
    }

    public void setCurrentItems(List<MenuItem> currentItems) {
        this.currentItems = currentItems;
    }

    public void executeCommand(OrderCommand orderCommand, MenuItem menuItem) {
        orderCommand.executeCommand(this.currentItems, menuItem);
    }

    public void showCurrentItems() {
        this.currentItems.forEach(item -> System.out.println(item.toString()));
        System.out.println("--------------------------------------------------------------------------------");
    }
}
