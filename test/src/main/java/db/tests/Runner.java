package db.tests;

import org.apache.log4j.helpers.Loader;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import db.tests.allWeb.CloseSessionLotes;
import db.tests.allWeb.AOpenAllWeb;

public class Runner {
	public static void main(String[] args) {
		Loader.getResource("log4j.xml");
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { AOpenAllWeb.class, CloseSessionLotes.class });

		testng.addListener(tla);
		testng.run();

		/*
		 * TestListenerAdapter tla = new TestListenerAdapter(); TestNG testng = new TestNG(); List<String> testFilesList = new ArrayList<String>();
		 * testFilesList.add("testng3.xml"); //test suite resides in the working directory's root folder testng.setTestSuites(testFilesList); //you can addd
		 * multiple suites either here by adding multiple files or include all suites needed in the testng.xml file testng.setUseDefaultListeners(false);
		 * testng.addListener(tla); testng.run();
		 */
	}
}
