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
        return _startField.getText();
    }

    public void setStart(String arg) {
        _startField.setText(arg);
    }

    public String getEnd() {
        return _endField.getText();
    }

    public void setEnd(String arg) {
        _endField.setText(arg);
    }

    public String getLength() {
        return _lengthField.getText();
    }

    public void setLength(String arg) {
        _lengthField.setText(arg);
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
        calculateLength();
    }

    void EndField_FocusLost(FocusEvent event) {
        setEnd(_endField.getText());
        if (getEnd().isEmpty()) {
            setEnd("0");
        }
        calculateLength();
    }

    void LengthField_FocusLost(FocusEvent event) {
        setLength(_lengthField.getText());
        if (getLength().isEmpty()) {
            setLength("0");
        }
        calculateEnd();
    }

    void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = end - start;
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("予期しない数字形式のエラー");
        }
    }

    void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(getLength());
            int end = start + length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("予期しない数字形式のエラー");
        }
    }    
}
