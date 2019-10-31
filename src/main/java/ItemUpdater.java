public abstract class ItemUpdater {

    private Item item;

    public ItemUpdater(Item item) {
        this.item = item;
    }

    abstract void updateQuality();

    private void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
