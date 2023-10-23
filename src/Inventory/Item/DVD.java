package Inventory.Item;

public class DVD  extends Item{
    private double DVDLength;
    public DVD(String itemName, double itemPrice, int id, double DVDLength, int itemSpecies) {
        super(itemName, itemPrice, id, itemSpecies);
        this.DVDLength = DVDLength;
    }

    public double getDVDLength() {
        return DVDLength;
    }

    public void setDVDLength(double DVDLength) {
        this.DVDLength = DVDLength;
    }
    @Override
    public String comparePrices(Item item1, Item item2) {
        return super.comparePrices(item1,item2);
    }
}
