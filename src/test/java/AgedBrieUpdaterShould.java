import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("Aged Brie",0,0);

        ItemUpdater updater = new AgedBrieUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='Aged Brie', sellIn=-1, quality=2}"));
    }
}
