package pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.danco.bpc.applogic.ApplicationManager;
import com.danco.bpc.applogic2.ApplicationManager2;
import com.danco.bpc.model.User;

public class TestBase {

	public static User ADMIN = new User().setLogin("admin").setPassword("admin");

	protected ApplicationManager app;

	@BeforeClass
	public void init() {
		app = new ApplicationManager2();
	}

	@AfterSuite
	public void stop() {
		app.stop();
	}

}
