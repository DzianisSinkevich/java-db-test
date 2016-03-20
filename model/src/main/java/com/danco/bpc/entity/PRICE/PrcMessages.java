package com.danco.bpc.entity.PRICE;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_MESSAGES")
@Entity
public class PrcMessages extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcMessages>  {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	private int version;
	private int userId;
	private String p02;
	private int p03;
	private int p04;
	private int p05;
	private int p06;
	private int p09;
	private int p10;
	private int p11;
	private int p12;
	private int p14;
	private int p16;
	private int p17;
	private int p18;
	private int p19;
	private int p22;
	private String p23;
	private int p24;
	private int p25;
	private int p26;
	private int p27;
	private int p28;
	private int p29;
	private int p301;
	private int p302;
	private String p31;
	private String p32;
	private String p33;
	private String p35;
	private String p37;
	private String p38;
	private int p39;
	private int p40;
	private String p41;
	private String p42;
	private String p43;
	private String p44;
	private String p45;
	private String p46;
	private String p48;
	private int p4801;
	private int p4802;
	private int p4803;
	private int p4804;
	private String p4805;
	private String p4806;
	private int p4807;
	private int p4808;
	private String p4809;
	private int p4810;
	private int p4812;
	private String p4813;
	private String p4814;
	private String p4815;
	private int p4816;
	private int p4817;
	private int p4818;
	private String p4819;
	private int p4820;
	private String p4821;
	private String p4822;
	private int p4823;
	private String p4824;
	private String p4825;
	private String p4826;
	private int p4828;
	private String p4829;
	private int p4830;
	private String p4831;
	private String p4835;
	private int p49;
	private int p50;
	private int p51;
	private int p53;
	private String p55;
	private int p57;
	private String p58;
	private String p62;
	private int p6201;
	private int p6202;
	private int p6203;
	private int p6204;
	private String p6205;
	private int p6206;
	private String p6213;
	private String p6216;
	private int p6217;
	private int s71;
	private Calendar s72;
	private int s74;
	private int s75;
	private int s76;
	private int s77;
	private int s80;
	private int s81;
	private int s85;
	private int s86;
	private int s87;
	private int s88;
	private int s89;
	private String s93;
	private String s94;
	private String s95;
	private int s97;
	private String s101;
	private String s102;
	private String s104;
	private int s105;
	private int s106;
	private int s107;
	private int s108;
	private int s109;
	private int s110;
	private String sessId;
	private String p56;
	private String optp;
	private String msgt;
	private int issInst;
	private int issNetwork;
	private int acqInst;
	private int acqNetwork;

	public PrcMessages() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public int getP04() {
		return p04;
	}

	public void setP04(int p04) {
		this.p04 = p04;
	}

	public int getP05() {
		return p05;
	}

	public void setP05(int p05) {
		this.p05 = p05;
	}

	public int getP06() {
		return p06;
	}

	public void setP06(int p06) {
		this.p06 = p06;
	}

	public int getP09() {
		return p09;
	}

	public void setP09(int p09) {
		this.p09 = p09;
	}

	public int getP10() {
		return p10;
	}

	public void setP10(int p10) {
		this.p10 = p10;
	}

	public int getP11() {
		return p11;
	}

	public void setP11(int p11) {
		this.p11 = p11;
	}

	public int getP12() {
		return p12;
	}

	public void setP12(int p12) {
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

	public int getP301() {
		return p301;
	}

	public void setP301(int p301) {
		this.p301 = p301;
	}

	public int getP302() {
		return p302;
	}

	public void setP302(int p302) {
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

	public int getP4801() {
		return p4801;
	}

	public void setP4801(int p4801) {
		this.p4801 = p4801;
	}

	public int getP4802() {
		return p4802;
	}

	public void setP4802(int p4802) {
		this.p4802 = p4802;
	}

	public int getP4803() {
		return p4803;
	}

	public void setP4803(int p4803) {
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

	public int getP53() {
		return p53;
	}

	public void setP53(int p53) {
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

	public int getP6202() {
		return p6202;
	}

	public void setP6202(int p6202) {
		this.p6202 = p6202;
	}

	public int getP6203() {
		return p6203;
	}

	public void setP6203(int p6203) {
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

	public int getP6206() {
		return p6206;
	}

	public void setP6206(int p6206) {
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

	public int getP6217() {
		return p6217;
	}

	public void setP6217(int p6217) {
		this.p6217 = p6217;
	}

	public int getS71() {
		return s71;
	}

	public void setS71(int s71) {
		this.s71 = s71;
	}

	public Calendar getS72() {
		return s72;
	}

	public void setS72(Calendar s72) {
		this.s72 = s72;
	}

	public int getS74() {
		return s74;
	}

	public void setS74(int s74) {
		this.s74 = s74;
	}

	public int getS75() {
		return s75;
	}

	public void setS75(int s75) {
		this.s75 = s75;
	}

	public int getS76() {
		return s76;
	}

	public void setS76(int s76) {
		this.s76 = s76;
	}

	public int getS77() {
		return s77;
	}

	public void setS77(int s77) {
		this.s77 = s77;
	}

	public int getS80() {
		return s80;
	}

	public void setS80(int s80) {
		this.s80 = s80;
	}

	public int getS81() {
		return s81;
	}

	public void setS81(int s81) {
		this.s81 = s81;
	}

	public int getS85() {
		return s85;
	}

	public void setS85(int s85) {
		this.s85 = s85;
	}

	public int getS86() {
		return s86;
	}

	public void setS86(int s86) {
		this.s86 = s86;
	}

	public int getS87() {
		return s87;
	}

	public void setS87(int s87) {
		this.s87 = s87;
	}

	public int getS88() {
		return s88;
	}

	public void setS88(int s88) {
		this.s88 = s88;
	}

	public int getS89() {
		return s89;
	}

	public void setS89(int s89) {
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

	public int getS97() {
		return s97;
	}

	public void setS97(int s97) {
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

	public int getS105() {
		return s105;
	}

	public void setS105(int s105) {
		this.s105 = s105;
	}

	public int getS106() {
		return s106;
	}

	public void setS106(int s106) {
		this.s106 = s106;
	}

	public int getS107() {
		return s107;
	}

	public void setS107(int s107) {
		this.s107 = s107;
	}

	public int getS108() {
		return s108;
	}

	public void setS108(int s108) {
		this.s108 = s108;
	}

	public int getS109() {
		return s109;
	}

	public void setS109(int s109) {
		this.s109 = s109;
	}

	public int getS110() {
		return s110;
	}

	public void setS110(int s110) {
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
	public int compareTo(PrcMessages o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
