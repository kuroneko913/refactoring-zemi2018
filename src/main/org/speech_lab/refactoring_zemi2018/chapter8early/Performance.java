package org.speech_lab.refactoring_zemi2018.chapter8early;

class Performance {
    public String[] _data = new String[2];

    public String getName() {
        return _data[0];
    }

    public void setName(String arg) {
        _data[0] = arg;
    }

    public int getWins() {
        return Integer.parseInt(_data[1]);
    }

    public void setWins(String arg) {
        _data[1] = arg;
    }
}
