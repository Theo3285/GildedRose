public abstract class ItemUpdater {

    protected Item item;

    ItemUpdater(Item item) {
        this.item = item;
    }

    public String toString() {
        return item.toString();
    }

    abstract void updateQuality();

    void increaseQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    void decreaseQuality() {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    protected void updateSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }
}
