package org.speech_lab.refactoring_zemi2018.chapter6;

class Body {
    private double _mass;
    private double _primaryForce;
    private double _secondaryForce;
    private double _delay;

    public Body(double mass, double primaryForce, double secondaryForce, double delay) {
	_mass = mass;
	_primaryForce = primaryForce;
	_secondaryForce = secondaryForce;
	_delay = delay;
    }

    double getDistanceTravelled(double time) {
	double result;
	double acc = _primaryForce / _mass;
	double primaryTime = Math.min(time, _delay);
	result = 0.5 * acc * primaryTime * primaryTime;
	double secondaryTime = time - _delay;
	if (secondaryTime > 0) {
	    double primaryVel = acc * _delay;
	    acc = (_primaryForce + _secondaryForce) / _mass;
	    result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
	}
	return result;
    }
}

