import org.junit.Test;

public class DefaultUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("",0,0);
        ItemUpdater updater = new DefaultUpdater(item);

        updater.updateQuality();
    }
}
