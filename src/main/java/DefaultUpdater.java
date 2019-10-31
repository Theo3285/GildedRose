public class DefaultUpdater extends ItemUpdater {

    DefaultUpdater(Item item) {
        super(item);
    }


    void updateQuality() {

    }

    private void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
