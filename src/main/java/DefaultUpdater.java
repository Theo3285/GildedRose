public class DefaultUpdater extends ItemUpdater {

    public DefaultUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        if (item.getSellIn() < 0)
            decreaseQuality();
    }
}
