package com.danco.bpc.applogic;

import com.danco.bpc.model.User;

public interface UserHelper {

	void loginAs(User user);

	void logout();

	boolean isLoggedIn();

	boolean isLoggedInAs(User user);

	boolean isNotLoggedIn();
}
