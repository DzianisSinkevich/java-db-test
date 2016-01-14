package denis.trening.applogic;

import java.util.List;

import denis.trening.model.Session;

public interface SessionHelper {

	List<Session> search(String title);

	boolean isFilmDeleted(Session film);

	boolean isSessionOpen(Session session);
}
