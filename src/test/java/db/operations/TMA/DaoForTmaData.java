package db.operations.TMA;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.TmaData;

public class DaoForTmaData extends ADao<TmaData> {
	private static final String TMADATA_GET_BY_ID = "SELECT * FROM tma_data WHERE id=? ";
	private static final String TMADATA_UPDATE = "UPDATE tma_data "
			+ "SET status=?,started=?,ended=?,priority=?,acqSessionId=?,manualProcessed=?,uploadSessionId=?,issSessionId=?,dccValue=?,dccDiscrepancy=? "
			+ "WHERE id=? ";
	private static final String TMADATA_DELETE = "DELETE FROM tma_data WHERE id=?";
	private static final String TMADATA_INSERT = "INSERT INTO tma_data (ID,status,started,ended,priority,acqSessionId,manualProcessed,uploadSessionId,issSessionId,dccValue,dccDiscrepancy)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String TMADATA_GET_LIST = "SELECT * FROM tma_data";
	private static final String TMADATA_GET_SORTED_LIST = "SELECT * FROM tma_data order by ";
	private static final String WHERE = " WHERE ";
	private static final String TMADATA_UPDATE_SESSION_ID = "UPDATE tma_data " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public TmaData getById(int id) {
		TmaData tmaData = null;
		String qs = TMADATA_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				tmaData = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return tmaData;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(TmaData tmaData) {
		String qs = TMADATA_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, tmaData.getStatus());
			ps.setDate(2, (Date) tmaData.getStarted());
			ps.setDate(3, (Date) tmaData.getEnded());
			ps.setInt(4, tmaData.getPriority());
			ps.setInt(5, tmaData.getAcqSessionId());
			ps.setInt(6, tmaData.getManualProcessed());
			ps.setString(7, tmaData.getUploadSessionId());
			ps.setInt(8, tmaData.getIssSessionId());
			ps.setInt(9, tmaData.getDccValue());
			ps.setInt(10, tmaData.getDccDiscrepancy());
			ps.setInt(11, tmaData.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = TMADATA_UPDATE_SESSION_ID;
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
		String qs = TMADATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(TmaData tmaData) {
		String qs = TMADATA_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, tmaData.getId());
			ps.setString(2, tmaData.getStatus());
			ps.setDate(3, (Date) tmaData.getStarted());
			ps.setDate(4, (Date) tmaData.getEnded());
			ps.setInt(5, tmaData.getPriority());
			ps.setInt(6, tmaData.getAcqSessionId());
			ps.setInt(7, tmaData.getManualProcessed());
			ps.setString(8, tmaData.getUploadSessionId());
			ps.setInt(9, tmaData.getIssSessionId());
			ps.setInt(10, tmaData.getDccValue());
			ps.setInt(11, tmaData.getDccDiscrepancy());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected TmaData createObject(ResultSet rs) {
		TmaData tmaData = null;
		try {
			tmaData = new TmaData(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8),
					rs.getInt(9), rs.getInt(10), rs.getInt(11));
		} catch (SQLException e) {
			log.error(e);
		}
		return tmaData;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = TMADATA_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = TMADATA_GET_SORTED_LIST + nameOfColumn;
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
		String qs = TMADATA_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
