public abstract class ItemUpdater {

    private static final int MAXIMUM_QUALITY = 50;
    static final int ZERO_DAY = 0;

    Item item;

    ItemUpdater(Item item) {
        this.item = item;
    }

    abstract void updateQuality();

    void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    void increaseQuality(Item item) {
        if (item.getQuality() < MAXIMUM_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
