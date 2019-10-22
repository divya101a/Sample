package test;

import org.testng.TestNG;

public class MainMethod {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {test1.class});
		testng.run();
	}
}
