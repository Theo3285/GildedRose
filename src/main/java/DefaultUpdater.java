class DefaultUpdater extends ItemUpdater{

    DefaultUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        decreaseQuality(item);

        if (item.getSellIn() < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
