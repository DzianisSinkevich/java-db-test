package com.danco.bpc.IApplogicReconWeb;

public interface IApplicationManager {

	IUserHelper getUserHelper();
	ISessionHelper getSessionHelper();
  INavigationHelper getNavigationHelper();

  void stop();

}
