class NormalUpdater extends ItemUpdater{

    NormalUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        decreaseQuality(item);

        if (item.getSellIn() < ZERO_DAY) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.getQuality() > ZERO_DAY) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
