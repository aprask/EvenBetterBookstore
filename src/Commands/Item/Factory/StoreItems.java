package Commands.Item.Factory;

import Commands.Item.Inventory;
import Commands.Item.Item;
import Commands.*;

public class StoreItems implements Command {
    private final Inventory inventory;
    public StoreItems(Inventory inventory)
    {
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        System.out.println("Total Number of Items: " + inventory.getItemList().size());
    }

    public void storeItem(Item item)
    {
        this.inventory.addItem(item);
    }
}
