package Inventory.Item;

public class Book extends Item
{
    private int pageCount;
    public Book(String itemName, double itemPrice, int id, int pageCount, int itemSpecies) {
        super(itemName, itemPrice, id, itemSpecies);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public String comparePrices(Item item1, Item item2) {
        return super.comparePrices(item1,item2);
    }
}
