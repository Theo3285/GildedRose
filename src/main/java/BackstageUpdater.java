class BackstageUpdater extends ItemUpdater{

    private static final int TEN_DAYS = 10;
    private static final int FIVE_DAYS = 5;

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
