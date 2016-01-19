package db.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.TestBase;

public class Test4 extends TestBase {

	@BeforeTest
	public void testBefore() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void testAfter() {
		System.out.println("After Test");
	}
}
