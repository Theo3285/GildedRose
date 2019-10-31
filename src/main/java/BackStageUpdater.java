public class BackStageUpdater extends ItemUpdater {

    BackStageUpdater(Item item) {
        super(item);
    }

    public void updateQuality() {
        increaseQuality();

        if (item.getSellIn() < 10) {
            increaseQuality();
        }

        if (item.getSellIn() < 5) {
            increaseQuality();
        }

        if (item.getSellIn() < 0)
            item.setQuality(0);
    }
}
