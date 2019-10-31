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
            if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            } else {
                item.setSellIn(item.getSellIn() - 1);
            }
            if ("Aged Brie".equals(item.getName())) {
                increaseQuality(item);
            } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
                if (item.getSellIn() < 10) {
                    increaseQuality(item);
                }

                if (item.getSellIn() < 5) {
                    increaseQuality(item);
                }
                increaseQuality(item);
            } else if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            } else {
                decreaseQuality(item);
            }


            if (item.getSellIn() < 0) {
                if ("Aged Brie".equals(item.getName())) {
                    increaseQuality(item);
                } else {
                    if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
                        item.setQuality(item.getQuality() - item.getQuality());
                    } else {
                        if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
                            continue;
                        }
                        decreaseQuality(item);
                    }
                }
            }
        }
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
