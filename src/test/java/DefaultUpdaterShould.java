import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DefaultUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("Elixir of the Mongoose",0,1);
        ItemUpdater updater = new DefaultUpdater(item);

        updater.updateQuality();

        assertThat(item.toString(), is("Item{name='Elixir of the Mongoose', sellIn=-1, quality=0}"));
    }
}
