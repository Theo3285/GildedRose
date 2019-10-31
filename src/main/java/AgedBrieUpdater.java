public class AgedBrieUpdater extends ItemUpdater{
    //private Item item;

    AgedBrieUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        decreaseSellIn(item);

        increaseQuality(item);

        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
    }
//
//    private void decreaseSellIn(Item item) {
//        item.setSellIn(item.getSellIn() - 1);
//    }
//
//    private void increaseQuality(Item item) {
//        if (item.getQuality() < 50) {
//            item.setQuality(item.getQuality() + 1);
//        }
//    }
}
