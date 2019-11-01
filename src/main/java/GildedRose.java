import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private static List<Item> items = null;

    public GildedRose(List<Item> items) {
    }

    public GildedRose() {
    }

    public static void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = QualityFactory.getUpdaterFor(item);
            updater.updateQuality();
        }
    }

    public List<Item> updateQuality(List<Item> items) {
        this.items = items;
        this.updateQuality();
        return this.items;
    }

}
