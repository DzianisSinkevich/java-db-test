package db.operations.PRICE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcInst;

public class DaoForPrcInst extends ADao<PrcInst> {
	private static final String PRCINST_GET_BY_ID = "SELECT * FROM prc_inst WHERE inst_id=? ";
	private static final String PRCINST_UPDATE = "UPDATE prc_inst " + "SET is_active=? " + "WHERE inst_id=? ";
	private static final String PRCINST_DELETE = "DELETE FROM prc_inst WHERE inst_id=?";
	private static final String PRCINST_INSERT = "INSERT INTO prc_inst (inst_id, is_active)" + " VALUES(?,?)";
	private static final String PRCINST_GET_LIST = "SELECT * FROM prc_inst";
	private static final String PRCINST_GET_SORTED_LIST = "SELECT * FROM prc_inst order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCINST_UPDATE_SESSION_ID = "UPDATE prc_inst " + "SET SESSION_ID=? " + "WHERE inst_id=? ";

	@Override
	public PrcInst getById(int id) {
		PrcInst prcInst = null;
		String qs = PRCINST_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcInst = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcInst;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcInst prcInst) {
		String qs = PRCINST_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcInst.getIsActive());
			ps.setInt(2, prcInst.getInstId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCINST_UPDATE_SESSION_ID;
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
		String qs = PRCINST_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcInst prcInst) {
		String qs = PRCINST_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcInst.getInstId());
			ps.setInt(2, prcInst.getIsActive());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcInst createObject(ResultSet rs) {
		PrcInst prcInst = null;
		try {
			prcInst = new PrcInst(rs.getInt(1), rs.getInt(2));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcInst;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCINST_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCINST_GET_SORTED_LIST + nameOfColumn;
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
		String qs = PRCINST_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
