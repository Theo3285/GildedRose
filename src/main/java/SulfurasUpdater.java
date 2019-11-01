class SulfurasUpdater extends ItemUpdater{
    SulfurasUpdater(Item item) {
        super(item);
    }

    void updateQuality() {
        //May seem like LSD violation but it is a business purpose:
        //"Sulfuras", being a legendary item, never has to be sold or decreases in Quality
    }
}
