import org.approvaltests.Approvals;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GildedRoseShould {

    private static final int MINIMUM = -50;
    private static final int MAXIMUM = 101;
    private static final int MAXIMUM_ITEM_NUMBERS = 200;
    private static final int SEED = 100;

    private List<String> itemsName = Arrays.asList(
            "+5 Dexterity Vest",
            "Aged Brie",
            "Elixir of the Mongoose",
            "Sulfuras, Hand of Ragnaros",
            "Backstage passes to a TAFKAL80ETC concert",
            "Conjured Mana Cake");

    private final Random random = new Random(SEED);
    private GildedRose gildedRose;

    @Before
    public void setUp() throws Exception {
        gildedRose = new GildedRose();
    }

    @Test
    public void update_items_quality() {
        List<Item> items = buildRandomItems(MAXIMUM_ITEM_NUMBERS);

        gildedRose.updateQuality(items);

        Approvals.verify(buildOutputRepresentationFor(items));
    }

    private List<Item> buildRandomItems(int maximumItemNumbers) {
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < maximumItemNumbers; i++) {
            items.add(new Item(itemName(), sellIn(), quality()));
        }
        return items;
    }

    private String itemName() {
        return itemsName.get(0 + random.nextInt(itemsName.size()));
    }

    private int sellIn() {
        return generateRandomNumberBetween(MINIMUM,MAXIMUM);
    }

    private int quality() {
        return generateRandomNumberBetween(MINIMUM,MAXIMUM);
    }

    private int generateRandomNumberBetween(int minimum, int maximum) {
        return minimum + random.nextInt(maximum);
    }

    private String buildOutputRepresentationFor(List<Item> items) {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {
            builder.append("Item{name='")
                    .append(item.name)
                    .append("', sellIn=")
                    .append(item.sellIn)
                    .append("', quality=")
                    .append(item.quality)
                    .append("}\n");
        }
        return builder.toString();
    }
}
