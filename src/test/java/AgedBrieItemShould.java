import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieItemShould {
    @Test
    public void do_something() {
        Item agedBrieItem = new Item("Aged Brie", 2, 0);
        AgedBrieItemQualityUpdater agedBrieQualityUpdater = new AgedBrieItemQualityUpdater(agedBrieItem);

        agedBrieQualityUpdater.update();

        assertThat(agedBrieQualityUpdater.toString(), is("AgedBrieItemQualityUpdater{name=Aged Brie, sellIn=2, quality=0}"));
    }
}
