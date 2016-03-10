package com.danco.bpc.IApplogicAllWeb;

import java.io.IOException;
import java.util.List;

import com.danco.bpc.modelAllWeb.Session;

public interface SessionHelper {

	List<Session> search(String title) throws InterruptedException;

	boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException;

	boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException;

	void getAllParameterSession(String ssid, Session currSession) throws InterruptedException, IOException;
	
	String lastSession(String sessMask) throws InterruptedException;
}
