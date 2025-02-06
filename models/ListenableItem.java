package models;

public class ListenableItem
extends Item
implements Listenable {

    private boolean parentalAdvisory;

    public ListenableItem(String itemName, String itemYear, boolean parentalAdvisory) {
        super(itemName, itemYear);
        this.parentalAdvisory = parentalAdvisory;
    }

    @Override
    public boolean isParentalAdvisory() {
        return parentalAdvisory;
    }
    
}
