package models;

public class WatchableItem
extends Item
implements Watchable {
    
    private boolean ultraHD;

    public WatchableItem(String itemName, String itemYear, boolean ultraHD) {
        super(itemName, itemYear);
        this.ultraHD = ultraHD;
    }

    @Override
    public boolean isUltraHD() {
        return ultraHD;
    }
 
}
