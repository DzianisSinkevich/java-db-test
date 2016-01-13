package db.operations.NPS;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.NPS.FibrnBatch;

public class DaoForFibrnBatch extends ADao<FibrnBatch> {
	private static final String FIBRNBATCH_GET_BY_ID = "SELECT * FROM fibrn_batch WHERE id=? ";
	private static final String FIBRNBATCH_UPDATE = "UPDATE fibrn_batch "
			+ "SET fileId=?, originator=?, destinator=?, fileDate=?, fileSequence=?, fileName=?, currencyType=?, totalAmount=?, numberOfRecords=?, netAmount=?, amountSign=?, totalComissions=?, comissionSign=?, applicationId=?, sessionId=?, recordsTotal=? "
			+ "WHERE id=? ";
	private static final String FIBRNBATCH_DELETE = "DELETE FROM fibrn_batch WHERE id=?";
	private static final String FIBRNBATCH_INSERT = "INSERT INTO fibrn_batch (ID, fileId, originator, destinator, fileDate, fileSequence, fileName, currencyType, totalAmount, numberOfRecords, netAmount, amountSign, totalComissions, comissionSign, applicationId, sessionId, recordsTotal)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String FIBRNBATCH_GET_LIST = "SELECT * FROM fibrn_batch";
	private static final String FIBRNBATCH_GET_SORTED_LIST = "SELECT * FROM fibrn_batch order by ";
	private static final String WHERE = " WHERE ";
	private static final String FIBRNBATCH_SELECT_ID_DINERS_SESSION = "SELECT id FROM fibrn_batch WHERE SESSION_ID LIKE '24_0444-%'";
	private static final String FIBRNBATCH_UPDATE_SESSION_ID = "UPDATE fibrn_batch " + "SET SESSION_ID=? " + "WHERE id=? ";

	public int getIdDinersSession() {
		int id = 0;
		String qs = FIBRNBATCH_SELECT_ID_DINERS_SESSION;
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
	public FibrnBatch getById(int id) {
		FibrnBatch fibrnBatch = null;
		String qs = FIBRNBATCH_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				fibrnBatch = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return fibrnBatch;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(FibrnBatch fibrnBatch) {
		String qs = FIBRNBATCH_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, fibrnBatch.getFileId());
			ps.setString(2, fibrnBatch.getOriginator());
			ps.setString(3, fibrnBatch.getDestinator());
			ps.setDate(4, (Date) fibrnBatch.getFileDate());
			ps.setInt(5, fibrnBatch.getFileSequence());
			ps.setString(6, fibrnBatch.getFileName());
			ps.setString(7, fibrnBatch.getCurrencyType());
			ps.setInt(8, fibrnBatch.getTotalAmount());
			ps.setInt(9, fibrnBatch.getNumberOfRecords());
			ps.setInt(10, fibrnBatch.getNetAmount());
			ps.setString(11, fibrnBatch.getAmountSign());
			ps.setInt(12, fibrnBatch.getTotalComissions());
			ps.setString(13, fibrnBatch.getComissionSign());
			ps.setString(14, fibrnBatch.getApplicationId());
			ps.setString(15, fibrnBatch.getSessionId());
			ps.setInt(16, fibrnBatch.getRecordsTotal());
			ps.setInt(17, fibrnBatch.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = FIBRNBATCH_UPDATE_SESSION_ID;
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
		String qs = FIBRNBATCH_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(FibrnBatch fibrnBatch) {
		String qs = FIBRNBATCH_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, fibrnBatch.getId());
			ps.setInt(2, fibrnBatch.getFileId());
			ps.setString(3, fibrnBatch.getOriginator());
			ps.setString(4, fibrnBatch.getDestinator());
			ps.setDate(5, (Date) fibrnBatch.getFileDate());
			ps.setInt(6, fibrnBatch.getFileSequence());
			ps.setString(7, fibrnBatch.getFileName());
			ps.setString(8, fibrnBatch.getCurrencyType());
			ps.setInt(9, fibrnBatch.getTotalAmount());
			ps.setInt(10, fibrnBatch.getNumberOfRecords());
			ps.setInt(11, fibrnBatch.getNetAmount());
			ps.setString(12, fibrnBatch.getAmountSign());
			ps.setInt(13, fibrnBatch.getTotalComissions());
			ps.setString(14, fibrnBatch.getComissionSign());
			ps.setString(15, fibrnBatch.getApplicationId());
			ps.setString(16, fibrnBatch.getSessionId());
			ps.setInt(17, fibrnBatch.getRecordsTotal());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected FibrnBatch createObject(ResultSet rs) {
		FibrnBatch fibrnBatch = null;
		try {
			fibrnBatch = new FibrnBatch(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getString(7),
					rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getString(12), rs.getInt(13), rs.getString(14), rs.getString(15),
					rs.getString(16), rs.getInt(17));
		} catch (SQLException e) {
			log.error(e);
		}
		return fibrnBatch;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = FIBRNBATCH_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = FIBRNBATCH_GET_SORTED_LIST + nameOfColumn;
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
		String qs = FIBRNBATCH_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
