package com.danco.bpc.entity.TMA;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "TMT_MOV_ACCT")
@Entity
public class TmtMovActcTr extends AbstractBaseEntity implements java.io.Serializable, Comparable<TmtMovActcTr> {

	private static final long serialVersionUID = 1L;
	@Column(name = "CMTQPART")
	private Long cmtqpart = (long) 3;
	@Column(name = "CMTPALTA", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	private Calendar cmtpalta = Calendar.getInstance();
	@Column(name = "CP0LAPPL")
	private Long cp0lappl = (long) 22;
	@Column(name = "CMTQNSES")
	private Long cmtqnses = (long) 8424;
	@Id
	@SequenceGenerator(name = "TMT_MOV_ACTC_INT_ID", sequenceName = "TMT_MOV_ACTC_INT_ID")
	@GeneratedValue(generator = "TMT_MOV_ACTC_INT_ID")
	@Column(name = "CMTQNMOV")
	private Long cmtqnmov;
	@Column(name = "CM0LTMOV")
	private Long cm0ltmov = (long) 23;
	@Column(name = "CMTMCRTS")
	private String cmtmcrts = "1";
	@Column(name = "CMTMFUNC")
	private String cmtmfunc = "0";
	@Column(name = "CMTMCLSR")
	private String cmtmclsr = "1";
	@Column(name = "CMTMSEAD")
	private String cmtmsead = "1";
	@Column(name = "CMTMACCI")
	private String cmtmacci = "1";
	@Column(name = "CMTMCOME")
	private String cmtmcome = "1";
	@Column(name = "CMTMCUEN")
	private String cmtmcuen = "1";
	@Column(name = "CMTMIDTC")
	private String cmtmidtc = "1";
	@Column(name = "CMTMNUAB")
	private String cmtmnuab = "1";
	@Column(name = "CMTMNUAA")
	private String cmtmnuaa = "0";
	@Column(name = "CMTMNUCA")
	private String cmtmnuca = "1";
	@Column(name = "CMTMNUAC")
	private String cmtmnuac = "0";
	@Column(name = "CMTMIMAB")
	private String cmtmimab = "1";
	@Column(name = "CMTMIMAA")
	private String cmtmimaa = "0";
	@Column(name = "CMTMIMCA")
	private String cmtmimca = "1";
	@Column(name = "CMTMIMAC")
	private String cmtmimac = "0";
	@Column(name = "CMTMIMTI")
	private String cmtmimti = "1";
	@Column(name = "CMTMIMTA")
	private String cmtmimta = "0";
	@Column(name = "CMTMIMTC")
	private String cmtmimtc = "0";
	@Column(name = "CMTMENSA")
	private String cmtmensa = "1";
	@Column(name = "CMTMRESO")
	private String cmtmreso = "0";
	@Column(name = "CMTMIEBC")
	private String cmtmiebc = "1";
	@Column(name = "CMTMERRO")
	private String cmtmerro = "1";
	@Column(name = "CMTMNCUE")
	private String cmtmncue = "0";
	@Column(name = "CMTVNULO")
	private String cmtvnulo = "0000000";
	@Column(name = "C0DLCIER")
	private Long c0dlcier = (long) 470003;
	@Column(name = "CMTPTRAN")
	private Long cmtptran = new Long("150429002343");
	@Column(name = "CMTQIDTR")
	private Long cmtqidtr = (long) 535860;
	@Column(name = "CMTLMENS")
	private Long cmtlmens = (long) 1530;
	@Column(name = "CM4LFMEN")
	private Long cm4lfmen = (long) 0;
	@Column(name = "C42LCLSR")
	private Long c42lclsr = (long) 80;
	@Column(name = "CMTQSEAD")
	private Long cmtqsead = (long) 160412;
	@Column(name = "CM1LRESP")
	private Long cm1lresp = (long) 500;
	@Column(name = "C43LECA")
	private Long c43leca = (long) 14;
	@Column(name = "C43LCOME")
	private Long c43lcome = (long) 16825;
	@Column(name = "C43CCHEC")
	private String c43cchec = "6";
	@Column(name = "C00LTIPO")
	private Long c00ltipo = (long) 0;
	@Column(name = "C00LCSB")
	private Long c00lcsb = (long) 3058;
	@Column(name = "C45LCSB")
	private Long c45lcsb = (long) 0;
	@Column(name = "CMTQNCTA")
	private int cmtqncta = 0;
	@Column(name = "C20CCOME")
	private String c20ccome = "000140000168256";
	@Column(name = "C20LORDE")
	private Long c20lorde = (long) 3;
	@Column(name = "C33LORDE")
	private Long c33lorde = (long) 0;
	@Column(name = "CMTLACUM")
	private Long cmtlacum = (long) 1;
	@Column(name = "CMTIABON")
	private Long cmtiabon = (long) 0;
	@Column(name = "CMTIANAB")
	private Long cmtianab = (long) 0;
	@Column(name = "CMTICARG")
	private Long cmticarg = (long) 2;
	@Column(name = "CMTIANCA")
	private Long cmtianca = (long) 0;
	@Column(name = "CMTJABON")
	private Long cmtjabon = (long) 0;
	@Column(name = "CMTJANAB")
	private Long cmtjanab = (long) 0;
	@Column(name = "CMTJCARG")
	private Long cmtjcarg = (long) 11300;
	@Column(name = "CMTJANCA")
	private Long cmtjanca = (long) 0;
	@Column(name = "CMTJTINT")
	private Long cmtjtint = new Long("11300");
	@Column(name = "CMTJTABO")
	private Long cmtjtabo = (long) 0;
	@Column(name = "CMTJTCAR")
	private Long cmtjtcar = (long) 0;
	@Column(name = "CMTPMVEN")
	private Calendar cmtpmven = new GregorianCalendar(2013, 0, 31);
	@Column(name = "CMTPMVSA")
	private Calendar cmtpmvsa = new GregorianCalendar(2013, 0, 31);
	@Column(name = "C0DLCIE1")
	private Long c0dlcie1 = (long) 220444;
	@Column(name = "CMTMIEAS")
	private String cmtmieas = "0";
	@Column(name = "CMTQERRO")
	private String cmtqerro = "000";
	@Column(name = "C00LTIP1")
	private Long c00ltip1 = (long) 0;
	@Column(name = "C00LCSB1")
	private Long c00lcsb1 = (long) 0;
	@Column(name = "C45LCSB1")
	private Long c45lcsb1 = (long) 0;
	@Column(name = "CMTQNCT1")
	private int cmtqnct1 = 0;
	@Column(name = "CMTVNCTA")
	private String cmtvncta = "";
	@Column(name = "CMTVNCT1")
	private String cmtvnct1 = "                    ";
	@Column(name = "CMTQREME")
	private Long cmtqreme = (long) 0;
	@Column(name = "CMTQSESI")
	private Long cmtqsesi = (long) 0;
	@Column(name = "CMTNTERM")
	private String cmtnterm = "M25P";
	@Column(name = "CMTMP33")
	private String cmtmp33 = "0";
	@Column(name = "C0DLP33")
	private Long c0dlp33 = (long) 0;
	@Column(name = "CD1LTDTO")
	private Long cd1ltdto = (long) 0;
	@Column(name = "CD5JIFIJ")
	private Double cd5jifij = (double) 0;
	@Column(name = "CD5JIPCT")
	private Double cd5jipct = (double) 0;
	@Column(name = "CMTJIDTO")
	private Long cmtjidto = (long) 0;
	@Column(name = "CMTMDDTO")
	private String cmtmddto = "0";
	@Column(name = "CA0LTECL")
	private Long ca0ltecl = (long) 0;
	@Column(name = "CMTMNSIC")
	private String cmtmnsic = "0";
	@Column(name = "CMTQNSIC")
	private Long cmtqnsic = (long) 0;
	@Column(name = "CMTMAGRA")
	private String cmtmagra = "1";
	@Column(name = "C00LCSBA_AGR")
	private Long c00lcsbaAgr = (long) 9000;
	@Column(name = "CMTMICIE")
	private String cmtmicie = "1";
	@Column(name = "CMTMCIER")
	private String cmtmcier = "1";
	@Column(name = "CMTMCIER_SIO")
	private String cmtmcierSio;
	@Column(name = "C0DLCIER_SIO")
	private Long c0dlcierSio = (long) 0;
	@Column(name = "CMTMACTI")
	private String cmtmacti = "0";
	@Column(name = "C41LACTI")
	private Long c41lacti = (long) 0;
	@Column(name = "C40LACTI")
	private Long c40lacti = (long) 0;
	@Column(name = "CMTMIMMX")
	private String cmtmimmx = "0";
	@Column(name = "CMTJIMAX")
	private Long cmtjimax = (long) 0;
	@Column(name = "CMTMFSES_SIO")
	private String cmtmfsesSio;
	@Column(name = "CMTFSESI_SIO")
	private Long cmtfsesiSio = (long) 0;
	@Column(name = "CMTMNSES_SIO")
	private String cmtmnsesSio = "0";
	@Column(name = "CMTQNSES_SIO")
	private Long cmtqnsesSio = (long) 0;
	@Column(name = "CMTMDCCJ")
	private String cmtmdccj = "0";
	@Column(name = "CE0LMONE")
	private Long ce0lmone = (long) 0;
	@Column(name = "CMTJREIN")
	private Long cmtjrein = (long) 0;
	@Column(name = "CMTJINGR")
	private Long cmtjingr = (long) 0;
	@Column(name = "CMTJTALO")
	private Long cmtjtalo = (long) 0;
	@Column(name = "CMTJOTRO")
	private Long cmtjotro = (long) 0;
	@Column(name = "CMTIOPER")
	private Long cmtioper = (long) 0;
	@Column(name = "CMTIREIN")
	private Long cmtirein = (long) 0;
	@Column(name = "CMTIIGEF")
	private Long cmtiigef = (long) 0;
	@Column(name = "CMTIIGTL")
	private Long cmtiigtl = (long) 0;
	@Column(name = "CMTITRSP")
	private Long cmtitrsp = (long) 0;
	@Column(name = "CMTITRSF")
	private Long cmtitrsf = (long) 0;
	@Column(name = "CMTICSAL")
	private Long cmticsal = (long) 0;
	@Column(name = "CMTIOTRO")
	private Long cmtiotro = (long) 0;
	@Column(name = "CMTIULMV")
	private Long cmtiulmv = (long) 0;
	@Column(name = "CMTIFTRP")
	private Long cmtiftrp = (long) 0;
	@Column(name = "CMTICPIN")
	private Long cmticpin = (long) 0;
	@Column(name = "CMTICIDI")
	private Long cmticidi = (long) 0;
	@Column(name = "CMTIIGTL_EUR")
	private Long cmtiigtlEur = (long) 0;
	@Column(name = "CMTITRSP_EUR")
	private Long cmtitrspEur = (long) 0;
	@Column(name = "CMTITRSF_EUR")
	private Long cmtitrsfEur = (long) 0;
	@Column(name = "CMTIOTRO_EUR")
	private Long cmtiotroEur = (long) 0;
	@Column(name = "SV_INTERNAL_ID")
	private Long svInternalId = null;
	@Column(name = "IS_NEW_FIELD")
	private Boolean isNewField = true;

	public TmtMovActcTr() {
		super();
	}

	public Long getCmtqpart() {
		return cmtqpart;
	}

	public void setCmtqpart(Long cmtqpart) {
		this.cmtqpart = cmtqpart;
	}

	public Calendar getCmtpalta() {
		return cmtpalta;
	}

	public void setCmtpalta(Calendar cmtpalta) {
		this.cmtpalta = cmtpalta;
	}

	public Long getCp0lappl() {
		return cp0lappl;
	}

	public void setCp0lappl(Long cp0lappl) {
		this.cp0lappl = cp0lappl;
	}

	public Long getCmtqnses() {
		return cmtqnses;
	}

	public void setCmtqnses(Long cmtqnses) {
		this.cmtqnses = cmtqnses;
	}

	public Long getCmtqnmov() {
		return cmtqnmov;
	}

	public void setCmtqnmov(Long cmtqnmov) {
		this.cmtqnmov = cmtqnmov;
	}

	public Long getCm0ltmov() {
		return cm0ltmov;
	}

	public void setCm0ltmov(Long cm0ltmov) {
		this.cm0ltmov = cm0ltmov;
	}

	public String getCmtmcrts() {
		return cmtmcrts;
	}

	public void setCmtmcrts(String cmtmcrts) {
		this.cmtmcrts = cmtmcrts;
	}

	public String getCmtmfunc() {
		return cmtmfunc;
	}

	public void setCmtmfunc(String cmtmfunc) {
		this.cmtmfunc = cmtmfunc;
	}

	public String getCmtmclsr() {
		return cmtmclsr;
	}

	public void setCmtmclsr(String cmtmclsr) {
		this.cmtmclsr = cmtmclsr;
	}

	public String getCmtmsead() {
		return cmtmsead;
	}

	public void setCmtmsead(String cmtmsead) {
		this.cmtmsead = cmtmsead;
	}

	public String getCmtmacci() {
		return cmtmacci;
	}

	public void setCmtmacci(String cmtmacci) {
		this.cmtmacci = cmtmacci;
	}

	public String getCmtmcome() {
		return cmtmcome;
	}

	public void setCmtmcome(String cmtmcome) {
		this.cmtmcome = cmtmcome;
	}

	public String getCmtmcuen() {
		return cmtmcuen;
	}

	public void setCmtmcuen(String cmtmcuen) {
		this.cmtmcuen = cmtmcuen;
	}

	public String getCmtmidtc() {
		return cmtmidtc;
	}

	public void setCmtmidtc(String cmtmidtc) {
		this.cmtmidtc = cmtmidtc;
	}

	public String getCmtmnuab() {
		return cmtmnuab;
	}

	public void setCmtmnuab(String cmtmnuab) {
		this.cmtmnuab = cmtmnuab;
	}

	public String getCmtmnuaa() {
		return cmtmnuaa;
	}

	public void setCmtmnuaa(String cmtmnuaa) {
		this.cmtmnuaa = cmtmnuaa;
	}

	public String getCmtmnuca() {
		return cmtmnuca;
	}

	public void setCmtmnuca(String cmtmnuca) {
		this.cmtmnuca = cmtmnuca;
	}

	public String getCmtmnuac() {
		return cmtmnuac;
	}

	public void setCmtmnuac(String cmtmnuac) {
		this.cmtmnuac = cmtmnuac;
	}

	public String getCmtmimab() {
		return cmtmimab;
	}

	public void setCmtmimab(String cmtmimab) {
		this.cmtmimab = cmtmimab;
	}

	public String getCmtmimaa() {
		return cmtmimaa;
	}

	public void setCmtmimaa(String cmtmimaa) {
		this.cmtmimaa = cmtmimaa;
	}

	public String getCmtmimca() {
		return cmtmimca;
	}

	public void setCmtmimca(String cmtmimca) {
		this.cmtmimca = cmtmimca;
	}

	public String getCmtmimac() {
		return cmtmimac;
	}

	public void setCmtmimac(String cmtmimac) {
		this.cmtmimac = cmtmimac;
	}

	public String getCmtmimti() {
		return cmtmimti;
	}

	public void setCmtmimti(String cmtmimti) {
		this.cmtmimti = cmtmimti;
	}

	public String getCmtmimta() {
		return cmtmimta;
	}

	public void setCmtmimta(String cmtmimta) {
		this.cmtmimta = cmtmimta;
	}

	public String getCmtmimtc() {
		return cmtmimtc;
	}

	public void setCmtmimtc(String cmtmimtc) {
		this.cmtmimtc = cmtmimtc;
	}

	public String getCmtmensa() {
		return cmtmensa;
	}

	public void setCmtmensa(String cmtmensa) {
		this.cmtmensa = cmtmensa;
	}

	public String getCmtmreso() {
		return cmtmreso;
	}

	public void setCmtmreso(String cmtmreso) {
		this.cmtmreso = cmtmreso;
	}

	public String getCmtmiebc() {
		return cmtmiebc;
	}

	public void setCmtmiebc(String cmtmiebc) {
		this.cmtmiebc = cmtmiebc;
	}

	public String getCmtmerro() {
		return cmtmerro;
	}

	public void setCmtmerro(String cmtmerro) {
		this.cmtmerro = cmtmerro;
	}

	public String getCmtmncue() {
		return cmtmncue;
	}

	public void setCmtmncue(String cmtmncue) {
		this.cmtmncue = cmtmncue;
	}

	public String getCmtvnulo() {
		return cmtvnulo;
	}

	public void setCmtvnulo(String cmtvnulo) {
		this.cmtvnulo = cmtvnulo;
	}

	public Long getC0dlcier() {
		return c0dlcier;
	}

	public void setC0dlcier(Long c0dlcier) {
		this.c0dlcier = c0dlcier;
	}

	public Long getCmtptran() {
		return cmtptran;
	}

	public void setCmtptran(Long cmtptran) {
		this.cmtptran = cmtptran;
	}

	public Long getCmtqidtr() {
		return cmtqidtr;
	}

	public void setCmtqidtr(Long cmtqidtr) {
		this.cmtqidtr = cmtqidtr;
	}

	public Long getCmtlmens() {
		return cmtlmens;
	}

	public void setCmtlmens(Long cmtlmens) {
		this.cmtlmens = cmtlmens;
	}

	public Long getCm4lfmen() {
		return cm4lfmen;
	}

	public void setCm4lfmen(Long cm4lfmen) {
		this.cm4lfmen = cm4lfmen;
	}

	public Long getC42lclsr() {
		return c42lclsr;
	}

	public void setC42lclsr(Long c42lclsr) {
		this.c42lclsr = c42lclsr;
	}

	public Long getCmtqsead() {
		return cmtqsead;
	}

	public void setCmtqsead(Long cmtqsead) {
		this.cmtqsead = cmtqsead;
	}

	public Long getCm1lresp() {
		return cm1lresp;
	}

	public void setCm1lresp(Long cm1lresp) {
		this.cm1lresp = cm1lresp;
	}

	public Long getC43leca() {
		return c43leca;
	}

	public void setC43leca(Long c43leca) {
		this.c43leca = c43leca;
	}

	public Long getC43lcome() {
		return c43lcome;
	}

	public void setC43lcome(Long c43lcome) {
		this.c43lcome = c43lcome;
	}

	public String getC43cchec() {
		return c43cchec;
	}

	public void setC43cchec(String c43cchec) {
		this.c43cchec = c43cchec;
	}

	public Long getC00ltipo() {
		return c00ltipo;
	}

	public void setC00ltipo(Long c00ltipo) {
		this.c00ltipo = c00ltipo;
	}

	public Long getC00lcsb() {
		return c00lcsb;
	}

	public void setC00lcsb(Long c00lcsb) {
		this.c00lcsb = c00lcsb;
	}

	public Long getC45lcsb() {
		return c45lcsb;
	}

	public void setC45lcsb(Long c45lcsb) {
		this.c45lcsb = c45lcsb;
	}

	public int getCmtqncta() {
		return cmtqncta;
	}

	public void setCmtqncta(int cmtqncta) {
		this.cmtqncta = cmtqncta;
	}

	public String getC20ccome() {
		return c20ccome;
	}

	public void setC20ccome(String c20ccome) {
		this.c20ccome = c20ccome;
	}

	public Long getC20lorde() {
		return c20lorde;
	}

	public void setC20lorde(Long c20lorde) {
		this.c20lorde = c20lorde;
	}

	public Long getC33lorde() {
		return c33lorde;
	}

	public void setC33lorde(Long c33lorde) {
		this.c33lorde = c33lorde;
	}

	public Long getCmtlacum() {
		return cmtlacum;
	}

	public void setCmtlacum(Long cmtlacum) {
		this.cmtlacum = cmtlacum;
	}

	public Long getCmtiabon() {
		return cmtiabon;
	}

	public void setCmtiabon(Long cmtiabon) {
		this.cmtiabon = cmtiabon;
	}

	public Long getCmtianab() {
		return cmtianab;
	}

	public void setCmtianab(Long cmtianab) {
		this.cmtianab = cmtianab;
	}

	public Long getCmticarg() {
		return cmticarg;
	}

	public void setCmticarg(Long cmticarg) {
		this.cmticarg = cmticarg;
	}

	public Long getCmtianca() {
		return cmtianca;
	}

	public void setCmtianca(Long cmtianca) {
		this.cmtianca = cmtianca;
	}

	public Long getCmtjabon() {
		return cmtjabon;
	}

	public void setCmtjabon(Long cmtjabon) {
		this.cmtjabon = cmtjabon;
	}

	public Long getCmtjanab() {
		return cmtjanab;
	}

	public void setCmtjanab(Long cmtjanab) {
		this.cmtjanab = cmtjanab;
	}

	public Long getCmtjcarg() {
		return cmtjcarg;
	}

	public void setCmtjcarg(Long cmtjcarg) {
		this.cmtjcarg = cmtjcarg;
	}

	public Long getCmtjanca() {
		return cmtjanca;
	}

	public void setCmtjanca(Long cmtjanca) {
		this.cmtjanca = cmtjanca;
	}

	public Long getCmtjtint() {
		return cmtjtint;
	}

	public void setCmtjtint(Long cmtjtint) {
		this.cmtjtint = cmtjtint;
	}

	public Long getCmtjtabo() {
		return cmtjtabo;
	}

	public void setCmtjtabo(Long cmtjtabo) {
		this.cmtjtabo = cmtjtabo;
	}

	public Long getCmtjtcar() {
		return cmtjtcar;
	}

	public void setCmtjtcar(Long cmtjtcar) {
		this.cmtjtcar = cmtjtcar;
	}

	public Calendar getCmtpmven() {
		return cmtpmven;
	}

	public void setCmtpmven(Calendar cmtpmven) {
		this.cmtpmven = cmtpmven;
	}

	public Calendar getCmtpmvsa() {
		return cmtpmvsa;
	}

	public void setCmtpmvsa(Calendar cmtpmvsa) {
		this.cmtpmvsa = cmtpmvsa;
	}

	public Long getC0dlcie1() {
		return c0dlcie1;
	}

	public void setC0dlcie1(Long c0dlcie1) {
		this.c0dlcie1 = c0dlcie1;
	}

	public String getCmtmieas() {
		return cmtmieas;
	}

	public void setCmtmieas(String cmtmieas) {
		this.cmtmieas = cmtmieas;
	}

	public String getCmtqerro() {
		return cmtqerro;
	}

	public void setCmtqerro(String cmtqerro) {
		this.cmtqerro = cmtqerro;
	}

	public Long getC00ltip1() {
		return c00ltip1;
	}

	public void setC00ltip1(Long c00ltip1) {
		this.c00ltip1 = c00ltip1;
	}

	public Long getC00lcsb1() {
		return c00lcsb1;
	}

	public void setC00lcsb1(Long c00lcsb1) {
		this.c00lcsb1 = c00lcsb1;
	}

	public Long getC45lcsb1() {
		return c45lcsb1;
	}

	public void setC45lcsb1(Long c45lcsb1) {
		this.c45lcsb1 = c45lcsb1;
	}

	public int getCmtqnct1() {
		return cmtqnct1;
	}

	public void setCmtqnct1(int cmtqnct1) {
		this.cmtqnct1 = cmtqnct1;
	}

	public String getCmtvncta() {
		return cmtvncta;
	}

	public void setCmtvncta(String cmtvncta) {
		this.cmtvncta = cmtvncta;
	}

	public String getCmtvnct1() {
		return cmtvnct1;
	}

	public void setCmtvnct1(String cmtvnct1) {
		this.cmtvnct1 = cmtvnct1;
	}

	public Long getCmtqreme() {
		return cmtqreme;
	}

	public void setCmtqreme(Long cmtqreme) {
		this.cmtqreme = cmtqreme;
	}

	public Long getCmtqsesi() {
		return cmtqsesi;
	}

	public void setCmtqsesi(Long cmtqsesi) {
		this.cmtqsesi = cmtqsesi;
	}

	public String getCmtnterm() {
		return cmtnterm;
	}

	public void setCmtnterm(String cmtnterm) {
		this.cmtnterm = cmtnterm;
	}

	public String getCmtmp33() {
		return cmtmp33;
	}

	public void setCmtmp33(String cmtmp33) {
		this.cmtmp33 = cmtmp33;
	}

	public Long getC0dlp33() {
		return c0dlp33;
	}

	public void setC0dlp33(Long c0dlp33) {
		this.c0dlp33 = c0dlp33;
	}

	public Long getCd1ltdto() {
		return cd1ltdto;
	}

	public void setCd1ltdto(Long cd1ltdto) {
		this.cd1ltdto = cd1ltdto;
	}

	public Double getCd5jifij() {
		return cd5jifij;
	}

	public void setCd5jifij(Double cd5jifij) {
		this.cd5jifij = cd5jifij;
	}

	public Double getCd5jipct() {
		return cd5jipct;
	}

	public void setCd5jipct(Double cd5jipct) {
		this.cd5jipct = cd5jipct;
	}

	public Long getCmtjidto() {
		return cmtjidto;
	}

	public void setCmtjidto(Long cmtjidto) {
		this.cmtjidto = cmtjidto;
	}

	public String getCmtmddto() {
		return cmtmddto;
	}

	public void setCmtmddto(String cmtmddto) {
		this.cmtmddto = cmtmddto;
	}

	public Long getCa0ltecl() {
		return ca0ltecl;
	}

	public void setCa0ltecl(Long ca0ltecl) {
		this.ca0ltecl = ca0ltecl;
	}

	public String getCmtmnsic() {
		return cmtmnsic;
	}

	public void setCmtmnsic(String cmtmnsic) {
		this.cmtmnsic = cmtmnsic;
	}

	public Long getCmtqnsic() {
		return cmtqnsic;
	}

	public void setCmtqnsic(Long cmtqnsic) {
		this.cmtqnsic = cmtqnsic;
	}

	public String getCmtmagra() {
		return cmtmagra;
	}

	public void setCmtmagra(String cmtmagra) {
		this.cmtmagra = cmtmagra;
	}

	public Long getC00lcsbaAgr() {
		return c00lcsbaAgr;
	}

	public void setC00lcsbaAgr(Long c00lcsbaAgr) {
		this.c00lcsbaAgr = c00lcsbaAgr;
	}

	public String getCmtmicie() {
		return cmtmicie;
	}

	public void setCmtmicie(String cmtmicie) {
		this.cmtmicie = cmtmicie;
	}

	public String getCmtmcier() {
		return cmtmcier;
	}

	public void setCmtmcier(String cmtmcier) {
		this.cmtmcier = cmtmcier;
	}

	public String getCmtmcierSio() {
		return cmtmcierSio;
	}

	public void setCmtmcierSio(String cmtmcierSio) {
		this.cmtmcierSio = cmtmcierSio;
	}

	public Long getC0dlcierSio() {
		return c0dlcierSio;
	}

	public void setC0dlcierSio(Long c0dlcierSio) {
		this.c0dlcierSio = c0dlcierSio;
	}

	public String getCmtmacti() {
		return cmtmacti;
	}

	public void setCmtmacti(String cmtmacti) {
		this.cmtmacti = cmtmacti;
	}

	public Long getC41lacti() {
		return c41lacti;
	}

	public void setC41lacti(Long c41lacti) {
		this.c41lacti = c41lacti;
	}

	public Long getC40lacti() {
		return c40lacti;
	}

	public void setC40lacti(Long c40lacti) {
		this.c40lacti = c40lacti;
	}

	public String getCmtmimmx() {
		return cmtmimmx;
	}

	public void setCmtmimmx(String cmtmimmx) {
		this.cmtmimmx = cmtmimmx;
	}

	public Long getCmtjimax() {
		return cmtjimax;
	}

	public void setCmtjimax(Long cmtjimax) {
		this.cmtjimax = cmtjimax;
	}

	public String getCmtmfsesSio() {
		return cmtmfsesSio;
	}

	public void setCmtmfsesSio(String cmtmfsesSio) {
		this.cmtmfsesSio = cmtmfsesSio;
	}

	public Long getCmtfsesiSio() {
		return cmtfsesiSio;
	}

	public void setCmtfsesiSio(Long cmtfsesiSio) {
		this.cmtfsesiSio = cmtfsesiSio;
	}

	public String getCmtmnsesSio() {
		return cmtmnsesSio;
	}

	public void setCmtmnsesSio(String cmtmnsesSio) {
		this.cmtmnsesSio = cmtmnsesSio;
	}

	public Long getCmtqnsesSio() {
		return cmtqnsesSio;
	}

	public void setCmtqnsesSio(Long cmtqnsesSio) {
		this.cmtqnsesSio = cmtqnsesSio;
	}

	public String getCmtmdccj() {
		return cmtmdccj;
	}

	public void setCmtmdccj(String cmtmdccj) {
		this.cmtmdccj = cmtmdccj;
	}

	public Long getCe0lmone() {
		return ce0lmone;
	}

	public void setCe0lmone(Long ce0lmone) {
		this.ce0lmone = ce0lmone;
	}

	public Long getCmtjrein() {
		return cmtjrein;
	}

	public void setCmtjrein(Long cmtjrein) {
		this.cmtjrein = cmtjrein;
	}

	public Long getCmtjingr() {
		return cmtjingr;
	}

	public void setCmtjingr(Long cmtjingr) {
		this.cmtjingr = cmtjingr;
	}

	public Long getCmtjtalo() {
		return cmtjtalo;
	}

	public void setCmtjtalo(Long cmtjtalo) {
		this.cmtjtalo = cmtjtalo;
	}

	public Long getCmtjotro() {
		return cmtjotro;
	}

	public void setCmtjotro(Long cmtjotro) {
		this.cmtjotro = cmtjotro;
	}

	public Long getCmtioper() {
		return cmtioper;
	}

	public void setCmtioper(Long cmtioper) {
		this.cmtioper = cmtioper;
	}

	public Long getCmtirein() {
		return cmtirein;
	}

	public void setCmtirein(Long cmtirein) {
		this.cmtirein = cmtirein;
	}

	public Long getCmtiigef() {
		return cmtiigef;
	}

	public void setCmtiigef(Long cmtiigef) {
		this.cmtiigef = cmtiigef;
	}

	public Long getCmtiigtl() {
		return cmtiigtl;
	}

	public void setCmtiigtl(Long cmtiigtl) {
		this.cmtiigtl = cmtiigtl;
	}

	public Long getCmtitrsp() {
		return cmtitrsp;
	}

	public void setCmtitrsp(Long cmtitrsp) {
		this.cmtitrsp = cmtitrsp;
	}

	public Long getCmtitrsf() {
		return cmtitrsf;
	}

	public void setCmtitrsf(Long cmtitrsf) {
		this.cmtitrsf = cmtitrsf;
	}

	public Long getCmticsal() {
		return cmticsal;
	}

	public void setCmticsal(Long cmticsal) {
		this.cmticsal = cmticsal;
	}

	public Long getCmtiotro() {
		return cmtiotro;
	}

	public void setCmtiotro(Long cmtiotro) {
		this.cmtiotro = cmtiotro;
	}

	public Long getCmtiulmv() {
		return cmtiulmv;
	}

	public void setCmtiulmv(Long cmtiulmv) {
		this.cmtiulmv = cmtiulmv;
	}

	public Long getCmtiftrp() {
		return cmtiftrp;
	}

	public void setCmtiftrp(Long cmtiftrp) {
		this.cmtiftrp = cmtiftrp;
	}

	public Long getCmticpin() {
		return cmticpin;
	}

	public void setCmticpin(Long cmticpin) {
		this.cmticpin = cmticpin;
	}

	public Long getCmticidi() {
		return cmticidi;
	}

	public void setCmticidi(Long cmticidi) {
		this.cmticidi = cmticidi;
	}

	public Long getCmtiigtlEur() {
		return cmtiigtlEur;
	}

	public void setCmtiigtlEur(Long cmtiigtlEur) {
		this.cmtiigtlEur = cmtiigtlEur;
	}

	public Long getCmtitrspEur() {
		return cmtitrspEur;
	}

	public void setCmtitrspEur(Long cmtitrspEur) {
		this.cmtitrspEur = cmtitrspEur;
	}

	public Long getCmtitrsfEur() {
		return cmtitrsfEur;
	}

	public void setCmtitrsfEur(Long cmtitrsfEur) {
		this.cmtitrsfEur = cmtitrsfEur;
	}

	public Long getCmtiotroEur() {
		return cmtiotroEur;
	}

	public void setCmtiotroEur(Long cmtiotroEur) {
		this.cmtiotroEur = cmtiotroEur;
	}

	public Long getSvInternalId() {
		return svInternalId;
	}

	public void setSvInternalId(Long svInternalId) {
		this.svInternalId = svInternalId;
	}

	public Boolean getIsNewField() {
		return isNewField;
	}

	public void setIsNewField(Boolean isNewField) {
		this.isNewField = isNewField;
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
	public int compareTo(TmtMovActcTr o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
