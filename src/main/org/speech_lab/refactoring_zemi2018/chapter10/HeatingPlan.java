package org.speech_lab.refactoring_zemi2018.chapter10;

class HeatingPlan {
	private TempRange _range;
	
	public HeatingPlan(TempRange range) {
		_range = range;
	}
	
	boolean withinRange(int low, int high) {
		return (low >= _range.getLow() && high <= _range.getHigh());
	}
}
