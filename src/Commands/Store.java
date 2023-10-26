package Commands;

import Commands.Item.Item;

public class Store implements BookStoreSpecification
{


    @Override
    public void restockProduct(Item item) {

    }

    @Override
    public double inventoryValue() {
        return 0;
    }
}