package org.speech_lab.refactoring_zemi2018.chapter7;


public class TelephoneNumber {
    private String _officeAreaCode;
    private String _officeNumber;

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
