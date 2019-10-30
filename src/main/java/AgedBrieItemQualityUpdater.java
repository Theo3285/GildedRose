public class AgedBrieItemQualityUpdater {
    private Item item;

    public AgedBrieItemQualityUpdater(Item item) {
        this.item = item;
    }

    public void update() {

    }

    @Override
    public String toString() {
        return "AgedBrieItemQualityUpdater{" +
                "name=" + item.getName()
                +", sellIn=" + item.getSellIn()
                +", quality="+item.getQuality()
                +"}";
    }
}
