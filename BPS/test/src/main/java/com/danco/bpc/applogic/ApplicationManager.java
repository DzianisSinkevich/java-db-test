package com.danco.bpc.applogic;

public interface ApplicationManager {

	UserHelper getUserHelper();
	SessionHelper getSessionHelper();
  NavigationHelper getNavigationHelper();

  void stop();

}
