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
            if (item.getName().equals("Aged Brie")) {
                increaseItemQuality(item);
            } else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getSellIn() < 11) {
                    increaseItemQuality(item);
                }

                if (item.getSellIn() < 6) {
                    increaseItemQuality(item);
                }
                increaseItemQuality(item);
            } else if (item.getName().equals("Sulfuras, Hand of Ragnaros")) {
            } else {
                decreaseItemQuality(item);
            }

            if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            } else {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if ("Aged Brie".equals(item.getName())) {
                    increaseItemQuality(item);
                } else {
                    if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
                        item.setQuality(item.getQuality() - item.getQuality());
                    } else {
                        if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
                            continue;
                        }
                        decreaseItemQuality(item);
                    }
                }
            }
        }
    }

    private static void decreaseItemQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    private static void increaseItemQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public List<Item> updateQuality(List<Item> itemList) {
        items = itemList;
        updateQuality();
        return items;
    }
}
