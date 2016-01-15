package denis.trening.applogic;

import java.util.List;

import denis.trening.model.Session;

public interface SessionHelper {

	List<Session> search(String title) throws InterruptedException;

	boolean checkSessionInTableNegative(String searchSsid) throws InterruptedException;

	boolean checkSessionInTablePositive(String searchSsid) throws InterruptedException;
}
