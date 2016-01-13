package db.operations.PRICE;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.PRICE.PrcMessages;

public class DaoForPrcMessages extends ADao<PrcMessages> {
	private static final String PRCMESSAGES_GET_BY_ID = "SELECT * FROM prc_messages WHERE id=? ";
	private static final String PRCMESSAGES_UPDATE = "UPDATE prc_messages "
			+ "SET version=?, userId=?, p02=?, p03=?, p04=?, p05=?, p06=?, p09=?, p10=?, p11=?, p12=?, p14=?, "
			+ "p16=?, p17=?, p18=?, p19=?, p22=?, p23=?, p24=?, p25=?, p26=?, p27=?, p28=?, p29=?, p301=?, p302=?,  "
			+ "p31=?, p32=?, p33=?, p35=?, p37=?, p38=?, p39=?, p40=?, p41=?, p42=?, p43=?, p44=?, p45=?, p46=?, "
			+ "p48=?, p4801=?, p4802=?, p4803=?, p4804=?, p4805=?, p4806=?, p4807=?, p4808=?, p4809=?, p4810=?, "
			+ "p4812=?, p4813=?, p4814=?, p4815=?, p4816=?, p4817=?, p4818=?, p4819=?, p4820=?, p4821=?, p4822=?, "
			+ "p4823=?, p4824=?, p4825=?, p4826=?, p4828=?, p4829=?, p4830=?, p4831=?, p4835=?, p49=?, p50=?, p51=?, "
			+ "p53=?, p55=?, p57=?, p58=?, p62=?, p6201=?, p6202=?, p6203=?, p6204=?, p6205=?, p6206=?, p6213=?, "
			+ "p6216=?, p6217=?, s71=?, s72=?, s74=?, s75=?, s76=?, s77=?, s80=?, s81=?, s85=?, s86=?, s87=?, s88=?, "
			+ "s89=?, s93=?, s94=?, s95=?, s97=?, s101=?, s102=?, s104=?, s105=?, s106=?, s107=?, s108=?, s109=?, "
			+ "s110=?, sessId=?, p56=?, optp=?, msgt=?, issInst=?, issNetwork=?, acqInst=?, acqNetwork=? " + "WHERE id=? ";
	private static final String PRCMESSAGES_DELETE = "DELETE FROM prc_messages WHERE id=?";
	private static final String PRCMESSAGES_INSERT = "INSERT INTO prc_messages (id, version, userId, p02, p03, "
			+ "p04, p05, p06, p09, p10, p11, p12, p14, p16, p17, p18, p19, p22, p23, p24, p25, p26, p27, p28, "
			+ "p29, p301, p302, p31, p32, p33, p35, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p48, "
			+ "p4801, p4802, p4803, p4804, p4805, p4806, p4807, p4808, p4809, p4810, p4812, p4813, p4814, p4815, "
			+ "p4816, p4817, p4818, p4819, p4820, p4821, p4822, p4823, p4824, p4825, p4826, p4828, p4829, p4830, "
			+ "p4831, p4835, p49, p50, p51, p53, p55, p57, p58, p62, p6201, p6202, p6203, p6204, p6205, p6206, "
			+ "p6213, p6216, p6217, s71, s72, s74, s75, s76, s77, s80, s81, s85, s86, s87, s88, s89, s93, s94, "
			+ "s95, s97, s101, s102, s104, s105, s106, s107, s108, s109, s110, sessId, p56, optp, msgt, issInst, " + "issNetwork, acqInst, acqNetwork)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String PRCMESSAGES_GET_LIST = "SELECT * FROM prc_messages";
	private static final String PRCMESSAGES_GET_SORTED_LIST = "SELECT * FROM prc_messages order by ";
	private static final String WHERE = " WHERE ";
	private static final String PRCMESSAGES_UPDATE_SESSION_ID = "UPDATE prc_messages " + "SET SESSION_ID=? " + "WHERE id=? ";

	@Override
	public PrcMessages getById(int id) {
		PrcMessages prcMessages = null;
		String qs = PRCMESSAGES_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				prcMessages = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return prcMessages;

	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(PrcMessages prcMessages) {
		String qs = PRCMESSAGES_UPDATE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcMessages.getVersion());
			ps.setInt(2, prcMessages.getUserId());
			ps.setString(3, prcMessages.getP02());
			ps.setInt(4, prcMessages.getP03());
			ps.setInt(5, prcMessages.getP04());
			ps.setInt(6, prcMessages.getP05());
			ps.setInt(7, prcMessages.getP06());
			ps.setInt(8, prcMessages.getP09());
			ps.setInt(9, prcMessages.getP10());
			ps.setInt(10, prcMessages.getP11());
			ps.setInt(11, prcMessages.getP12());
			ps.setInt(12, prcMessages.getP14());
			ps.setInt(13, prcMessages.getP16());
			ps.setInt(14, prcMessages.getP17());
			ps.setInt(15, prcMessages.getP18());
			ps.setInt(16, prcMessages.getP19());
			ps.setInt(17, prcMessages.getP22());
			ps.setString(18, prcMessages.getP23());
			ps.setInt(19, prcMessages.getP24());
			ps.setInt(20, prcMessages.getP25());
			ps.setInt(21, prcMessages.getP26());
			ps.setInt(22, prcMessages.getP27());
			ps.setInt(23, prcMessages.getP28());
			ps.setInt(24, prcMessages.getP29());
			ps.setInt(25, prcMessages.getP301());
			ps.setInt(26, prcMessages.getP302());
			ps.setString(27, prcMessages.getP31());
			ps.setString(28, prcMessages.getP32());
			ps.setString(29, prcMessages.getP33());
			ps.setString(30, prcMessages.getP35());
			ps.setString(31, prcMessages.getP37());
			ps.setString(32, prcMessages.getP38());
			ps.setInt(33, prcMessages.getP39());
			ps.setInt(34, prcMessages.getP40());
			ps.setString(35, prcMessages.getP41());
			ps.setString(36, prcMessages.getP42());
			ps.setString(37, prcMessages.getP43());
			ps.setString(38, prcMessages.getP44());
			ps.setString(39, prcMessages.getP45());
			ps.setString(40, prcMessages.getP46());
			ps.setString(41, prcMessages.getP48());
			ps.setInt(42, prcMessages.getP4801());
			ps.setInt(43, prcMessages.getP4802());
			ps.setInt(44, prcMessages.getP4803());
			ps.setInt(45, prcMessages.getP4804());
			ps.setString(46, prcMessages.getP4805());
			ps.setString(47, prcMessages.getP4806());
			ps.setInt(48, prcMessages.getP4807());
			ps.setInt(49, prcMessages.getP4808());
			ps.setString(50, prcMessages.getP4809());
			ps.setInt(51, prcMessages.getP4810());
			ps.setInt(52, prcMessages.getP4812());
			ps.setString(53, prcMessages.getP4813());
			ps.setString(54, prcMessages.getP4814());
			ps.setString(55, prcMessages.getP4815());
			ps.setInt(56, prcMessages.getP4816());
			ps.setInt(57, prcMessages.getP4817());
			ps.setInt(58, prcMessages.getP4818());
			ps.setString(59, prcMessages.getP4819());
			ps.setInt(60, prcMessages.getP4820());
			ps.setString(61, prcMessages.getP4821());
			ps.setString(62, prcMessages.getP4822());
			ps.setInt(63, prcMessages.getP4823());
			ps.setString(64, prcMessages.getP4824());
			ps.setString(65, prcMessages.getP4825());
			ps.setString(66, prcMessages.getP4826());
			ps.setInt(67, prcMessages.getP4828());
			ps.setString(68, prcMessages.getP4829());
			ps.setInt(69, prcMessages.getP4830());
			ps.setString(70, prcMessages.getP4831());
			ps.setString(71, prcMessages.getP4835());
			ps.setInt(72, prcMessages.getP49());
			ps.setInt(73, prcMessages.getP50());
			ps.setInt(74, prcMessages.getP51());
			ps.setInt(75, prcMessages.getP53());
			ps.setString(76, prcMessages.getP55());
			ps.setInt(77, prcMessages.getP57());
			ps.setString(78, prcMessages.getP58());
			ps.setString(79, prcMessages.getP62());
			ps.setInt(80, prcMessages.getP6201());
			ps.setInt(81, prcMessages.getP6202());
			ps.setInt(82, prcMessages.getP6203());
			ps.setInt(83, prcMessages.getP6204());
			ps.setString(84, prcMessages.getP6205());
			ps.setInt(85, prcMessages.getP6206());
			ps.setString(86, prcMessages.getP6213());
			ps.setString(87, prcMessages.getP6216());
			ps.setInt(88, prcMessages.getP6217());
			ps.setInt(89, prcMessages.getS71());
			ps.setDate(90, (Date) prcMessages.getS72());
			ps.setInt(91, prcMessages.getS74());
			ps.setInt(92, prcMessages.getS75());
			ps.setInt(93, prcMessages.getS76());
			ps.setInt(94, prcMessages.getS77());
			ps.setInt(95, prcMessages.getS80());
			ps.setInt(96, prcMessages.getS81());
			ps.setInt(97, prcMessages.getS85());
			ps.setInt(98, prcMessages.getS86());
			ps.setInt(99, prcMessages.getS87());
			ps.setInt(100, prcMessages.getS88());
			ps.setInt(101, prcMessages.getS89());
			ps.setString(102, prcMessages.getS93());
			ps.setString(103, prcMessages.getS94());
			ps.setString(104, prcMessages.getS95());
			ps.setInt(105, prcMessages.getS97());
			ps.setString(106, prcMessages.getS101());
			ps.setString(107, prcMessages.getS102());
			ps.setString(108, prcMessages.getS104());
			ps.setInt(109, prcMessages.getS105());
			ps.setInt(110, prcMessages.getS106());
			ps.setInt(111, prcMessages.getS107());
			ps.setInt(112, prcMessages.getS108());
			ps.setInt(113, prcMessages.getS109());
			ps.setInt(114, prcMessages.getS110());
			ps.setString(115, prcMessages.getSessId());
			ps.setString(116, prcMessages.getP56());
			ps.setString(117, prcMessages.getOptp());
			ps.setString(118, prcMessages.getMsgt());
			ps.setInt(119, prcMessages.getIssInst());
			ps.setInt(120, prcMessages.getIssNetwork());
			ps.setInt(121, prcMessages.getAcqInst());
			ps.setInt(122, prcMessages.getAcqNetwork());
			ps.setInt(123, prcMessages.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getUpdateSessionIdPreparedStatement(int id, String sessionId) {
		String qs = PRCMESSAGES_UPDATE_SESSION_ID;
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
		String qs = PRCMESSAGES_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(PrcMessages prcMessages) {
		String qs = PRCMESSAGES_INSERT;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, prcMessages.getId());
			ps.setInt(2, prcMessages.getVersion());
			ps.setInt(3, prcMessages.getUserId());
			ps.setString(4, prcMessages.getP02());
			ps.setInt(5, prcMessages.getP03());
			ps.setInt(6, prcMessages.getP04());
			ps.setInt(7, prcMessages.getP05());
			ps.setInt(8, prcMessages.getP06());
			ps.setInt(9, prcMessages.getP09());
			ps.setInt(10, prcMessages.getP10());
			ps.setInt(11, prcMessages.getP11());
			ps.setInt(12, prcMessages.getP12());
			ps.setInt(13, prcMessages.getP14());
			ps.setInt(14, prcMessages.getP16());
			ps.setInt(15, prcMessages.getP17());
			ps.setInt(16, prcMessages.getP18());
			ps.setInt(17, prcMessages.getP19());
			ps.setInt(18, prcMessages.getP22());
			ps.setString(19, prcMessages.getP23());
			ps.setInt(20, prcMessages.getP24());
			ps.setInt(21, prcMessages.getP25());
			ps.setInt(22, prcMessages.getP26());
			ps.setInt(23, prcMessages.getP27());
			ps.setInt(24, prcMessages.getP28());
			ps.setInt(25, prcMessages.getP29());
			ps.setInt(26, prcMessages.getP301());
			ps.setInt(27, prcMessages.getP302());
			ps.setString(28, prcMessages.getP31());
			ps.setString(29, prcMessages.getP32());
			ps.setString(30, prcMessages.getP33());
			ps.setString(31, prcMessages.getP35());
			ps.setString(32, prcMessages.getP37());
			ps.setString(33, prcMessages.getP38());
			ps.setInt(34, prcMessages.getP39());
			ps.setInt(35, prcMessages.getP40());
			ps.setString(36, prcMessages.getP41());
			ps.setString(37, prcMessages.getP42());
			ps.setString(38, prcMessages.getP43());
			ps.setString(39, prcMessages.getP44());
			ps.setString(40, prcMessages.getP45());
			ps.setString(41, prcMessages.getP46());
			ps.setString(42, prcMessages.getP48());
			ps.setInt(43, prcMessages.getP4801());
			ps.setInt(44, prcMessages.getP4802());
			ps.setInt(45, prcMessages.getP4803());
			ps.setInt(46, prcMessages.getP4804());
			ps.setString(47, prcMessages.getP4805());
			ps.setString(48, prcMessages.getP4806());
			ps.setInt(49, prcMessages.getP4807());
			ps.setInt(50, prcMessages.getP4808());
			ps.setString(51, prcMessages.getP4809());
			ps.setInt(52, prcMessages.getP4810());
			ps.setInt(53, prcMessages.getP4812());
			ps.setString(54, prcMessages.getP4813());
			ps.setString(55, prcMessages.getP4814());
			ps.setString(56, prcMessages.getP4815());
			ps.setInt(57, prcMessages.getP4816());
			ps.setInt(58, prcMessages.getP4817());
			ps.setInt(59, prcMessages.getP4818());
			ps.setString(60, prcMessages.getP4819());
			ps.setInt(61, prcMessages.getP4820());
			ps.setString(62, prcMessages.getP4821());
			ps.setString(63, prcMessages.getP4822());
			ps.setInt(64, prcMessages.getP4823());
			ps.setString(65, prcMessages.getP4824());
			ps.setString(66, prcMessages.getP4825());
			ps.setString(67, prcMessages.getP4826());
			ps.setInt(68, prcMessages.getP4828());
			ps.setString(69, prcMessages.getP4829());
			ps.setInt(70, prcMessages.getP4830());
			ps.setString(71, prcMessages.getP4831());
			ps.setString(72, prcMessages.getP4835());
			ps.setInt(73, prcMessages.getP49());
			ps.setInt(74, prcMessages.getP50());
			ps.setInt(75, prcMessages.getP51());
			ps.setInt(76, prcMessages.getP53());
			ps.setString(77, prcMessages.getP55());
			ps.setInt(78, prcMessages.getP57());
			ps.setString(79, prcMessages.getP58());
			ps.setString(80, prcMessages.getP62());
			ps.setInt(81, prcMessages.getP6201());
			ps.setInt(82, prcMessages.getP6202());
			ps.setInt(83, prcMessages.getP6203());
			ps.setInt(84, prcMessages.getP6204());
			ps.setString(85, prcMessages.getP6205());
			ps.setInt(86, prcMessages.getP6206());
			ps.setString(87, prcMessages.getP6213());
			ps.setString(88, prcMessages.getP6216());
			ps.setInt(89, prcMessages.getP6217());
			ps.setInt(90, prcMessages.getS71());
			ps.setDate(91, (Date) prcMessages.getS72());
			ps.setInt(92, prcMessages.getS74());
			ps.setInt(93, prcMessages.getS75());
			ps.setInt(94, prcMessages.getS76());
			ps.setInt(95, prcMessages.getS77());
			ps.setInt(96, prcMessages.getS80());
			ps.setInt(97, prcMessages.getS81());
			ps.setInt(98, prcMessages.getS85());
			ps.setInt(99, prcMessages.getS86());
			ps.setInt(100, prcMessages.getS87());
			ps.setInt(101, prcMessages.getS88());
			ps.setInt(102, prcMessages.getS89());
			ps.setString(103, prcMessages.getS93());
			ps.setString(104, prcMessages.getS94());
			ps.setString(105, prcMessages.getS95());
			ps.setInt(106, prcMessages.getS97());
			ps.setString(107, prcMessages.getS101());
			ps.setString(108, prcMessages.getS102());
			ps.setString(109, prcMessages.getS104());
			ps.setInt(110, prcMessages.getS105());
			ps.setInt(111, prcMessages.getS106());
			ps.setInt(112, prcMessages.getS107());
			ps.setInt(113, prcMessages.getS108());
			ps.setInt(114, prcMessages.getS109());
			ps.setInt(115, prcMessages.getS110());
			ps.setString(116, prcMessages.getSessId());
			ps.setString(117, prcMessages.getP56());
			ps.setString(118, prcMessages.getOptp());
			ps.setString(119, prcMessages.getMsgt());
			ps.setInt(120, prcMessages.getIssInst());
			ps.setInt(121, prcMessages.getIssNetwork());
			ps.setInt(122, prcMessages.getAcqInst());
			ps.setInt(123, prcMessages.getAcqNetwork());
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PrcMessages createObject(ResultSet rs) {
		PrcMessages prcMessages = null;
		try {
			prcMessages = new PrcMessages(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
					rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getInt(17),
					rs.getInt(18), rs.getString(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23), rs.getInt(24), rs.getInt(25), rs.getInt(26),
					rs.getInt(27), rs.getString(28), rs.getString(29), rs.getString(30), rs.getString(31), rs.getString(32), rs.getString(33), rs.getInt(34),
					rs.getInt(35), rs.getString(36), rs.getString(37), rs.getString(38), rs.getString(39), rs.getString(40), rs.getString(41), rs.getString(42),
					rs.getInt(43), rs.getInt(44), rs.getInt(45), rs.getInt(46), rs.getString(47), rs.getString(48), rs.getInt(49), rs.getInt(50),
					rs.getString(51), rs.getInt(52), rs.getInt(53), rs.getString(54), rs.getString(55), rs.getString(56), rs.getInt(57), rs.getInt(58),
					rs.getInt(59), rs.getString(60), rs.getInt(61), rs.getString(62), rs.getString(63), rs.getInt(64), rs.getString(65), rs.getString(66),
					rs.getString(67), rs.getInt(68), rs.getString(69), rs.getInt(70), rs.getString(71), rs.getString(72), rs.getInt(73), rs.getInt(74),
					rs.getInt(75), rs.getInt(76), rs.getString(77), rs.getInt(78), rs.getString(79), rs.getString(80), rs.getInt(81), rs.getInt(82),
					rs.getInt(83), rs.getInt(84), rs.getString(85), rs.getInt(86), rs.getString(87), rs.getString(88), rs.getInt(89), rs.getInt(90),
					rs.getDate(91), rs.getInt(92), rs.getInt(93), rs.getInt(94), rs.getInt(95), rs.getInt(96), rs.getInt(97), rs.getInt(98), rs.getInt(99),
					rs.getInt(100), rs.getInt(101), rs.getInt(102), rs.getString(103), rs.getString(104), rs.getString(105), rs.getInt(106), rs.getString(107),
					rs.getString(108), rs.getString(109), rs.getInt(110), rs.getInt(111), rs.getInt(112), rs.getInt(113), rs.getInt(114), rs.getInt(115),
					rs.getString(116), rs.getString(117), rs.getString(118), rs.getString(119), rs.getInt(120), rs.getInt(121), rs.getInt(122), rs.getInt(123));
		} catch (SQLException e) {
			log.error(e);
		}
		return prcMessages;
	}

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = PRCMESSAGES_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = PRCMESSAGES_GET_SORTED_LIST + nameOfColumn;
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
		String qs = PRCMESSAGES_GET_LIST + WHERE + nameOfColumn + " = " + value;
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
