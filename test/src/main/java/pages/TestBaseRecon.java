package pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.danco.bpc.IApplogicReconWeb.IApplicationManager;
import com.danco.bpc.applogicReconWeb.ApplicationManager;
import com.danco.bpc.modelReconWeb.User;

public class TestBaseRecon {

	public static User ADMIN = new User().setLogin("admin").setPassword("admin");

	protected IApplicationManager app;

//	@BeforeSuite
//	public void login() {
//		app = new ApplicationManager2();
//		System.out.println("Before suite BASE");
//		app.getUserHelper().loginAs(ADMIN);
//	}
//
//	@BeforeTest
//	public void init() {
//		app = new ApplicationManager2();
//		System.out.println("Before test BASE");
//		app.getUserHelper().loginAs(ADMIN);
//	}
//
//	@AfterTest
//	public void stop() {
//		app.getNavigationHelper().menuLogoutClick();
//		System.out.println("After test BASE");
//		app.stop();
//	}
//
//	@AfterSuite
//	public void logout() {
//		app.getNavigationHelper().menuLogoutClick();
//		System.out.println("After suite BASE");
//		app.stop();
//	}

}
