package denis.trening.applogic;

import java.util.List;

import denis.trening.model.Session;

public interface SessionHelper {

	List<Session> search(String title) throws InterruptedException;

	boolean isFilmDeleted(Session film) throws InterruptedException;

	boolean isSessionOpen(Session session) throws InterruptedException;
}
