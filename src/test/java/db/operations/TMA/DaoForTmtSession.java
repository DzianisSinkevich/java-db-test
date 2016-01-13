package db.operations.TMA;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.TmtSession;

public class DaoForTmtSession extends ADao<TmtSession> {
	private static final String TMTSESSION_GET_BY_ID = "SELECT * FROM tmt_session WHERE id=? ";
	private static final String TMTSESSION_UPDATE = "UPDATE tmt_session "
			+ "SET started=?,ended=?,status=?,totalTransactions=?,sessionId=? ,s74=? ,s75=? ,s76=? ,s77=? ,s80=? ,s81=? ,s85=? ,s86=? ,s87=? ,s88=? ,s89=? ,s97=? ,s105=? ,s106=? ,s107=? ,s108=? ,s109=? ,s110=? ,openSessionSend=? ,closeSessionSend=? "
			+ "WHERE id=? ";
	private static final String TMTSESSION_DELETE = "DELETE FROM tmt_session WHERE id=?";
	private static final String TMTSESSION_INSERT = "INSERT INTO tmt_session (ID, started, ended, status, totalTransactions, sessionId ,s74 ,s75 ,s76 ,s77 ,s80 ,s81 ,s85 ,s86 ,s87 ,s88 ,s89 ,s97 ,s105 ,s106 ,s107 ,s108 ,s109 ,s110 ,openSessionSend ,closeSessionSend)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String TMTSESSION_GET_LIST = "SELECT * FROM tmt_session";
	private static final String TMTSESSION_GET_SORTED_LIST = "SELECT * FROM tmt_session order by ";
	private static final String WHERE = " WHERE ";
	private static final String TMTSESSION_UPDATE_SESSION_ID = "UPDATE tmt_session " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public TmtSession getById(int id) {
		TmtSession tmtSession = null;
		String qs = TMTSESSION_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				tmtSession = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtSession;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(TmtSession tmtSession) {
		String qs = TMTSESSION_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setDate(1, (Date) tmtSession.getStarted());
			ps.setDate(2, (Date) tmtSession.getEnded());
			ps.setString(3, tmtSession.getStatus());
			ps.setInt(4, tmtSession.getTotalTransactions());
			ps.setString(5, tmtSession.getSessionId());
			ps.setInt(6, tmtSession.getS74());
			ps.setInt(7, tmtSession.getS75());
			ps.setInt(8, tmtSession.getS76());
			ps.setInt(9, tmtSession.getS77());
			ps.setInt(10, tmtSession.getS80());
			ps.setInt(11, tmtSession.getS81());
			ps.setInt(12, tmtSession.getS85());
			ps.setInt(13, tmtSession.getS86());
			ps.setInt(14, tmtSession.getS87());
			ps.setInt(15, tmtSession.getS88());
			ps.setInt(16, tmtSession.getS89());
			ps.setInt(17, tmtSession.getS97());
			ps.setInt(18, tmtSession.getS105());
			ps.setInt(19, tmtSession.getS106());
			ps.setInt(20, tmtSession.getS107());
			ps.setInt(21, tmtSession.getS108());
			ps.setInt(22, tmtSession.getS109());
			ps.setInt(23, tmtSession.getS110());
			ps.setInt(24, tmtSession.getOpenSessionSend());
			ps.setInt(25, tmtSession.getCloseSessionSend());
			ps.setInt(26, tmtSession.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = TMTSESSION_UPDATE_SESSION_ID;
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
		String qs = TMTSESSION_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(TmtSession tmtSession) {
		String qs = TMTSESSION_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, tmtSession.getId());
			ps.setDate(2, (Date) tmtSession.getStarted());
			ps.setDate(3, (Date) tmtSession.getEnded());
			ps.setString(4, tmtSession.getStatus());
			ps.setInt(5, tmtSession.getTotalTransactions());
			ps.setString(6, tmtSession.getSessionId());
			ps.setInt(7, tmtSession.getS74());
			ps.setInt(8, tmtSession.getS75());
			ps.setInt(9, tmtSession.getS76());
			ps.setInt(10, tmtSession.getS77());
			ps.setInt(11, tmtSession.getS80());
			ps.setInt(12, tmtSession.getS81());
			ps.setInt(13, tmtSession.getS85());
			ps.setInt(14, tmtSession.getS86());
			ps.setInt(15, tmtSession.getS87());
			ps.setInt(16, tmtSession.getS88());
			ps.setInt(17, tmtSession.getS89());
			ps.setInt(18, tmtSession.getS97());
			ps.setInt(19, tmtSession.getS105());
			ps.setInt(20, tmtSession.getS106());
			ps.setInt(21, tmtSession.getS107());
			ps.setInt(22, tmtSession.getS108());
			ps.setInt(23, tmtSession.getS109());
			ps.setInt(24, tmtSession.getS110());
			ps.setInt(25, tmtSession.getOpenSessionSend());
			ps.setInt(26, tmtSession.getCloseSessionSend());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected TmtSession createObject(ResultSet rs) {
		TmtSession tmtSession = null;
		try {
			tmtSession = new TmtSession(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8),
					rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getInt(17),
					rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23), rs.getInt(24), rs.getInt(25), rs.getInt(26));
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtSession;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = TMTSESSION_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = TMTSESSION_GET_SORTED_LIST + nameOfColumn;
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
		String qs = TMTSESSION_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
