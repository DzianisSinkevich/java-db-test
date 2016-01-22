package com.danco.bpc.IApplogicReconWeb;

public interface ApplicationManager {

	UserHelper getUserHelper();
	SessionHelper getSessionHelper();
  NavigationHelper getNavigationHelper();

  void stop();

}
