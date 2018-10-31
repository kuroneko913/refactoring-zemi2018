package chapter9;

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
	double result;
	if (_isDead) result = deadAmount();
	else {
	    if (_isSeparated) result = separatedAmount();
	    else {
		if (_isRetired) result = retiredAmount();
		else result = normalPayAmount();
	    }
	}
	return result;
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
