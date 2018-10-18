package org.speech_lab.refactoring_zemi2018.chapter8early;

class IntRange {

    private int _low, _high;

    IntRange(int low, int high) {
        _low = low;
        _high = high;
    }

    boolean includes(int arg) {
        return arg >= _low && arg <= _high;
    }

    void grow(int factor) {
        _high = _high * factor;
    }
}
