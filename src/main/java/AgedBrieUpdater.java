public class AgedBrieUpdater {
    private Item item;

    public AgedBrieUpdater(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
    }

    private static void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    private static void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
