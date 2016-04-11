package pages;

import com.danco.bpc.IApplogicAllWeb.IApplicationManager;
import com.danco.bpc.IApplogicDB.IDBManager;
import com.danco.bpc.modelAllWeb.User;

public class TestBaseAll {

	public static User ADMIN = new User().setLogin("admin").setPassword("admin");

	protected IApplicationManager appAll;
	protected IDBManager db;

	// @BeforeSuite
	// public void login() { 
	// app = new ApplicationManager2();
	// System.out.println("Before suite BASE");
	// app.getUserHelper().loginAs(ADMIN);
	// }
	//
	// @BeforeTest
	// public void init() {
	// app = new ApplicationManager2();
	// System.out.println("Before test BASE");
	// app.getUserHelper().loginAs(ADMIN);
	// }
	//
	// @AfterTest
	// public void stop() {
	// app.getNavigationHelper().menuLogoutClick();
	// System.out.println("After test BASE");
	// app.stop();
	// }
	//
	// @AfterSuite
	// public void logout() {
	// app.getNavigationHelper().menuLogoutClick();
	// System.out.println("After suite BASE");
	// app.stop();
	// }

}
