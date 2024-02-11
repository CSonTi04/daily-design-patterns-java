package entrypoint;

import command.concrete.CommandFactory;
import invoker.Patron;
import model.MenuItem;

/**
 * Client participant
 */
public class Program {
    public static void main(String[] args) {
        var patron = new Patron();
        patron.setOrderCommand(CommandFactory.CommandType.ADD);
        patron.setMenuItem(new MenuItem("French Fries", 2, 1.99));
        patron.executeCommand();

        patron.setOrderCommand(CommandFactory.CommandType.ADD);
        patron.setMenuItem(new MenuItem("Hamburger", 2, 2.59));
        patron.executeCommand();

        patron.setOrderCommand(CommandFactory.CommandType.ADD);
        patron.setMenuItem(new MenuItem("Drink", 2, 1.19));
        patron.executeCommand();

        patron.showCurrentOrder();

        patron.setOrderCommand(CommandFactory.CommandType.REMOVE);
        patron.setMenuItem(new MenuItem("French Fries", 2, 1.99));
        patron.executeCommand();

        patron.showCurrentOrder();

        patron.setOrderCommand(CommandFactory.CommandType.MODIFY);
        patron.setMenuItem(new MenuItem("Hamburger", 4, 2.59));
        patron.executeCommand();

        patron.showCurrentOrder();

    }
}
