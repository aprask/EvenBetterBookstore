package Inventory.Item.Factory;

import Inventory.Inventory;
import Inventory.Item.Item;
import User.Command;

public class StoreItems implements Command {
    private Inventory inventory;
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
