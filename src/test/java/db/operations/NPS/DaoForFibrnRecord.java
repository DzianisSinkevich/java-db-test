package db.operations.NPS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.NPS.FibrnRecord;

public class DaoForFibrnRecord extends ADao<FibrnRecord> {
	private static final String FIBRNRECORD_GET_BY_ID = "SELECT * FROM fibrn_record WHERE id=? ";
	private static final String FIBRNRECORD_UPDATE = "UPDATE fibrn_record " + "SET fileId=?,recordType=? " + "WHERE id=? ";
	private static final String FIBRNRECORD_DELETE = "DELETE FROM fibrn_record WHERE id=?";
	private static final String FIBRNRECORD_INSERT = "INSERT INTO fibrn_record (ID,fileId,recordType)" + " VALUES(?,?,?)";
	private static final String FIBRNRECORD_GET_LIST = "SELECT * FROM fibrn_record";
	private static final String FIBRNRECORD_GET_SORTED_LIST = "SELECT * FROM fibrn_record order by ";
	private static final String WHERE = " WHERE ";
	private static final String FIBRNRECORD_UPDATE_SESSION_ID = "UPDATE fibrn_record " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public FibrnRecord getById(int id) {
		FibrnRecord fibrnRecord = null;
		String qs = FIBRNRECORD_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				fibrnRecord = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return fibrnRecord;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(FibrnRecord fibrnRecord) {
		String qs = FIBRNRECORD_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, fibrnRecord.getFileId());
			ps.setString(2, fibrnRecord.getRecordType());
			ps.setInt(3, fibrnRecord.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = FIBRNRECORD_UPDATE_SESSION_ID;
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
		String qs = FIBRNRECORD_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(FibrnRecord fibrnRecord) {
		String qs = FIBRNRECORD_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, fibrnRecord.getId());
			ps.setInt(2, fibrnRecord.getFileId());
			ps.setString(3, fibrnRecord.getRecordType());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected FibrnRecord createObject(ResultSet rs) {
		FibrnRecord fibrnRecord = null;
		try {
			fibrnRecord = new FibrnRecord(rs.getInt(1), rs.getInt(2), rs.getString(3));
		} catch (SQLException e) {
			log.error(e);
		}
		return fibrnRecord;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = FIBRNRECORD_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = FIBRNRECORD_GET_SORTED_LIST + nameOfColumn;
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
		String qs = FIBRNRECORD_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
