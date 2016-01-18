package com.danco.bpc.applogic;

import java.util.List;

import com.danco.bpc.model.Session;

public interface SessionHelper {

	List<Session> search(String title) throws InterruptedException;

	boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException;

	boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException;

	String sessionState(String searchSsid) throws InterruptedException;

	void getAllParameterSession(String ssid, Session currSession) throws InterruptedException;
}
