package org.speech_lab.refactoring_zemi2018.chapter10;

class Room {
	private int _low;
	private int _high;
	public Room(int low,int high) {
		_low = low;
		_high = high;
	}
	/*暖房計画を実行するかしないか*/
	boolean withinPlan(HeatingPlan plan) {
		int low = daysTempRange().getLow();
		int high = daysTempRange().getHigh();
		return plan.withinRange(low,high);
	}
	/*これまでの室内気温の範囲*/
 	TempRange daysTempRange() {
		return new TempRange(_low,_high);
	}
}
