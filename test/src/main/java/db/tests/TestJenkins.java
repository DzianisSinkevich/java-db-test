package db.tests;

import org.testng.annotations.Test;

import pages.TestBase;
import db.utils.PropertyLoaderJenkins;

public class TestJenkins extends TestBase {
	@Test
	public void testUntitled() {
		String testParam = PropertyLoaderJenkins.loadProperty("test.param");
		System.out.println("TEST PARAM -" + testParam);
	}
}
