package com.danco.bpc.applogicDB;

import com.danco.bpc.IApplogicDB.IMainHelper;
import com.danco.bpc.IApplogicDB.IPriceHelper;

public class DBManager implements com.danco.bpc.IApplogicDB.IDBManager {

	private IMainHelper mainHelper;
	private IPriceHelper priceHelper;

	public DBManager() {
		mainHelper = new MainHelper(this);
		priceHelper = new PriceHelper(this);
	}

	@Override
	public IMainHelper getMainHelper() {
		return mainHelper;
	}

	@Override
	public IPriceHelper getPriceHelper() {
		return priceHelper;
	}

}
