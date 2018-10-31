package org.speech_lab.refactoring_zemi2018.chapter9;

class Disability
{
    private int disabilityamount;
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
	if (_seniorrity < 2) return 0;
	if (_monthsDisabled > 12) return 0;
	if (_isPartTime) return 0;
	//傷病給付金を計算する
	else
	    disabilityamount = 200;
	return disabilityamount;
    }
    //--------------------------
    
}
