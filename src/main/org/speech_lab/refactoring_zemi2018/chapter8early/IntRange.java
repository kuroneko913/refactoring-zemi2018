package org.speech_lab.refactoring_zemi2018.chapter8early;

class IntRange {

    private int _low, _high;

    IntRange(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        _low = low;
        _high = high;
    }

    void setLow(int arg) {
        _low = arg;
    }

    void setHigh(int arg) {
        _high = arg;
    }

    int getLow() {
        return _low;
    }

    int getHigh() {
        return _high;
    }

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }
}
