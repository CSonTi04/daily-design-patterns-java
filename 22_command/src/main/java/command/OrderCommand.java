package command;

import model.MenuItem;

import java.util.List;

/**
 * Command participant
 */
public abstract class OrderCommand {
    public abstract void executeCommand(List<MenuItem> currentItems, MenuItem menuItem);
}
