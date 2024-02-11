package invoker;

import command.OrderCommand;
import command.concrete.CommandFactory;
import model.MenuItem;
import receiver.FastFoodOrder;

/**
 * Invoker participant
 */
public class Patron {
    private OrderCommand orderCommand;
    private MenuItem menuItem;
    private final FastFoodOrder fastFoodOrder;

    public Patron() {
        this.fastFoodOrder = new FastFoodOrder();
    }

    public void setOrderCommand(CommandFactory.CommandType commandType) {
        this.orderCommand = new CommandFactory().createCommand(commandType);
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void executeCommand() {
        fastFoodOrder.executeCommand(orderCommand, menuItem);
    }

    public void showCurrentOrder() {
        fastFoodOrder.showCurrentItems();
    }
}
