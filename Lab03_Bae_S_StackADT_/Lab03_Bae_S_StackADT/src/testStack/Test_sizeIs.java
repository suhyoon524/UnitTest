package testStack;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stackPackage.ArrayStack;
import stackPackage.LinkedStack;

/*
 * Class to test the sizeIs method added to the ArrayStack ADT of Lab03
 * 
 *   test sizeIs on an empty stack
 *     a stack with one element
 *     a stack with multiple elements
 *     and a "full" ArrayStack (not applicable to Linked Stack - comment it out)
 */

public class Test_sizeIs {

	 ArrayStack stk;

	 @Before
	 public void setUp() throws Exception {

	 stk = new ArrayStack<Integer>(5);
	 }

//	LinkedStack stk;
//
//	@Before
//	public void setUp() throws Exception {
//		stk = new LinkedStack<Integer>();
//	}

	@Test
	public void test_sizeIs_on_an_emptyStack() {
		Assert.assertEquals(0, stk.sizeIs());
	}

	@Test
	public void test_sizeIs_on_a_stack_with_1_element() {

		stk.push(5);

		Assert.assertEquals(1, stk.sizeIs());
	}

	@Test
	public void test_sizeIs_on_a_stack_with_multiple_elements() {

		stk.push(5);
		stk.push(4);
		stk.push(3);

		Assert.assertEquals(3, stk.sizeIs());
	}

// comment this test OUT when testing LinkedStack
//	@Test
//	public void test_sizeIs_on_a_full_stack() {
//		stk.push(1); stk.push(2); stk.push(3); stk.push(4); stk.push(5);
//
//		Assert.assertEquals(5, stk.sizeIs());

//	}

}
