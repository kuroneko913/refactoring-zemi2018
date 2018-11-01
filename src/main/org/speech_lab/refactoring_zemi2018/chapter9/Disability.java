package org.speech_lab.refactoring_zemi2018.chapter9;

class Disability
{
    private int _seniorrity;
    private int _monthsDisabled;
    private boolean _isPartTime;
    
    public Disability(int seniorrity, int monthsDisabled, boolean isPartTime)
    {
	_seniorrity = seniorrity;
	_monthsDisabled = monthsDisabled;
	_isPartTime = isPartTime;
    }
	
    //-------------------------
    double disabilityAmount()
    {
	if (isNotEligibleForDisability()) {
	    return 0;
	}    
	//傷病給付金を計算する
	else {
	    return 200;
	}
    }
    
    //--------------------------
    public boolean isNotEligibleForDisability() {
	return (_seniorrity <2 || _monthsDisabled > 12 || _isPartTime);
    }
}
