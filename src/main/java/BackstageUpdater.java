public class BackstageUpdater {
    private Item item;

    BackstageUpdater(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < 10) {
            increaseQuality(item);
        }

        if (item.getSellIn() < 5) {
            increaseQuality(item);
        }

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }

    private void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
