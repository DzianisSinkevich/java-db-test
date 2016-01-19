package pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.danco.bpc.applogic.ApplicationManager;
import com.danco.bpc.applogic2.ApplicationManager2;
import com.danco.bpc.model.User;

public class TestBase {

	public static User ADMIN = new User().setLogin("admin").setPassword("admin");

	protected ApplicationManager app;

	@BeforeSuite
	public void login() {
		app = new ApplicationManager2();
		 System.out.println("Before suite");
		app.getUserHelper().loginAs(ADMIN);
	}

	@BeforeTest
	public void init() {
		app = new ApplicationManager2();
		 System.out.println("Before test");
		// app.getUserHelper().loginAs(ADMIN);
	}

	@AfterTest
	public void stop() {
		// app.getNavigationHelper().menuLogoutClick();
		 System.out.println("After test");
//		app.stop();
	}

	@AfterSuite
	public void logout() {
		app.getNavigationHelper().menuLogoutClick();
		 System.out.println("After suite");
		app.stop();
	}

}
