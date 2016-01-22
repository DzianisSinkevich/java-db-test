package com.danco.bpc.IApplogicAllWeb;

public interface ApplicationManager {

	UserHelper getUserHelper();
	SessionHelper getSessionHelper();
  NavigationHelper getNavigationHelper();

  void stop();

}
