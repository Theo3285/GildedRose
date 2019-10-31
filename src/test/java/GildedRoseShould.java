import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GildedRoseShould {

    public static final int SEED = 100;
    public static final int MINIMUM = -50;
    public static final int MAXIMUM = 101;
    private List<String> itemNames = Arrays.asList(
            "+5 Dexterity Vest",
            "Aged Brie",
            "Elixir of the Mongoose",
            "Sulfuras, Hand of Ragnaros",
            "Backstage passes to a TAFKAL80ETC concert",
            "Conjured Mana Cake");

    private Random random = new Random(SEED);

    @Test
    public void update_quality() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        List<Item> tempItems = new ArrayList<Item>();
        for (int i = 0; i < 2000; i++) {
            tempItems.add(new Item(itemName(), sellIn(), 20));
        }

        GildedRose gildedRose = new GildedRose();

        gildedRose.updateQuality(items);

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