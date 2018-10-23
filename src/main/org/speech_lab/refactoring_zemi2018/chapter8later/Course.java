package org.speech_lab.refactoring_zemi2018.chapter8later;

class Course {
    private String _name;
    private boolean _isAdvanced;

    public Course(String name, boolean isAdvanced) {
        _name = name;
        _isAdvanced = isAdvanced;
    }

    public void setName(String arg) {
        _name = arg;
    }

    public String getName() {
        return _name;
    }

    public void setIsAdvanced(boolean isAdvanced) {
        _isAdvanced = isAdvanced;
    }

    public boolean isAdvanced() {
        return _isAdvanced;
    }
}
