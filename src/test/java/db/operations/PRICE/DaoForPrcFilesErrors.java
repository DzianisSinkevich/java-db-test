package db.operations.PRICE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcFilesErrors;

public class DaoForPrcFilesErrors extends ADao<PrcFilesErrors> {
	private static final String PRCFILESERRORS_GET_BY_ID = "SELECT * FROM prc_files_errors WHERE id=? ";
	private static final String PRCFILESERRORS_UPDATE = "UPDATE prc_files_errors " + "SET fileId=?,error=? " + "WHERE id=? ";
	private static final String PRCFILESERRORS_DELETE = "DELETE FROM prc_files_errors WHERE id=?";
	private static final String PRCFILESERRORS_INSERT = "INSERT INTO prc_files_errors (ID, fileId, error)" + " VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String PRCFILESERRORS_GET_LIST = "SELECT * FROM prc_files_errors";
	private static final String PRCFILESERRORS_GET_SORTED_LIST = "SELECT * FROM prc_files_errors order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCFILESERRORS_UPDATE_SESSION_ID = "UPDATE prc_files_errors " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcFilesErrors getById(int id) {
		PrcFilesErrors prcFilesErrors = null;
		String qs = PRCFILESERRORS_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcFilesErrors = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcFilesErrors;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcFilesErrors prcFilesErrors) {
		String qs = PRCFILESERRORS_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcFilesErrors.getFileId());
			ps.setString(2, prcFilesErrors.getError());
			ps.setInt(3, prcFilesErrors.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCFILESERRORS_UPDATE_SESSION_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, sessionId);
			ps.setInt(2, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getDeletePreparedStatement(int id) {
		String qs = PRCFILESERRORS_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcFilesErrors prcFilesErrors) {
		String qs = PRCFILESERRORS_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcFilesErrors.getId());
			ps.setInt(2, prcFilesErrors.getFileId());
			ps.setString(3, prcFilesErrors.getError());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcFilesErrors createObject(ResultSet rs) {
		PrcFilesErrors prcFilesErrors = null;
		try {
			prcFilesErrors = new PrcFilesErrors(rs.getInt(1), rs.getInt(2), rs.getString(3));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcFilesErrors;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCFILESERRORS_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCFILESERRORS_GET_SORTED_LIST + nameOfColumn;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	// public void deleteById(int id) {
	// PreparedStatement pst2 = getDeletePreparedStatement(id);
	// Connection conn = null;
	// try {
	// conn = Connector.getInstance().getConn();
	// conn.setAutoCommit(false);
	// String qs_order = ORDER_GET_BY_ID_BOOK;
	// ps = (PreparedStatement) conn.createStatement();
	// rs = ps.executeQuery(qs_order);
	// DaoForOrder orderDao = new DaoForOrder();
	// while (rs.next()) {
	// orderDao.deleteById(rs.getInt(1));
	// }
	// String qs_query = QUERY_GET_BY_ID_BOOK;
	// rs = ps.executeQuery(qs_query);
	// DaoForQuery queryDao = new DaoForQuery();
	// while (rs.next()) {
	// queryDao.deleteById(rs.getInt(1));
	// }
	// pst2.executeUpdate();
	// conn.commit();
	// conn.setAutoCommit(true);
	// } catch (SQLException e) {
	// System.err.println(DELETE_ERROR);
	// log.error(e);
	// try {
	// conn.rollback();
	// conn.setAutoCommit(true);
	// } catch (SQLException e1) {
	// log.error(e1);
	// }
	// }
	//
	// }

	@Override
	protected PreparedStatement getListByFieldPreparedStatement(String nameOfColumn, String value) {
		String qs = PRCFILESERRORS_GET_LIST + WHERE + nameOfColumn + " = " + value;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);

		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getCountPreparedStatement(String nameOfColumn, String value, java.util.Date date1, java.util.Date date2) {
		return null;
	}

	@Override
	protected PreparedStatement getSummPreparedStatement(String nameOfColumn, String value, java.util.Date date1, java.util.Date date2) {
		return null;
	}

	@Override
	protected PreparedStatement getSetFieldValuePreparedStatement(int id, String nameOfColumn, String value) {
		return null;
	}

	@Override
	protected PreparedStatement getListByFieldPreparedStatement(String nameOfColumn, String value, java.util.Date date1, java.util.Date date2) {
		return null;
	}
}
