package com.danco.bpc.applogic2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.applogic.SessionHelper;
import com.danco.bpc.model.Session;
import com.danco.bpc.util.SessionPropertyReader;

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
		System.out.println("Size elements - " + elements.size());
		for (WebElement el : elements) {
			sessions.add(new Session().setSsid((el.getAttribute("data-rk"))));
		}
		return sessions;
	}

	@Override
	public boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException {
		List<Session> sessions = search(searchSsid);
		if (sessions.size() > 1) {
			System.out.println("Count of session not equal 1");
			return true;
		}
		for (Session sess : sessions) {
			if (sess.getSsid().equals(searchSsid)) {
				System.out.println("Session is open");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException {
		for (int i = 0; i < 60; i++) {
			List<Session> sessions = search(searchSsid);
			if (sessions.size() > 1) {
				System.out.println("Count of session not equal 1");
				return false;
			}
			for (Session sess : sessions) {
				if (sess.getSsid().equals(searchSsid)) {
					return true;
				}
			}
			Thread.sleep(1000);
		}
		System.out.println("Session is not open");
		return false;
	}

	@Override
	public void getAllParameterSession(String ssid, Session currSession) throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
		String sessMask = ssid.substring(0, ssid.length() - 4);
		if ((ssid.substring(ssid.length() - 4, ssid.length())).equals("null")) {
			pr.setS220444(lastSession(sessMask));
			ssid = sessMask + pr.getS220444();
		}
		pages.sessionPage.clickSearchLink(ssid).getSessionState(currSession).getSessionStatus(currSession).getSessionTe(currSession).getSessionTf(currSession)
				.getSessionTr(currSession).getSessionTsv(currSession);
	}

	@Override
	public String lastSession(String sessMask) throws InterruptedException {
		pages.sessionPage.clickSearchLink(sessMask + "%").sortingSessions();
		String fullLastSession = pages.sessionPage.getFirstSession();
		System.out.println("Last session - " + fullLastSession.substring(fullLastSession.indexOf("-") + 1, fullLastSession.length()));
		return fullLastSession.substring((fullLastSession.indexOf("-") + 1), fullLastSession.length());
	}
}
