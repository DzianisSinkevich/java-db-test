package db.tests;

import java.sql.SQLException;

import db.operations.DaoForMusBatch;

public class TestDB {

	public static void main(String[] argv) throws SQLException {
		DaoForMusBatch daoForMusbatch = new DaoForMusBatch();
		daoForMusbatch.getUpdateSessionIdPreparedStatement(
				daoForMusbatch.getIdDinersSession(), "24_0444-000005");
	}
}
