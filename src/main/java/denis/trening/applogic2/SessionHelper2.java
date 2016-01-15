package denis.trening.applogic2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import denis.trening.applogic.SessionHelper;
import denis.trening.model.Session;

public class SessionHelper2 extends DriverBasedHelper implements SessionHelper {

	public SessionHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	@FindBy(css = "nav a[href = './?go=add']")
	private WebElement firstSession;

	@Override
	public List<Session> search(String ssid) throws InterruptedException {
		List<WebElement> elements;
		List<Session> sessions = new ArrayList<Session>();
		pages.sessionPage.clickSearchLink(ssid);
		elements = pages.sessionPage.getSearchedSessions();
		System.out.println(elements.size());
		for (WebElement el : elements) {
			sessions.add(new Session().setSsid(el.getText().substring(0, el.getText().indexOf(" "))));
			System.out.println(el.getText().substring(0, el.getText().indexOf(" ")));
		}
		return sessions;
	}

	@Override
	public boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException {
		List<Session> sessions = search(searchSsid);
		for (Session sess : sessions) {
			if (sess.getSsid().equals(searchSsid)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException {
		List<Session> sessions = search(searchSsid);
		for (Session sess : sessions) {
			if (sess.getSsid().equals(searchSsid)) {
				return true;
			}
		}
		return false;
	}
}
