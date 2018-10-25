package org.speech_lab.refactoring_zemi2018.chapter8later;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

class Person{
    private Set<Course> _courses = new HashSet<Course>();

    public void initializeCourses(Set<Course> arg)
    {
	assert _courses.isEmpty();
	for (Object each : arg)
	    {
		addCourse((Course) each);
	    }
    }
    
    public Set<Course> getCourses() {
      
	{
	    return Collections.unmodifiableSet(_courses);
	}
    }

    public void setCourses(Set<Course> arg) {
        _courses = arg;
    }

    public void addCourse(Course arg){
	_courses.add(arg);
    }

    public void removeCourse(Course arg){
	_courses.remove(arg);
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
