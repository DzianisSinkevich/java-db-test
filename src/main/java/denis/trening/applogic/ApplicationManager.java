package denis.trening.applogic;

public interface ApplicationManager {

	UserHelper getUserHelper();
	SessionHelper getSessionHelper();
  NavigationHelper getNavigationHelper();

  void stop();

}
