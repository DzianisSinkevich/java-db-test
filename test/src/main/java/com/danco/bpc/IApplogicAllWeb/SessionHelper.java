package com.danco.bpc.IApplogicAllWeb;

import java.io.IOException;
import java.util.List;

import com.danco.bpc.modelAllWeb.ProcessesSession;

public interface SessionHelper {

	List<ProcessesSession> search(String title) throws InterruptedException;

	boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException;

	boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException;

	void getAllParameterSession(String ssid, ProcessesSession currSession) throws InterruptedException, IOException;

	String lastSession(String sessMask) throws InterruptedException;

	public String waitForProcessFinished(String pid) throws Exception;
}
