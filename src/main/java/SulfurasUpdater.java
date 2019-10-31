public class SulfurasUpdater extends ItemUpdater {

    SulfurasUpdater(Item item) {
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
