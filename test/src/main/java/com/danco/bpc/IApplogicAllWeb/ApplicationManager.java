package com.danco.bpc.IApplogicAllWeb;

public interface ApplicationManager {

	UserHelper getUserHelper();
	ProcessesSessionHelper getSessionHelper();
  NavigationHelper getNavigationHelper();

  void stop();

}
