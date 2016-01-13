package db.operations.TMA;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.TmtData;

public class DaoForTmtData extends ADao<TmtData> {
	private static final String TMTDATA_GET_BY_ID = "SELECT * FROM tma_data WHERE id=? ";
	private static final String TMTDATA_UPDATE = "UPDATE tma_data " + "SET uploadSessionId=?,status=?,started=?,ended=?,sessionId=? " + "WHERE id=? ";
	private static final String TMTDATA_DELETE = "DELETE FROM tma_data WHERE id=?";
	private static final String TMTDATA_INSERT = "INSERT INTO tma_data (ID,uploadSessionId,status,started,ended,sessionId)" + " VALUES(?,?,?,?,?,?)";
	private static final String TMTDATA_GET_LIST = "SELECT * FROM tma_data";
	private static final String TMTDATA_GET_SORTED_LIST = "SELECT * FROM tma_data order by ";
	private static final String WHERE = " WHERE ";
	private static final String TMTDATA_UPDATE_SESSION_ID = "UPDATE tma_data " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public TmtData getById(int id) {
		TmtData tmtData = null;
		String qs = TMTDATA_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				tmtData = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtData;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(TmtData tmtData) {
		String qs = TMTDATA_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setString(1, tmtData.getUploadSessionId());
			ps.setString(2, tmtData.getStatus());
			ps.setDate(3, (Date) tmtData.getStarted());
			ps.setDate(4, (Date) tmtData.getEnded());
			ps.setString(5, tmtData.getSessionId());
			ps.setInt(6, tmtData.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = TMTDATA_UPDATE_SESSION_ID;
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
		String qs = TMTDATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(TmtData tmtData) {
		String qs = TMTDATA_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, tmtData.getId());
			ps.setString(2, tmtData.getUploadSessionId());
			ps.setString(3, tmtData.getStatus());
			ps.setDate(4, (Date) tmtData.getStarted());
			ps.setDate(5, (Date) tmtData.getEnded());
			ps.setString(6, tmtData.getSessionId());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected TmtData createObject(ResultSet rs) {
		TmtData tmtData = null;
		try {
			tmtData = new TmtData(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getString(6));
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtData;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = TMTDATA_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = TMTDATA_GET_SORTED_LIST + nameOfColumn;
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
		String qs = TMTDATA_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
