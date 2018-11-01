package org.speech_lab.refactoring_zemi2018.chapter9;

class Pay
{
    private boolean _isDead;
    private boolean _isSeparated;
    private boolean _isRetired;
    
    public Pay(boolean isDead,boolean isSeparated, boolean isRetired)
    {
	_isDead = isDead;
	_isSeparated = isSeparated;
	_isRetired = isRetired;
    }
    // ---------------------------
    double getPayAmount()
    {
	if (_isDead) return deadAmount();
	if (_isSeparated) return separatedAmount();
	if (_isRetired) return retiredAmount();
	return normalPayAmount();
    }
    //-----------------------------

    double deadAmount()
    {
	return 500;
    }

    double separatedAmount()
    {
	return 600;
    }

    double retiredAmount()
    {
	return 700;
    }

    double normalPayAmount()
    {
	return 300;
    }

    
}
