package com.danco.bpc.IApplogicAllWeb;

public interface IApplicationManager {

	IUserHelper getUserHelper();

	INavigationHelper getNavigationHelper();
	
	IPriceHelper getPriceHelper();

	void stop();

}
