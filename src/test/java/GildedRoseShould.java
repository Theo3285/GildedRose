import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseShould {

    @Test
    public void do_something() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose();

        gildedRose.updateQuality(items);
    }

    private String buildApprovedOutputFrom(List<Item> items) {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {

        }
        return "";
    }
}