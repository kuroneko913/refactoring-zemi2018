package org.speech_lab.refactoring_zemi2018.chapter8later;

import java.util.Set;

class Person<T> {
    private Set<T> _courses;
    
    public Set<T> getCourses() {
        return _courses;
    }

    public void setCourses(Set<T> arg) {
        _courses = arg;
    }

    public int countAdvancedCourses() {
        int result = 0;
        for (Object each : _courses) {
            if (((Course) each).isAdvanced()) {
                result++;
            }
        }
        return result;
    }
}
