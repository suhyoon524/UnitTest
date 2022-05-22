package testStack;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stackPackage.ArrayStack;
import stackPackage.LinkedStack;

public class Test_clear {

//	ArrayStack<Integer> stk;
//
//	@Before
//	public void setUp() throws Exception {
//		stk = new ArrayStack<Integer>(5);
//	}

	 LinkedStack<Integer> stk;
	 @Before
	 public void setUp() throws Exception {
	 stk = new LinkedStack<Integer>();
	 }

	@Test
	public void test_clear_on_an_emptyStack() {

		stk.clear();

		Assert.assertEquals(true, stk.isEmpty());
	}

	@Test
	public void test_clear_on_a_stack_with_1_element() {
		stk.push(14);
		stk.clear();
		Assert.assertEquals(true, stk.isEmpty());
	}

	@Test
	public void test_clear_on_a_stack_with_multiple_elements() {
		stk.push(5); stk.push(4); stk.push(3);
		stk.clear();
		Assert.assertEquals(true, stk.isEmpty());
	}

	/*
	 * @Test 
	 * public void test_clear_on_a_full_stack() { stk.push(1); stk.push(2);
	 * stk.push(3); stk.push(4); stk.push(5); stk.clear(); 
	 * Assert.assertEquals(true,stk.isEmpty()); }
	 */
	
	@After
	public void tearDown() throws Exception {
	}

}
