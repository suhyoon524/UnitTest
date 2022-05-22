package testBST;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	Test_LeafCount.class,
	Test_Max.class, Test_Min.class, 
	Test_SingleParentCoun.class})
	
public class All_Tests {
// dummy class used to call the suite of tests
		}


