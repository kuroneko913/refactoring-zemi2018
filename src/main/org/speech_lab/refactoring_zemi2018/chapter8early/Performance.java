package org.speech_lab.refactoring_zemi2018.chapter8early;

class Performance {
    public String[] _data = new String[2];

    public String getName() {
        return _data[0];
    }

    public String setName(String arg) {
        _data[0] = arg;
    }
}
