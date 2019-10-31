public class AgedBrieUpdater extends ItemUpdater {

    AgedBrieUpdater(Item item) {
        super(item);
    }

    public void updateQuality() {
        increaseQuality();
        if (item.getSellIn() < 0)
            increaseQuality();
    }
}
