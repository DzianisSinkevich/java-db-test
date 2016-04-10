package com.danco.bpc.entity.MAIN;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "OPR_OPERATION")
@Entity
public class OprOperation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "SESSION_ID")
	private Long sessionId;
	@Column(name = "IS_REVERSAL")
	private int isReversal;
	@Column(name = "ORIGINAL_ID")
	private Long originalId;
	@Column(name = "OPER_TYPE")
	private String operType;
	@Column(name = "OPER_REASON")
	private String operReason;
	@Column(name = "MSG_TYPE")
	private String mshType;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "STATUS_REASON")
	private String statusReason;
	@Column(name = "STTL_TYPE")
	private String sttlType;
	@Column(name = "TERMINAL_TYPE")
	private String terminalType;
	@Column(name = "ACQ_INST_BIN")
	private String acqInstBin;
	@Column(name = "FORW_INST_BIN")
	private String forwInstBin;
	@Column(name = "MERCHANT_NUMBER")
	private String merchantNubmer;
	@Column(name = "TERMINAL_NUMBER")
	private String terminalNumber;
	@Column(name = "MERCHANT_NAME")
	private String merchantName;
	@Column(name = "MERCHANT_STREET")
	private String merchantStreet;
	@Column(name = "MERCHANT_CITY")
	private String merchantCity;
	@Column(name = "MERCHANT_REGION")
	private String merchantRegion;
	@Column(name = "MERCHANT_COUNTRY")
	private String merchantCountry;
	@Column(name = "MERCHANT_POSTCODE")
	private String merchantPostcode;
	@Column(name = "MCC")
	private String mcc;
	@Column(name = "ORIGINATOR_REFNUM")
	private String originatorRefnum;
	@Column(name = "NETWORK_REFNUM")
	private String networkRefnum;
	@Column(name = "OPER_COUNT")
	private Long operCount;
	@Column(name = "OPER_REQUEST_AMOUNT")
	private Double operRequestAmount;
	@Column(name = "OPER_AMOUNT_ALGORITHM")
	private String operAmountAlgorithm;
	@Column(name = "OPER_AMOUNT")
	private Double operAmount;
	@Column(name = "OPER_CURRENCY")
	private String operCurrency;
	@Column(name = "OPER_CASHBACK_AMOUNT")
	private Double operCoshbackAmount;
	@Column(name = "OPER_REPLACEMENT_AMOUNT")
	private Double operReplacementAmount;
	@Column(name = "OPER_SURCHARGE_AMOUNT")
	private Double operSurchargeAmount;
	@Column(name = "OPER_DATE")
	private Date operDate;
	@Column(name = "HOST_DATE")
	private Date hostDate;
	@Column(name = "UNHOLD_DATE")
	private Date unholdDate;
	@Column(name = "MATCH_STATUS")
	private String matchStatus;
	@Column(name = "STTL_AMOUNT")
	private Double sttlAmount;
	@Column(name = "STTL_CURRENCY")
	private String sttlCurrency;
	@Column(name = "DISPUTE_ID")
	private Long disputeId;
	@Column(name = "PAYMENT_ORDER_ID")
	private Long paymentOrderId;
	@Column(name = "PAYMENT_HOST_ID")
	private int paymentHostId;
	@Column(name = "FORCED_PROCESSING")
	private int forcedProcessing;
	@Column(name = "MATCH_ID")
	private Long matchId;
	@Column(name = "PROC_MODE")
	private String procMode;
	@Column(name = "CLEARING_SEQUENCE_NUM")
	private int clearingSequenceNum;
	@Column(name = "CLEARING_SEQUENCE_COUNT")
	private int clearingSequenceCount;
	@Column(name = "INCOM_SESS_FILE_ID")
	private Long incomSessFileId;
	@Column(name = "FEE_AMOUNT")
	private Double feeAmount;
	@Column(name = "FEE_CURRENCY")
	private String feeCurency;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public int getIsReversal() {
		return isReversal;
	}
	public void setIsReversal(int isReversal) {
		this.isReversal = isReversal;
	}
	public Long getOriginalId() {
		return originalId;
	}
	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getOperReason() {
		return operReason;
	}
	public void setOperReason(String operReason) {
		this.operReason = operReason;
	}
	public String getMshType() {
		return mshType;
	}
	public void setMshType(String mshType) {
		this.mshType = mshType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public String getSttlType() {
		return sttlType;
	}
	public void setSttlType(String sttlType) {
		this.sttlType = sttlType;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getAcqInstBin() {
		return acqInstBin;
	}
	public void setAcqInstBin(String acqInstBin) {
		this.acqInstBin = acqInstBin;
	}
	public String getForwInstBin() {
		return forwInstBin;
	}
	public void setForwInstBin(String forwInstBin) {
		this.forwInstBin = forwInstBin;
	}
	public String getMerchantNubmer() {
		return merchantNubmer;
	}
	public void setMerchantNubmer(String merchantNubmer) {
		this.merchantNubmer = merchantNubmer;
	}
	public String getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantStreet() {
		return merchantStreet;
	}
	public void setMerchantStreet(String merchantStreet) {
		this.merchantStreet = merchantStreet;
	}
	public String getMerchantCity() {
		return merchantCity;
	}
	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}
	public String getMerchantRegion() {
		return merchantRegion;
	}
	public void setMerchantRegion(String merchantRegion) {
		this.merchantRegion = merchantRegion;
	}
	public String getMerchantCountry() {
		return merchantCountry;
	}
	public void setMerchantCountry(String merchantCountry) {
		this.merchantCountry = merchantCountry;
	}
	public String getMerchantPostcode() {
		return merchantPostcode;
	}
	public void setMerchantPostcode(String merchantPostcode) {
		this.merchantPostcode = merchantPostcode;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getOriginatorRefnum() {
		return originatorRefnum;
	}
	public void setOriginatorRefnum(String originatorRefnum) {
		this.originatorRefnum = originatorRefnum;
	}
	public String getNetworkRefnum() {
		return networkRefnum;
	}
	public void setNetworkRefnum(String networkRefnum) {
		this.networkRefnum = networkRefnum;
	}
	public Long getOperCount() {
		return operCount;
	}
	public void setOperCount(Long operCount) {
		this.operCount = operCount;
	}
	public Double getOperRequestAmount() {
		return operRequestAmount;
	}
	public void setOperRequestAmount(Double operRequestAmount) {
		this.operRequestAmount = operRequestAmount;
	}
	public String getOperAmountAlgorithm() {
		return operAmountAlgorithm;
	}
	public void setOperAmountAlgorithm(String operAmountAlgorithm) {
		this.operAmountAlgorithm = operAmountAlgorithm;
	}
	public Double getOperAmount() {
		return operAmount;
	}
	public void setOperAmount(Double operAmount) {
		this.operAmount = operAmount;
	}
	public String getOperCurrency() {
		return operCurrency;
	}
	public void setOperCurrency(String operCurrency) {
		this.operCurrency = operCurrency;
	}
	public Double getOperCoshbackAmount() {
		return operCoshbackAmount;
	}
	public void setOperCoshbackAmount(Double operCoshbackAmount) {
		this.operCoshbackAmount = operCoshbackAmount;
	}
	public Double getOperReplacementAmount() {
		return operReplacementAmount;
	}
	public void setOperReplacementAmount(Double operReplacementAmount) {
		this.operReplacementAmount = operReplacementAmount;
	}
	public Double getOperSurchargeAmount() {
		return operSurchargeAmount;
	}
	public void setOperSurchargeAmount(Double operSurchargeAmount) {
		this.operSurchargeAmount = operSurchargeAmount;
	}
	public Date getOperDate() {
		return operDate;
	}
	public void setOperDate(Date operDate) {
		this.operDate = operDate;
	}
	public Date getHostDate() {
		return hostDate;
	}
	public void setHostDate(Date hostDate) {
		this.hostDate = hostDate;
	}
	public Date getUnholdDate() {
		return unholdDate;
	}
	public void setUnholdDate(Date unholdDate) {
		this.unholdDate = unholdDate;
	}
	public String getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}
	public Double getSttlAmount() {
		return sttlAmount;
	}
	public void setSttlAmount(Double sttlAmount) {
		this.sttlAmount = sttlAmount;
	}
	public String getSttlCurrency() {
		return sttlCurrency;
	}
	public void setSttlCurrency(String sttlCurrency) {
		this.sttlCurrency = sttlCurrency;
	}
	public Long getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(Long disputeId) {
		this.disputeId = disputeId;
	}
	public Long getPaymentOrderId() {
		return paymentOrderId;
	}
	public void setPaymentOrderId(Long paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}
	public int getPaymentHostId() {
		return paymentHostId;
	}
	public void setPaymentHostId(int paymentHostId) {
		this.paymentHostId = paymentHostId;
	}
	public int getForcedProcessing() {
		return forcedProcessing;
	}
	public void setForcedProcessing(int forcedProcessing) {
		this.forcedProcessing = forcedProcessing;
	}
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
	public String getProcMode() {
		return procMode;
	}
	public void setProcMode(String procMode) {
		this.procMode = procMode;
	}
	public int getClearingSequenceNum() {
		return clearingSequenceNum;
	}
	public void setClearingSequenceNum(int clearingSequenceNum) {
		this.clearingSequenceNum = clearingSequenceNum;
	}
	public int getClearingSequenceCount() {
		return clearingSequenceCount;
	}
	public void setClearingSequenceCount(int clearingSequenceCount) {
		this.clearingSequenceCount = clearingSequenceCount;
	}
	public Long getIncomSessFileId() {
		return incomSessFileId;
	}
	public void setIncomSessFileId(Long incomSessFileId) {
		this.incomSessFileId = incomSessFileId;
	}
	public Double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getFeeCurency() {
		return feeCurency;
	}
	public void setFeeCurency(String feeCurency) {
		this.feeCurency = feeCurency;
	}
}
