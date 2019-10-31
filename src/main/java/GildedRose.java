import java.util.List;

public class GildedRose {
    private List<Item> items;
    private Console console;

    public GildedRose(Console console, List<Item> items) {
        this.console = console;
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = getUpdaterFor(item);
            updater.updateSellIn();
            updater.updateQuality();
        }
    }

    void printItems() {
        for (Item item : items) {
            console.print(item.toString());
        }
    }

    private ItemUpdater getUpdaterFor(Item item) {
        if (nameIsAgedBrie(item))
            return new AgedBrieUpdater(item);
        if (nameIsBackstage(item))
            return new BackStageUpdater(item);
        if (nameIsSulfuras(item))
            return new SulfurasUpdater(item);
        return new DefaultUpdater(item);
    }

    private boolean nameIsAgedBrie(Item item) {
        return "Aged Brie".equals(item.getName());
    }

    private boolean nameIsBackstage(Item item) {
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.getName());
    }

    private boolean nameIsSulfuras(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }
}
