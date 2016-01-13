package db.operations.PRICE;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcFiles;

public class DaoForPrcFiles extends ADao<PrcFiles> {
	private static final String PRCFILES_GET_BY_ID = "SELECT * FROM prc_files WHERE id=? ";
	private static final String PRCFILES_UPDATE = "UPDATE prc_files "
			+ "SET fileName=?,uploadDate=?,processingDate=?,totalRecords=?,totalBatches=? ,recievedBatches=? ,sessionId=? ,status=? ,type=? " + "WHERE id=? ";
	private static final String PRCFILES_DELETE = "DELETE FROM prc_files WHERE id=?";
	private static final String PRCFILES_INSERT = "INSERT INTO prc_files (ID, fileName, uploadDate, processingDate, totalRecords, totalBatches, recievedBatches, sessionId, status, type)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String PRCFILES_GET_LIST = "SELECT * FROM prc_files";
	private static final String PRCFILES_GET_SORTED_LIST = "SELECT * FROM prc_files order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCFILES_UPDATE_SESSION_ID = "UPDATE prc_files " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcFiles getById(int id) {
		PrcFiles prcFiles = null;
		String qs = PRCFILES_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcFiles = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcFiles;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcFiles prcFiles) {
		String qs = PRCFILES_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, prcFiles.getFileName());
			ps.setDate(2, (Date) prcFiles.getUploadDate());
			ps.setDate(3, (Date) prcFiles.getProcessingDate());
			ps.setInt(4, prcFiles.getTotalRecords());
			ps.setInt(5, prcFiles.getTotalBatches());
			ps.setInt(6, prcFiles.getRecievedBatches());
			ps.setString(7, prcFiles.getSessionId());
			ps.setString(8, prcFiles.getStatus());
			ps.setString(9, prcFiles.getType());
			ps.setInt(10, prcFiles.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCFILES_UPDATE_SESSION_ID;
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
		String qs = PRCFILES_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcFiles prcFiles) {
		String qs = PRCFILES_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcFiles.getId());
			ps.setString(2, prcFiles.getFileName());
			ps.setDate(3, (Date) prcFiles.getUploadDate());
			ps.setDate(4, (Date) prcFiles.getProcessingDate());
			ps.setInt(5, prcFiles.getTotalRecords());
			ps.setInt(6, prcFiles.getTotalBatches());
			ps.setInt(7, prcFiles.getRecievedBatches());
			ps.setString(8, prcFiles.getSessionId());
			ps.setString(9, prcFiles.getStatus());
			ps.setString(10, prcFiles.getType());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcFiles createObject(ResultSet rs) {
		PrcFiles prcFiles = null;
		try {
			prcFiles = new PrcFiles(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8),
					rs.getString(9), rs.getString(10));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcFiles;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCFILES_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCFILES_GET_SORTED_LIST + nameOfColumn;
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
		String qs = PRCFILES_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
