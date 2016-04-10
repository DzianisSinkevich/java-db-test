package com.danco.bpc.applogicAllWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.IApplogicAllWeb.SessionHelper;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.modelAllWeb.ProcessesSession;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;
import com.danco.bpc.util.SessionPropertyReader;

public class SessionHelper2 extends DriverBasedHelper implements SessionHelper {

	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	public SessionHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	@FindBy(css = "nav a[href = './?go=add']")
	private WebElement firstSession;

	@Override
	public List<ProcessesSession> search(String ssid) throws InterruptedException {
		List<WebElement> elements;
		List<ProcessesSession> sessions = new ArrayList<ProcessesSession>();
		pages.sessionPage.clickSearchLink(ssid);
		elements = pages.sessionPage.getSearchedSessions();
		System.out.println("Size elements - " + elements.size());
		for (WebElement el : elements) {
			sessions.add(new ProcessesSession().setSsid(Long.parseLong(el.getAttribute("data-rk"))));
		}
		return sessions;
	}

	@Override
	public boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException {
		List<ProcessesSession> sessions = search(searchSsid);
		if (sessions.size() > 1) {
			System.out.println("Count of session not equal 1");
			return true;
		}
		for (ProcessesSession sess : sessions) {
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
			List<ProcessesSession> sessions = search(searchSsid);
			if (sessions.size() > 1) {
				System.out.println("Count of session not equal 1");
				return false;
			}
			for (ProcessesSession sess : sessions) {
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
	public void getAllParameterSession(String ssid, ProcessesSession currSession) throws InterruptedException, IOException {
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

	@Override
	public String waitForProcessFinished(String pid) throws Exception {
		String resultCode = "PRSR0001";
		for (int i=0;i<=1200;i++){
			PrcSession prcSession = prcSessionService.selectSession(pid);
			resultCode = prcSession.getResultCode();
			if (!resultCode.equals("PRSR0001")){
				return resultCode;
			}
			Thread.sleep(1000);
		}
		return resultCode;
	}
}
