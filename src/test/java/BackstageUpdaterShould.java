import org.junit.Test;

public class BackstageUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("",0,0);
        BackstageUpdater updater = new BackstageUpdater(item);

        updater.updateQuality();
    }
}
