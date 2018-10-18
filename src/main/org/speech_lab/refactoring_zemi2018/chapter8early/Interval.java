package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.Observable;

class Interval extends Observable {

    private String _start = "0";
    private String _end = "0";
    private String _length = "0";

    String getStart() {
        return _start;
    }

    void setStart(String arg) {
        _start = arg;
        setChanged();
        notifyObservers();
    }

    String getEnd() {
        return _end;
    }

    void setEnd(String arg) {
        _end = arg;
        setChanged();
        notifyObservers();
    }

    String getLength() {
        return _length;
    }

    void setLength(String arg) {
        _length = arg;
        setChanged();
        notifyObservers();
    }
}
