import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GildedRoseShould {

    private static final int SEED = 100;
    private static final int MINIMUM = -50;
    private static final int MAXIMUM = 101;
    private static final int NUMBER_OF_RANDOM_ITEMS = 2000;

    private Random random = new Random(SEED);

    private List<String> itemNames = Arrays.asList(
            "+5 Dexterity Vest",
            "Aged Brie",
            "Elixir of the Mongoose",
            "Sulfuras, Hand of Ragnaros",
            "Backstage passes to a TAFKAL80ETC concert",
            "Conjured Mana Cake");

    @Test
    public void update_quality() {
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < NUMBER_OF_RANDOM_ITEMS; i++) {
            items.add(new Item(itemName(), sellIn(), quality()));
        }

        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Approvals.verify(buildApprovedOutputFrom(items));
    }

    private String itemName() {
        return itemNames.get(random.nextInt(itemNames.size()));
    }

    private int sellIn() {
        return generateRandomNumber();
    }

    private int quality() {
        return generateRandomNumber();
    }

    private int generateRandomNumber(){
        return MINIMUM + random.nextInt(MAXIMUM);
    }

    private String buildApprovedOutputFrom(List<Item> items) {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {
            builder.append(item.toString() + "\r");
        }
        return builder.toString();
    }
}