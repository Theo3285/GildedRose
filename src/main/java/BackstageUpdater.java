class BackstageUpdater extends ItemUpdater{

    BackstageUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < TEN_DAYS) {
            increaseQuality(item);
        }

        if (item.getSellIn() < FIVE_DAYS) {
            increaseQuality(item);
        }

        if (item.getSellIn() < ZERO_DAY) {
            item.setQuality(0);
        }
    }
}
