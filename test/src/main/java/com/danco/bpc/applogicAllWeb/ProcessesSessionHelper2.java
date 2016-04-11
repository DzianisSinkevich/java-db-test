package com.danco.bpc.applogicAllWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.IApplogicAllWeb.ProcessesSessionHelper;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.modelAllWeb.ProcessesSession;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class ProcessesSessionHelper2 extends DriverBasedHelper implements ProcessesSessionHelper {

	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();
	private ProcessesSession procSess = new ProcessesSession();

	public ProcessesSessionHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	@FindBy(css = "nav a[href = './?go=add']")
	private WebElement firstSession;

	@Override
	public void checkAllParameters(){
		
	}
	
	@Override
	public String waitForProcessFinished(String pid) throws Exception {
		String resultCode = "PRSR0001";
		for (int i = 0; i <= 1200; i++) {
			PrcSession prcSession = prcSessionService.selectSession(pid);
			resultCode = prcSession.getResultCode();
			if (!resultCode.equals("PRSR0001")) {
				return resultCode;
			}
			Thread.sleep(1000);
		}
		return resultCode;
	}
}
