package command.concrete;

import command.OrderCommand;
import model.MenuItem;

import java.util.List;

public class RemoveCommand extends OrderCommand {
    @Override
    public void executeCommand(List<MenuItem> currentItems, MenuItem menuItem) {
        currentItems.stream().filter(item -> item.getName().equals(menuItem.getName())).findFirst().ifPresent(currentItems::remove);
    }
}
