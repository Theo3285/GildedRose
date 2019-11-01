class AgedBrieUpdater extends ItemUpdater{

    AgedBrieUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < ZERO_DAY) {
            increaseQuality(item);
        }
    }
}
