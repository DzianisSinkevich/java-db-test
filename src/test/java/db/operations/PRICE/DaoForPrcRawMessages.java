package db.operations.PRICE;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcRawMessages;

public class DaoForPrcRawMessages extends ADao<PrcRawMessages> {
	private static final String RAWMESSAGES_GET_BY_ID = "SELECT * FROM raw_messages WHERE id=? ";
	private static final String RAWMESSAGES_UPDATE = "UPDATE raw_messages "
			+ "SET fileId=?, line=?, createdAt=?, type=?, sendCount=?, status=?, sessionId=?, svOperId=?, sequenceFile=?, sequinceLote=? " + "WHERE id=? ";
	private static final String RAWMESSAGES_DELETE = "DELETE FROM raw_messages WHERE id=? ";
	private static final String RAWMESSAGES_INSERT = "INSERT INTO raw_messages (id, fileId, line, createdAt, type, sendCount, status, sessionId, svOperId, sequenceFile, sequinceLote)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String RAWMESSAGES_GET_LIST = "SELECT * FROM raw_messages";
	private static final String RAWMESSAGES_GET_SORTED_LIST = "SELECT * FROM raw_messages order by ";
	private static final String WHERE = " WHERE ";
	private static final String RAWMESSAGES_UPDATE_SESSION_ID = "UPDATE raw_messages " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcRawMessages getById(int id) {
		PrcRawMessages prcRawMessages = null;
		String qs = RAWMESSAGES_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcRawMessages = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcRawMessages;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcRawMessages prcRawMessages) {
		String qs = RAWMESSAGES_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcRawMessages.getFileId());
			ps.setInt(2, prcRawMessages.getLine());
			ps.setDate(3, (Date) prcRawMessages.getCreatedAt());
			ps.setString(4, prcRawMessages.getType());
			ps.setInt(5, prcRawMessages.getSendCount());
			ps.setString(6, prcRawMessages.getStatus());
			ps.setString(7, prcRawMessages.getSessionId());
			ps.setInt(8, prcRawMessages.getSvOperId());
			ps.setInt(9, prcRawMessages.getSequenceFile());
			ps.setInt(10, prcRawMessages.getSequinceLote());
			ps.setInt(11, prcRawMessages.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = RAWMESSAGES_UPDATE_SESSION_ID;
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
		String qs = RAWMESSAGES_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcRawMessages prcRawMessages) {
		String qs = RAWMESSAGES_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcRawMessages.getId());
			ps.setInt(2, prcRawMessages.getFileId());
			ps.setInt(3, prcRawMessages.getLine());
			ps.setDate(4, (Date) prcRawMessages.getCreatedAt());
			ps.setString(5, prcRawMessages.getType());
			ps.setInt(6, prcRawMessages.getSendCount());
			ps.setString(7, prcRawMessages.getStatus());
			ps.setString(8, prcRawMessages.getSessionId());
			ps.setInt(9, prcRawMessages.getSvOperId());
			ps.setInt(10, prcRawMessages.getSequenceFile());
			ps.setInt(11, prcRawMessages.getSequinceLote());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcRawMessages createObject(ResultSet rs) {
		PrcRawMessages prcRawMessages = null;
		try {
			prcRawMessages = new PrcRawMessages(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getString(7),
					rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcRawMessages;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = RAWMESSAGES_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = RAWMESSAGES_GET_SORTED_LIST + nameOfColumn;
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
		String qs = RAWMESSAGES_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
