package db.operations.TMA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.operations.ADao;
import db.utils.Connector;
import entity.TMA.TmaMovActc;

public class DaoForTmaMovActc extends ADao<TmaMovActc> {
	private static final String TMAMOVACTC_GET_BY_ID = "SELECT * FROM tma_mov_actc WHERE id=? ";
	private static final String TMAMOVACTC_UPDATE = "UPDATE tma_mov_actc " + "SET batchStatus=?,created=?,send=?,batchSize=?,sessionId=? " + "WHERE id=? ";
	private static final String TMAMOVACTC_DELETE = "DELETE FROM tma_mov_actc WHERE id=?";
	private static final String TMADATA_DELETE = "DELETE FROM tma_data";
	private static final String TMTDATA_DELETE = "DELETE FROM tmt_data";
	private static final String BATCHDATA_DELETE = "DELETE FROM batch_data";
	private static final String TMTMESSAGESESSION_DELETE = "DELETE FROM tmt_message_session";
	private static final String TMTSESSION_DELETE = "DELETE FROM tmt_session";
	private static final String TMAMOVACTC_DELETE_ALL = "DELETE FROM tma_mov_actc";
	private static final String TMTMOVACTC_DELETE_ALL = "DELETE FROM tmt_mov_actc";
	private static final String TMP3_TMAMOVACTC_DELETE = "DELETE FROM tmp3_tma_mov_actc";
	private static final String TMP3_TMTMOVACTC_DELETE = "DELETE FROM tmp3_tmt_mov_actc";
	private static final String TMAMOVACTC_INSERT = "INSERT INTO tma_mov_actc (ID, batchStatus, created, send, batchSize, sessionId)" + " VALUES(?,?,?,?,?,?)";
	private static final String TMAMOVACTC_GET_LIST = "SELECT * FROM tma_mov_actc";
	private static final String TMAMOVACTC_GET_SORTED_LIST = "SELECT * FROM tma_mov_actc order by ";
	private static final String WHERE = " WHERE ";
	private static final String TMAMOVACTC_OPEN_SESSION = "INSERT INTO TMA_TMT.TMA_MOV_ACTC (SELECT a.CMAQPART,a.CMAPALTA,a.CP0LAPPL,a.CMAQNSES,a.CMAQNMOV,a.CM0LTMOV,a.CMAMCRTS,a.CMAMNTAR, a.CMAMPROC,a.CMAMIMSO,a.CMAMMONC,a.CMAMMONE,a.CMAMCADU,a.CMAMACTI,a.CMAMDTPS,a.CMAMFUNC, a.CMAMRAZO,a.CMAMCLSR,a.CMAMLGAU,a.CMAMSEAD,a.CMAMSERE,a.CMAMCOAD,a.CMAMCORE,a.CMAMIMOR, a.CMAMIMCO,a.CMAMDTP2,a.CMAMREFE,a.CMAMNAUT,a.CMAMACAD,a.CMAMACRE,a.CMAMCSRV,a.CMAMCOME, a.CMAMDOMI,a.CMAMDTAD,a.CMAMCUTR,a.CMAMOFFS,a.CMAMIDIO,a.CMAMNOFF,a.CMAMNIDI,a.CMAMSALD, a.CMAMULMV,a.CMAMCVVA,a.CMAMTERM,a.CMAMENVI,a.CMAMPVV ,a.CMAMBLOQ,a.CMAMMONA,a.CMAMCIFA, a.CMAMCIFR,a.CMAMSEGA,a.CMAMSEGR,a.CMAMDTOR,a.CMAMIDAU,a.CMAMMACA,a.CMAMMACR,a.CMAMENSA, a.CMAMENSM,a.CMAMENSR,a.CMAMDTPF,a.CMAMDTPR,a.CMAMDTVR,a.CMAVNULO,a.C0DLCIER,a.CMAPTRAN, a.CMAQIDTR,a.CMALMENS,a.CA3LLPAN,a.CMACTARJ,a.CM2LTRSP,a.CM3LTCTA,a.CM3QNULO,a.CMAJIMAD, a.CMAJIMCO,a.CMAICAMC,a.CE0LMON2,a.CMAJIMTI,a.CMAICAMB,a.CE0LMONE,a.CMAFCADU,a.C41LACTI, a.C3HCCATE,a.C2KCAUTT,a.C2JCRETA,a.C2HCENTO,a.C3ICPRCL,a.C3JCPRTJ,a.C2LCCEDT,a.C3KCAUMO,a.C3LCAUDI,a.C3MCAUDA,a.C3NCSEDA,a.C2ICCAPP,a.CM4LFMEN,a.CM5LRAZM,a.C42LCLSR,a.CMAILGAU,'151127','151127',a.CMALCOAD,a.CMALCORE,a.CMAJIMOR,a.CMAJIMOC,a.CMAILGP2,a.CMAVDTP2,a.CMACREFE,a.CMAVNAUT,a.CM1LRESP,a.CM1LRES1,a.CA5LSRTJ,a.C43LECA ,a.C43LCOME,a.C43CCHEC,a.C43NREDU,a.C43ALOCA,a.C86CALF2,a.CMAVDTAD,a.CMALTCU1,a.CMAJCUO1,a.CMALTCU2,a.CMAJCUO2,a.CMALTCU3,a.CMAJCUO3,a.CMALTCU4,a.CMAJCUO4,a.CMAQOFFS,a.CMALIDIO,a.CMAQOFFN,a.CMALIDIN,a.CMALSALD,a.CMAIDICR,a.CMAIDIDB,a.CMAIDIDI,a.CMAFMOV1,a.CMAJMOV1,a.CMALMOV1,a.CMAFMOV2,a.CMAJMOV2,a.CMALMOV2,a.CMAFMOV3,a.CMAJMOV3,a.CMALMOV3,a.CMAFMOV4,a.CMAJMOV4,a.CMALMOV4,a.CMAFMOV5,a.CMAJMOV5,a.CMALMOV5,a.CMAFMOV6,a.CMAJMOV6,a.CMALMOV6,a.CMAVCVV ,a.CMACCAJE,a.CMALENVI,a.CMAQPVV ,a.CMAQBLOQ,a.CE0LMON1,a.CMAVCFAD,a.CMAVCFRE,a.CX0LFSEG,a.CX0LALGO,a.CX0LFBLQ,a.CX0LZPIN,a.CX0LZMAC,a.CX0LFSE1,a.CX0LALG1,a.CX0LFBL1,a.CX0LZPI1,a.CX0LZMA1,a.C0DLCIE1,a.CMAPTRAO,a.CMAQIDTO,a.CMALMENO,a.C0DLCIE2,a.CMACMACA,a.CMACMACR,a.CMAPMVEA,a.CMAPMVSA,a.CMAPMVEM,a.CMAPMVSM,a.CMAPMVER,a.CMAPMVSR,a.CMAILGPF,a.CMAVDTPF,a.CMAVESPR,a.C0DLCIE3,a.C0DLCIE4,a.CMAMCSLN,a.CMAMVFCV,a.CMAMVFPI,a.CMAMRESL,a.CMAMCRDB,a.CMAVPROC,a.CMAMIEBA,a.CMAMIEBR,a.CMAMRESO,a.C0CCTEMI,a.CA1LTTAR,a.C0DLCIE5,a.CMAMIDPR,a.CMAMCONX,a.CMALCSBM,a.CMALCSBC,a.CMAMP11B,a.CMAQIDTB,a.CMAMP03B,a.CMACTCUE,a.CMAMP28M,a.CMAQSEME,a.CMAMP29B,a.CMALCOME,a.CMAMP31 ,a.CMACREFS,a.CMAMP41 ,a.CMACTERM,a.CMAMP44B,a.CMAVDTAC,a.CMAMP45 ,a.CMAVDTP1,a.CMAMP57 ,a.CMAQPPAU,a.CMAIPPAU,a.CMAMP62A,a.CMAFAC62,a.CMAQOP62,a.CMAQTR62,a.CMAJSA62,a.CMACFI62,a.CMACFO62,a.CMAMP62B,a.CMAVCA62,a.CMAMP62C,a.CMAVAD62,a.CMAVAC62,a.CMAMP62D,a.CMAVCE62,a.CMAVGC62,a.CMAMP62E,a.CMAVCF62,a.CMAMP62F,a.CMAVDA62,a.CMAMP62G,a.CMAIO162,a.CMALO162,a.CMAJO162,a.CMAIO262,a.CMALO262,a.CMAJO262,a.CMAIO362,a.CMALO362,a.CMAJO362,a.CMAMP62H,a.CMACIS62,a.CMAFAS62,a.CMAVAL62,a.CMAVVC62,a.CMACIF62,a.CMAMS95 ,a.CMACRFEM,a.CMAMDPR2,a.CMAVDPR2,a.CMAMDTV2,a.CMAVDTV2,a.CMAMBFRA,a.CMAMFRAU,a.CMAMCERR,a.CMACERRO,a.CMAMREGI,a.CMACRGAD,a.CMACRGRE,a.CMAMPAIE,a.C86CALF3,a.CMAMDPF2,a.CMAVDPF2,a.CMAMDTEM,a.CMAVDTEM,a.CMAMMOCA,a.CMAJIMCA,a.CMAICMCA,a.CE0LMON3,a.CMAMCUPR,a.CMALTCP1,a.CMAJCUP1,a.CMALTCP2,a.CMAJCUP2,a.CMALTCP3,a.CMAJCUP3,a.CMALTCP4,a.CMAJCUP4,a.CMAMP11O,a.CMAQIDBO,a.CMAM6216,a.CA3LLPAC,a.CMACTARC,a.CMAFCADC,a.CA5LSRTC,a.CMAMDTCH,a.C0DLCIE6,a.CMALCSBE,a.CMAVDTCH,a.CMAMPEFR,a.CMAQPEFR,a.CMANTERM,a.CMAMNSEC,a.CMAQNSEC,a.CMAMCRPE,a.CMAMCRIP,a.CMAMCRPT,a.CMAMSCRI,a.CMAMECOM,a.CMAVSETC,a.CMAVSETT,a.CMAMIAID,a.CMAVIAID,a.CMAMDTTJ,a.CMAVDTTJ,a.CMAMDDTJ,a.CMAVDDTJ,a.CMAMDDSH,a.CMAVDDSH,a.CMAMDTSL,a.CMAVDTSL,a.CMAMCRPR,a.CMAVCRPR,a.CMAMDGCE,a.CMAVDGCE,a.CMAMLSAM,a.CMAVLSAM,a.CMAMSLEM,a.CMAVSLEM,a.CMAMCRRE,a.CMAVCRRE,a.CMAMACTR,a.CMACACTR,a.CMAMCMSR,a.CMAMTCSR,a.CMAJCMSR,a.CE0LCMSR,a.CMAMDAT_PRF ,a.CMAVDAT_PRF ,a.CMAMDAT_PRC ,a.CMAMMODU_PRC,a.CMAQTARE_PRC,a.CE0LLADQ_PRC,a.CE0LLRES_PRC,a.CMAQMS89_PRC,a.CMARTASA_PRC,a.C41CTRMO_PRC,a.C43CCAE_PRC ,a.CMAMPSUS_PRC,a.CMAMRSPR_PRC,a.CMACRSPR_PRC,a.CMAMDAT_MER ,a.CMACOPTV_MER,a.CMAVDAT_MER ,a.CMAMTPO_HSM ,a.CMAITACC_HSM,a.CMAITTOT_HSM,a.CMACCOMM_HSM,a.CMAMDAT_ONL ,a.CMAVDAT_ONL ,a.CMAMCRI_PRE ,a.CMAVCRI_PRE ,a.CMAMCRI_RES ,a.CMAVCRI_RES ,a.CMACE8A_RES ,a.CMAMCRI_SCR ,a.CMACRES_SCR  ,a.CMAMOPE_ESP ,a.CMACOPTV_ESP ,a.CMAVOPTV_ESP ,a.CMAMPRF_COM ,a.CMAMADCC_COM ,a.CMAMPROP_COM ,a.CMAMPREA_COM ,a.CMAMTAXF_COM ,a.CE0LLIQU_COM ,a.CMAMFDIG_COM ,a.CMAMTPRV_COM ,a.CMAMDAT_NTR ,a.CMAVDAT_NTR ,a.CMAMDAT_ISL ,a.CMAVDAT_ISL ,a.CMACVVCA_PRC ,a.CMAQVCA_PRC,a.C00LCSBA_AGR ,a.C00QLESQ ,a.C0DLCIE3_T01 ,a.CMACLYNX_RES ,a.CMAMDDTO ,a.CD1LTDTO_SOL ,a.CA0LMARC_SOL ,a.C00LCSB_SOL ,a.CE2LTDID_SOL ,a.CMACIDFI_SOL ,a.CD1LTDTO_RES ,a.CMAJIFIJ_RES ,a.CMAJIPCT_RES ,a.CMAJIDTO_RES ,NULL, NULL, 1,a.CMAVCRPE, a.CMAVCRIP, a.CMACRSCR, a.CMAVCRPT, a.CMAVSCRI, a.CMAVCRI_SCR FROM TMA_TMT.TMA_MOV_ACTC_CDD A WHERE NVL(A.CMAQIDTR,0)||NVL(A.CMAPTRAN,0)||NVL(A.C0DLCIER,0)||NVL(A.CMALMENS,0) NOT IN (SELECT NVL(B.CMAQIDTR,0)||NVL(B.CMAPTRAN,0)||NVL(B.C0DLCIER,0)||NVL(B.CMALMENS,0) FROM TMA_TMT.TMA_MOV_ACTC B) AND (A.CMALCSBM IN ('3058','3858') OR A.CMALCSBC IN ('3058','3858') OR A.C0DLCIE3_T01 IN ('23058','23858')) AND A.CMAVNAUT <> '      ' AND A.C00QLESQ IN (111,129) AND  A.CMALCSBM  IN (3058, 0031, 0078, 0234, 1525, 3001, 3140) AND ROWNUM <=1 ";

	public PreparedStatement getTmaDataClear() {
		String qs = TMADATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmtDataClear() {
		String qs = TMTDATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getBatchDataClear() {
		String qs = BATCHDATA_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmtMessageSessionClear() {
		String qs = TMTMESSAGESESSION_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmtSessionClear() {
		String qs = TMTSESSION_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmaMovActcClear() {
		String qs = TMAMOVACTC_DELETE_ALL;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmtMovActcClear() {
		String qs = TMTMOVACTC_DELETE_ALL;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmp3TmaMovActcDataClear() {
		String qs = TMP3_TMAMOVACTC_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	public PreparedStatement getTmp3TmtMovActcDataClear() {
		String qs = TMP3_TMTMOVACTC_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	public TmaMovActc getById(int id) {
		TmaMovActc tmaMovActc = null;
		String qs = TMAMOVACTC_GET_BY_ID;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			if (rs.next()) {
				tmaMovActc = createObject(rs);
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return tmaMovActc;

	}

	public PreparedStatement getOpenSession() {
		String qs = TMAMOVACTC_OPEN_SESSION;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getDeletePreparedStatement(int id) {
		String qs = TMAMOVACTC_DELETE;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
			ps.setInt(1, id);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	// @Override
	// protected TmaMovActc createObject(ResultSet rs) {
	// TmaMovActc tmaMovActc = null;
	// try {
	// tmaMovActc = new TmaMovActc(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getString(6));
	// } catch (SQLException e) {
	// log.error(e);
	// }
	// return tmaMovActc;
	// }

	@Override
	protected PreparedStatement getListPreparedStatement() {
		String qs = TMAMOVACTC_GET_LIST;
		try {
			ps = Connector.getInstance().getConnNPS().prepareStatement(qs);
		} catch (SQLException e) {
			log.error(e);
		}
		return ps;
	}

	@Override
	protected PreparedStatement getSortedListPreparedStatement(String nameOfColumn) {
		String qs = TMAMOVACTC_GET_SORTED_LIST + nameOfColumn;
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
		String qs = TMAMOVACTC_GET_LIST + WHERE + nameOfColumn + " = " + value;
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

	@Override
	protected TmaMovActc createObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getUpdatePreparedStatement(TmaMovActc entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getInsertPreparedStatement(TmaMovActc entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
