package Store;

import Inventory.Item.Item;

public interface BookStoreSpecification
{
    public void restockProduct(Item item);
    public double inventoryValue();
}
