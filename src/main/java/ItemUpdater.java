public abstract class ItemUpdater {

    Item item;

    ItemUpdater(Item item) {
        this.item = item;
    }

    abstract void updateQuality();

    void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
