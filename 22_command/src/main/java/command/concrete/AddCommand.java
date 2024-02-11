package command.concrete;

import command.OrderCommand;
import model.MenuItem;

import java.util.List;

public class AddCommand extends OrderCommand {
    @Override
    public void executeCommand(List<MenuItem> currentItems, MenuItem menuItem) {
        currentItems.add(menuItem);
    }
}
