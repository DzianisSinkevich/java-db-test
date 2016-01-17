package com.danco.bpc.entity.TMA;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "TMT_MOV_ACTC", catalog = "mkyong")
@Entity
public class TmtMovActc extends AbstractBaseEntity implements java.io.Serializable, Comparable<TmtMovActc> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CMTQPART")
	private Long cmtqpart;
	@Column(name = "CMTPALTA")
	private Calendar cmtpalta;
	@Column(name = "CP0LAPPL")
	private Long cp0lappl;
	@Column(name = "CMTQNSES")
	private Long cmtqnses;
	@Column(name = "CMTQNMOV")
	private Long cmtqnmov;
	@Column(name = "CM0LTMOV")
	private Long cm0ltmov;
	@Column(name = "C0DLCIER")
	private Long c0dlcier;
	@Column(name = "CMTPTRAN")
	private Long cmtptran;
	@Column(name = "CMTQIDTR")
	private Long cmtqidtr;
	@Column(name = "CMTLMENS")
	private Long cmtlmens;
	@Column(name = "CM4LFMEN")
	private Long cm4lfmen;
	@Column(name = "C42LCLSR")
	private Long c42lclsr;
	@Column(name = "CMTQSEAD")
	private Long cmtqsead;
	@Column(name = "CM1LRESP")
	private Long cm1lresp;
	@Column(name = "C43LECA")
	private Long c43leca;
	@Column(name = "C43LCOME")
	private Long c43lcome;
	@Column(name = "C00LTIPO")
	private Long c00ltipo;
	@Column(name = "C00LCSB")
	private Long c00lcsb;
	@Column(name = "C45LCSB")
	private Long c45lcsb;
	@Column(name = "CMTQNCTA")
	private Integer cmtqncta;
	@Column(name = "C20LORDE")
	private Long c20lorde;
	@Column(name = "C33LORDE")
	private Long c33lorde;
	@Column(name = "CMTLACUM")
	private Long cmtlacum;
	@Column(name = "CMTIABON")
	private Long cmtiabon;
	@Column(name = "CMTIANAB")
	private Long cmtianab;
	@Column(name = "CMTICARG")
	private Long cmticarg;
	@Column(name = "CMTIANCA")
	private Long cmtianca;
	@Column(name = "CMTJABON")
	private Long cmtjabon;
	@Column(name = "CMTJANAB")
	private Long cmtjanab;
	@Column(name = "CMTJCARG")
	private Long cmtjcarg;
	@Column(name = "CMTJANCA")
	private Long cmtjanca;
	@Column(name = "CMTJTINT")
	private Long cmtjtint;
	@Column(name = "CMTJTABO")
	private Long cmtjtabo;
	@Column(name = "CMTJTCAR")
	private Long cmtjtcar;
	@Column(name = "CMTPMVEN")
	private Calendar cmtpmven;
	@Column(name = "CMTPMVSA")
	private Calendar cmtpmvsa;
	@Column(name = "C0DLCIE1")
	private Long c0dlcie1;
	@Column(name = "C00LTIP1")
	private Long c00ltip1;
	@Column(name = "C00LCSB1")
	private Long c00lcsb1;
	@Column(name = "C45LCSB1")
	private Long c45lcsb1;
	@Column(name = "CMTQNCT1")
	private Integer cmtqnct1;
	@Column(name = "CMTQREME")
	private Long cmtqreme;
	@Column(name = "CMTQSESI")
	private Long cmtqsesi;
	@Column(name = "C0DLP33")
	private Long c0dlp33;
	@Column(name = "CD1LTDTO")
	private Long cd1ltdto;
	@Column(name = "CD5JIFIJ")
	private Double cd5jifij;
	@Column(name = "CD5JIPCT")
	private Double cd5jipct;
	@Column(name = "CMTJIDTO")
	private Long cmtjidto;
	@Column(name = "CA0LTECL")
	private Long ca0ltecl;
	@Column(name = "CMTQNSIC")
	private Long cmtqnsic;
	@Column(name = "C00LCSBA_AGR")
	private Long c00lcsba_agr;
	@Column(name = "C0DLCIER_SIO")
	private Long c0dlcier_sio;
	@Column(name = "C41LACTI")
	private Long c41lacti;
	@Column(name = "C40LACTI")
	private Long c40lacti;
	@Column(name = "CMTJIMAX")
	private Long cmtjimax;
	@Column(name = "CMTFSESI_SIO")
	private Long cmtfsesi_sio;
	@Column(name = "CMTQNSES_SIO")
	private Long cmtqnses_sio;
	@Column(name = "CE0LMONE")
	private Long ce0lmone;
	@Column(name = "CMTJREIN")
	private Long cmtjrein;
	@Column(name = "CMTJINGR")
	private Long cmtjingr;
	@Column(name = "CMTJTALO")
	private Long cmtjtalo;
	@Column(name = "CMTJOTRO")
	private Long cmtjotro;
	@Column(name = "CMTIOPER")
	private Long cmtioper;
	@Column(name = "CMTIREIN")
	private Long cmtirein;
	@Column(name = "CMTIIGEF")
	private Long cmtiigef;
	@Column(name = "CMTIIGTL")
	private Long cmtiigtl;
	@Column(name = "CMTITRSP")
	private Long cmtitrsp;
	@Column(name = "CMTITRSF")
	private Long cmtitrsf;
	@Column(name = "CMTICSAL")
	private Long cmticsal;
	@Column(name = "CMTIOTRO")
	private Long cmtiotro;
	@Column(name = "CMTIULMV")
	private Long cmtiulmv;
	@Column(name = "CMTIFTRP")
	private Long cmtiftrp;
	@Column(name = "CMTICPIN")
	private Long cmticpin;
	@Column(name = "CMTICIDI")
	private Long cmticidi;
	@Column(name = "CMTIIGTL_EUR")
	private Long cmtiigtl_eur;
	@Column(name = "CMTITRSP_EUR")
	private Long cmtitrsp_eur;
	@Column(name = "CMTITRSF_EUR")
	private Long cmtitrsf_eur;
	@Column(name = "CMTIOTRO_EUR")
	private Long cmtiotro_eur;
	@Column(name = "SV_INTERNAL_ID")
	private Long sv_internal_id;
	@Column(name = "IS_NEW_FIELD")
	private Boolean is_new_field;

	public TmtMovActc() {
		super();
	}

	@Override
	public Long getId() {
		return null;
	}

	@Override
	public void setId(Long id) {

	}

	@Override
	public int compareTo(TmtMovActc o) {
		return 0;
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

	public Integer getCmtqncta() {
		return cmtqncta;
	}

	public void setCmtqncta(Integer cmtqncta) {
		this.cmtqncta = cmtqncta;
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

	public Integer getCmtqnct1() {
		return cmtqnct1;
	}

	public void setCmtqnct1(Integer cmtqnct1) {
		this.cmtqnct1 = cmtqnct1;
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

	public Long getCa0ltecl() {
		return ca0ltecl;
	}

	public void setCa0ltecl(Long ca0ltecl) {
		this.ca0ltecl = ca0ltecl;
	}

	public Long getCmtqnsic() {
		return cmtqnsic;
	}

	public void setCmtqnsic(Long cmtqnsic) {
		this.cmtqnsic = cmtqnsic;
	}

	public Long getC00lcsba_agr() {
		return c00lcsba_agr;
	}

	public void setC00lcsba_agr(Long c00lcsba_agr) {
		this.c00lcsba_agr = c00lcsba_agr;
	}

	public Long getC0dlcier_sio() {
		return c0dlcier_sio;
	}

	public void setC0dlcier_sio(Long c0dlcier_sio) {
		this.c0dlcier_sio = c0dlcier_sio;
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

	public Long getCmtjimax() {
		return cmtjimax;
	}

	public void setCmtjimax(Long cmtjimax) {
		this.cmtjimax = cmtjimax;
	}

	public Long getCmtfsesi_sio() {
		return cmtfsesi_sio;
	}

	public void setCmtfsesi_sio(Long cmtfsesi_sio) {
		this.cmtfsesi_sio = cmtfsesi_sio;
	}

	public Long getCmtqnses_sio() {
		return cmtqnses_sio;
	}

	public void setCmtqnses_sio(Long cmtqnses_sio) {
		this.cmtqnses_sio = cmtqnses_sio;
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

	public Long getCmtiigtl_eur() {
		return cmtiigtl_eur;
	}

	public void setCmtiigtl_eur(Long cmtiigtl_eur) {
		this.cmtiigtl_eur = cmtiigtl_eur;
	}

	public Long getCmtitrsp_eur() {
		return cmtitrsp_eur;
	}

	public void setCmtitrsp_eur(Long cmtitrsp_eur) {
		this.cmtitrsp_eur = cmtitrsp_eur;
	}

	public Long getCmtitrsf_eur() {
		return cmtitrsf_eur;
	}

	public void setCmtitrsf_eur(Long cmtitrsf_eur) {
		this.cmtitrsf_eur = cmtitrsf_eur;
	}

	public Long getCmtiotro_eur() {
		return cmtiotro_eur;
	}

	public void setCmtiotro_eur(Long cmtiotro_eur) {
		this.cmtiotro_eur = cmtiotro_eur;
	}

	public Long getSv_internal_id() {
		return sv_internal_id;
	}

	public void setSv_internal_id(Long sv_internal_id) {
		this.sv_internal_id = sv_internal_id;
	}

	public Boolean getIs_new_field() {
		return is_new_field;
	}

	public void setIs_new_field(Boolean is_new_field) {
		this.is_new_field = is_new_field;
	}

}
