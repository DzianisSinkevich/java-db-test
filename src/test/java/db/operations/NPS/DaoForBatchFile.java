package db.operations.NPS;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.NPS.BatchFile;

public class DaoForBatchFile extends ADao<BatchFile> {
	private static final String BATCHFILE_GET_BY_ID = "SELECT * FROM fibrn_record WHERE id=? ";
	private static final String BATCHFILE_UPDATE = "UPDATE fibrn_record " + "SET fileName=?, fileSize=?, fileStatus=?, started=?, ended=?, fileType=? "
			+ "WHERE id=? ";
	private static final String BATCHFILE_DELETE = "DELETE FROM fibrn_record WHERE id=?";
	private static final String BATCHFILE_INSERT = "INSERT INTO fibrn_record (ID, fileName, fileSize, fileStatus, started, ended, fileType)"
			+ " VALUES(?,?,?,?,?,?,?)";
	private static final String BATCHFILE_GET_LIST = "SELECT * FROM fibrn_record";
	private static final String BATCHFILE_GET_SORTED_LIST = "SELECT * FROM fibrn_record order by ";
	private static final String WHERE = " WHERE ";
	private static final String BATCHFILE_UPDATE_SESSION_ID = "UPDATE fibrn_record " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public BatchFile getById(int id) {
		BatchFile BatchFile = null;
		String qs = BATCHFILE_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				BatchFile = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return BatchFile;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(BatchFile BatchFile) {
		String qs = BATCHFILE_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, BatchFile.getFileName());
			ps.setInt(2, BatchFile.getFileSize());
			ps.setString(3, BatchFile.getFileStatus());
			ps.setDate(4, (Date) BatchFile.getStarted());
			ps.setDate(5, (Date) BatchFile.getEnded());
			ps.setString(6, BatchFile.getFileType());
			ps.setInt(7, BatchFile.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = BATCHFILE_UPDATE_SESSION_ID;
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
		String qs = BATCHFILE_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(BatchFile BatchFile) {
		String qs = BATCHFILE_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, BatchFile.getId());
			ps.setString(2, BatchFile.getFileName());
			ps.setInt(3, BatchFile.getFileSize());
			ps.setString(4, BatchFile.getFileStatus());
			ps.setDate(5, (Date) BatchFile.getStarted());
			ps.setDate(6, (Date) BatchFile.getEnded());
			ps.setString(7, BatchFile.getFileType());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected BatchFile createObject(ResultSet rs) {
		BatchFile BatchFile = null;
		try {
			BatchFile = new BatchFile(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7));
		} catch (SQLException e) {
			log.error(e);
		}
		return BatchFile;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = BATCHFILE_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = BATCHFILE_GET_SORTED_LIST + nameOfColumn;
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
		String qs = BATCHFILE_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
