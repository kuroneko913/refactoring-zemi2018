package org.speech_lab.refactoring_zemi2018.chapter8later;

public class Item {
    private final ItemType _itemtype;
    private final String _title;
    private final int _price;

    public Item(ItemType itemtype, String title, int price) {
        _itemtype = itemtype;
        _title = title;
        _price = price;
    }

    public int getTypecode() {
        return _itemtype.getTypecode();
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ "
            + getTypecode() + ", "
            + getTitle() + ", "
            + getPrice() + " ]";
    }
}

