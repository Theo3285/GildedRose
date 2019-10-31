import org.junit.Test;

public class SulfurasUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",0,0);
        ItemUpdater updater = new SulfurasUpdater(item);
        updater.updateQuality();
    }
}
