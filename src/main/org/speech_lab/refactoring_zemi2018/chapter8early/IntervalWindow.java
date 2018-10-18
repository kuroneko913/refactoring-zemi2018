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

    TextField _startField;
    TextField _endField;
    TextField _lengthField;

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
        if (_startField.getText().isEmpty()) {
            _startField.setText("0");
        }
        calculateLength();
    }

    void EndField_FocusLost(FocusEvent event) {
        if (_endField.getText().isEmpty()) {
            _endField.setText("0");
        }
        calculateLength();
    }

    void LengthField_FocusLost(FocusEvent event) {
        if (_lengthField.getText().isEmpty()) {
            _lengthField.setText("0");
        }
        calculateEnd();
    }

    void calculateLength() {
        try {
            int start = Integer.parseInt(_startField.getText());
            int end = Integer.parseInt(_endField.getText());
            int length = end - start;
            _lengthField.setText(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("予期しない数字形式のエラー");
        }
    }

    void calculateEnd() {
        try {
            int start = Integer.parseInt(_startField.getText());
            int length = Integer.parseInt(_lengthField.getText());
            int end = start + length;
            _endField.setText(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("予期しない数字形式のエラー");
        }
    }    
}
