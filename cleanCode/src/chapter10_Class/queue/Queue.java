package chapter10_Class.queue;

import java.util.LinkedList;
import java.util.List;

import chapter10_Class.sql.EmptyQueueGetException;

public class Queue {
	List<Integer> elements = new LinkedList<Integer>();
	
	public int size() {
		return elements.size();
	}
	
	public void put(int element) {
		elements.add(element);
	}
	
	public int get() throws EmptyQueueGetException {
		if (elements.size() == 0) {
			throw new EmptyQueueGetException();
		}
		
		return elements.remove(0);
	}
}
