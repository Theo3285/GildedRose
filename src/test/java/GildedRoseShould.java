import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GildedRoseShould {

    private List<String> itemNames = Arrays.asList("","","","","","");

    @Test
    public void update_quality() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose();

        gildedRose.updateQuality(items);

        Approvals.verify(buildApprovedOutputFrom(items));
    }

    private String buildApprovedOutputFrom(List<Item> items) {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {
            builder.append(item.toString() + "\r");
        }
        return builder.toString();
    }
}