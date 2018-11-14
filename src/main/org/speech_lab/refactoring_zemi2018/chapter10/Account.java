package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.Date;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

class Account {
	private Collection _entries = new ArrayList();
	
	public Account(Collection entries) {
		_entries = entries;
	}
	double getFlowBetween(Date start, Date end) {
		double result = 0;
		Iterator iter = _entries.iterator();
		while (iter.hasNext()) {
		    Entry each = (Entry) iter.next();
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
