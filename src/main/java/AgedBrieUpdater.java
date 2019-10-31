public class AgedBrieUpdater {
    private Item item;

    public AgedBrieUpdater(Item item) {
        this.item = item;
    }

    public void updateQuality() {

    }

    private static void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }


    private static void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    private static void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
