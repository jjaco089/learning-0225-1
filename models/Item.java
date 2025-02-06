package models;

public abstract class Item {
    
    private String itemName;
    private String itemYear;

    public Item(String itemName, String itemYear) {
        this.itemName = itemName;
        this.itemYear = itemYear;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemYear() {
        return itemYear;
    }

}
