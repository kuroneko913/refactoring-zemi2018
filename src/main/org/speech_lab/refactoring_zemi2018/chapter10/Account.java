package org.speech_lab.refactoring_zemi2018.chapter10;

import

class Account {
	private Vector  _entries = new Vector();
	
	public Account(Vector entries) {
		_entries = entries;
	}
	double getFlowBetween(Date start, Date end) {
		double result = 0;
		Enumeration e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (each.getDate().equals(start) ||
				each.getDate().equals(end) ||
					(each.getDate().after(start) && each.getDate().before(end)))
			   {
				   result += each.getValue();
				}
			
		}
		return result;
	}
}
