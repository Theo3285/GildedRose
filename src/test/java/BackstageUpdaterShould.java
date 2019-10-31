import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BackstageUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,0);
        ItemUpdater updater = new BackstageUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='Backstage passes to a TAFKAL80ETC concert', sellIn=-1, quality=0}"));
    }
}
