class AgedBrieUpdater extends ItemUpdater{

    AgedBrieUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn();

        increaseQuality(item);

        if (item.getSellIn() < ZERO_DAY) {
            increaseQuality(item);
        }
    }
}
