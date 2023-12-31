package Commands.Item;

public abstract class Item implements Comparable {
    private String name;
    private double price;
    private boolean sold;
    private int ID;
    private int itemSpecies;

    public Item(String itemName) {
        this.name = itemName;
        this.sold = false;
    }

    public Item(String itemName, double itemPrice, int id, int itemSpecies) {
        this.name = itemName;
        this.price = itemPrice;
        this.sold = false;
        this.ID = id;
        this.itemSpecies = itemSpecies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getItemSpecies() {
        return itemSpecies;
    }

    public void setItemSpecies(int itemSpecies) {
        this.itemSpecies = itemSpecies;
    }
    @Override
    public String comparePrices(Item item1, Item item2) {
        if(item1.getPrice() > item2.getPrice())
        {
            return item1.getName() + " is more expensive than " + item2.getPrice();
        }
        else if(item1.getPrice() == item2.getPrice())
        {
            return item1.getName() + " is the same price as " + item2.getPrice();
        }
        else if(item2.getPrice() > item1.getPrice())
        {
            return item2.getName() + " is more expensive than " + item1.getPrice();
        }
        return null;
    }
}
