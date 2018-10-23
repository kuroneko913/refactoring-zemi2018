package org.speech_lab.refactoring_zemi2018.chapter8early;

import java.util.Observer;
import java.util.Observable;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;

public class IntervalWindow extends Frame implements Observer {
    private static final int MAXLEN = 10;

    private Interval _subject;

    private TextField _startField;
    private TextField _endField;
    private TextField _lengthField;

    public String getStart() {
        return _subject.getStart();
    }

    public void setStart(String arg) {
        _subject.setStart(arg);
    }

    public String getEnd() {
        return _subject.getEnd();
    }

    public void setEnd(String arg) {
        _subject.setEnd(arg);
    }

    public String getLength() {
        return _subject.getLength();
    }

    public void setLength(String arg) {
        _subject.setLength(arg);
    }

    public IntervalWindow() {
        super("Interval Window");

        _startField = new TextField("0", MAXLEN);
        _endField = new TextField("0", MAXLEN);
        _lengthField = new TextField("0", MAXLEN);

        _startField.addFocusListener(new SymFocus());
        _endField.addFocusListener(new SymFocus());
        _lengthField.addFocusListener(new SymFocus());

        add(_startField, BorderLayout.NORTH);
        add(_endField, BorderLayout.CENTER);
        add(_lengthField, BorderLayout.SOUTH);

        pack();
        show();
        
        _subject = new Interval();
        _subject.addObserver(this);
        update(_subject, null);
    }

    public void update(Observable observed, Object arg) {
        _startField.setText(_subject.getStart());
        _endField.setText(_subject.getEnd());
        _lengthField.setText(_subject.getLength());
    }

    class SymFocus extends FocusAdapter {
        public void focusLost(FocusEvent event) {
            Object object = event.getSource();
            if (object == _startField) {
                StartField_FocusLost(event);
            } else if (object == _endField) {
                EndField_FocusLost(event);
            } else if (object == _lengthField) {
                LengthField_FocusLost(event);
            }
        }
    }

    void StartField_FocusLost(FocusEvent event) {
        setStart(_startField.getText());
        if (getStart().isEmpty()) {
            setStart("0");
        }
        _subject.calculateLength();
    }

    void EndField_FocusLost(FocusEvent event) {
        setEnd(_endField.getText());
        if (getEnd().isEmpty()) {
            setEnd("0");
        }
        _subject.calculateLength();
    }

    void LengthField_FocusLost(FocusEvent event) {
        setLength(_lengthField.getText());
        if (getLength().isEmpty()) {
            setLength("0");
        }
        _subject.calculateEnd();
    }
}
