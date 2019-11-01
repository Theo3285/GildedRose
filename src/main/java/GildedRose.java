import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = QualityFactory.getUpdaterFor(item);
            updater.updateQuality();
        }
    }
}
