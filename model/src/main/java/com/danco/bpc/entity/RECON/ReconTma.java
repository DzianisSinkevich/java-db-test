package com.danco.bpc.entity.RECON;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_INST")
@Entity
public class ReconTma extends AbstractBaseEntity implements java.io.Serializable, Comparable<ReconSession> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "OPER_ID")
	private int operId;
	@Column(name = "SSID")
	private String ssid;
	@Column(name = "AUTH_CODE")
	private String authCode;
	@Column(name = "CARD_CAPTURE_CAP")
	private String cardCaptureCap;
	@Column(name = "CARD_NUMBER")
	private String cardNumber;
	@Column(name = "CARD_SEQ_NUMBER")
	private String cardSeqNumber;
	@Column(name = "CLIENT_ID_TYPE")
	private String clientIdType;
	@Column(name = "ISS_INST_ID")
	private int issInstId;
	@Column(name = "MCC")
	private String mcc;
	@Column(name = "MERCHANT_CITY")
	private String merchantCity;
	@Column(name = "MERCHANT_COUNTRY")
	private String merchantCountry;
	@Column(name = "MERCHANT_NAME")
	private String merchantName;
	@Column(name = "MERCHANT_NUMBER")
	private String merchantNumber;
	@Column(name = "NETWORK_REFNUM")
	private String networkRefnum;
	@Column(name = "OPER_AMOUNT")
	private int operAmount;
	@Column(name = "OPER_CURRENCY")
	private String operCurrency;
	@Column(name = "OPER_DATE")
	private Calendar operDate;
	@Column(name = "OPER_TYPE")
	private String operType;
	@Column(name = "ORIG_REFNUM")
	private String origRefnum;
	@Column(name = "RESP_CODE")
	private String respCode;
	@Column(name = "TERMINAL_NUMBER")
	private String terminalNumber;
	@Column(name = "CST_TRAN_NUMBER")
	private String cstTranNumber;
	@Column(name = "ACQ_INST_ID")
	private int acqInstId;
	@Column(name = "CST_MSG_TYPE")
	private String cstMsgType;
	@Column(name = "CST_APPL_ID")
	private String cstApplId;
	@Column(name = "EMV_DATA")
	private String emvData;
	@Column(name = "CST_MTI")
	private String cstMti;
	@Column(name = "CST_FUNC_CODE")
	private String cstFuncCode;
	@Column(name = "CST_REASON_CODE")
	private String cstReasonCode;
	@Column(name = "PURCH_ID_CODE")
	private String purchIdCode;
	@Column(name = "RECEIVING_ID")
	private String receivingId;
	@Column(name = "PROCESS_CODE")
	private String processCode;
	@Column(name = "PURCH_SESSION_DATE")
	private Calendar purchSessionDate;
	@Column(name = "APPR_SESSION_DATE")
	private Calendar apprSessionDate;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(ReconSession o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
