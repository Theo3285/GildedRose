class ConjuredUpdater extends NormalUpdater{

    ConjuredUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        super.updateQuality();
        decreaseQuality();
    }
}
