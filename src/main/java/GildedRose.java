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
            switch (item.getName()) {
                case "Aged Brie":
                    increaseItemQuality(item);
                    if (item.getSellIn() < 0)
                        increaseItemQuality(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.getSellIn() < 10) {
                        increaseItemQuality(item);
                    }

                    if (item.getSellIn() < 5) {
                        increaseItemQuality(item);
                    }

                    increaseItemQuality(item);

                    if (item.getSellIn() < 0)
                        item.setQuality(item.getQuality() - item.getQuality());
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    decreaseItemQuality(item);
                    if (item.getSellIn() < 0)
                        decreaseItemQuality(item);
                    break;
            }


            switch (item.getName()) {
                case "Aged Brie":
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    break;
                default:
                    break;
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
