package com.danco.bpc.IApplogicAllWeb;

import com.danco.bpc.modelAllWeb.User;

public interface IUserHelper {

	void loginAs(User user);

	void logout();

	boolean isLoggedIn();

	boolean isLoggedInAs(User user);

	boolean isNotLoggedIn();
}
