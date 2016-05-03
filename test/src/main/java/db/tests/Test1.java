package db.tests;

import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TestBaseRecon;

public class Test1 extends TestBaseRecon {

	private Logger log = Logger.getLogger("file");
	private Logger logConsole = Logger.getLogger("console");
	
//	@BeforeTest
//    public void setUp() {
//        log = Logger.getLogger("file");
//    }
	
	@Test
	public void testUntitled() {
		log.debug("Debug!");
		log.warn("Warning!");
		log.info("INFO");
		log.error("ERROR");
		log.fatal("FaTaL");
		
		logConsole.debug("Debug");
	}
}