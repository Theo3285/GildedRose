class BackstageUpdater extends ItemUpdater{
    BackstageUpdater(Item item) {
        super(item);
    }

    public void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < 10) {
            increaseQuality(item);
        }

        if (item.getSellIn() < 5) {
            increaseQuality(item);
        }

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
