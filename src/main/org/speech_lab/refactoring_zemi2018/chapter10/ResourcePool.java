package org.speech_lab.refactoring_zemi2018.chapter10;

import java.util.Stack;
import java.util.EmptyStackException;

class ResourcePool {
	private Stack _available;
	private Stack _allocated;

	public ResourcePool(Stack available, Stack allocated) {
		_available = available;
		_allocated = allocated;
	}
	
	Resource getResource() {
		Resource result;
		try {
			result = (Resource) _available.pop();
			_allocated.push(result);
			return result;
		} catch (EmptyStackException e) {
			result = new Resource();
			_allocated.push(result);
			return result;
		}
	}
}
