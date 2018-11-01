package org.speech_lab.refactoring_zemi2018.chapter9;

import java.util.Map;
import java.util.HashMap;

class Laboratory {
    private String _name;
    private Map<String, Student> _students = new HashMap<String, Student>();

    public Laboratory(String labName){
        _name = labName;
    }

    Student getStudent(String studentName){
	Student student = _students.get(studentName);
	if (student == null) {
	    return new NullStudent();
	}
        return _students.get(studentName);
    }

    public void registerStudent(Student student){
        _students.put(student.getName(), student);
    }
}
