package org.speech_lab.refactoring_zemi2018.chapter8early;

class Performance {
    private String _name;
    private String _wins;

    public String getName() {
        return _name;
    }

    public void setName(String arg) {
        _name = arg;
    }

    public int getWins() {
        return Integer.parseInt(_wins);
    }

    public void setWins(String arg) {
        _wins = arg;
    }
}
