public class SulfuraUpdater extends ItemUpdater {

    SulfuraUpdater(Item item) {
        super(item);
    }

    public void updateQuality() {
        item.setQuality(item.getQuality());
    }

    @Override
    protected void updateSellIn() {
        item.setSellIn(item.getSellIn());
    }

}
