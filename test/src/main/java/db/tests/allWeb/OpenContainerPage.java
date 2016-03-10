package db.tests.allWeb;

import org.testng.annotations.Test;
import pages.TestBaseAll;

public class OpenContainerPage extends TestBaseAll {

	@Test
	public void openContainerPage() {
		app.getNavigationHelper().administrationClick();
	}
}
