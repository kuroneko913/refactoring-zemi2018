package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

class Resource {
	private ArrayList _list;
	public Resource() {
		_list = create();
	}

	private ArrayList create(){
		ArrayList list = new ArrayList();
		for (int i = 1;i<=5;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		return list;
	}

	public ArrayList get() {
		return _list;
	}
}
