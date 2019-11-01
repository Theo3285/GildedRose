import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConjuredUpdaterShould {
    @Test
    public void decrease_quality_twice_as_fast_as_normal_items() {
        Item item = new Item("Elixir of the Mongoose",2,4);
        ItemUpdater updater = new NormalUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='Elixir of the Mongoose', sellIn=1, quality=3}"));

    }
}
