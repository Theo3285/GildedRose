import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DefaultUpdaterShould {
    @Test
    public void update_quality() {
        Item item = new Item("",0,0);
        ItemUpdater updater = new DefaultUpdater(item);

        updater.updateQuality();

        assertThat("", is(""));
    }
}
