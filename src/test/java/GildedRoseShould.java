import org.approvaltests.Approvals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class GildedRoseShould {

    @Mock
    Console console;

    private static final int MINIMUM = -50;
    private static final int MAXIMUM = 101;
    private static final int MAXIMUM_ITEM_NUMBERS = 2000;
    private static final int SEED = 100;

    private List<String> itemsName = Arrays.asList(
            "+5 Dexterity Vest",
            "Aged Brie",
            "Elixir of the Mongoose",
            "Sulfuras, Hand of Ragnaros",
            "Backstage passes to a TAFKAL80ETC concert",
            "Conjured Mana Cake");

    private final Random random = new Random(SEED);

    @Test
    public void update_items_quality() {
        List<Item> items = buildRandomItems();
        GildedRose gildedRose = new GildedRose(console, items);

        gildedRose.updateQuality();

        Approvals.verify(buildOutputRepresentationFor(items));
    }

    private List<Item> buildRandomItems() {
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < MAXIMUM_ITEM_NUMBERS; i++) {
            items.add(new Item(itemName(), sellIn(), quality()));
        }
        return items;
    }

    private String itemName() {
        return itemsName.get(0 + random.nextInt(itemsName.size()));
    }

    private int sellIn() {
        return generateRandomNumberBetween();
    }

    private int quality() {
        return generateRandomNumberBetween();
    }

    private int generateRandomNumberBetween() {
        return MINIMUM + random.nextInt(MAXIMUM);
    }
    private String buildOutputRepresentationFor(List<Item> items) {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {
            builder.append(item + "\r");
        }
        return builder.toString();
    }
}
