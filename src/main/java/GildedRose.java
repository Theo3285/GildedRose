import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public GildedRose() {
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = QualityFactory.getUpdaterFor(item);
            updater.updateQuality();
        }
    }

//    public List<Item> updateQuality(List<Item> items) {
//        this.items = items;
//        this.updateQuality();
//        return this.items;
//    }

}
