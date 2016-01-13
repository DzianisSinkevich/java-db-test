package db.operations.PRICE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcMessagesErrors;

public class DaoForPrcMessagesErrors extends ADao<PrcMessagesErrors> {
	private static final String PRCMESSAGESERRORS_GET_BY_ID = "SELECT * FROM prc_messages_errors WHERE id=? ";
	private static final String PRCMESSAGESERRORS_UPDATE = "UPDATE prc_messages_errors " + "SET version=?, msgId=?, error=? " + "WHERE id=? ";
	private static final String PRCMESSAGESERRORS_DELETE = "DELETE FROM prc_messages_errors WHERE id=? ";
	private static final String PRCMESSAGESERRORS_INSERT = "INSERT INTO prc_messages_errors (id, version, msgId, error)" + " VALUES(?,?,?,?)";
	private static final String PRCMESSAGESERRORS_GET_LIST = "SELECT * FROM prc_messages_errors";
	private static final String PRCMESSAGESERRORS_GET_SORTED_LIST = "SELECT * FROM prc_messages_errors order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCMESSAGESERRORS_UPDATE_SESSION_ID = "UPDATE prc_messages_errors " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcMessagesErrors getById(int id) {
		PrcMessagesErrors prcMessagesErrors = null;
		String qs = PRCMESSAGESERRORS_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcMessagesErrors = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcMessagesErrors;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcMessagesErrors prcMessagesErrors) {
		String qs = PRCMESSAGESERRORS_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcMessagesErrors.getVersion());
			ps.setInt(2, prcMessagesErrors.getMsgId());
			ps.setString(3, prcMessagesErrors.getError());
			ps.setInt(4, prcMessagesErrors.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCMESSAGESERRORS_UPDATE_SESSION_ID;
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
		String qs = PRCMESSAGESERRORS_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcMessagesErrors prcMessagesErrors) {
		String qs = PRCMESSAGESERRORS_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcMessagesErrors.getId());
			ps.setInt(2, prcMessagesErrors.getVersion());
			ps.setInt(3, prcMessagesErrors.getMsgId());
			ps.setString(4, prcMessagesErrors.getError());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcMessagesErrors createObject(ResultSet rs) {
		PrcMessagesErrors prcMessagesErrors = null;
		try {
			prcMessagesErrors = new PrcMessagesErrors(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcMessagesErrors;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCMESSAGESERRORS_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCMESSAGESERRORS_GET_SORTED_LIST + nameOfColumn;
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
		String qs = PRCMESSAGESERRORS_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
