import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieItemShould {
    @Test
    public void update_quality() {
        Item agedBrieItem = new Item("Aged Brie", 2, 0);
        ItemUpdater agedBrieUpdater = new AgedBrieUpdater(agedBrieItem);

        agedBrieUpdater.updateQuality();

        assertThat(agedBrieUpdater.toString(), is("Item{name='Aged Brie', sellIn=2, quality=1}"));
    }
}
