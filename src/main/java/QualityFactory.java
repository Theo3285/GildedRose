class QualityFactory {
    static ItemUpdater getUpdaterFor(Item item) {
        if (nameIsAgedBrie(item))
            return new AgedBrieUpdater(item);
        if (nameIsBackstage(item))
            return new BackstageUpdater(item);
        if (nameIsSulfuras(item))
            return new SulfurasUpdater(item);
        return new NormalUpdater(item);
    }

    private static boolean nameIsBackstage(Item item) {
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.getName());
    }

    private static boolean nameIsAgedBrie(Item item) {
        return "Aged Brie".equals(item.getName());
    }

    private static boolean nameIsSulfuras(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }
}
