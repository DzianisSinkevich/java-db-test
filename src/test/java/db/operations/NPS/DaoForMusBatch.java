package db.operations.NPS;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.NPS.MusBatch;

public class DaoForMusBatch extends ADao<MusBatch> {
	private static final String MUSBATCH_GET_BY_ID = "SELECT * FROM mus_batch WHERE id=? ";
	private static final String MUSBATCH_UPDATE = "UPDATE mus_batch "
			+ "SET FILE_ID=?,ORIGINATOR=?,DESTINATOR=?,DATA_RECORD=?,SESSION_NUMBER=?,TRANSACTION_DATE_TIME=?,APPLICATION_ID=?,SESSION_ID=?,S74=?,S75=?,S76=?,S77=?,S80=?,S81=?,S86=?,S87=?,S88=?,S89=?,S97=?,S109=?,S110=? "
			+ "WHERE id=? ";
	private static final String MUSBATCH_DELETE = "DELETE FROM mus_batch WHERE id=?";
	private static final String MUSBATCH_INSERT = "INSERT INTO mus_batch (ID,FILE_ID,ORIGINATOR,DESTINATOR,DATA_RECORD,SESSION_NUMBER,TRANSACTION_DATE_TIME,APPLICATION_ID,SESSION_ID,S74,S75,S76,S77,S80,S81,S86,S87,S88,S89,S97,S109,S110)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String MUSBATCH_GET_LIST = "SELECT * FROM mus_batch";
	private static final String MUSBATCH_GET_SORTED_LIST = "SELECT * FROM mus_batch order by ";
	private static final String WHERE = " WHERE ";
	private static final String MUSBATCH_SELECT_ID_DINERS_SESSION = "SELECT id FROM mus_batch WHERE SESSION_ID LIKE '24_0444-%'";
	private static final String MUSBATCH_UPDATE_SESSION_ID = "UPDATE mus_batch " + "SET SESSION_ID=? " + "WHERE id=? ";

	public int getIdDinersSession() {
		int id = 0;
		String qs = MUSBATCH_SELECT_ID_DINERS_SESSION;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			log.error(e);
		}
		try {
			if (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		if (id != 0) {
			System.out.println("Session id - " + id);
			return id;
		} else {
			System.out.println("Session id - underfined");
			return 0;
		}

	}

	@Override
	public MusBatch getById(int id) {
		MusBatch musBatch = null;
		String qs = MUSBATCH_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				musBatch = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return musBatch;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(MusBatch musBatch) {
		String qs = MUSBATCH_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, musBatch.getFileId());
			ps.setString(2, musBatch.getOriginator());
			ps.setString(3, musBatch.getDestinator());
			ps.setString(4, musBatch.getDataRecord());
			ps.setString(5, musBatch.getSessionNumber());
			ps.setDate(6, (Date) musBatch.getTransactionDateTime());
			ps.setString(7, musBatch.getApplicationId());
			ps.setString(8, musBatch.getSessionId());
			ps.setInt(9, musBatch.getS74());
			ps.setInt(10, musBatch.getS75());
			ps.setInt(11, musBatch.getS76());
			ps.setInt(12, musBatch.getS77());
			ps.setInt(13, musBatch.getS80());
			ps.setInt(14, musBatch.getS81());
			ps.setInt(15, musBatch.getS86());
			ps.setInt(16, musBatch.getS87());
			ps.setInt(17, musBatch.getS88());
			ps.setInt(18, musBatch.getS89());
			ps.setInt(19, musBatch.getS97());
			ps.setInt(20, musBatch.getS109());
			ps.setInt(21, musBatch.getS110());
			ps.setInt(22, musBatch.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = MUSBATCH_UPDATE_SESSION_ID;
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
		String qs = MUSBATCH_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(MusBatch musBatch) {
		String qs = MUSBATCH_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, musBatch.getId());
			ps.setInt(2, musBatch.getFileId());
			ps.setString(3, musBatch.getOriginator());
			ps.setString(4, musBatch.getDestinator());
			ps.setString(5, musBatch.getDataRecord());
			ps.setString(6, musBatch.getSessionNumber());
			ps.setDate(7, (Date) musBatch.getTransactionDateTime());
			ps.setString(8, musBatch.getApplicationId());
			ps.setString(9, musBatch.getSessionId());
			ps.setInt(10, musBatch.getS74());
			ps.setInt(11, musBatch.getS75());
			ps.setInt(12, musBatch.getS76());
			ps.setInt(13, musBatch.getS77());
			ps.setInt(14, musBatch.getS80());
			ps.setInt(15, musBatch.getS81());
			ps.setInt(16, musBatch.getS86());
			ps.setInt(17, musBatch.getS87());
			ps.setInt(18, musBatch.getS88());
			ps.setInt(19, musBatch.getS89());
			ps.setInt(20, musBatch.getS97());
			ps.setInt(21, musBatch.getS109());
			ps.setInt(22, musBatch.getS110());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected MusBatch createObject(ResultSet rs) {
		MusBatch musBatch = null;
		try {
			musBatch = new MusBatch(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7),
					rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16),
					rs.getInt(17), rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22));
		} catch (SQLException e) {
			log.error(e);
		}
		return musBatch;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = MUSBATCH_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = MUSBATCH_GET_SORTED_LIST + nameOfColumn;
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
		String qs = MUSBATCH_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
