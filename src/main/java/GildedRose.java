import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private static List<Item> items = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
    }


    public static void updateQuality() {
        for (Item item : items) {
            if (nameIsSulfuras(item)) {
            } else {
                item.setSellIn(item.getSellIn() - 1);
            }
            if (nameIsAgedBrie(item)) {
                increaseQuality(item);
                if (item.getSellIn() < 0)
                    increaseQuality(item);
            } else if (nameIsBackStage(item)) {
                increaseQuality(item);

                if (item.getSellIn() < 10) {
                    increaseQuality(item);
                }

                if (item.getSellIn() < 5) {
                    increaseQuality(item);
                }
                if (item.getSellIn() < 0)
                    item.setQuality(0);
            } else if (nameIsSulfuras(item)) {
                    continue;
            } else {
                decreaseQuality(item);
                if (item.getSellIn() < 0)
                    decreaseQuality(item);
            }
        }
    }

    private static boolean nameIsBackStage(Item item) {
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.getName());
    }

    private static boolean nameIsAgedBrie(Item item) {
        return "Aged Brie".equals(item.getName());
    }

    private static boolean nameIsSulfuras(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }

    private static void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    private static void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public List<Item> updateQuality(List<Item> items) {
        this.items = items;
        this.updateQuality();
        return this.items;
    }
}
