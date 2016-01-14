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
			sessions.add(new Session().setSsid(el.getAttribute("value")));
			System.out.println(el.getAttribute("value"));
		}
		return sessions;
	}

	@Override
	public boolean isSessionOpen(Session session) throws InterruptedException {
		List<Session> sessions = search(session.getSsid());
		if (pages.internalPage.confirmAmountsAdd()) {
			for (Session someSession : sessions) {
				if (someSession.getSsid().equals(session.getSsid())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isFilmDeleted(Session session) throws InterruptedException {
		List<Session> sessions = search(session.getSsid());
		if (pages.internalPage.confirmAmountsDelete()) {
			return true;
		}
		return false;
	}
}
