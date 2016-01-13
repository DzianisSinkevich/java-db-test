package db.operations.TMA;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.TmtSessionMessage;

public class DaoForTmtSessionMessage extends ADao<TmtSessionMessage> {
	private static final String TMTSESSIONMESSAGE_GET_BY_ID = "SELECT * FROM tmt_session_message WHERE id=? ";
	private static final String TMTSESSIONMESSAGE_UPDATE = "UPDATE tmt_session_message "
			+ "SET tmtSessionId=?, created=?, uploadSessionId=?, sessionType=?, s74=?, s75=?, s76=?, s77=?, s86=?, s87=?, s88=?, s89=?, s97=?, s109=?, s110=?, s80=?, s81=?, s85=?, s105=?, s106=?, s107=?, s108=? "
			+ "WHERE id=? ";
	private static final String TMTSESSIONMESSAGE_DELETE = "DELETE FROM tmt_session_message WHERE id=?";
	private static final String TMTSESSIONMESSAGE_INSERT = "INSERT INTO tmt_session_message (ID, tmtSessionId, created, uploadSessionId, sessionType, s74, s75, s76, s77, s86, s87, s88, s89, s97, s109, s110, s80, s81, s85, s105, s106, s107, s108)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String TMTSESSIONMESSAGE_GET_LIST = "SELECT * FROM tmt_session_message";
	private static final String TMTSESSIONMESSAGE_GET_SORTED_LIST = "SELECT * FROM tmt_session_message order by ";
	private static final String WHERE = " WHERE ";
	private static final String TMTSESSIONMESSAGE_UPDATE_SESSION_ID = "UPDATE tmt_session_message " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public TmtSessionMessage getById(int id) {
		TmtSessionMessage tmtSessionMessage = null;
		String qs = TMTSESSIONMESSAGE_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				tmtSessionMessage = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtSessionMessage;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(TmtSessionMessage tmtSessionMessage) {
		String qs = TMTSESSIONMESSAGE_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, tmtSessionMessage.getTmtSessionId());
			ps.setDate(2, (Date) tmtSessionMessage.getCreated());
			ps.setString(3, tmtSessionMessage.getUploadSessionId());
			ps.setString(4, tmtSessionMessage.getSessionType());
			ps.setInt(5, tmtSessionMessage.getS74());
			ps.setInt(6, tmtSessionMessage.getS75());
			ps.setInt(7, tmtSessionMessage.getS76());
			ps.setInt(8, tmtSessionMessage.getS77());
			ps.setInt(9, tmtSessionMessage.getS86());
			ps.setInt(10, tmtSessionMessage.getS87());
			ps.setInt(11, tmtSessionMessage.getS88());
			ps.setInt(12, tmtSessionMessage.getS89());
			ps.setInt(13, tmtSessionMessage.getS97());
			ps.setInt(14, tmtSessionMessage.getS109());
			ps.setInt(15, tmtSessionMessage.getS110());
			ps.setInt(16, tmtSessionMessage.getS80());
			ps.setInt(17, tmtSessionMessage.getS81());
			ps.setInt(18, tmtSessionMessage.getS85());
			ps.setInt(19, tmtSessionMessage.getS105());
			ps.setInt(20, tmtSessionMessage.getS106());
			ps.setInt(21, tmtSessionMessage.getS107());
			ps.setInt(22, tmtSessionMessage.getS108());
			ps.setInt(23, tmtSessionMessage.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = TMTSESSIONMESSAGE_UPDATE_SESSION_ID;
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
		String qs = TMTSESSIONMESSAGE_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(TmtSessionMessage tmtSessionMessage) {
		String qs = TMTSESSIONMESSAGE_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, tmtSessionMessage.getId());
			ps.setInt(2, tmtSessionMessage.getTmtSessionId());
			ps.setDate(3, (Date) tmtSessionMessage.getCreated());
			ps.setString(4, tmtSessionMessage.getUploadSessionId());
			ps.setString(5, tmtSessionMessage.getSessionType());
			ps.setInt(6, tmtSessionMessage.getS74());
			ps.setInt(7, tmtSessionMessage.getS75());
			ps.setInt(8, tmtSessionMessage.getS76());
			ps.setInt(9, tmtSessionMessage.getS77());
			ps.setInt(10, tmtSessionMessage.getS86());
			ps.setInt(11, tmtSessionMessage.getS87());
			ps.setInt(12, tmtSessionMessage.getS88());
			ps.setInt(13, tmtSessionMessage.getS89());
			ps.setInt(14, tmtSessionMessage.getS97());
			ps.setInt(15, tmtSessionMessage.getS109());
			ps.setInt(16, tmtSessionMessage.getS110());
			ps.setInt(17, tmtSessionMessage.getS80());
			ps.setInt(18, tmtSessionMessage.getS81());
			ps.setInt(19, tmtSessionMessage.getS85());
			ps.setInt(20, tmtSessionMessage.getS105());
			ps.setInt(21, tmtSessionMessage.getS106());
			ps.setInt(22, tmtSessionMessage.getS107());
			ps.setInt(23, tmtSessionMessage.getS108());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected TmtSessionMessage createObject(ResultSet rs) {
		TmtSessionMessage tmtSessionMessage = null;
		try {
			tmtSessionMessage = new TmtSessionMessage(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
					rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16),
					rs.getInt(17), rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23));
		} catch (SQLException e) {
			log.error(e);
		}
		return tmtSessionMessage;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = TMTSESSIONMESSAGE_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = TMTSESSIONMESSAGE_GET_SORTED_LIST + nameOfColumn;
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
		String qs = TMTSESSIONMESSAGE_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
