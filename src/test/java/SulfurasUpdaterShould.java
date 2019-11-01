import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SulfurasUpdaterShould {
    @Test
    public void never_sold_or_decrease_in_quality() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 0);
        ItemUpdater updater = new SulfurasUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=0}"));
    }
}
