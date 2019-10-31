import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BackstageUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("",0,0);
        BackstageUpdater updater = new BackstageUpdater(item);

        updater.updateQuality();

        assertThat("Item{name='', sellIn=-1, quality=2}", is("Item{name='', sellIn=-1, quality=2}"));
    }
}
