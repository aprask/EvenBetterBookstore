package Commands;

import Commands.Item.Item;

public interface BookStoreSpecification
{
    public void restockProduct(Item item);
    public double inventoryValue();
}
