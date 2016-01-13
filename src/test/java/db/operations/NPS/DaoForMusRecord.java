package db.operations.NPS;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.NPS.MusRecord;

public class DaoForMusRecord extends ADao<MusRecord> {
	private static final String MUSRECORD_GET_BY_ID = "SELECT * FROM mus_record WHERE id=? ";
	private static final String MUSRECORD_UPDATE = "UPDATE mus_record " + "SET recordStatus=?,started=? " + "WHERE id=? ";
	private static final String MUSRECORD_DELETE = "DELETE FROM mus_record WHERE id=?";
	private static final String MUSRECORD_INSERT = "INSERT INTO mus_record (ID,recordStatus,started)" + " VALUES(?,?,?)";
	private static final String MUSRECORD_GET_LIST = "SELECT * FROM mus_record";
	private static final String MUSRECORD_GET_SORTED_LIST = "SELECT * FROM mus_record order by ";
	private static final String WHERE = " WHERE ";
	private static final String MUSRECORD_UPDATE_SESSION_ID = "UPDATE mus_record " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public MusRecord getById(int id) {
		MusRecord musRecord = null;
		String qs = MUSRECORD_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				musRecord = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return musRecord;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(MusRecord musRecord) {
		String qs = MUSRECORD_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, musRecord.getRecordStatus());
			ps.setDate(2, (Date) musRecord.getStarted());
			ps.setInt(3, musRecord.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = MUSRECORD_UPDATE_SESSION_ID;
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
		String qs = MUSRECORD_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(MusRecord musRecord) {
		String qs = MUSRECORD_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, musRecord.getId());
			ps.setString(2, musRecord.getRecordStatus());
			ps.setDate(3, (Date) musRecord.getStarted());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected MusRecord createObject(ResultSet rs) {
		MusRecord musRecord = null;
		try {
			musRecord = new MusRecord(rs.getInt(1), rs.getString(2), rs.getDate(3));
		} catch (SQLException e) {
			log.error(e);
		}
		return musRecord;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = MUSRECORD_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = MUSRECORD_GET_SORTED_LIST + nameOfColumn;
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
		String qs = MUSRECORD_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
