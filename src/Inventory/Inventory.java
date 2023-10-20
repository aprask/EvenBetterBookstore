package Inventory;

import Inventory.Item.Item;

import java.util.ArrayList;

public class Inventory
{
    ArrayList<Item> itemList = new ArrayList<Item>();
    private static int selectionID;
    public Inventory()
    {

    }
    public void addItem(Item item)
    {
        this.itemList.add(item);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void displayMenu(int checkID)
    {
        if(checkID == 1)
        {
            System.out.println("Item Type: CD");
            for(int i = 0; i < this.getItemList().size(); i++)
            {
                if(this.getItemList().get(i).getItemSpecies() == 1)
                {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Name: " + this.getItemList().get(i).getName());
                    System.out.println("Price: " + this.getItemList().get(i).getPrice());
                    System.out.println("-----------------------------------------------");
                }
            }
        }
        if(checkID == 2)
        {
            System.out.println("Item Type: Book");
            for(int i = 0; i < this.getItemList().size(); i++)
            {
                if(this.getItemList().get(i).getItemSpecies() == 2)
                {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Name: " + this.getItemList().get(i).getName());
                    System.out.println("Price: " + this.getItemList().get(i).getPrice());
                    System.out.println("-----------------------------------------------");
                }
            }

        }
        if(checkID == 3)
        {
            System.out.println("Item Type: DVD");
            for(int i = 0; i < this.getItemList().size(); i++)
            {
                if(this.getItemList().get(i).getItemSpecies() == 3)
                {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Name: " + this.getItemList().get(i).getName());
                    System.out.println("Price: " + this.getItemList().get(i).getPrice());
                    System.out.println("-----------------------------------------------");
                }
            }

        }
    }

    public static int getSelectionID() {
        return selectionID;
    }
}
