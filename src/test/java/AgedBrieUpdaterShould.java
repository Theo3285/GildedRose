import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("",0,0);

        AgedBrieUpdater updater = new AgedBrieUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='', sellIn=0, quality=0}"));
    }
}
