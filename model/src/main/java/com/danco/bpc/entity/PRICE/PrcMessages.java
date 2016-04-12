package com.danco.bpc.entity.PRICE;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_MESSAGES")
@Entity
public class PrcMessages extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcMessages> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "VERSION")
	private int version;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "P02")
	private String p02;
	@Column(name = "P03")
	private int p03;
	@Column(name = "P04")
	private Long p04;
	@Column(name = "P05")
	private Long p05;
	@Column(name = "P06")
	private Long p06;
	@Column(name = "P09")
	private Long p09;
	@Column(name = "P10")
	private Long p10;
	@Column(name = "P11")
	private int p11;
	@Column(name = "P12")
	private Long p12;
	@Column(name = "P14")
	private int p14;
	@Column(name = "P16")
	private int p16;
	@Column(name = "P17")
	private int p17;
	@Column(name = "P18")
	private int p18;
	@Column(name = "P19")
	private int p19;
	@Column(name = "P22")
	private int p22;
	@Column(name = "P23")
	private String p23;
	@Column(name = "P24")
	private int p24;
	@Column(name = "P25")
	private int p25;
	@Column(name = "P26")
	private int p26;
	@Column(name = "P27")
	private int p27;
	@Column(name = "P28")
	private int p28;
	@Column(name = "P29")
	private int p29;
	@Column(name = "P30_1")
	private Long p301;
	@Column(name = "P30_2")
	private Long p302;
	@Column(name = "P31")
	private String p31;
	@Column(name = "P32")
	private String p32;
	@Column(name = "P33")
	private String p33;
	@Column(name = "P35")
	private String p35;
	@Column(name = "P37")
	private String p37;
	@Column(name = "P38")
	private String p38;
	@Column(name = "P39")
	private int p39;
	@Column(name = "P40")
	private int p40;
	@Column(name = "P41")
	private String p41;
	@Column(name = "P42")
	private String p42;
	@Column(name = "P43")
	private String p43;
	@Column(name = "P44")
	private String p44;
	@Column(name = "P45")
	private String p45;
	@Column(name = "P46")
	private String p46;
	@Column(name = "P48")
	private String p48;
	@Column(name = "P48_01")
	private Long p4801;
	@Column(name = "P48_02")
	private int p4802;
	@Column(name = "P48_03")
	private Long p4803;
	@Column(name = "P48_04")
	private int p4804;
	@Column(name = "P48_05")
	private String p4805;
	@Column(name = "P48_06")
	private String p4806;
	@Column(name = "P48_07")
	private int p4807;
	@Column(name = "P48_08")
	private int p4808;
	@Column(name = "P48_09")
	private String p4809;
	@Column(name = "P48_10")
	private int p4810;
	@Column(name = "P48_12")
	private int p4812;
	@Column(name = "P48_13")
	private String p4813;
	@Column(name = "P48_14")
	private String p4814;
	@Column(name = "P48_15")
	private String p4815;
	@Column(name = "P48_16")
	private int p4816;
	@Column(name = "P48_17")
	private int p4817;
	@Column(name = "P48_18")
	private int p4818;
	@Column(name = "P48_19")
	private String p4819;
	@Column(name = "P48_20")
	private int p4820;
	@Column(name = "P48_21")
	private String p4821;
	@Column(name = "P48_22")
	private String p4822;
	@Column(name = "P48_23")
	private int p4823;
	@Column(name = "P48_24")
	private String p4824;
	@Column(name = "P48_25")
	private String p4825;
	@Column(name = "P48_26")
	private String p4826;
	@Column(name = "P48_28")
	private int p4828;
	@Column(name = "P48_29")
	private String p4829;
	@Column(name = "P48_30")
	private int p4830;
	@Column(name = "P48_31")
	private String p4831;
	@Column(name = "P48_35")
	private String p4835;
	@Column(name = "P49")
	private int p49;
	@Column(name = "P50")
	private int p50;
	@Column(name = "P51")
	private int p51;
	@Column(name = "P53")
	private Long p53;
	@Column(name = "P55")
	private String p55;
	@Column(name = "P57")
	private int p57;
	@Column(name = "P58")
	private String p58;
	@Column(name = "P62")
	private String p62;
	@Column(name = "P62_01")
	private int p6201;
	@Column(name = "P62_02")
	private Long p6202;
	@Column(name = "P62_03")
	private Long p6203;
	@Column(name = "P62_04")
	private int p6204;
	@Column(name = "P62_05")
	private String p6205;
	@Column(name = "P62_06")
	private Long p6206;
	@Column(name = "P62_13")
	private String p6213;
	@Column(name = "P62_16")
	private String p6216;
	@Column(name = "P62_17")
	private Long p6217;
	@Column(name = "S71")
	private Long s71;
	@Column(name = "S72")
	private Calendar s72;
	@Column(name = "S74")
	private Long s74;
	@Column(name = "S75")
	private Long s75;
	@Column(name = "S76")
	private Long s76;
	@Column(name = "S77")
	private Long s77;
	@Column(name = "S80")
	private Long s80;
	@Column(name = "S81")
	private Long s81;
	@Column(name = "S85")
	private Long s85;
	@Column(name = "S86")
	private Long s86;
	@Column(name = "S87")
	private Long s87;
	@Column(name = "S88")
	private Long s88;
	@Column(name = "S89")
	private Long s89;
	@Column(name = "S93")
	private String s93;
	@Column(name = "S94")
	private String s94;
	@Column(name = "S95")
	private String s95;
	@Column(name = "S97")
	private Long s97;
	@Column(name = "S101")
	private String s101;
	@Column(name = "S102")
	private String s102;
	@Column(name = "S104")
	private String s104;
	@Column(name = "S105")
	private Long s105;
	@Column(name = "S106")
	private Long s106;
	@Column(name = "S107")
	private Long s107;
	@Column(name = "S108")
	private Long s108;
	@Column(name = "S109")
	private Long s109;
	@Column(name = "S110")
	private Long s110;
	@Column(name = "SESS_ID")
	private String sessId;
	@Column(name = "P56")
	private String p56;
	@Column(name = "OPTP")
	private String optp;
	@Column(name = "MSGT")
	private String msgt;
	@Column(name = "ISS_INST")
	private int issInst;
	@Column(name = "ISS_NETWORK")
	private int issNetwork;
	@Column(name = "ACQ_INST")
	private int acqInst;
	@Column(name = "ACQ_NETWORK")
	private int acqNetwork;
	@Column(name = "P94_T")
	private String p94T;
	@Column(name = "P28_T")
	private String p28T;
	@Column(name = "P11_T")
	private String p11T;
	@Column(name = "P28L_T")
	private String p28LT;
	@Column(name = "P29L_T")
	private String p29LT;
	@Column(name = "P11L_T")
	private String p11LT;

	public PrcMessages() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getP02() {
		return p02;
	}

	public void setP02(String p02) {
		this.p02 = p02;
	}

	public int getP03() {
		return p03;
	}

	public void setP03(int p03) {
		this.p03 = p03;
	}

	public Long getP04() {
		return p04;
	}

	public void setP04(Long p04) {
		this.p04 = p04;
	}

	public Long getP05() {
		return p05;
	}

	public void setP05(Long p05) {
		this.p05 = p05;
	}

	public Long getP06() {
		return p06;
	}

	public void setP06(Long p06) {
		this.p06 = p06;
	}

	public Long getP09() {
		return p09;
	}

	public void setP09(Long p09) {
		this.p09 = p09;
	}

	public Long getP10() {
		return p10;
	}

	public void setP10(Long p10) {
		this.p10 = p10;
	}

	public int getP11() {
		return p11;
	}

	public void setP11(int p11) {
		this.p11 = p11;
	}

	public Long getP12() {
		return p12;
	}

	public void setP12(Long p12) {
		this.p12 = p12;
	}

	public int getP14() {
		return p14;
	}

	public void setP14(int p14) {
		this.p14 = p14;
	}

	public int getP16() {
		return p16;
	}

	public void setP16(int p16) {
		this.p16 = p16;
	}

	public int getP17() {
		return p17;
	}

	public void setP17(int p17) {
		this.p17 = p17;
	}

	public int getP18() {
		return p18;
	}

	public void setP18(int p18) {
		this.p18 = p18;
	}

	public int getP19() {
		return p19;
	}

	public void setP19(int p19) {
		this.p19 = p19;
	}

	public int getP22() {
		return p22;
	}

	public void setP22(int p22) {
		this.p22 = p22;
	}

	public String getP23() {
		return p23;
	}

	public void setP23(String p23) {
		this.p23 = p23;
	}

	public int getP24() {
		return p24;
	}

	public void setP24(int p24) {
		this.p24 = p24;
	}

	public int getP25() {
		return p25;
	}

	public void setP25(int p25) {
		this.p25 = p25;
	}

	public int getP26() {
		return p26;
	}

	public void setP26(int p26) {
		this.p26 = p26;
	}

	public int getP27() {
		return p27;
	}

	public void setP27(int p27) {
		this.p27 = p27;
	}

	public int getP28() {
		return p28;
	}

	public void setP28(int p28) {
		this.p28 = p28;
	}

	public int getP29() {
		return p29;
	}

	public void setP29(int p29) {
		this.p29 = p29;
	}

	public Long getP301() {
		return p301;
	}

	public void setP301(Long p301) {
		this.p301 = p301;
	}

	public Long getP302() {
		return p302;
	}

	public void setP302(Long p302) {
		this.p302 = p302;
	}

	public String getP31() {
		return p31;
	}

	public void setP31(String p31) {
		this.p31 = p31;
	}

	public String getP32() {
		return p32;
	}

	public void setP32(String p32) {
		this.p32 = p32;
	}

	public String getP33() {
		return p33;
	}

	public void setP33(String p33) {
		this.p33 = p33;
	}

	public String getP35() {
		return p35;
	}

	public void setP35(String p35) {
		this.p35 = p35;
	}

	public String getP37() {
		return p37;
	}

	public void setP37(String p37) {
		this.p37 = p37;
	}

	public String getP38() {
		return p38;
	}

	public void setP38(String p38) {
		this.p38 = p38;
	}

	public int getP39() {
		return p39;
	}

	public void setP39(int p39) {
		this.p39 = p39;
	}

	public int getP40() {
		return p40;
	}

	public void setP40(int p40) {
		this.p40 = p40;
	}

	public String getP41() {
		return p41;
	}

	public void setP41(String p41) {
		this.p41 = p41;
	}

	public String getP42() {
		return p42;
	}

	public void setP42(String p42) {
		this.p42 = p42;
	}

	public String getP43() {
		return p43;
	}

	public void setP43(String p43) {
		this.p43 = p43;
	}

	public String getP44() {
		return p44;
	}

	public void setP44(String p44) {
		this.p44 = p44;
	}

	public String getP45() {
		return p45;
	}

	public void setP45(String p45) {
		this.p45 = p45;
	}

	public String getP46() {
		return p46;
	}

	public void setP46(String p46) {
		this.p46 = p46;
	}

	public String getP48() {
		return p48;
	}

	public void setP48(String p48) {
		this.p48 = p48;
	}

	public Long getP4801() {
		return p4801;
	}

	public void setP4801(Long p4801) {
		this.p4801 = p4801;
	}

	public int getP4802() {
		return p4802;
	}

	public void setP4802(int p4802) {
		this.p4802 = p4802;
	}

	public Long getP4803() {
		return p4803;
	}

	public void setP4803(Long p4803) {
		this.p4803 = p4803;
	}

	public int getP4804() {
		return p4804;
	}

	public void setP4804(int p4804) {
		this.p4804 = p4804;
	}

	public String getP4805() {
		return p4805;
	}

	public void setP4805(String p4805) {
		this.p4805 = p4805;
	}

	public String getP4806() {
		return p4806;
	}

	public void setP4806(String p4806) {
		this.p4806 = p4806;
	}

	public int getP4807() {
		return p4807;
	}

	public void setP4807(int p4807) {
		this.p4807 = p4807;
	}

	public int getP4808() {
		return p4808;
	}

	public void setP4808(int p4808) {
		this.p4808 = p4808;
	}

	public String getP4809() {
		return p4809;
	}

	public void setP4809(String p4809) {
		this.p4809 = p4809;
	}

	public int getP4810() {
		return p4810;
	}

	public void setP4810(int p4810) {
		this.p4810 = p4810;
	}

	public int getP4812() {
		return p4812;
	}

	public void setP4812(int p4812) {
		this.p4812 = p4812;
	}

	public String getP4813() {
		return p4813;
	}

	public void setP4813(String p4813) {
		this.p4813 = p4813;
	}

	public String getP4814() {
		return p4814;
	}

	public void setP4814(String p4814) {
		this.p4814 = p4814;
	}

	public String getP4815() {
		return p4815;
	}

	public void setP4815(String p4815) {
		this.p4815 = p4815;
	}

	public int getP4816() {
		return p4816;
	}

	public void setP4816(int p4816) {
		this.p4816 = p4816;
	}

	public int getP4817() {
		return p4817;
	}

	public void setP4817(int p4817) {
		this.p4817 = p4817;
	}

	public int getP4818() {
		return p4818;
	}

	public void setP4818(int p4818) {
		this.p4818 = p4818;
	}

	public String getP4819() {
		return p4819;
	}

	public void setP4819(String p4819) {
		this.p4819 = p4819;
	}

	public int getP4820() {
		return p4820;
	}

	public void setP4820(int p4820) {
		this.p4820 = p4820;
	}

	public String getP4821() {
		return p4821;
	}

	public void setP4821(String p4821) {
		this.p4821 = p4821;
	}

	public String getP4822() {
		return p4822;
	}

	public void setP4822(String p4822) {
		this.p4822 = p4822;
	}

	public int getP4823() {
		return p4823;
	}

	public void setP4823(int p4823) {
		this.p4823 = p4823;
	}

	public String getP4824() {
		return p4824;
	}

	public void setP4824(String p4824) {
		this.p4824 = p4824;
	}

	public String getP4825() {
		return p4825;
	}

	public void setP4825(String p4825) {
		this.p4825 = p4825;
	}

	public String getP4826() {
		return p4826;
	}

	public void setP4826(String p4826) {
		this.p4826 = p4826;
	}

	public int getP4828() {
		return p4828;
	}

	public void setP4828(int p4828) {
		this.p4828 = p4828;
	}

	public String getP4829() {
		return p4829;
	}

	public void setP4829(String p4829) {
		this.p4829 = p4829;
	}

	public int getP4830() {
		return p4830;
	}

	public void setP4830(int p4830) {
		this.p4830 = p4830;
	}

	public String getP4831() {
		return p4831;
	}

	public void setP4831(String p4831) {
		this.p4831 = p4831;
	}

	public String getP4835() {
		return p4835;
	}

	public void setP4835(String p4835) {
		this.p4835 = p4835;
	}

	public int getP49() {
		return p49;
	}

	public void setP49(int p49) {
		this.p49 = p49;
	}

	public int getP50() {
		return p50;
	}

	public void setP50(int p50) {
		this.p50 = p50;
	}

	public int getP51() {
		return p51;
	}

	public void setP51(int p51) {
		this.p51 = p51;
	}

	public Long getP53() {
		return p53;
	}

	public void setP53(Long p53) {
		this.p53 = p53;
	}

	public String getP55() {
		return p55;
	}

	public void setP55(String p55) {
		this.p55 = p55;
	}

	public int getP57() {
		return p57;
	}

	public void setP57(int p57) {
		this.p57 = p57;
	}

	public String getP58() {
		return p58;
	}

	public void setP58(String p58) {
		this.p58 = p58;
	}

	public String getP62() {
		return p62;
	}

	public void setP62(String p62) {
		this.p62 = p62;
	}

	public int getP6201() {
		return p6201;
	}

	public void setP6201(int p6201) {
		this.p6201 = p6201;
	}

	public Long getP6202() {
		return p6202;
	}

	public void setP6202(Long p6202) {
		this.p6202 = p6202;
	}

	public Long getP6203() {
		return p6203;
	}

	public void setP6203(Long p6203) {
		this.p6203 = p6203;
	}

	public int getP6204() {
		return p6204;
	}

	public void setP6204(int p6204) {
		this.p6204 = p6204;
	}

	public String getP6205() {
		return p6205;
	}

	public void setP6205(String p6205) {
		this.p6205 = p6205;
	}

	public Long getP6206() {
		return p6206;
	}

	public void setP6206(Long p6206) {
		this.p6206 = p6206;
	}

	public String getP6213() {
		return p6213;
	}

	public void setP6213(String p6213) {
		this.p6213 = p6213;
	}

	public String getP6216() {
		return p6216;
	}

	public void setP6216(String p6216) {
		this.p6216 = p6216;
	}

	public Long getP6217() {
		return p6217;
	}

	public void setP6217(Long p6217) {
		this.p6217 = p6217;
	}

	public Long getS71() {
		return s71;
	}

	public void setS71(Long s71) {
		this.s71 = s71;
	}

	public Calendar getS72() {
		return s72;
	}

	public void setS72(Calendar s72) {
		this.s72 = s72;
	}

	public Long getS74() {
		return s74;
	}

	public void setS74(Long s74) {
		this.s74 = s74;
	}

	public Long getS75() {
		return s75;
	}

	public void setS75(Long s75) {
		this.s75 = s75;
	}

	public Long getS76() {
		return s76;
	}

	public void setS76(Long s76) {
		this.s76 = s76;
	}

	public Long getS77() {
		return s77;
	}

	public void setS77(Long s77) {
		this.s77 = s77;
	}

	public Long getS80() {
		return s80;
	}

	public void setS80(Long s80) {
		this.s80 = s80;
	}

	public Long getS81() {
		return s81;
	}

	public void setS81(Long s81) {
		this.s81 = s81;
	}

	public Long getS85() {
		return s85;
	}

	public void setS85(Long s85) {
		this.s85 = s85;
	}

	public Long getS86() {
		return s86;
	}

	public void setS86(Long s86) {
		this.s86 = s86;
	}

	public Long getS87() {
		return s87;
	}

	public void setS87(Long s87) {
		this.s87 = s87;
	}

	public Long getS88() {
		return s88;
	}

	public void setS88(Long s88) {
		this.s88 = s88;
	}

	public Long getS89() {
		return s89;
	}

	public void setS89(Long s89) {
		this.s89 = s89;
	}

	public String getS93() {
		return s93;
	}

	public void setS93(String s93) {
		this.s93 = s93;
	}

	public String getS94() {
		return s94;
	}

	public void setS94(String s94) {
		this.s94 = s94;
	}

	public String getS95() {
		return s95;
	}

	public void setS95(String s95) {
		this.s95 = s95;
	}

	public Long getS97() {
		return s97;
	}

	public void setS97(Long s97) {
		this.s97 = s97;
	}

	public String getS101() {
		return s101;
	}

	public void setS101(String s101) {
		this.s101 = s101;
	}

	public String getS102() {
		return s102;
	}

	public void setS102(String s102) {
		this.s102 = s102;
	}

	public String getS104() {
		return s104;
	}

	public void setS104(String s104) {
		this.s104 = s104;
	}

	public Long getS105() {
		return s105;
	}

	public void setS105(Long s105) {
		this.s105 = s105;
	}

	public Long getS106() {
		return s106;
	}

	public void setS106(Long s106) {
		this.s106 = s106;
	}

	public Long getS107() {
		return s107;
	}

	public void setS107(Long s107) {
		this.s107 = s107;
	}

	public Long getS108() {
		return s108;
	}

	public void setS108(Long s108) {
		this.s108 = s108;
	}

	public Long getS109() {
		return s109;
	}

	public void setS109(Long s109) {
		this.s109 = s109;
	}

	public Long getS110() {
		return s110;
	}

	public void setS110(Long s110) {
		this.s110 = s110;
	}

	public String getSessId() {
		return sessId;
	}

	public void setSessId(String sessId) {
		this.sessId = sessId;
	}

	public String getP56() {
		return p56;
	}

	public void setP56(String p56) {
		this.p56 = p56;
	}

	public String getOptp() {
		return optp;
	}

	public void setOptp(String optp) {
		this.optp = optp;
	}

	public String getMsgt() {
		return msgt;
	}

	public void setMsgt(String msgt) {
		this.msgt = msgt;
	}

	public int getIssInst() {
		return issInst;
	}

	public void setIssInst(int issInst) {
		this.issInst = issInst;
	}

	public int getIssNetwork() {
		return issNetwork;
	}

	public void setIssNetwork(int issNetwork) {
		this.issNetwork = issNetwork;
	}

	public int getAcqInst() {
		return acqInst;
	}

	public void setAcqInst(int acqInst) {
		this.acqInst = acqInst;
	}

	public int getAcqNetwork() {
		return acqNetwork;
	}

	public void setAcqNetwork(int acqNetwork) {
		this.acqNetwork = acqNetwork;
	}

	public String getP94T() {
		return p94T;
	}

	public void setP94T(String p94t) {
		p94T = p94t;
	}

	public String getP28T() {
		return p28T;
	}

	public void setP28T(String p28t) {
		p28T = p28t;
	}

	public String getP11T() {
		return p11T;
	}

	public void setP11T(String p11t) {
		p11T = p11t;
	}

	public String getP28LT() {
		return p28LT;
	}

	public void setP28LT(String p28lt) {
		p28LT = p28lt;
	}

	public String getP29LT() {
		return p29LT;
	}

	public void setP29LT(String p29lt) {
		p29LT = p29lt;
	}

	public String getP11LT() {
		return p11LT;
	}

	public void setP11LT(String p11lt) {
		p11LT = p11lt;
	}

	@Override
	public int compareTo(PrcMessages arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
