package db.operations.TMA;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.BatchData;

public class DaoForBatchData extends ADao<BatchData> {
	private static final String BATCHDATA_GET_BY_ID = "SELECT * FROM batch_data WHERE id=? ";
	private static final String BATCHDATA_UPDATE = "UPDATE batch_data " + "SET batchStatus=?,created=?,send=?,batchSize=?,sessionId=? " + "WHERE id=? ";
	private static final String BATCHDATA_DELETE = "DELETE FROM batch_data WHERE id=?";
	private static final String BATCHDATA_INSERT = "INSERT INTO batch_data (ID, batchStatus, created, send, batchSize, sessionId)" + " VALUES(?,?,?,?,?,?)";
	private static final String BATCHDATA_GET_LIST = "SELECT * FROM batch_data";
	private static final String BATCHDATA_GET_SORTED_LIST = "SELECT * FROM batch_data order by ";
	private static final String WHERE = " WHERE ";
	private static final String BATCHDATA_UPDATE_SESSION_ID = "UPDATE batch_data " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public BatchData getById(int id) {
		BatchData batchData = null;
		String qs = BATCHDATA_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				batchData = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return batchData;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(BatchData batchData) {
		String qs = BATCHDATA_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, batchData.getBatchStatus());
			ps.setDate(2, (Date) batchData.getCreated());
			ps.setDate(3, (Date) batchData.getSend());
			ps.setInt(4, batchData.getBatchSize());
			ps.setString(5, batchData.getSessionId());
			ps.setInt(6, batchData.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = BATCHDATA_UPDATE_SESSION_ID;
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
		String qs = BATCHDATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(BatchData batchData) {
		String qs = BATCHDATA_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, batchData.getId());
			ps.setString(2, batchData.getBatchStatus());
			ps.setDate(3, (Date) batchData.getCreated());
			ps.setDate(4, (Date) batchData.getSend());
			ps.setInt(5, batchData.getBatchSize());
			ps.setString(6, batchData.getSessionId());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected BatchData createObject(ResultSet rs) {
		BatchData batchData = null;
		try {
			batchData = new BatchData(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getString(6));
		} catch (SQLException e) {
			log.error(e);
		}
		return batchData;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = BATCHDATA_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = BATCHDATA_GET_SORTED_LIST + nameOfColumn;
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
		String qs = BATCHDATA_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
