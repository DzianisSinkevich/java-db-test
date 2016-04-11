package com.danco.bpc.IApplogicReconWeb;

import com.danco.bpc.modelReconWeb.User;

public interface IUserHelper {

	void loginAs(User user);

	void logout();

	boolean isLoggedIn();

	boolean isLoggedInAs(User user);

	boolean isNotLoggedIn();
}
