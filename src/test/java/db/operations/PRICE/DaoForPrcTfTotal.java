package db.operations.PRICE;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcTfTotal;

public class DaoForPrcTfTotal extends ADao<PrcTfTotal> {
	private static final String PRCTFTOTAl_GET_BY_ID = "SELECT * FROM prc_tf_total WHERE file_id=? ";
	private static final String PRCTFTOTAl_UPDATE = "UPDATE prc_tf_total " + "SET sessionId=?, totalAmount=?, storeDate=? " + "WHERE file_id=? ";
	private static final String PRCTFTOTAl_DELETE = "DELETE FROM prc_tf_total WHERE file_id=? ";
	private static final String PRCTFTOTAl_INSERT = "INSERT INTO prc_tf_total (file_id, sessionId, totalAmount, storeDate)" + " VALUES(?,?,?,?)";
	private static final String PRCTFTOTAl_GET_LIST = "SELECT * FROM prc_tf_total";
	private static final String PRCTFTOTAl_GET_SORTED_LIST = "SELECT * FROM prc_tf_total order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCTFTOTAl_UPDATE_SESSION_ID = "UPDATE prc_tf_total " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcTfTotal getById(int id) {
		PrcTfTotal prcTfTotal = null;
		String qs = PRCTFTOTAl_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcTfTotal = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcTfTotal;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcTfTotal prcTfTotal) {
		String qs = PRCTFTOTAl_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, prcTfTotal.getSessionId());
			ps.setInt(2, prcTfTotal.getTotalAmount());
			ps.setDate(3, (Date) prcTfTotal.getStoreDate());
			ps.setInt(4, prcTfTotal.getFileId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCTFTOTAl_UPDATE_SESSION_ID;
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
		String qs = PRCTFTOTAl_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcTfTotal prcTfTotal) {
		String qs = PRCTFTOTAl_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(4, prcTfTotal.getFileId());
			ps.setString(1, prcTfTotal.getSessionId());
			ps.setInt(2, prcTfTotal.getTotalAmount());
			ps.setDate(3, (Date) prcTfTotal.getStoreDate());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcTfTotal createObject(ResultSet rs) {
		PrcTfTotal prcTfTotal = null;
		try {
			prcTfTotal = new PrcTfTotal(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcTfTotal;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCTFTOTAl_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCTFTOTAl_GET_SORTED_LIST + nameOfColumn;
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
		String qs = PRCTFTOTAl_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
