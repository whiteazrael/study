package chapter10_Class;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter10_Class.queue.Queue;
import chapter10_Class.sql.EmptyQueueGetException;

public class QueueTest {

	@Test
	public void test() throws EmptyQueueGetException {
		Queue queue = new Queue();
		
		queue.put(1);
		queue.put(2);
		
		assertEquals(queue.get(), 1);
		assertEquals(queue.get(), 2);
		queue.get();
	}
	
}
