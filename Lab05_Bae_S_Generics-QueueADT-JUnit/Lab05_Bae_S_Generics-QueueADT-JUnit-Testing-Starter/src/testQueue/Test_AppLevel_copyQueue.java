package testQueue;

import static org.junit.Assert.*;
//import junit.framework.Assert;
//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import ApplicationLevelMethods.Methods;
import queuePackage.LinkedUnbndQueue;

/* Tests of static method: copyQueue
 *   test for a null reference; the copy should also be a null reference
 *   test an empty queue
 *   test queue with one element
 *   test queue with many elements
 */

public class Test_AppLevel_copyQueue {

	LinkedUnbndQueue<String> q1, q2;
	
	// toggle to true to turn on console output in this test class
	boolean consoleOut = false; 

	@Before
	public void setUp() throws Exception {	
		
		q1 = new LinkedUnbndQueue<String>();
		// q2 is set in each test below
		
	}

	@Test
	public void test_null_reference() {
		LinkedUnbndQueue<String> q1 =null;
		q2 = Methods.copyQueue(q1);
		String str =Methods.showQueue(q2);
		assertEquals("null",str);
		
	}

	@Test
	public void test_empty_Queue() {
		q2 = Methods.copyQueue(q1);
		String str =Methods.showQueue(q2);
		assertEquals("empty",str);
	
	}
	
	@Test
	public void test_queue_with_one_element() {
		q1.enqueue("A");
		q2 = Methods.copyQueue(q1);
		String str = Methods.showQueue(q2);
		assertEquals("front|A|rear",str);
		
		
	}	

	@Test
	public void test_queue_with_many_elements() {
		
		q1.enqueue("A"); q1.enqueue("B"); q1.enqueue("C");
		q2 = Methods.copyQueue(q1);
		
		String q1Contents = Methods.showQueue(q1);
		String q2Contents = Methods.showQueue(q2);	

		assertEquals("front|A|B|C|rear", q1Contents, q2Contents);	
	}
}
