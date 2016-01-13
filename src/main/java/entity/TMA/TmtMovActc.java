package entity.TMA;

import java.io.Serializable;
import java.util.Date;

public class TmtMovActc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cMTQPART;
	private Date cMTPALTA;
	private int cP0LAPPL;
	private int cMTQNSES;
	private int cMTQNMOV;
	private int cM0LTMOV;
	private String cMTMCRTS;
	private String cMTMFUNC;
	private String cMTMCLSR;
	private String cMTMSEAD;
	private String cMTMACCI;
	private String cMTMCOME;
	private String cMTMCUEN;
	private String cMTMIDTC;
	private String cMTMNUAB;
	private String cMTMNUAA;
	private String cMTMNUCA;
	private String cMTMNUAC;
	private String cMTMIMAB;
	private String cMTMIMAA;
	private String cMTMIMCA;
	private String cMTMIMAC;
	private String cMTMIMTI;
	private String cMTMIMTA;
	private String cMTMIMTC;
	private String cMTMENSA;
	private String cMTMRESO;
	private String cMTMIEBC;
	private String cMTMERRO;
	private String cMTMNCUE;
	private String cMTVNULO;
	private int c0dlcier;
	private int cMTPTRAN;
	private int cMTQIDTR;
	private int cMTLMENS;
	private int cM4LFMEN;
	private int c42lclsr;
	private int cMTQSEAD;
	private int cM1LRESP;
	private int c43leca;
	private int c43lcome;
	private String c43cchec;
	private int c00ltipo;
	private int c00lcsb;
	private int c45lcsb;
	private int cMTQNCTA;
	private String c20ccome;
	private int c20lorde;
	private int c33lorde;
	private int cMTLACUM;
	private int cMTIABON;
	private int cMTIANAB;
	private int cMTICARG;
	private int cMTIANCA;
	private int cMTJABON;
	private int cMTJANAB;
	private int cMTJCARG;
	private int cMTJANCA;
	private int cMTJTINT;
	private int cMTJTABO;
	private int cMTJTCAR;
	private Date cMTPMVEN;
	private Date cMTPMVSA;
	private int c0dlcie1;
	private String cMTMIEAS;
	private String cMTQERRO;
	private int c00ltip1;
	private int c00lcsb1;
	private int c45lcsb1;
	private int cMTQNCT1;
	private String cMTVNCTA;
	private String cMTVNCT1;
	private int cMTQREME;
	private int cMTQSESI;
	private String cMTNTERM;
	private String cMTMP33;
	private int c0dlp33;
	private int cD1LTDTO;
	private int cD5JIFIJ;
	private int cD5JIPCT;
	private int cMTJIDTO;
	private String cMTMDDTO;
	private int cA0LTECL;
	private String cMTMNSIC;
	private int cMTQNSIC;
	private String cMTMAGRA;
	private int c00lcsbaAgr;
	private String cMTMICIE;
	private String cMTMCIER;
	private String cMTMCIErSio;
	private int c0dlciErSio;
	private String cMTMACTI;
	private int c41lacti;
	private int c40lacti;
	private String cMTMIMMX;
	private int cMTJIMAX;
	private String cMTMFSEsSio;
	private int cMTFSESiSio;
	private String cMTMNSEsSio;
	private int cMTQNSEsSio;
	private String cMTMDCCJ;
	private int cE0LMONE;
	private int cMTJREIN;
	private int cMTJINGR;
	private int cMTJTALO;
	private int cMTJOTRO;
	private int cMTIOPER;
	private int cMTIREIN;
	private int cMTIIGEF;
	private int cMTIIGTL;
	private int cMTITRSP;
	private int cMTITRSF;
	private int cMTICSAL;
	private int cMTIOTRO;
	private int cMTIULMV;
	private int cMTIFTRP;
	private int cMTICPIN;
	private int cMTICIDI;
	private int cMTIIGTlEur;
	private int cMTITRSpEur;
	private int cMTITRSfEur;
	private int cMTIOTRoEur;
	private int svIntergalId;
	private int isNewField;

	public TmtMovActc() {

	}

	public TmtMovActc(int cMTQPART, Date cMTPALTA, int cP0LAPPL, int cMTQNSES, int cMTQNMOV, int cM0LTMOV, String cMTMCRTS, String cMTMFUNC, String cMTMCLSR,
			String cMTMSEAD, String cMTMACCI, String cMTMCOME, String cMTMCUEN, String cMTMIDTC, String cMTMNUAB, String cMTMNUAA, String cMTMNUCA,
			String cMTMNUAC, String cMTMIMAB, String cMTMIMAA, String cMTMIMCA, String cMTMIMAC, String cMTMIMTI, String cMTMIMTA, String cMTMIMTC,
			String cMTMENSA, String cMTMRESO, String cMTMIEBC, String cMTMERRO, String cMTMNCUE, String cMTVNULO, int c0dlcier, int cMTPTRAN, int cMTQIDTR,
			int cMTLMENS, int cM4LFMEN, int c42lclsr, int cMTQSEAD, int cM1LRESP, int c43leca, int c43lcome, String c43cchec, int c00ltipo, int c00lcsb,
			int c45lcsb, int cMTQNCTA, String c20ccome, int c20lorde, int c33lorde, int cMTLACUM, int cMTIABON, int cMTIANAB, int cMTICARG, int cMTIANCA,
			int cMTJABON, int cMTJANAB, int cMTJCARG, int cMTJANCA, int cMTJTINT, int cMTJTABO, int cMTJTCAR, Date cMTPMVEN, Date cMTPMVSA, int c0dlcie1,
			String cMTMIEAS, String cMTQERRO, int c00ltip1, int c00lcsb1, int c45lcsb1, int cMTQNCT1, String cMTVNCTA, String cMTVNCT1, int cMTQREME,
			int cMTQSESI, String cMTNTERM, String cMTMP33, int c0dlp33, int cD1LTDTO, int cD5JIFIJ, int cD5JIPCT, int cMTJIDTO, String cMTMDDTO, int cA0LTECL,
			String cMTMNSIC, int cMTQNSIC, String cMTMAGRA, int c00lcsbaAgr, String cMTMICIE, String cMTMCIER, String cMTMCIErSio, int c0dlciErSio,
			String cMTMACTI, int c41lacti, int c40lacti, String cMTMIMMX, int cMTJIMAX, String cMTMFSEsSio, int cMTFSESiSio, String cMTMNSEsSio,
			int cMTQNSEsSio, String cMTMDCCJ, int cE0LMONE, int cMTJREIN, int cMTJINGR, int cMTJTALO, int cMTJOTRO, int cMTIOPER, int cMTIREIN, int cMTIIGEF,
			int cMTIIGTL, int cMTITRSP, int cMTITRSF, int cMTICSAL, int cMTIOTRO, int cMTIULMV, int cMTIFTRP, int cMTICPIN, int cMTICIDI, int cMTIIGTlEur,
			int cMTITRSpEur, int cMTITRSfEur, int cMTIOTRoEur, int svIntergalId, int isNewField) {
		super();
		this.cMTQPART = cMTQPART;
		this.cMTPALTA = cMTPALTA;
		this.cP0LAPPL = cP0LAPPL;
		this.cMTQNSES = cMTQNSES;
		this.cMTQNMOV = cMTQNMOV;
		this.cM0LTMOV = cM0LTMOV;
		this.cMTMCRTS = cMTMCRTS;
		this.cMTMFUNC = cMTMFUNC;
		this.cMTMCLSR = cMTMCLSR;
		this.cMTMSEAD = cMTMSEAD;
		this.cMTMACCI = cMTMACCI;
		this.cMTMCOME = cMTMCOME;
		this.cMTMCUEN = cMTMCUEN;
		this.cMTMIDTC = cMTMIDTC;
		this.cMTMNUAB = cMTMNUAB;
		this.cMTMNUAA = cMTMNUAA;
		this.cMTMNUCA = cMTMNUCA;
		this.cMTMNUAC = cMTMNUAC;
		this.cMTMIMAB = cMTMIMAB;
		this.cMTMIMAA = cMTMIMAA;
		this.cMTMIMCA = cMTMIMCA;
		this.cMTMIMAC = cMTMIMAC;
		this.cMTMIMTI = cMTMIMTI;
		this.cMTMIMTA = cMTMIMTA;
		this.cMTMIMTC = cMTMIMTC;
		this.cMTMENSA = cMTMENSA;
		this.cMTMRESO = cMTMRESO;
		this.cMTMIEBC = cMTMIEBC;
		this.cMTMERRO = cMTMERRO;
		this.cMTMNCUE = cMTMNCUE;
		this.cMTVNULO = cMTVNULO;
		this.c0dlcier = c0dlcier;
		this.cMTPTRAN = cMTPTRAN;
		this.cMTQIDTR = cMTQIDTR;
		this.cMTLMENS = cMTLMENS;
		this.cM4LFMEN = cM4LFMEN;
		this.c42lclsr = c42lclsr;
		this.cMTQSEAD = cMTQSEAD;
		this.cM1LRESP = cM1LRESP;
		this.c43leca = c43leca;
		this.c43lcome = c43lcome;
		this.c43cchec = c43cchec;
		this.c00ltipo = c00ltipo;
		this.c00lcsb = c00lcsb;
		this.c45lcsb = c45lcsb;
		this.cMTQNCTA = cMTQNCTA;
		this.c20ccome = c20ccome;
		this.c20lorde = c20lorde;
		this.c33lorde = c33lorde;
		this.cMTLACUM = cMTLACUM;
		this.cMTIABON = cMTIABON;
		this.cMTIANAB = cMTIANAB;
		this.cMTICARG = cMTICARG;
		this.cMTIANCA = cMTIANCA;
		this.cMTJABON = cMTJABON;
		this.cMTJANAB = cMTJANAB;
		this.cMTJCARG = cMTJCARG;
		this.cMTJANCA = cMTJANCA;
		this.cMTJTINT = cMTJTINT;
		this.cMTJTABO = cMTJTABO;
		this.cMTJTCAR = cMTJTCAR;
		this.cMTPMVEN = cMTPMVEN;
		this.cMTPMVSA = cMTPMVSA;
		this.c0dlcie1 = c0dlcie1;
		this.cMTMIEAS = cMTMIEAS;
		this.cMTQERRO = cMTQERRO;
		this.c00ltip1 = c00ltip1;
		this.c00lcsb1 = c00lcsb1;
		this.c45lcsb1 = c45lcsb1;
		this.cMTQNCT1 = cMTQNCT1;
		this.cMTVNCTA = cMTVNCTA;
		this.cMTVNCT1 = cMTVNCT1;
		this.cMTQREME = cMTQREME;
		this.cMTQSESI = cMTQSESI;
		this.cMTNTERM = cMTNTERM;
		this.cMTMP33 = cMTMP33;
		this.c0dlp33 = c0dlp33;
		this.cD1LTDTO = cD1LTDTO;
		this.cD5JIFIJ = cD5JIFIJ;
		this.cD5JIPCT = cD5JIPCT;
		this.cMTJIDTO = cMTJIDTO;
		this.cMTMDDTO = cMTMDDTO;
		this.cA0LTECL = cA0LTECL;
		this.cMTMNSIC = cMTMNSIC;
		this.cMTQNSIC = cMTQNSIC;
		this.cMTMAGRA = cMTMAGRA;
		this.c00lcsbaAgr = c00lcsbaAgr;
		this.cMTMICIE = cMTMICIE;
		this.cMTMCIER = cMTMCIER;
		this.cMTMCIErSio = cMTMCIErSio;
		this.c0dlciErSio = c0dlciErSio;
		this.cMTMACTI = cMTMACTI;
		this.c41lacti = c41lacti;
		this.c40lacti = c40lacti;
		this.cMTMIMMX = cMTMIMMX;
		this.cMTJIMAX = cMTJIMAX;
		this.cMTMFSEsSio = cMTMFSEsSio;
		this.cMTFSESiSio = cMTFSESiSio;
		this.cMTMNSEsSio = cMTMNSEsSio;
		this.cMTQNSEsSio = cMTQNSEsSio;
		this.cMTMDCCJ = cMTMDCCJ;
		this.cE0LMONE = cE0LMONE;
		this.cMTJREIN = cMTJREIN;
		this.cMTJINGR = cMTJINGR;
		this.cMTJTALO = cMTJTALO;
		this.cMTJOTRO = cMTJOTRO;
		this.cMTIOPER = cMTIOPER;
		this.cMTIREIN = cMTIREIN;
		this.cMTIIGEF = cMTIIGEF;
		this.cMTIIGTL = cMTIIGTL;
		this.cMTITRSP = cMTITRSP;
		this.cMTITRSF = cMTITRSF;
		this.cMTICSAL = cMTICSAL;
		this.cMTIOTRO = cMTIOTRO;
		this.cMTIULMV = cMTIULMV;
		this.cMTIFTRP = cMTIFTRP;
		this.cMTICPIN = cMTICPIN;
		this.cMTICIDI = cMTICIDI;
		this.cMTIIGTlEur = cMTIIGTlEur;
		this.cMTITRSpEur = cMTITRSpEur;
		this.cMTITRSfEur = cMTITRSfEur;
		this.cMTIOTRoEur = cMTIOTRoEur;
		this.svIntergalId = svIntergalId;
		this.isNewField = isNewField;
	}

	public int getcMTQPART() {
		return cMTQPART;
	}

	public void setcMTQPART(int cMTQPART) {
		this.cMTQPART = cMTQPART;
	}

	public Date getcMTPALTA() {
		return cMTPALTA;
	}

	public void setcMTPALTA(Date cMTPALTA) {
		this.cMTPALTA = cMTPALTA;
	}

	public int getcP0LAPPL() {
		return cP0LAPPL;
	}

	public void setcP0LAPPL(int cP0LAPPL) {
		this.cP0LAPPL = cP0LAPPL;
	}

	public int getcMTQNSES() {
		return cMTQNSES;
	}

	public void setcMTQNSES(int cMTQNSES) {
		this.cMTQNSES = cMTQNSES;
	}

	public int getcMTQNMOV() {
		return cMTQNMOV;
	}

	public void setcMTQNMOV(int cMTQNMOV) {
		this.cMTQNMOV = cMTQNMOV;
	}

	public int getcM0LTMOV() {
		return cM0LTMOV;
	}

	public void setcM0LTMOV(int cM0LTMOV) {
		this.cM0LTMOV = cM0LTMOV;
	}

	public String getcMTMCRTS() {
		return cMTMCRTS;
	}

	public void setcMTMCRTS(String cMTMCRTS) {
		this.cMTMCRTS = cMTMCRTS;
	}

	public String getcMTMFUNC() {
		return cMTMFUNC;
	}

	public void setcMTMFUNC(String cMTMFUNC) {
		this.cMTMFUNC = cMTMFUNC;
	}

	public String getcMTMCLSR() {
		return cMTMCLSR;
	}

	public void setcMTMCLSR(String cMTMCLSR) {
		this.cMTMCLSR = cMTMCLSR;
	}

	public String getcMTMSEAD() {
		return cMTMSEAD;
	}

	public void setcMTMSEAD(String cMTMSEAD) {
		this.cMTMSEAD = cMTMSEAD;
	}

	public String getcMTMACCI() {
		return cMTMACCI;
	}

	public void setcMTMACCI(String cMTMACCI) {
		this.cMTMACCI = cMTMACCI;
	}

	public String getcMTMCOME() {
		return cMTMCOME;
	}

	public void setcMTMCOME(String cMTMCOME) {
		this.cMTMCOME = cMTMCOME;
	}

	public String getcMTMCUEN() {
		return cMTMCUEN;
	}

	public void setcMTMCUEN(String cMTMCUEN) {
		this.cMTMCUEN = cMTMCUEN;
	}

	public String getcMTMIDTC() {
		return cMTMIDTC;
	}

	public void setcMTMIDTC(String cMTMIDTC) {
		this.cMTMIDTC = cMTMIDTC;
	}

	public String getcMTMNUAB() {
		return cMTMNUAB;
	}

	public void setcMTMNUAB(String cMTMNUAB) {
		this.cMTMNUAB = cMTMNUAB;
	}

	public String getcMTMNUAA() {
		return cMTMNUAA;
	}

	public void setcMTMNUAA(String cMTMNUAA) {
		this.cMTMNUAA = cMTMNUAA;
	}

	public String getcMTMNUCA() {
		return cMTMNUCA;
	}

	public void setcMTMNUCA(String cMTMNUCA) {
		this.cMTMNUCA = cMTMNUCA;
	}

	public String getcMTMNUAC() {
		return cMTMNUAC;
	}

	public void setcMTMNUAC(String cMTMNUAC) {
		this.cMTMNUAC = cMTMNUAC;
	}

	public String getcMTMIMAB() {
		return cMTMIMAB;
	}

	public void setcMTMIMAB(String cMTMIMAB) {
		this.cMTMIMAB = cMTMIMAB;
	}

	public String getcMTMIMAA() {
		return cMTMIMAA;
	}

	public void setcMTMIMAA(String cMTMIMAA) {
		this.cMTMIMAA = cMTMIMAA;
	}

	public String getcMTMIMCA() {
		return cMTMIMCA;
	}

	public void setcMTMIMCA(String cMTMIMCA) {
		this.cMTMIMCA = cMTMIMCA;
	}

	public String getcMTMIMAC() {
		return cMTMIMAC;
	}

	public void setcMTMIMAC(String cMTMIMAC) {
		this.cMTMIMAC = cMTMIMAC;
	}

	public String getcMTMIMTI() {
		return cMTMIMTI;
	}

	public void setcMTMIMTI(String cMTMIMTI) {
		this.cMTMIMTI = cMTMIMTI;
	}

	public String getcMTMIMTA() {
		return cMTMIMTA;
	}

	public void setcMTMIMTA(String cMTMIMTA) {
		this.cMTMIMTA = cMTMIMTA;
	}

	public String getcMTMIMTC() {
		return cMTMIMTC;
	}

	public void setcMTMIMTC(String cMTMIMTC) {
		this.cMTMIMTC = cMTMIMTC;
	}

	public String getcMTMENSA() {
		return cMTMENSA;
	}

	public void setcMTMENSA(String cMTMENSA) {
		this.cMTMENSA = cMTMENSA;
	}

	public String getcMTMRESO() {
		return cMTMRESO;
	}

	public void setcMTMRESO(String cMTMRESO) {
		this.cMTMRESO = cMTMRESO;
	}

	public String getcMTMIEBC() {
		return cMTMIEBC;
	}

	public void setcMTMIEBC(String cMTMIEBC) {
		this.cMTMIEBC = cMTMIEBC;
	}

	public String getcMTMERRO() {
		return cMTMERRO;
	}

	public void setcMTMERRO(String cMTMERRO) {
		this.cMTMERRO = cMTMERRO;
	}

	public String getcMTMNCUE() {
		return cMTMNCUE;
	}

	public void setcMTMNCUE(String cMTMNCUE) {
		this.cMTMNCUE = cMTMNCUE;
	}

	public String getcMTVNULO() {
		return cMTVNULO;
	}

	public void setcMTVNULO(String cMTVNULO) {
		this.cMTVNULO = cMTVNULO;
	}

	public int getC0dlcier() {
		return c0dlcier;
	}

	public void setC0dlcier(int c0dlcier) {
		this.c0dlcier = c0dlcier;
	}

	public int getcMTPTRAN() {
		return cMTPTRAN;
	}

	public void setcMTPTRAN(int cMTPTRAN) {
		this.cMTPTRAN = cMTPTRAN;
	}

	public int getcMTQIDTR() {
		return cMTQIDTR;
	}

	public void setcMTQIDTR(int cMTQIDTR) {
		this.cMTQIDTR = cMTQIDTR;
	}

	public int getcMTLMENS() {
		return cMTLMENS;
	}

	public void setcMTLMENS(int cMTLMENS) {
		this.cMTLMENS = cMTLMENS;
	}

	public int getcM4LFMEN() {
		return cM4LFMEN;
	}

	public void setcM4LFMEN(int cM4LFMEN) {
		this.cM4LFMEN = cM4LFMEN;
	}

	public int getC42lclsr() {
		return c42lclsr;
	}

	public void setC42lclsr(int c42lclsr) {
		this.c42lclsr = c42lclsr;
	}

	public int getcMTQSEAD() {
		return cMTQSEAD;
	}

	public void setcMTQSEAD(int cMTQSEAD) {
		this.cMTQSEAD = cMTQSEAD;
	}

	public int getcM1LRESP() {
		return cM1LRESP;
	}

	public void setcM1LRESP(int cM1LRESP) {
		this.cM1LRESP = cM1LRESP;
	}

	public int getC43leca() {
		return c43leca;
	}

	public void setC43leca(int c43leca) {
		this.c43leca = c43leca;
	}

	public int getC43lcome() {
		return c43lcome;
	}

	public void setC43lcome(int c43lcome) {
		this.c43lcome = c43lcome;
	}

	public String getC43cchec() {
		return c43cchec;
	}

	public void setC43cchec(String c43cchec) {
		this.c43cchec = c43cchec;
	}

	public int getC00ltipo() {
		return c00ltipo;
	}

	public void setC00ltipo(int c00ltipo) {
		this.c00ltipo = c00ltipo;
	}

	public int getC00lcsb() {
		return c00lcsb;
	}

	public void setC00lcsb(int c00lcsb) {
		this.c00lcsb = c00lcsb;
	}

	public int getC45lcsb() {
		return c45lcsb;
	}

	public void setC45lcsb(int c45lcsb) {
		this.c45lcsb = c45lcsb;
	}

	public int getcMTQNCTA() {
		return cMTQNCTA;
	}

	public void setcMTQNCTA(int cMTQNCTA) {
		this.cMTQNCTA = cMTQNCTA;
	}

	public String getC20ccome() {
		return c20ccome;
	}

	public void setC20ccome(String c20ccome) {
		this.c20ccome = c20ccome;
	}

	public int getC20lorde() {
		return c20lorde;
	}

	public void setC20lorde(int c20lorde) {
		this.c20lorde = c20lorde;
	}

	public int getC33lorde() {
		return c33lorde;
	}

	public void setC33lorde(int c33lorde) {
		this.c33lorde = c33lorde;
	}

	public int getcMTLACUM() {
		return cMTLACUM;
	}

	public void setcMTLACUM(int cMTLACUM) {
		this.cMTLACUM = cMTLACUM;
	}

	public int getcMTIABON() {
		return cMTIABON;
	}

	public void setcMTIABON(int cMTIABON) {
		this.cMTIABON = cMTIABON;
	}

	public int getcMTIANAB() {
		return cMTIANAB;
	}

	public void setcMTIANAB(int cMTIANAB) {
		this.cMTIANAB = cMTIANAB;
	}

	public int getcMTICARG() {
		return cMTICARG;
	}

	public void setcMTICARG(int cMTICARG) {
		this.cMTICARG = cMTICARG;
	}

	public int getcMTIANCA() {
		return cMTIANCA;
	}

	public void setcMTIANCA(int cMTIANCA) {
		this.cMTIANCA = cMTIANCA;
	}

	public int getcMTJABON() {
		return cMTJABON;
	}

	public void setcMTJABON(int cMTJABON) {
		this.cMTJABON = cMTJABON;
	}

	public int getcMTJANAB() {
		return cMTJANAB;
	}

	public void setcMTJANAB(int cMTJANAB) {
		this.cMTJANAB = cMTJANAB;
	}

	public int getcMTJCARG() {
		return cMTJCARG;
	}

	public void setcMTJCARG(int cMTJCARG) {
		this.cMTJCARG = cMTJCARG;
	}

	public int getcMTJANCA() {
		return cMTJANCA;
	}

	public void setcMTJANCA(int cMTJANCA) {
		this.cMTJANCA = cMTJANCA;
	}

	public int getcMTJTINT() {
		return cMTJTINT;
	}

	public void setcMTJTINT(int cMTJTINT) {
		this.cMTJTINT = cMTJTINT;
	}

	public int getcMTJTABO() {
		return cMTJTABO;
	}

	public void setcMTJTABO(int cMTJTABO) {
		this.cMTJTABO = cMTJTABO;
	}

	public int getcMTJTCAR() {
		return cMTJTCAR;
	}

	public void setcMTJTCAR(int cMTJTCAR) {
		this.cMTJTCAR = cMTJTCAR;
	}

	public Date getcMTPMVEN() {
		return cMTPMVEN;
	}

	public void setcMTPMVEN(Date cMTPMVEN) {
		this.cMTPMVEN = cMTPMVEN;
	}

	public Date getcMTPMVSA() {
		return cMTPMVSA;
	}

	public void setcMTPMVSA(Date cMTPMVSA) {
		this.cMTPMVSA = cMTPMVSA;
	}

	public int getC0dlcie1() {
		return c0dlcie1;
	}

	public void setC0dlcie1(int c0dlcie1) {
		this.c0dlcie1 = c0dlcie1;
	}

	public String getcMTMIEAS() {
		return cMTMIEAS;
	}

	public void setcMTMIEAS(String cMTMIEAS) {
		this.cMTMIEAS = cMTMIEAS;
	}

	public String getcMTQERRO() {
		return cMTQERRO;
	}

	public void setcMTQERRO(String cMTQERRO) {
		this.cMTQERRO = cMTQERRO;
	}

	public int getC00ltip1() {
		return c00ltip1;
	}

	public void setC00ltip1(int c00ltip1) {
		this.c00ltip1 = c00ltip1;
	}

	public int getC00lcsb1() {
		return c00lcsb1;
	}

	public void setC00lcsb1(int c00lcsb1) {
		this.c00lcsb1 = c00lcsb1;
	}

	public int getC45lcsb1() {
		return c45lcsb1;
	}

	public void setC45lcsb1(int c45lcsb1) {
		this.c45lcsb1 = c45lcsb1;
	}

	public int getcMTQNCT1() {
		return cMTQNCT1;
	}

	public void setcMTQNCT1(int cMTQNCT1) {
		this.cMTQNCT1 = cMTQNCT1;
	}

	public String getcMTVNCTA() {
		return cMTVNCTA;
	}

	public void setcMTVNCTA(String cMTVNCTA) {
		this.cMTVNCTA = cMTVNCTA;
	}

	public String getcMTVNCT1() {
		return cMTVNCT1;
	}

	public void setcMTVNCT1(String cMTVNCT1) {
		this.cMTVNCT1 = cMTVNCT1;
	}

	public int getcMTQREME() {
		return cMTQREME;
	}

	public void setcMTQREME(int cMTQREME) {
		this.cMTQREME = cMTQREME;
	}

	public int getcMTQSESI() {
		return cMTQSESI;
	}

	public void setcMTQSESI(int cMTQSESI) {
		this.cMTQSESI = cMTQSESI;
	}

	public String getcMTNTERM() {
		return cMTNTERM;
	}

	public void setcMTNTERM(String cMTNTERM) {
		this.cMTNTERM = cMTNTERM;
	}

	public String getcMTMP33() {
		return cMTMP33;
	}

	public void setcMTMP33(String cMTMP33) {
		this.cMTMP33 = cMTMP33;
	}

	public int getC0dlp33() {
		return c0dlp33;
	}

	public void setC0dlp33(int c0dlp33) {
		this.c0dlp33 = c0dlp33;
	}

	public int getcD1LTDTO() {
		return cD1LTDTO;
	}

	public void setcD1LTDTO(int cD1LTDTO) {
		this.cD1LTDTO = cD1LTDTO;
	}

	public int getcD5JIFIJ() {
		return cD5JIFIJ;
	}

	public void setcD5JIFIJ(int cD5JIFIJ) {
		this.cD5JIFIJ = cD5JIFIJ;
	}

	public int getcD5JIPCT() {
		return cD5JIPCT;
	}

	public void setcD5JIPCT(int cD5JIPCT) {
		this.cD5JIPCT = cD5JIPCT;
	}

	public int getcMTJIDTO() {
		return cMTJIDTO;
	}

	public void setcMTJIDTO(int cMTJIDTO) {
		this.cMTJIDTO = cMTJIDTO;
	}

	public String getcMTMDDTO() {
		return cMTMDDTO;
	}

	public void setcMTMDDTO(String cMTMDDTO) {
		this.cMTMDDTO = cMTMDDTO;
	}

	public int getcA0LTECL() {
		return cA0LTECL;
	}

	public void setcA0LTECL(int cA0LTECL) {
		this.cA0LTECL = cA0LTECL;
	}

	public String getcMTMNSIC() {
		return cMTMNSIC;
	}

	public void setcMTMNSIC(String cMTMNSIC) {
		this.cMTMNSIC = cMTMNSIC;
	}

	public int getcMTQNSIC() {
		return cMTQNSIC;
	}

	public void setcMTQNSIC(int cMTQNSIC) {
		this.cMTQNSIC = cMTQNSIC;
	}

	public String getcMTMAGRA() {
		return cMTMAGRA;
	}

	public void setcMTMAGRA(String cMTMAGRA) {
		this.cMTMAGRA = cMTMAGRA;
	}

	public int getC00lcsbaAgr() {
		return c00lcsbaAgr;
	}

	public void setC00lcsbaAgr(int c00lcsbaAgr) {
		this.c00lcsbaAgr = c00lcsbaAgr;
	}

	public String getcMTMICIE() {
		return cMTMICIE;
	}

	public void setcMTMICIE(String cMTMICIE) {
		this.cMTMICIE = cMTMICIE;
	}

	public String getcMTMCIER() {
		return cMTMCIER;
	}

	public void setcMTMCIER(String cMTMCIER) {
		this.cMTMCIER = cMTMCIER;
	}

	public String getcMTMCIErSio() {
		return cMTMCIErSio;
	}

	public void setcMTMCIErSio(String cMTMCIErSio) {
		this.cMTMCIErSio = cMTMCIErSio;
	}

	public int getC0dlciErSio() {
		return c0dlciErSio;
	}

	public void setC0dlciErSio(int c0dlciErSio) {
		this.c0dlciErSio = c0dlciErSio;
	}

	public String getcMTMACTI() {
		return cMTMACTI;
	}

	public void setcMTMACTI(String cMTMACTI) {
		this.cMTMACTI = cMTMACTI;
	}

	public int getC41lacti() {
		return c41lacti;
	}

	public void setC41lacti(int c41lacti) {
		this.c41lacti = c41lacti;
	}

	public int getC40lacti() {
		return c40lacti;
	}

	public void setC40lacti(int c40lacti) {
		this.c40lacti = c40lacti;
	}

	public String getcMTMIMMX() {
		return cMTMIMMX;
	}

	public void setcMTMIMMX(String cMTMIMMX) {
		this.cMTMIMMX = cMTMIMMX;
	}

	public int getcMTJIMAX() {
		return cMTJIMAX;
	}

	public void setcMTJIMAX(int cMTJIMAX) {
		this.cMTJIMAX = cMTJIMAX;
	}

	public String getcMTMFSEsSio() {
		return cMTMFSEsSio;
	}

	public void setcMTMFSEsSio(String cMTMFSEsSio) {
		this.cMTMFSEsSio = cMTMFSEsSio;
	}

	public int getcMTFSESiSio() {
		return cMTFSESiSio;
	}

	public void setcMTFSESiSio(int cMTFSESiSio) {
		this.cMTFSESiSio = cMTFSESiSio;
	}

	public String getcMTMNSEsSio() {
		return cMTMNSEsSio;
	}

	public void setcMTMNSEsSio(String cMTMNSEsSio) {
		this.cMTMNSEsSio = cMTMNSEsSio;
	}

	public int getcMTQNSEsSio() {
		return cMTQNSEsSio;
	}

	public void setcMTQNSEsSio(int cMTQNSEsSio) {
		this.cMTQNSEsSio = cMTQNSEsSio;
	}

	public String getcMTMDCCJ() {
		return cMTMDCCJ;
	}

	public void setcMTMDCCJ(String cMTMDCCJ) {
		this.cMTMDCCJ = cMTMDCCJ;
	}

	public int getcE0LMONE() {
		return cE0LMONE;
	}

	public void setcE0LMONE(int cE0LMONE) {
		this.cE0LMONE = cE0LMONE;
	}

	public int getcMTJREIN() {
		return cMTJREIN;
	}

	public void setcMTJREIN(int cMTJREIN) {
		this.cMTJREIN = cMTJREIN;
	}

	public int getcMTJINGR() {
		return cMTJINGR;
	}

	public void setcMTJINGR(int cMTJINGR) {
		this.cMTJINGR = cMTJINGR;
	}

	public int getcMTJTALO() {
		return cMTJTALO;
	}

	public void setcMTJTALO(int cMTJTALO) {
		this.cMTJTALO = cMTJTALO;
	}

	public int getcMTJOTRO() {
		return cMTJOTRO;
	}

	public void setcMTJOTRO(int cMTJOTRO) {
		this.cMTJOTRO = cMTJOTRO;
	}

	public int getcMTIOPER() {
		return cMTIOPER;
	}

	public void setcMTIOPER(int cMTIOPER) {
		this.cMTIOPER = cMTIOPER;
	}

	public int getcMTIREIN() {
		return cMTIREIN;
	}

	public void setcMTIREIN(int cMTIREIN) {
		this.cMTIREIN = cMTIREIN;
	}

	public int getcMTIIGEF() {
		return cMTIIGEF;
	}

	public void setcMTIIGEF(int cMTIIGEF) {
		this.cMTIIGEF = cMTIIGEF;
	}

	public int getcMTIIGTL() {
		return cMTIIGTL;
	}

	public void setcMTIIGTL(int cMTIIGTL) {
		this.cMTIIGTL = cMTIIGTL;
	}

	public int getcMTITRSP() {
		return cMTITRSP;
	}

	public void setcMTITRSP(int cMTITRSP) {
		this.cMTITRSP = cMTITRSP;
	}

	public int getcMTITRSF() {
		return cMTITRSF;
	}

	public void setcMTITRSF(int cMTITRSF) {
		this.cMTITRSF = cMTITRSF;
	}

	public int getcMTICSAL() {
		return cMTICSAL;
	}

	public void setcMTICSAL(int cMTICSAL) {
		this.cMTICSAL = cMTICSAL;
	}

	public int getcMTIOTRO() {
		return cMTIOTRO;
	}

	public void setcMTIOTRO(int cMTIOTRO) {
		this.cMTIOTRO = cMTIOTRO;
	}

	public int getcMTIULMV() {
		return cMTIULMV;
	}

	public void setcMTIULMV(int cMTIULMV) {
		this.cMTIULMV = cMTIULMV;
	}

	public int getcMTIFTRP() {
		return cMTIFTRP;
	}

	public void setcMTIFTRP(int cMTIFTRP) {
		this.cMTIFTRP = cMTIFTRP;
	}

	public int getcMTICPIN() {
		return cMTICPIN;
	}

	public void setcMTICPIN(int cMTICPIN) {
		this.cMTICPIN = cMTICPIN;
	}

	public int getcMTICIDI() {
		return cMTICIDI;
	}

	public void setcMTICIDI(int cMTICIDI) {
		this.cMTICIDI = cMTICIDI;
	}

	public int getcMTIIGTlEur() {
		return cMTIIGTlEur;
	}

	public void setcMTIIGTlEur(int cMTIIGTlEur) {
		this.cMTIIGTlEur = cMTIIGTlEur;
	}

	public int getcMTITRSpEur() {
		return cMTITRSpEur;
	}

	public void setcMTITRSpEur(int cMTITRSpEur) {
		this.cMTITRSpEur = cMTITRSpEur;
	}

	public int getcMTITRSfEur() {
		return cMTITRSfEur;
	}

	public void setcMTITRSfEur(int cMTITRSfEur) {
		this.cMTITRSfEur = cMTITRSfEur;
	}

	public int getcMTIOTRoEur() {
		return cMTIOTRoEur;
	}

	public void setcMTIOTRoEur(int cMTIOTRoEur) {
		this.cMTIOTRoEur = cMTIOTRoEur;
	}

	public int getSvIntergalId() {
		return svIntergalId;
	}

	public void setSvIntergalId(int svIntergalId) {
		this.svIntergalId = svIntergalId;
	}

	public int getIsNewField() {
		return isNewField;
	}

	public void setIsNewField(int isNewField) {
		this.isNewField = isNewField;
	}
}
