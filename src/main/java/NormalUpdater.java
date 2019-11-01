class NormalUpdater extends ItemUpdater{

    NormalUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        decreaseQuality();

        if (item.getSellIn() < ZERO_DAY) {
            decreaseQuality();
        }
    }

    void decreaseQuality() {
        if (item.getQuality() > ZERO_DAY) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
