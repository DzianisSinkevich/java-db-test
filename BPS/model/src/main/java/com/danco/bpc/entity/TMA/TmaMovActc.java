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

@Table(name = "TMA_MOV_ACTC")
@Entity
public class TmaMovActc extends AbstractBaseEntity implements java.io.Serializable, Comparable<TmaMovActc> {
	private static final long serialVersionUID = 1L;
	@Column(name = "CMAQPART")
	private Long cmaqpart = (long) 2;
	@Column(name = "CMAPALTA", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	private Calendar cmapalta = Calendar.getInstance();
	@Column(name = "CP0LAPPL")
	private Long cp0lappl = (long) 7;
	@Column(name = "CMAQNSES")
	private int cmaqnses = 5826;
	@Id
	@SequenceGenerator(name = "TMA_MOV_ACTC_INT_ID", sequenceName = "TMA_MOV_ACTC_INT_ID")
	@GeneratedValue(generator = "TMA_MOV_ACTC_INT_ID")
	@Column(name = "CMAQNMOV", unique = true, nullable = false, precision = 15, scale = 0)
	private Long cmaqnmov;
	@Column(name = "CM0LTMOV")
	private Long cm0ltmov = (long) 1;
	@Column(name = "CMAMCRTS")
	private String cmamcrts = "1";
	@Column(name = "CMAMNTAR")
	private String cmamntar = "1";
	@Column(name = "CMAMPROC")
	private String cmamproc = "1";
	@Column(name = "CMAMIMSO")
	private String cmamimso = "1";
	@Column(name = "CMAMMONC")
	private String cmammonc = "0";
	@Column(name = "CMAMMONE")
	private String cmammone = "0";
	@Column(name = "CMAMCADU")
	private String cmamcadu = "0";
	@Column(name = "CMAMACTI")
	private String cmamacti = "1";
	@Column(name = "CMAMDTPS")
	private String cmamdtps = "1";
	@Column(name = "CMAMFUNC")
	private String cmamfunc = "1";
	@Column(name = "CMAMRAZO")
	private String cmamrazo = "1";
	@Column(name = "CMAMCLSR")
	private String cmamclsr = "1";
	@Column(name = "CMAMLGAU")
	private String cmamlgau = "0";
	@Column(name = "CMAMSEAD")
	private String cmamsead = "1";
	@Column(name = "CMAMSERE")
	private String cmamsere = "1";
	@Column(name = "CMAMCOAD")
	private String cmamcoad = "1";
	@Column(name = "CMAMCORE")
	private String cmamcore = "1";
	@Column(name = "CMAMIMOR")
	private String cmamimor = "1";
	@Column(name = "CMAMIMCO")
	private String cmamimco = "0";
	@Column(name = "CMAMDTP2")
	private String cmamdtp2 = "1";
	@Column(name = "CMAMREFE")
	private String cmamrefe = "1";
	@Column(name = "CMAMNAUT")
	private String cmamnaut = "1";
	@Column(name = "CMAMACAD")
	private String cmamacad = "1";
	@Column(name = "CMAMACRE")
	private String cmamacre = "1";
	@Column(name = "CMAMCSRV")
	private String cmamcsrv = "1";
	@Column(name = "CMAMCOME")
	private String cmamcome = "1";
	@Column(name = "CMAMDOMI")
	private String cmamdomi = "1";
	@Column(name = "CMAMDTAD")
	private String cmamdtad = "0";
	@Column(name = "CMAMCUTR")
	private String cmamcutr = "1";
	@Column(name = "CMAMOFFS")
	private String cmamoffs = "0";
	@Column(name = "CMAMIDIO")
	private String cmamidio = "0";
	@Column(name = "CMAMNOFF")
	private String cmamnoff = "0";
	@Column(name = "CMAMNIDI")
	private String cmamnidi = "0";
	@Column(name = "CMAMSALD")
	private String cmamsald = "0";
	@Column(name = "CMAMULMV")
	private String cmamulmv = "0";
	@Column(name = "CMAMCVVA")
	private String cmamcvva = "0";
	@Column(name = "CMAMTERM")
	private String cmamterm = "1";
	@Column(name = "CMAMENVI")
	private String cmamenvi = "0";
	@Column(name = "CMAMPVV")
	private String cmampvv = "0";
	@Column(name = "CMAMBLOQ")
	private String cmambloq = "0";
	@Column(name = "CMAMMONA")
	private String cmammona = "1";
	@Column(name = "CMAMCIFA")
	private String cmamcifa = "0";
	@Column(name = "CMAMCIFR")
	private String cmamcifr = "0";
	@Column(name = "CMAMSEGA")
	private String cmamsega = "1";
	@Column(name = "CMAMSEGR")
	private String cmamsegr = "1";
	@Column(name = "CMAMDTOR")
	private String cmamdtor = "0";
	@Column(name = "CMAMIDAU")
	private String cmamidau = "1";
	@Column(name = "CMAMMACA")
	private String cmammaca = "0";
	@Column(name = "CMAMMACR")
	private String cmammacr = "0";
	@Column(name = "CMAMENSA")
	private String cmamensa = "1";
	@Column(name = "CMAMENSM")
	private String cmamensm = "1";
	@Column(name = "CMAMENSR")
	private String cmamensr = "0";
	@Column(name = "CMAMDTPF")
	private String cmamdtpf = "1";
	@Column(name = "CMAMDTPR")
	private String cmamdtpr = "1";
	@Column(name = "CMAMDTVR")
	private String cmamdtvr = "1";
	@Column(name = "CMAVNULO")
	private String cmavnulo = null;
	@Column(name = "C0DLCIER")
	private int c0dlcier = 70020;
	@Column(name = "CMAPTRAN")
	private Long cmaptran =  new Long("151209112942");
	@Column(name = "CMAQIDTR")
	private int cmaqidtr = 264656;
	@Column(name = "CMALMENS")
	private Long cmalmens = (long) 1120;
	@Column(name = "CA3LLPAN")
	private Long ca3llpan = (long) 16;
	@Column(name = "CMACTARJ")
	private String cmactarj = "5584394578564015000";
	@Column(name = "CM2LTRSP")
	private Long cm2ltrsp = (long) 0;
	@Column(name = "CM3LTCTA")
	private Long cm3ltcta = (long) 0;
	@Column(name = "CM3QNULO")
	private Long cm3qnulo = (long) 0;
	@Column(name = "CMAJIMAD")
	private Long cmajimad = (long) 0;
	@Column(name = "CMAJIMCO")
	private Long cmajimco = (long) 0;
	@Column(name = "CMAICAMC")
	private int cmaicamc = 0;
	@Column(name = "CE0LMON2")
	private Long ce0lmon2 = (long) 0;
	@Column(name = "CMAJIMTI")
	private Long cmajimti = (long) 0;
	@Column(name = "CMAICAMB")
	private int cmaicamb = 0;
	@Column(name = "CE0LMONE")
	private Long ce0lmone = (long) 0;
	@Column(name = "CMAFCADU")
	private Long cmafcadu = (long) 0;
	@Column(name = "C41LACTI")
	private Long c41lacti = (long) 7523;
	@Column(name = "C3HCCATE")
	private String c3hccate = "M";
	@Column(name = "C2KCAUTT")
	private String c2kcautt = "1";
	@Column(name = "C2JCRETA")
	private String c2jcreta = "0";
	@Column(name = "C2HCENTO")
	private String c2hcento = "1";
	@Column(name = "C3ICPRCL")
	private String c3icprcl = "0";
	@Column(name = "C3JCPRTJ")
	private String c3jcprtj = "1";
	@Column(name = "C2LCCEDT")
	private String c2lccedt = "5";
	@Column(name = "C3KCAUMO")
	private String c3kcaumo = "1";
	@Column(name = "C3LCAUDI")
	private String c3lcaudi = "1";
	@Column(name = "C3MCAUDA")
	private String c3mcauda = "1";
	@Column(name = "C3NCSEDA")
	private String c3ncseda = "4";
	@Column(name = "C2ICCAPP")
	private String c2iccapp = "C";
	@Column(name = "CM4LFMEN")
	private Long cm4lfmen = (long) 200;
	@Column(name = "CM5LRAZM")
	private Long cm5lrazm = (long) 1002;
	@Column(name = "C42LCLSR")
	private Long c42lclsr = (long) 7523;
	@Column(name = "CMAILGAU")
	private Long cmailgau = (long) 0;
	@Column(name = "CMAQSEAD")
	private int cmaqsead = 151209;
	@Column(name = "CMAQSERE")
	private int cmaqsere = 160430;
	@Column(name = "CMALCOAD")
	private Long cmalcoad = (long) 1;
	@Column(name = "CMALCORE")
	private Long cmalcore = (long) 347;
	@Column(name = "CMAJIMOR")
	private Long cmajimor = (long) 60000;
	@Column(name = "CMAJIMOC")
	private Long cmajimoc = (long) 0;
	@Column(name = "CMAILGP2")
	private Long cmailgp2 = (long) 37;
	@Column(name = "CMAVDTP2")
	private String cmavdtp2 = "5584394578564015=16122010000000000000";
	@Column(name = "CMACREFE")
	private String cmacrefe = "1655        ";
	@Column(name = "CMAVNAUT")
	private String cmavnaut = "540193";
	@Column(name = "CM1LRESP")
	private Long cm1lresp = (long) 912;
	@Column(name = "CM1LRES1")
	private Long cm1lres1 = (long) 912;
	@Column(name = "CA5LSRTJ")
	private Long ca5lsrtj = (long) 201;
	@Column(name = "C43LECA")
	private int c43leca = 30;
	@Column(name = "C43LCOME")
	private int c43lcome = 65425;
	@Column(name = "C43CCHEC")
	private String c43cchec = "5";
	@Column(name = "C43NREDU")
	private String c43nredu = "ALDEASA ALEMANIA         ";
	@Column(name = "C43ALOCA")
	private String c43aloca = "ARROYO DE CUE";
	@Column(name = "C86CALF2")
	private String c86calf2 = "ES";
	@Column(name = "CMAVDTAD")
	private String cmavdtad = "                                ";
	@Column(name = "CMALTCU1")
	private Long cmaltcu1 = (long) 0;
	@Column(name = "CMAJCUO1")
	private int cmajcuo1 = 0;
	@Column(name = "CMALTCU2")
	private Long cmaltcu2 = (long) 0;
	@Column(name = "CMAJCUO2")
	private int cmajcuo2 = 0;
	@Column(name = "CMALTCU3")
	private Long cmaltcu3 = (long) 0;
	@Column(name = "CMAJCUO3")
	private int cmajcuo3 = 0;
	@Column(name = "CMALTCU4")
	private Long cmaltcu4 = (long) 0;
	@Column(name = "CMAJCUO4")
	private int cmajcuo4 = 0;
	@Column(name = "CMAQOFFS")
	private Long cmaqoffs = (long) 0;
	@Column(name = "CMALIDIO")
	private Long cmalidio = (long) 0;
	@Column(name = "CMAQOFFN")
	private Long cmaqoffn = (long) 0;
	@Column(name = "CMALIDIN")
	private Long cmalidin = (long) 0;
	@Column(name = "CMALSALD")
	private Long cmalsald = (long) 0;
	@Column(name = "CMAIDICR")
	private Long cmaidicr = (long) 0;
	@Column(name = "CMAIDIDB")
	private Long cmaididb = (long) 0;
	@Column(name = "CMAIDIDI")
	private Long cmaididi = (long) 0;
	@Column(name = "CMAFMOV1")
	private int cmafmov1 = 0;
	@Column(name = "CMAJMOV1")
	private Long cmajmov1 = (long) 0;
	@Column(name = "CMALMOV1")
	private Long cmalmov1 = (long) 0;
	@Column(name = "CMAFMOV2")
	private int cmafmov2 = 0;
	@Column(name = "CMAJMOV2")
	private Long cmajmov2 = (long) 0;
	@Column(name = "CMALMOV2")
	private Long cmalmov2 = (long) 0;
	@Column(name = "CMAFMOV3")
	private int cmafmov3 = 0;
	@Column(name = "CMAJMOV3")
	private Long cmajmov3 = (long) 0;
	@Column(name = "CMALMOV3")
	private Long cmalmov3 = (long) 0;
	@Column(name = "CMAFMOV4")
	private int cmafmov4 = 0;
	@Column(name = "CMAJMOV4")
	private Long cmajmov4 = (long) 0;
	@Column(name = "CMALMOV4")
	private Long cmalmov4 = (long) 0;
	@Column(name = "CMAFMOV5")
	private int cmafmov5 = 0;
	@Column(name = "CMAJMOV5")
	private Long cmajmov5 = (long) 0;
	@Column(name = "CMALMOV5")
	private Long cmalmov5 = (long) 0;
	@Column(name = "CMAFMOV6")
	private int cmafmov6 = 0;
	@Column(name = "CMAJMOV6")
	private Long cmajmov6 = (long) 0;
	@Column(name = "CMALMOV6")
	private Long cmalmov6 = (long) 0;
	@Column(name = "CMAVCVV")
	private String cmavcvv = "   ";
	@Column(name = "CMACCAJE")
	private String cmaccaje = "030654255031";
	@Column(name = "CMALENVI")
	private Long cmalenvi = (long) 0;
	@Column(name = "CMAQPVV")
	private int cmaqpvv = 0;
	@Column(name = "CMAQBLOQ")
	private Long cmaqbloq = (long) 0;
	@Column(name = "CE0LMON1")
	private Long ce0lmon1 = (long) 978;
	@Column(name = "CMAVCFAD")
	private String cmavcfad = "        ";
	@Column(name = "CMAVCFRE")
	private String cmavcfre = "        ";
	@Column(name = "CX0LFSEG")
	private Long cx0lfseg = (long) 20;
	@Column(name = "CX0LALGO")
	private Long cx0lalgo = (long) 0;
	@Column(name = "CX0LFBLQ")
	private Long cx0lfblq = (long) 25;
	@Column(name = "CX0LZPIN")
	private Long cx0lzpin = (long) 0;
	@Column(name = "CX0LZMAC")
	private Long cx0lzmac = (long) 1;
	@Column(name = "CX0LFSE1")
	private Long cx0lfse1 = (long) 20;
	@Column(name = "CX0LALG1")
	private Long cx0lalg1 = (long) 0;
	@Column(name = "CX0LFBL1")
	private Long cx0lfbl1 = (long) 0;
	@Column(name = "CX0LZPI1")
	private Long cx0lzpi1 = (long) 0;
	@Column(name = "CX0LZMA1")
	private Long cx0lzma1 = (long) 1;
	@Column(name = "C0DLCIE1")
	private int c0dlcie1 = 0;
	@Column(name = "CMAPTRAO")
	private Long cmaptrao = (long) 0;
	@Column(name = "CMAQIDTO")
	private int cmaqidto = 0;
	@Column(name = "CMALMENO")
	private Long cmalmeno = (long) 0;
	@Column(name = "C0DLCIE2")
	private int c0dlcie2 = 808000;
	@Column(name = "CMACMACA")
	private String cmacmaca = "        ";
	@Column(name = "CMACMACR")
	private String cmacmacr = "        ";
	@Column(name = "CMAPMVEA")
	private Calendar cmapmvea = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAPMVSA")
	private Calendar cmapmvsa = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAPMVEM")
	private Calendar cmapmvem = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAPMVSM")
	private Calendar cmapmvsm = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAPMVER")
	private Calendar cmapmver = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAPMVSR")
	private Calendar cmapmvsr = new GregorianCalendar(2013,0,31);
	@Column(name = "CMAILGPF")
	private Long cmailgpf = (long) 42;
	@Column(name = "CMAVDTPF")
	private String cmavdtpf = "0182018211                0182        67 0";
	@Column(name = "CMAVESPR")
	private String cmavespr = "4";
	@Column(name = "C0DLCIE3")
	private int c0dlcie3 = 220444;
	@Column(name = "C0DLCIE4")
	private int c0dlcie4 = 308000;
	@Column(name = "CMAMCSLN")
	private String cmamcsln = "s";
	@Column(name = "CMAMVFCV")
	private String cmamvfcv = "y";
	@Column(name = "CMAMVFPI")
	private String cmamvfpi = "p";
	@Column(name = "CMAMRESL")
	private String cmamresl = "n";
	@Column(name = "CMAMCRDB")
	private String cmamcrdb = "e";
	@Column(name = "CMAVPROC")
	private String cmavproc = "  ";
	@Column(name = "CMAMIEBA")
	private String cmamieba = "2";
	@Column(name = "CMAMIEBR")
	private String cmamiebr = "3";
	@Column(name = "CMAMRESO")
	private String cmamreso = "3";
	@Column(name = "C0CCTEMI")
	private String c0cctemi = "K";
	@Column(name = "CA1LTTAR")
	private Long ca1lttar = (long) 2;
	@Column(name = "C0DLCIE5")
	private int c0dlcie5 = 70001;
	@Column(name = "CMAMIDPR")
	private String cmamidpr = "1";
	@Column(name = "CMAMCONX")
	private String cmamconx = "1";
	@Column(name = "CMALCSBM")
	private Long cmalcsbm = (long) 182;
	@Column(name = "CMALCSBC")
	private Long cmalcsbc = (long) 444;
	@Column(name = "CMAMP11B")
	private String cmamp11b = "1";
	@Column(name = "CMAQIDTB")
	private int cmaqidtb = 2533;
	@Column(name = "CMAMP03B")
	private String cmamp03b = "1";
	@Column(name = "CMACTCUE")
	private String cmactcue = "00";
	@Column(name = "CMAMP28M")
	private String cmamp28m = "0";
	@Column(name = "CMAQSEME")
	private int cmaqseme = 0;
	@Column(name = "CMAMP29B")
	private String cmamp29b = "1";
	@Column(name = "CMALCOME")
	private Long cmalcome = (long) 1;
	@Column(name = "CMAMP31")
	private String cmamp31 = "0";
	@Column(name = "CMACREFS")
	private String cmacrefs = "                       ";
	@Column(name = "CMAMP41")
	private String cmamp41 = "1";
	@Column(name = "CMACTERM")
	private String cmacterm = "33333333";
	@Column(name = "CMAMP44B")
	private String cmamp44b = "0";
	@Column(name = "CMAVDTAC")
	private String cmavdtac = null;
	@Column(name = "CMAMP45")
	private String cmamp45 = "0";
	@Column(name = "CMAVDTP1")
	private String cmavdtp1 = null;
	@Column(name = "CMAMP57")
	private String cmamp57 = "0";
	@Column(name = "CMAQPPAU")
	private Long cmaqppau = (long) 0;
	@Column(name = "CMAIPPAU")
	private Long cmaippau = (long) 0;
	@Column(name = "CMAMP62A")
	private String cmamp62a = "0";
	@Column(name = "CMAFAC62")
	private int cmafac62 = 0;
	@Column(name = "CMAQOP62")
	private int cmaqop62 = 0;
	@Column(name = "CMAQTR62")
	private int cmaqtr62 = 0;
	@Column(name = "CMAJSA62")
	private int cmajsa62 = 0;
	@Column(name = "CMACFI62")
	private String cmacfi62 = "    ";
	@Column(name = "CMACFO62")
	private String cmacfo62 = "    ";
	@Column(name = "CMAMP62B")
	private String cmamp62b = "0";
	@Column(name = "CMAVCA62")
	private String cmavca62 = "  ";
	@Column(name = "CMAMP62C")
	private String cmamp62c = "0";
	@Column(name = "CMAVAD62")
	private String cmavad62 = "        ";
	@Column(name = "CMAVAC62")
	private String cmavac62 = "        ";
	@Column(name = "CMAMP62D")
	private String cmamp62d = "0";
	@Column(name = "CMAVCE62")
	private String cmavce62 = "        ";
	@Column(name = "CMAVGC62")
	private String cmavgc62 = "        ";
	@Column(name = "CMAMP62E")
	private String cmamp62e = "0";
	@Column(name = "CMAVCF62")
	private String cmavcf62 = "        ";
	@Column(name = "CMAMP62F")
	private String cmamp62f = "0";
	@Column(name = "CMAVDA62")
	private String cmavda62 = "        ";
	@Column(name = "CMAMP62G")
	private String cmamp62g = "0";
	@Column(name = "CMAIO162")
	private int cmaio162 = 0;
	@Column(name = "CMALO162")
	private Long cmalo162 = (long) 0;
	@Column(name = "CMAJO162")
	private Long cmajo162 = (long) 0;
	@Column(name = "CMAIO262")
	private int cmaio262 = 0;
	@Column(name = "CMALO262")
	private Long cmalo262 = (long) 0;
	@Column(name = "CMAJO262")
	private Long cmajo262 = (long) 0;
	@Column(name = "CMAIO362")
	private int cmaio362 = 0;
	@Column(name = "CMALO362")
	private Long cmalo362 = (long) 0;
	@Column(name = "CMAJO362")
	private Long cmajo362 = (long) 0;
	@Column(name = "CMAMP62H")
	private String cmamp62h = "0";
	@Column(name = "CMACIS62")
	private String cmacis62 = "        ";
	@Column(name = "CMAFAS62")
	private int cmafas62 = 0;
	@Column(name = "CMAVAL62")
	private String cmaval62 = "  ";
	@Column(name = "CMAVVC62")
	private String cmavvc62 = "  ";
	@Column(name = "CMACIF62")
	private String cmacif62 = "    ";
	@Column(name = "CMAMS95")
	private String cmams95 = "0";
	@Column(name = "CMACRFEM")
	private String cmacrfem = null;
	@Column(name = "CMAMDPR2")
	private String cmamdpr2 = "1";
	@Column(name = "CMAVDPR2")
	private String cmavdpr2 = "2  nssnn nnsnn ns   ";
	@Column(name = "CMAMDTV2")
	private String cmamdtv2 = "1";
	@Column(name = "CMAVDTV2")
	private String cmavdtv2 = "146540215    ";
	@Column(name = "CMAMBFRA")
	private String cmambfra = "0";
	@Column(name = "CMAMFRAU")
	private String cmamfrau = " ";
	@Column(name = "CMAMCERR")
	private String cmamcerr = "1";
	@Column(name = "CMACERRO")
	private String cmacerro = "22044";
	@Column(name = "CMAMREGI")
	private String cmamregi = "1";
	@Column(name = "CMACRGAD")
	private String cmacrgad = " ";
	@Column(name = "CMACRGRE")
	private String cmacrgre = "E";
	@Column(name = "CMAMPAIE")
	private String cmampaie = "1";
	@Column(name = "C86CALF3")
	private String c86calf3 = "ESP";
	@Column(name = "CMAMDPF2")
	private String cmamdpf2 = "1";
	@Column(name = "CMAVDPF2")
	private String cmavdpf2 = "05";
	@Column(name = "CMAMDTEM")
	private String cmamdtem = "1";
	@Column(name = "CMAVDTEM")
	private String cmavdtem = "                       752375237523752319  21STD00510012              ";
	@Column(name = "CMAMMOCA")
	private String cmammoca = "0";
	@Column(name = "CMAJIMCA")
	private Long cmajimca = (long) 0;
	@Column(name = "CMAICMCA")
	private int cmaicmca = 0;
	@Column(name = "CE0LMON3")
	private Long ce0lmon3 = (long) 0;
	@Column(name = "CMAMCUPR")
	private String cmamcupr = "0";
	@Column(name = "CMALTCP1")
	private Long cmaltcp1 = (long) 0;
	@Column(name = "CMAJCUP1")
	private int cmajcup1 = 0;
	@Column(name = "CMALTCP2")
	private Long cmaltcp2 = (long) 0;
	@Column(name = "CMAJCUP2")
	private int cmajcup2 = 0;
	@Column(name = "CMALTCP3")
	private Long cmaltcp3 = (long) 0;
	@Column(name = "CMAJCUP3")
	private int cmajcup3 = 0;
	@Column(name = "CMALTCP4")
	private Long cmaltcp4 = (long) 0;
	@Column(name = "CMAJCUP4")
	private int cmajcup4 = 0;
	@Column(name = "CMAMP11O")
	private String cmamp11o = "0";
	@Column(name = "CMAQIDBO")
	private int cmaqidbo = 0;
	@Column(name = "CMAM6216")
	private String cmam6216 = "0";
	@Column(name = "CA3LLPAC")
	private Long ca3llpac = (long) 0;
	@Column(name = "CMACTARC")
	private String cmactarc = "                   ";
	@Column(name = "CMAFCADC")
	private Long cmafcadc = (long) 0;
	@Column(name = "CA5LSRTC")
	private Long ca5lsrtc = (long) 0;
	@Column(name = "CMAMDTCH")
	private String cmamdtch = "1";
	@Column(name = "C0DLCIE6")
	private int c0dlcie6 = 0;
	@Column(name = "CMALCSBE")
	private Long cmalcsbe = (long) 0;
	@Column(name = "CMAVDTCH")
	private String cmavdtch = "    0                s 220002 ";
	@Column(name = "CMAMPEFR")
	private String cmampefr = "0";
	@Column(name = "CMAQPEFR")
	private Long cmaqpefr = (long) 0;
	@Column(name = "CMANTERM")
	private String cmanterm = "M63I";
	@Column(name = "CMAMNSEC")
	private String cmamnsec = "1";
	@Column(name = "CMAQNSEC")
	private Long cmaqnsec = (long) 0;
	@Column(name = "CMAMCRPE")
	private String cmamcrpe = "1";
	@Column(name = "CMAMCRIP")
	private String cmamcrip = "1";
	@Column(name = "CMAMCRPT")
	private String cmamcrpt = "1";
	@Column(name = "CMAMSCRI")
	private String cmamscri = "0";
	@Column(name = "CMAMECOM")
	private String cmamecom = "1";
	@Column(name = "CMAVSETC")
	private String cmavsetc;
	@Column(name = "CMAVSETT")
	private String cmavsett = null;
	@Column(name = "CMAMIAID")
	private String cmamiaid = "0";
	@Column(name = "CMAVIAID")
	private String cmaviaid = null;
	@Column(name = "CMAMDTTJ")
	private String cmamdttj = "0";
	@Column(name = "CMAVDTTJ")
	private String cmavdttj = null;
	@Column(name = "CMAMDDTJ")
	private String cmamddtj = "0";
	@Column(name = "CMAVDDTJ")
	private String cmavddtj = null;
	@Column(name = "CMAMDDSH")
	private String cmamddsh = "0";
	@Column(name = "CMAVDDSH")
	private String cmavddsh = null;
	@Column(name = "CMAMDTSL")
	private String cmamdtsl = "0";
	@Column(name = "CMAVDTSL")
	private String cmavdtsl = null;
	@Column(name = "CMAMCRPR")
	private String cmamcrpr = "0";
	@Column(name = "CMAVCRPR")
	private String cmavcrpr = "        ";
	@Column(name = "CMAMDGCE")
	private String cmamdgce = "0";
	@Column(name = "CMAVDGCE")
	private String cmavdgce = null;
	@Column(name = "CMAMLSAM")
	private String cmamlsam = "0";
	@Column(name = "CMAVLSAM")
	private String cmavlsam = null;
	@Column(name = "CMAMSLEM")
	private String cmamslem = "0";
	@Column(name = "CMAVSLEM")
	private String cmavslem = "    ";
	@Column(name = "CMAMCRRE")
	private String cmamcrre = "0";
	@Column(name = "CMAVCRRE")
	private String cmavcrre = "        ";
	@Column(name = "CMAMACTR")
	private String cmamactr = "0";
	@Column(name = "CMACACTR")
	private String cmacactr = "     ";
	@Column(name = "CMAMCMSR")
	private String cmamcmsr = "0";
	@Column(name = "CMAMTCSR")
	private String cmamtcsr = " ";
	@Column(name = "CMAJCMSR")
	private int cmajcmsr = 0;
	@Column(name = "CE0LCMSR")
	private Long ce0lcmsr = (long) 0;
	@Column(name = "CMAMDAT_PRF")
	private String cmamdatPrf = "1";
	@Column(name = "CMAVDAT_PRF")
	private String cmavdatPrf = "                         1             00";
	@Column(name = "CMAMDAT_PRC")
	private String cmamdatPrc = "1";
	@Column(name = "CMAMMODU_PRC")
	private String cmammoduPrc = "n";
	@Column(name = "CMAQTARE_PRC")
	private int cmaqtarePrc = 0;
	@Column(name = "CE0LLADQ_PRC")
	private Long ce0lladqPrc = (long) 978;
	@Column(name = "CE0LLRES_PRC")
	private Long ce0llresPrc = (long) 978;
	@Column(name = "CMAQMS89_PRC")
	private int cmaqms89Prc = 0;
	@Column(name = "CMARTASA_PRC")
	private int cmartasaPrc = 0;
	@Column(name = "C41CTRMO_PRC")
	private String c41ctrmoPrc = "1";
	@Column(name = "C43CCAE_PRC")
	private String c43ccaePrc = "             ";
	@Column(name = "CMAMPSUS_PRC")
	private String cmampsusPrc = "0";
	@Column(name = "CMAMRSPR_PRC")
	private String cmamrsprPrc = " ";
	@Column(name = "CMACRSPR_PRC")
	private String cmacrsprPrc = "1";
	@Column(name = "CMAMDAT_MER")
	private String cmamdatMer = "1";
	@Column(name = "CMACOPTV_MER")
	private String cmacoptvMer = "07";
	@Column(name = "CMAVDAT_MER")
	private String cmavdatMer = "                                                                                                     10140600000000064667000000538900000053891500";
	@Column(name = "CMAMTPO_HSM")
	private String cmamtpoHsm = "1";
	@Column(name = "CMAITACC_HSM")
	private Long cmaitaccHsm = (long) 3;
	@Column(name = "CMAITTOT_HSM")
	private int cmaittotHsm = 521;
	@Column(name = "CMACCOMM_HSM")
	private String cmaccommHsm = "KQ";
	@Column(name = "CMAMDAT_ONL")
	private String cmamdatOnl = "1";
	@Column(name = "CMAVDAT_ONL")
	private String cmavdatOnl = "007500003000   1                                      ";
	@Column(name = "CMAMCRI_PRE")
	private String cmamcriPre = "0";
	@Column(name = "CMAVCRI_PRE")
	private String cmavcriPre = null;
	@Column(name = "CMAMCRI_RES")
	private String cmamcriRes = "0";
	@Column(name = "CMAVCRI_RES")
	private String cmavcriRes = null;
	@Column(name = "CMACE8A_RES")
	private String cmace8aRes = "  ";
	@Column(name = "CMAMCRI_SCR")
	private String cmamcriScr = "0";
	@Column(name = "CMACRES_SCR")
	private String cmacresScr = "     ";
	@Column(name = "CMAMOPE_ESP")
	private String cmamopeEsp = "0";
	@Column(name = "CMACOPTV_ESP")
	private String cmacoptvEsp = "  ";
	@Column(name = "CMAVOPTV_ESP")
	private String cmavoptvEsp = null;
	@Column(name = "CMAMPRF_COM")
	private String cmamprfCom = "1";
	@Column(name = "CMAMADCC_COM")
	private String cmamadccCom = "4";
	@Column(name = "CMAMPROP_COM")
	private String cmampropCom = "0";
	@Column(name = "CMAMPREA_COM")
	private String cmampreaCom = "1";
	@Column(name = "CMAMTAXF_COM")
	private String cmamtaxfCom = " ";
	@Column(name = "CE0LLIQU_COM")
	private Long ce0lliquCom = (long) 978;
	@Column(name = "CMAMFDIG_COM")
	private String cmamfdigCom = "1";
	@Column(name = "CMAMTPRV_COM")
	private String cmamtprvCom = "2";
	@Column(name = "CMAMDAT_NTR")
	private String cmamdatNtr = "1";
	@Column(name = "CMAVDAT_NTR")
	private String cmavdatNtr = "              9999  ";
	@Column(name = "CMAMDAT_ISL")
	private String cmamdatIsl = "1";
	@Column(name = "CMAVDAT_ISL")
	private String cmavdatIsl = "     070000000{150000000{000000000{000000000{ 00000       ";
	@Column(name = "CMACVVCA_PRC")
	private String cmacvvcaPrc = "";
	@Column(name = "CMAQVCA_PRC")
	private Long cmaqvcaPrc = (long) 0;
	@Column(name = "C00LCSBA_AGR")
	private Long c00lcsbaAgr = (long) 9000;
	@Column(name = "C00QLESQ")
	private Long c00qlesq = (long) 999;
	@Column(name = "C0DLCIE3_T01")
	private int c0dlcie3T01 = 821465;
	@Column(name = "CMACLYNX_RES")
	private String cmaclynxRes = "2";
	@Column(name = "CMAMDDTO")
	private String cmamddto = "0";
	@Column(name = "CD1LTDTO_SOL")
	private Long cd1ltdtoSol = (long) 0;
	@Column(name = "CA0LMARC_SOL")
	private Long ca0lmarcSol = (long) 0;
	@Column(name = "C00LCSB_SOL")
	private Long c00lcsbSol = (long) 0;
	@Column(name = "CE2LTDID_SOL")
	private Long ce2ltdidSol = (long) 0;
	@Column(name = "CMACIDFI_SOL")
	private String cmacidfiSol = "            ";
	@Column(name = "CD1LTDTO_RES")
	private Long cd1ltdtoRes = (long) 0;
	@Column(name = "CMAJIFIJ_RES")
	private Double cmajifijRes = (double) 0;
	@Column(name = "CMAJIPCT_RES")
	private Double cmajipctRes = (double) 0;
	@Column(name = "CMAJIDTO_RES")
	private Long cmajidtoRes = (long) 0;
	@Column(name = "SV_INTERNAL_ID")
	private Long svInternalId;
	@Column(name = "ORIGINAL_SV_ID")
	private Long originalSvId;
	@Column(name = "IS_NEW_FIELD")
	private Boolean isNewField = true;

	public TmaMovActc() {
		super();
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
	public int compareTo(TmaMovActc arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Long getCmaqpart() {
		return cmaqpart;
	}

	public void setCmaqpart(Long cmaqpart) {
		this.cmaqpart = cmaqpart;
	}

	public Calendar getCmapalta() {
		return cmapalta;
	}

	public void setCmapalta(Calendar cmapalta) {
		this.cmapalta = cmapalta;
	}

	public Long getCp0lappl() {
		return cp0lappl;
	}

	public void setCp0lappl(Long cp0lappl) {
		this.cp0lappl = cp0lappl;
	}

	public int getCmaqnses() {
		return cmaqnses;
	}

	public void setCmaqnses(int cmaqnses) {
		this.cmaqnses = cmaqnses;
	}

	public Long getCmaqnmov() {
		return cmaqnmov;
	}

	public void setCmaqnmov(Long cmaqnmov) {
		this.cmaqnmov = cmaqnmov;
	}

	public Long getCm0ltmov() {
		return cm0ltmov;
	}

	public void setCm0ltmov(Long cm0ltmov) {
		this.cm0ltmov = cm0ltmov;
	}

	public String getCmamcrts() {
		return cmamcrts;
	}

	public void setCmamcrts(String cmamcrts) {
		this.cmamcrts = cmamcrts;
	}

	public String getCmamntar() {
		return cmamntar;
	}

	public void setCmamntar(String cmamntar) {
		this.cmamntar = cmamntar;
	}

	public String getCmamproc() {
		return cmamproc;
	}

	public void setCmamproc(String cmamproc) {
		this.cmamproc = cmamproc;
	}

	public String getCmamimso() {
		return cmamimso;
	}

	public void setCmamimso(String cmamimso) {
		this.cmamimso = cmamimso;
	}

	public String getCmammonc() {
		return cmammonc;
	}

	public void setCmammonc(String cmammonc) {
		this.cmammonc = cmammonc;
	}

	public String getCmammone() {
		return cmammone;
	}

	public void setCmammone(String cmammone) {
		this.cmammone = cmammone;
	}

	public String getCmamcadu() {
		return cmamcadu;
	}

	public void setCmamcadu(String cmamcadu) {
		this.cmamcadu = cmamcadu;
	}

	public String getCmamacti() {
		return cmamacti;
	}

	public void setCmamacti(String cmamacti) {
		this.cmamacti = cmamacti;
	}

	public String getCmamdtps() {
		return cmamdtps;
	}

	public void setCmamdtps(String cmamdtps) {
		this.cmamdtps = cmamdtps;
	}

	public String getCmamfunc() {
		return cmamfunc;
	}

	public void setCmamfunc(String cmamfunc) {
		this.cmamfunc = cmamfunc;
	}

	public String getCmamrazo() {
		return cmamrazo;
	}

	public void setCmamrazo(String cmamrazo) {
		this.cmamrazo = cmamrazo;
	}

	public String getCmamclsr() {
		return cmamclsr;
	}

	public void setCmamclsr(String cmamclsr) {
		this.cmamclsr = cmamclsr;
	}

	public String getCmamlgau() {
		return cmamlgau;
	}

	public void setCmamlgau(String cmamlgau) {
		this.cmamlgau = cmamlgau;
	}

	public String getCmamsead() {
		return cmamsead;
	}

	public void setCmamsead(String cmamsead) {
		this.cmamsead = cmamsead;
	}

	public String getCmamsere() {
		return cmamsere;
	}

	public void setCmamsere(String cmamsere) {
		this.cmamsere = cmamsere;
	}

	public String getCmamcoad() {
		return cmamcoad;
	}

	public void setCmamcoad(String cmamcoad) {
		this.cmamcoad = cmamcoad;
	}

	public String getCmamcore() {
		return cmamcore;
	}

	public void setCmamcore(String cmamcore) {
		this.cmamcore = cmamcore;
	}

	public String getCmamimor() {
		return cmamimor;
	}

	public void setCmamimor(String cmamimor) {
		this.cmamimor = cmamimor;
	}

	public String getCmamimco() {
		return cmamimco;
	}

	public void setCmamimco(String cmamimco) {
		this.cmamimco = cmamimco;
	}

	public String getCmamdtp2() {
		return cmamdtp2;
	}

	public void setCmamdtp2(String cmamdtp2) {
		this.cmamdtp2 = cmamdtp2;
	}

	public String getCmamrefe() {
		return cmamrefe;
	}

	public void setCmamrefe(String cmamrefe) {
		this.cmamrefe = cmamrefe;
	}

	public String getCmamnaut() {
		return cmamnaut;
	}

	public void setCmamnaut(String cmamnaut) {
		this.cmamnaut = cmamnaut;
	}

	public String getCmamacad() {
		return cmamacad;
	}

	public void setCmamacad(String cmamacad) {
		this.cmamacad = cmamacad;
	}

	public String getCmamacre() {
		return cmamacre;
	}

	public void setCmamacre(String cmamacre) {
		this.cmamacre = cmamacre;
	}

	public String getCmamcsrv() {
		return cmamcsrv;
	}

	public void setCmamcsrv(String cmamcsrv) {
		this.cmamcsrv = cmamcsrv;
	}

	public String getCmamcome() {
		return cmamcome;
	}

	public void setCmamcome(String cmamcome) {
		this.cmamcome = cmamcome;
	}

	public String getCmamdomi() {
		return cmamdomi;
	}

	public void setCmamdomi(String cmamdomi) {
		this.cmamdomi = cmamdomi;
	}

	public String getCmamdtad() {
		return cmamdtad;
	}

	public void setCmamdtad(String cmamdtad) {
		this.cmamdtad = cmamdtad;
	}

	public String getCmamcutr() {
		return cmamcutr;
	}

	public void setCmamcutr(String cmamcutr) {
		this.cmamcutr = cmamcutr;
	}

	public String getCmamoffs() {
		return cmamoffs;
	}

	public void setCmamoffs(String cmamoffs) {
		this.cmamoffs = cmamoffs;
	}

	public String getCmamidio() {
		return cmamidio;
	}

	public void setCmamidio(String cmamidio) {
		this.cmamidio = cmamidio;
	}

	public String getCmamnoff() {
		return cmamnoff;
	}

	public void setCmamnoff(String cmamnoff) {
		this.cmamnoff = cmamnoff;
	}

	public String getCmamnidi() {
		return cmamnidi;
	}

	public void setCmamnidi(String cmamnidi) {
		this.cmamnidi = cmamnidi;
	}

	public String getCmamsald() {
		return cmamsald;
	}

	public void setCmamsald(String cmamsald) {
		this.cmamsald = cmamsald;
	}

	public String getCmamulmv() {
		return cmamulmv;
	}

	public void setCmamulmv(String cmamulmv) {
		this.cmamulmv = cmamulmv;
	}

	public String getCmamcvva() {
		return cmamcvva;
	}

	public void setCmamcvva(String cmamcvva) {
		this.cmamcvva = cmamcvva;
	}

	public String getCmamterm() {
		return cmamterm;
	}

	public void setCmamterm(String cmamterm) {
		this.cmamterm = cmamterm;
	}

	public String getCmamenvi() {
		return cmamenvi;
	}

	public void setCmamenvi(String cmamenvi) {
		this.cmamenvi = cmamenvi;
	}

	public String getCmampvv() {
		return cmampvv;
	}

	public void setCmampvv(String cmampvv) {
		this.cmampvv = cmampvv;
	}

	public String getCmambloq() {
		return cmambloq;
	}

	public void setCmambloq(String cmambloq) {
		this.cmambloq = cmambloq;
	}

	public String getCmammona() {
		return cmammona;
	}

	public void setCmammona(String cmammona) {
		this.cmammona = cmammona;
	}

	public String getCmamcifa() {
		return cmamcifa;
	}

	public void setCmamcifa(String cmamcifa) {
		this.cmamcifa = cmamcifa;
	}

	public String getCmamcifr() {
		return cmamcifr;
	}

	public void setCmamcifr(String cmamcifr) {
		this.cmamcifr = cmamcifr;
	}

	public String getCmamsega() {
		return cmamsega;
	}

	public void setCmamsega(String cmamsega) {
		this.cmamsega = cmamsega;
	}

	public String getCmamsegr() {
		return cmamsegr;
	}

	public void setCmamsegr(String cmamsegr) {
		this.cmamsegr = cmamsegr;
	}

	public String getCmamdtor() {
		return cmamdtor;
	}

	public void setCmamdtor(String cmamdtor) {
		this.cmamdtor = cmamdtor;
	}

	public String getCmamidau() {
		return cmamidau;
	}

	public void setCmamidau(String cmamidau) {
		this.cmamidau = cmamidau;
	}

	public String getCmammaca() {
		return cmammaca;
	}

	public void setCmammaca(String cmammaca) {
		this.cmammaca = cmammaca;
	}

	public String getCmammacr() {
		return cmammacr;
	}

	public void setCmammacr(String cmammacr) {
		this.cmammacr = cmammacr;
	}

	public String getCmamensa() {
		return cmamensa;
	}

	public void setCmamensa(String cmamensa) {
		this.cmamensa = cmamensa;
	}

	public String getCmamensm() {
		return cmamensm;
	}

	public void setCmamensm(String cmamensm) {
		this.cmamensm = cmamensm;
	}

	public String getCmamensr() {
		return cmamensr;
	}

	public void setCmamensr(String cmamensr) {
		this.cmamensr = cmamensr;
	}

	public String getCmamdtpf() {
		return cmamdtpf;
	}

	public void setCmamdtpf(String cmamdtpf) {
		this.cmamdtpf = cmamdtpf;
	}

	public String getCmamdtpr() {
		return cmamdtpr;
	}

	public void setCmamdtpr(String cmamdtpr) {
		this.cmamdtpr = cmamdtpr;
	}

	public String getCmamdtvr() {
		return cmamdtvr;
	}

	public void setCmamdtvr(String cmamdtvr) {
		this.cmamdtvr = cmamdtvr;
	}

	public String getCmavnulo() {
		return cmavnulo;
	}

	public void setCmavnulo(String cmavnulo) {
		this.cmavnulo = cmavnulo;
	}

	public int getC0dlcier() {
		return c0dlcier;
	}

	public void setC0dlcier(int c0dlcier) {
		this.c0dlcier = c0dlcier;
	}

	public Long getCmaptran() {
		return cmaptran;
	}

	public void setCmaptran(Long cmaptran) {
		this.cmaptran = cmaptran;
	}

	public int getCmaqidtr() {
		return cmaqidtr;
	}

	public void setCmaqidtr(int cmaqidtr) {
		this.cmaqidtr = cmaqidtr;
	}

	public Long getCmalmens() {
		return cmalmens;
	}

	public void setCmalmens(Long cmalmens) {
		this.cmalmens = cmalmens;
	}

	public Long getCa3llpan() {
		return ca3llpan;
	}

	public void setCa3llpan(Long ca3llpan) {
		this.ca3llpan = ca3llpan;
	}

	public String getCmactarj() {
		return cmactarj;
	}

	public void setCmactarj(String cmactarj) {
		this.cmactarj = cmactarj;
	}

	public Long getCm2ltrsp() {
		return cm2ltrsp;
	}

	public void setCm2ltrsp(Long cm2ltrsp) {
		this.cm2ltrsp = cm2ltrsp;
	}

	public Long getCm3ltcta() {
		return cm3ltcta;
	}

	public void setCm3ltcta(Long cm3ltcta) {
		this.cm3ltcta = cm3ltcta;
	}

	public Long getCm3qnulo() {
		return cm3qnulo;
	}

	public void setCm3qnulo(Long cm3qnulo) {
		this.cm3qnulo = cm3qnulo;
	}

	public Long getCmajimad() {
		return cmajimad;
	}

	public void setCmajimad(Long cmajimad) {
		this.cmajimad = cmajimad;
	}

	public Long getCmajimco() {
		return cmajimco;
	}

	public void setCmajimco(Long cmajimco) {
		this.cmajimco = cmajimco;
	}

	public int getCmaicamc() {
		return cmaicamc;
	}

	public void setCmaicamc(int cmaicamc) {
		this.cmaicamc = cmaicamc;
	}

	public Long getCe0lmon2() {
		return ce0lmon2;
	}

	public void setCe0lmon2(Long ce0lmon2) {
		this.ce0lmon2 = ce0lmon2;
	}

	public Long getCmajimti() {
		return cmajimti;
	}

	public void setCmajimti(Long cmajimti) {
		this.cmajimti = cmajimti;
	}

	public int getCmaicamb() {
		return cmaicamb;
	}

	public void setCmaicamb(int cmaicamb) {
		this.cmaicamb = cmaicamb;
	}

	public Long getCe0lmone() {
		return ce0lmone;
	}

	public void setCe0lmone(Long ce0lmone) {
		this.ce0lmone = ce0lmone;
	}

	public Long getCmafcadu() {
		return cmafcadu;
	}

	public void setCmafcadu(Long cmafcadu) {
		this.cmafcadu = cmafcadu;
	}

	public Long getC41lacti() {
		return c41lacti;
	}

	public void setC41lacti(Long c41lacti) {
		this.c41lacti = c41lacti;
	}

	public String getC3hccate() {
		return c3hccate;
	}

	public void setC3hccate(String c3hccate) {
		this.c3hccate = c3hccate;
	}

	public String getC2kcautt() {
		return c2kcautt;
	}

	public void setC2kcautt(String c2kcautt) {
		this.c2kcautt = c2kcautt;
	}

	public String getC2jcreta() {
		return c2jcreta;
	}

	public void setC2jcreta(String c2jcreta) {
		this.c2jcreta = c2jcreta;
	}

	public String getC2hcento() {
		return c2hcento;
	}

	public void setC2hcento(String c2hcento) {
		this.c2hcento = c2hcento;
	}

	public String getC3icprcl() {
		return c3icprcl;
	}

	public void setC3icprcl(String c3icprcl) {
		this.c3icprcl = c3icprcl;
	}

	public String getC3jcprtj() {
		return c3jcprtj;
	}

	public void setC3jcprtj(String c3jcprtj) {
		this.c3jcprtj = c3jcprtj;
	}

	public String getC2lccedt() {
		return c2lccedt;
	}

	public void setC2lccedt(String c2lccedt) {
		this.c2lccedt = c2lccedt;
	}

	public String getC3kcaumo() {
		return c3kcaumo;
	}

	public void setC3kcaumo(String c3kcaumo) {
		this.c3kcaumo = c3kcaumo;
	}

	public String getC3lcaudi() {
		return c3lcaudi;
	}

	public void setC3lcaudi(String c3lcaudi) {
		this.c3lcaudi = c3lcaudi;
	}

	public String getC3mcauda() {
		return c3mcauda;
	}

	public void setC3mcauda(String c3mcauda) {
		this.c3mcauda = c3mcauda;
	}

	public String getC3ncseda() {
		return c3ncseda;
	}

	public void setC3ncseda(String c3ncseda) {
		this.c3ncseda = c3ncseda;
	}

	public String getC2iccapp() {
		return c2iccapp;
	}

	public void setC2iccapp(String c2iccapp) {
		this.c2iccapp = c2iccapp;
	}

	public Long getCm4lfmen() {
		return cm4lfmen;
	}

	public void setCm4lfmen(Long cm4lfmen) {
		this.cm4lfmen = cm4lfmen;
	}

	public Long getCm5lrazm() {
		return cm5lrazm;
	}

	public void setCm5lrazm(Long cm5lrazm) {
		this.cm5lrazm = cm5lrazm;
	}

	public Long getC42lclsr() {
		return c42lclsr;
	}

	public void setC42lclsr(Long c42lclsr) {
		this.c42lclsr = c42lclsr;
	}

	public Long getCmailgau() {
		return cmailgau;
	}

	public void setCmailgau(Long cmailgau) {
		this.cmailgau = cmailgau;
	}

	public int getCmaqsead() {
		return cmaqsead;
	}

	public void setCmaqsead(int cmaqsead) {
		this.cmaqsead = cmaqsead;
	}

	public int getCmaqsere() {
		return cmaqsere;
	}

	public void setCmaqsere(int cmaqsere) {
		this.cmaqsere = cmaqsere;
	}

	public Long getCmalcoad() {
		return cmalcoad;
	}

	public void setCmalcoad(Long cmalcoad) {
		this.cmalcoad = cmalcoad;
	}

	public Long getCmalcore() {
		return cmalcore;
	}

	public void setCmalcore(Long cmalcore) {
		this.cmalcore = cmalcore;
	}

	public Long getCmajimor() {
		return cmajimor;
	}

	public void setCmajimor(Long cmajimor) {
		this.cmajimor = cmajimor;
	}

	public Long getCmajimoc() {
		return cmajimoc;
	}

	public void setCmajimoc(Long cmajimoc) {
		this.cmajimoc = cmajimoc;
	}

	public Long getCmailgp2() {
		return cmailgp2;
	}

	public void setCmailgp2(Long cmailgp2) {
		this.cmailgp2 = cmailgp2;
	}

	public String getCmavdtp2() {
		return cmavdtp2;
	}

	public void setCmavdtp2(String cmavdtp2) {
		this.cmavdtp2 = cmavdtp2;
	}

	public String getCmacrefe() {
		return cmacrefe;
	}

	public void setCmacrefe(String cmacrefe) {
		this.cmacrefe = cmacrefe;
	}

	public String getCmavnaut() {
		return cmavnaut;
	}

	public void setCmavnaut(String cmavnaut) {
		this.cmavnaut = cmavnaut;
	}

	public Long getCm1lresp() {
		return cm1lresp;
	}

	public void setCm1lresp(Long cm1lresp) {
		this.cm1lresp = cm1lresp;
	}

	public Long getCm1lres1() {
		return cm1lres1;
	}

	public void setCm1lres1(Long cm1lres1) {
		this.cm1lres1 = cm1lres1;
	}

	public Long getCa5lsrtj() {
		return ca5lsrtj;
	}

	public void setCa5lsrtj(Long ca5lsrtj) {
		this.ca5lsrtj = ca5lsrtj;
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

	public String getC43nredu() {
		return c43nredu;
	}

	public void setC43nredu(String c43nredu) {
		this.c43nredu = c43nredu;
	}

	public String getC43aloca() {
		return c43aloca;
	}

	public void setC43aloca(String c43aloca) {
		this.c43aloca = c43aloca;
	}

	public String getC86calf2() {
		return c86calf2;
	}

	public void setC86calf2(String c86calf2) {
		this.c86calf2 = c86calf2;
	}

	public String getCmavdtad() {
		return cmavdtad;
	}

	public void setCmavdtad(String cmavdtad) {
		this.cmavdtad = cmavdtad;
	}

	public Long getCmaltcu1() {
		return cmaltcu1;
	}

	public void setCmaltcu1(Long cmaltcu1) {
		this.cmaltcu1 = cmaltcu1;
	}

	public int getCmajcuo1() {
		return cmajcuo1;
	}

	public void setCmajcuo1(int cmajcuo1) {
		this.cmajcuo1 = cmajcuo1;
	}

	public Long getCmaltcu2() {
		return cmaltcu2;
	}

	public void setCmaltcu2(Long cmaltcu2) {
		this.cmaltcu2 = cmaltcu2;
	}

	public int getCmajcuo2() {
		return cmajcuo2;
	}

	public void setCmajcuo2(int cmajcuo2) {
		this.cmajcuo2 = cmajcuo2;
	}

	public Long getCmaltcu3() {
		return cmaltcu3;
	}

	public void setCmaltcu3(Long cmaltcu3) {
		this.cmaltcu3 = cmaltcu3;
	}

	public int getCmajcuo3() {
		return cmajcuo3;
	}

	public void setCmajcuo3(int cmajcuo3) {
		this.cmajcuo3 = cmajcuo3;
	}

	public Long getCmaltcu4() {
		return cmaltcu4;
	}

	public void setCmaltcu4(Long cmaltcu4) {
		this.cmaltcu4 = cmaltcu4;
	}

	public int getCmajcuo4() {
		return cmajcuo4;
	}

	public void setCmajcuo4(int cmajcuo4) {
		this.cmajcuo4 = cmajcuo4;
	}

	public Long getCmaqoffs() {
		return cmaqoffs;
	}

	public void setCmaqoffs(Long cmaqoffs) {
		this.cmaqoffs = cmaqoffs;
	}

	public Long getCmalidio() {
		return cmalidio;
	}

	public void setCmalidio(Long cmalidio) {
		this.cmalidio = cmalidio;
	}

	public Long getCmaqoffn() {
		return cmaqoffn;
	}

	public void setCmaqoffn(Long cmaqoffn) {
		this.cmaqoffn = cmaqoffn;
	}

	public Long getCmalidin() {
		return cmalidin;
	}

	public void setCmalidin(Long cmalidin) {
		this.cmalidin = cmalidin;
	}

	public Long getCmalsald() {
		return cmalsald;
	}

	public void setCmalsald(Long cmalsald) {
		this.cmalsald = cmalsald;
	}

	public Long getCmaidicr() {
		return cmaidicr;
	}

	public void setCmaidicr(Long cmaidicr) {
		this.cmaidicr = cmaidicr;
	}

	public Long getCmaididb() {
		return cmaididb;
	}

	public void setCmaididb(Long cmaididb) {
		this.cmaididb = cmaididb;
	}

	public Long getCmaididi() {
		return cmaididi;
	}

	public void setCmaididi(Long cmaididi) {
		this.cmaididi = cmaididi;
	}

	public int getCmafmov1() {
		return cmafmov1;
	}

	public void setCmafmov1(int cmafmov1) {
		this.cmafmov1 = cmafmov1;
	}

	public Long getCmajmov1() {
		return cmajmov1;
	}

	public void setCmajmov1(Long cmajmov1) {
		this.cmajmov1 = cmajmov1;
	}

	public Long getCmalmov1() {
		return cmalmov1;
	}

	public void setCmalmov1(Long cmalmov1) {
		this.cmalmov1 = cmalmov1;
	}

	public int getCmafmov2() {
		return cmafmov2;
	}

	public void setCmafmov2(int cmafmov2) {
		this.cmafmov2 = cmafmov2;
	}

	public Long getCmajmov2() {
		return cmajmov2;
	}

	public void setCmajmov2(Long cmajmov2) {
		this.cmajmov2 = cmajmov2;
	}

	public Long getCmalmov2() {
		return cmalmov2;
	}

	public void setCmalmov2(Long cmalmov2) {
		this.cmalmov2 = cmalmov2;
	}

	public int getCmafmov3() {
		return cmafmov3;
	}

	public void setCmafmov3(int cmafmov3) {
		this.cmafmov3 = cmafmov3;
	}

	public Long getCmajmov3() {
		return cmajmov3;
	}

	public void setCmajmov3(Long cmajmov3) {
		this.cmajmov3 = cmajmov3;
	}

	public Long getCmalmov3() {
		return cmalmov3;
	}

	public void setCmalmov3(Long cmalmov3) {
		this.cmalmov3 = cmalmov3;
	}

	public int getCmafmov4() {
		return cmafmov4;
	}

	public void setCmafmov4(int cmafmov4) {
		this.cmafmov4 = cmafmov4;
	}

	public Long getCmajmov4() {
		return cmajmov4;
	}

	public void setCmajmov4(Long cmajmov4) {
		this.cmajmov4 = cmajmov4;
	}

	public Long getCmalmov4() {
		return cmalmov4;
	}

	public void setCmalmov4(Long cmalmov4) {
		this.cmalmov4 = cmalmov4;
	}

	public int getCmafmov5() {
		return cmafmov5;
	}

	public void setCmafmov5(int cmafmov5) {
		this.cmafmov5 = cmafmov5;
	}

	public Long getCmajmov5() {
		return cmajmov5;
	}

	public void setCmajmov5(Long cmajmov5) {
		this.cmajmov5 = cmajmov5;
	}

	public Long getCmalmov5() {
		return cmalmov5;
	}

	public void setCmalmov5(Long cmalmov5) {
		this.cmalmov5 = cmalmov5;
	}

	public int getCmafmov6() {
		return cmafmov6;
	}

	public void setCmafmov6(int cmafmov6) {
		this.cmafmov6 = cmafmov6;
	}

	public Long getCmajmov6() {
		return cmajmov6;
	}

	public void setCmajmov6(Long cmajmov6) {
		this.cmajmov6 = cmajmov6;
	}

	public Long getCmalmov6() {
		return cmalmov6;
	}

	public void setCmalmov6(Long cmalmov6) {
		this.cmalmov6 = cmalmov6;
	}

	public String getCmavcvv() {
		return cmavcvv;
	}

	public void setCmavcvv(String cmavcvv) {
		this.cmavcvv = cmavcvv;
	}

	public String getCmaccaje() {
		return cmaccaje;
	}

	public void setCmaccaje(String cmaccaje) {
		this.cmaccaje = cmaccaje;
	}

	public Long getCmalenvi() {
		return cmalenvi;
	}

	public void setCmalenvi(Long cmalenvi) {
		this.cmalenvi = cmalenvi;
	}

	public int getCmaqpvv() {
		return cmaqpvv;
	}

	public void setCmaqpvv(int cmaqpvv) {
		this.cmaqpvv = cmaqpvv;
	}

	public Long getCmaqbloq() {
		return cmaqbloq;
	}

	public void setCmaqbloq(Long cmaqbloq) {
		this.cmaqbloq = cmaqbloq;
	}

	public Long getCe0lmon1() {
		return ce0lmon1;
	}

	public void setCe0lmon1(Long ce0lmon1) {
		this.ce0lmon1 = ce0lmon1;
	}

	public String getCmavcfad() {
		return cmavcfad;
	}

	public void setCmavcfad(String cmavcfad) {
		this.cmavcfad = cmavcfad;
	}

	public String getCmavcfre() {
		return cmavcfre;
	}

	public void setCmavcfre(String cmavcfre) {
		this.cmavcfre = cmavcfre;
	}

	public Long getCx0lfseg() {
		return cx0lfseg;
	}

	public void setCx0lfseg(Long cx0lfseg) {
		this.cx0lfseg = cx0lfseg;
	}

	public Long getCx0lalgo() {
		return cx0lalgo;
	}

	public void setCx0lalgo(Long cx0lalgo) {
		this.cx0lalgo = cx0lalgo;
	}

	public Long getCx0lfblq() {
		return cx0lfblq;
	}

	public void setCx0lfblq(Long cx0lfblq) {
		this.cx0lfblq = cx0lfblq;
	}

	public Long getCx0lzpin() {
		return cx0lzpin;
	}

	public void setCx0lzpin(Long cx0lzpin) {
		this.cx0lzpin = cx0lzpin;
	}

	public Long getCx0lzmac() {
		return cx0lzmac;
	}

	public void setCx0lzmac(Long cx0lzmac) {
		this.cx0lzmac = cx0lzmac;
	}

	public Long getCx0lfse1() {
		return cx0lfse1;
	}

	public void setCx0lfse1(Long cx0lfse1) {
		this.cx0lfse1 = cx0lfse1;
	}

	public Long getCx0lalg1() {
		return cx0lalg1;
	}

	public void setCx0lalg1(Long cx0lalg1) {
		this.cx0lalg1 = cx0lalg1;
	}

	public Long getCx0lfbl1() {
		return cx0lfbl1;
	}

	public void setCx0lfbl1(Long cx0lfbl1) {
		this.cx0lfbl1 = cx0lfbl1;
	}

	public Long getCx0lzpi1() {
		return cx0lzpi1;
	}

	public void setCx0lzpi1(Long cx0lzpi1) {
		this.cx0lzpi1 = cx0lzpi1;
	}

	public Long getCx0lzma1() {
		return cx0lzma1;
	}

	public void setCx0lzma1(Long cx0lzma1) {
		this.cx0lzma1 = cx0lzma1;
	}

	public int getC0dlcie1() {
		return c0dlcie1;
	}

	public void setC0dlcie1(int c0dlcie1) {
		this.c0dlcie1 = c0dlcie1;
	}

	public Long getCmaptrao() {
		return cmaptrao;
	}

	public void setCmaptrao(Long cmaptrao) {
		this.cmaptrao = cmaptrao;
	}

	public int getCmaqidto() {
		return cmaqidto;
	}

	public void setCmaqidto(int cmaqidto) {
		this.cmaqidto = cmaqidto;
	}

	public Long getCmalmeno() {
		return cmalmeno;
	}

	public void setCmalmeno(Long cmalmeno) {
		this.cmalmeno = cmalmeno;
	}

	public int getC0dlcie2() {
		return c0dlcie2;
	}

	public void setC0dlcie2(int c0dlcie2) {
		this.c0dlcie2 = c0dlcie2;
	}

	public String getCmacmaca() {
		return cmacmaca;
	}

	public void setCmacmaca(String cmacmaca) {
		this.cmacmaca = cmacmaca;
	}

	public String getCmacmacr() {
		return cmacmacr;
	}

	public void setCmacmacr(String cmacmacr) {
		this.cmacmacr = cmacmacr;
	}

	public Calendar getCmapmvea() {
		return cmapmvea;
	}

	public void setCmapmvea(Calendar cmapmvea) {
		this.cmapmvea = cmapmvea;
	}

	public Calendar getCmapmvsa() {
		return cmapmvsa;
	}

	public void setCmapmvsa(Calendar cmapmvsa) {
		this.cmapmvsa = cmapmvsa;
	}

	public Calendar getCmapmvem() {
		return cmapmvem;
	}

	public void setCmapmvem(Calendar cmapmvem) {
		this.cmapmvem = cmapmvem;
	}

	public Calendar getCmapmvsm() {
		return cmapmvsm;
	}

	public void setCmapmvsm(Calendar cmapmvsm) {
		this.cmapmvsm = cmapmvsm;
	}

	public Calendar getCmapmver() {
		return cmapmver;
	}

	public void setCmapmver(Calendar cmapmver) {
		this.cmapmver = cmapmver;
	}

	public Calendar getCmapmvsr() {
		return cmapmvsr;
	}

	public void setCmapmvsr(Calendar cmapmvsr) {
		this.cmapmvsr = cmapmvsr;
	}

	public Long getCmailgpf() {
		return cmailgpf;
	}

	public void setCmailgpf(Long cmailgpf) {
		this.cmailgpf = cmailgpf;
	}

	public String getCmavdtpf() {
		return cmavdtpf;
	}

	public void setCmavdtpf(String cmavdtpf) {
		this.cmavdtpf = cmavdtpf;
	}

	public String getCmavespr() {
		return cmavespr;
	}

	public void setCmavespr(String cmavespr) {
		this.cmavespr = cmavespr;
	}

	public int getC0dlcie3() {
		return c0dlcie3;
	}

	public void setC0dlcie3(int c0dlcie3) {
		this.c0dlcie3 = c0dlcie3;
	}

	public int getC0dlcie4() {
		return c0dlcie4;
	}

	public void setC0dlcie4(int c0dlcie4) {
		this.c0dlcie4 = c0dlcie4;
	}

	public String getCmamcsln() {
		return cmamcsln;
	}

	public void setCmamcsln(String cmamcsln) {
		this.cmamcsln = cmamcsln;
	}

	public String getCmamvfcv() {
		return cmamvfcv;
	}

	public void setCmamvfcv(String cmamvfcv) {
		this.cmamvfcv = cmamvfcv;
	}

	public String getCmamvfpi() {
		return cmamvfpi;
	}

	public void setCmamvfpi(String cmamvfpi) {
		this.cmamvfpi = cmamvfpi;
	}

	public String getCmamresl() {
		return cmamresl;
	}

	public void setCmamresl(String cmamresl) {
		this.cmamresl = cmamresl;
	}

	public String getCmamcrdb() {
		return cmamcrdb;
	}

	public void setCmamcrdb(String cmamcrdb) {
		this.cmamcrdb = cmamcrdb;
	}

	public String getCmavproc() {
		return cmavproc;
	}

	public void setCmavproc(String cmavproc) {
		this.cmavproc = cmavproc;
	}

	public String getCmamieba() {
		return cmamieba;
	}

	public void setCmamieba(String cmamieba) {
		this.cmamieba = cmamieba;
	}

	public String getCmamiebr() {
		return cmamiebr;
	}

	public void setCmamiebr(String cmamiebr) {
		this.cmamiebr = cmamiebr;
	}

	public String getCmamreso() {
		return cmamreso;
	}

	public void setCmamreso(String cmamreso) {
		this.cmamreso = cmamreso;
	}

	public String getC0cctemi() {
		return c0cctemi;
	}

	public void setC0cctemi(String c0cctemi) {
		this.c0cctemi = c0cctemi;
	}

	public Long getCa1lttar() {
		return ca1lttar;
	}

	public void setCa1lttar(Long ca1lttar) {
		this.ca1lttar = ca1lttar;
	}

	public int getC0dlcie5() {
		return c0dlcie5;
	}

	public void setC0dlcie5(int c0dlcie5) {
		this.c0dlcie5 = c0dlcie5;
	}

	public String getCmamidpr() {
		return cmamidpr;
	}

	public void setCmamidpr(String cmamidpr) {
		this.cmamidpr = cmamidpr;
	}

	public String getCmamconx() {
		return cmamconx;
	}

	public void setCmamconx(String cmamconx) {
		this.cmamconx = cmamconx;
	}

	public Long getCmalcsbm() {
		return cmalcsbm;
	}

	public void setCmalcsbm(Long cmalcsbm) {
		this.cmalcsbm = cmalcsbm;
	}

	public Long getCmalcsbc() {
		return cmalcsbc;
	}

	public void setCmalcsbc(Long cmalcsbc) {
		this.cmalcsbc = cmalcsbc;
	}

	public String getCmamp11b() {
		return cmamp11b;
	}

	public void setCmamp11b(String cmamp11b) {
		this.cmamp11b = cmamp11b;
	}

	public int getCmaqidtb() {
		return cmaqidtb;
	}

	public void setCmaqidtb(int cmaqidtb) {
		this.cmaqidtb = cmaqidtb;
	}

	public String getCmamp03b() {
		return cmamp03b;
	}

	public void setCmamp03b(String cmamp03b) {
		this.cmamp03b = cmamp03b;
	}

	public String getCmactcue() {
		return cmactcue;
	}

	public void setCmactcue(String cmactcue) {
		this.cmactcue = cmactcue;
	}

	public String getCmamp28m() {
		return cmamp28m;
	}

	public void setCmamp28m(String cmamp28m) {
		this.cmamp28m = cmamp28m;
	}

	public int getCmaqseme() {
		return cmaqseme;
	}

	public void setCmaqseme(int cmaqseme) {
		this.cmaqseme = cmaqseme;
	}

	public String getCmamp29b() {
		return cmamp29b;
	}

	public void setCmamp29b(String cmamp29b) {
		this.cmamp29b = cmamp29b;
	}

	public Long getCmalcome() {
		return cmalcome;
	}

	public void setCmalcome(Long cmalcome) {
		this.cmalcome = cmalcome;
	}

	public String getCmamp31() {
		return cmamp31;
	}

	public void setCmamp31(String cmamp31) {
		this.cmamp31 = cmamp31;
	}

	public String getCmacrefs() {
		return cmacrefs;
	}

	public void setCmacrefs(String cmacrefs) {
		this.cmacrefs = cmacrefs;
	}

	public String getCmamp41() {
		return cmamp41;
	}

	public void setCmamp41(String cmamp41) {
		this.cmamp41 = cmamp41;
	}

	public String getCmacterm() {
		return cmacterm;
	}

	public void setCmacterm(String cmacterm) {
		this.cmacterm = cmacterm;
	}

	public String getCmamp44b() {
		return cmamp44b;
	}

	public void setCmamp44b(String cmamp44b) {
		this.cmamp44b = cmamp44b;
	}

	public String getCmavdtac() {
		return cmavdtac;
	}

	public void setCmavdtac(String cmavdtac) {
		this.cmavdtac = cmavdtac;
	}

	public String getCmamp45() {
		return cmamp45;
	}

	public void setCmamp45(String cmamp45) {
		this.cmamp45 = cmamp45;
	}

	public String getCmavdtp1() {
		return cmavdtp1;
	}

	public void setCmavdtp1(String cmavdtp1) {
		this.cmavdtp1 = cmavdtp1;
	}

	public String getCmamp57() {
		return cmamp57;
	}

	public void setCmamp57(String cmamp57) {
		this.cmamp57 = cmamp57;
	}

	public Long getCmaqppau() {
		return cmaqppau;
	}

	public void setCmaqppau(Long cmaqppau) {
		this.cmaqppau = cmaqppau;
	}

	public Long getCmaippau() {
		return cmaippau;
	}

	public void setCmaippau(Long cmaippau) {
		this.cmaippau = cmaippau;
	}

	public String getCmamp62a() {
		return cmamp62a;
	}

	public void setCmamp62a(String cmamp62a) {
		this.cmamp62a = cmamp62a;
	}

	public int getCmafac62() {
		return cmafac62;
	}

	public void setCmafac62(int cmafac62) {
		this.cmafac62 = cmafac62;
	}

	public int getCmaqop62() {
		return cmaqop62;
	}

	public void setCmaqop62(int cmaqop62) {
		this.cmaqop62 = cmaqop62;
	}

	public int getCmaqtr62() {
		return cmaqtr62;
	}

	public void setCmaqtr62(int cmaqtr62) {
		this.cmaqtr62 = cmaqtr62;
	}

	public int getCmajsa62() {
		return cmajsa62;
	}

	public void setCmajsa62(int cmajsa62) {
		this.cmajsa62 = cmajsa62;
	}

	public String getCmacfi62() {
		return cmacfi62;
	}

	public void setCmacfi62(String cmacfi62) {
		this.cmacfi62 = cmacfi62;
	}

	public String getCmacfo62() {
		return cmacfo62;
	}

	public void setCmacfo62(String cmacfo62) {
		this.cmacfo62 = cmacfo62;
	}

	public String getCmamp62b() {
		return cmamp62b;
	}

	public void setCmamp62b(String cmamp62b) {
		this.cmamp62b = cmamp62b;
	}

	public String getCmavca62() {
		return cmavca62;
	}

	public void setCmavca62(String cmavca62) {
		this.cmavca62 = cmavca62;
	}

	public String getCmamp62c() {
		return cmamp62c;
	}

	public void setCmamp62c(String cmamp62c) {
		this.cmamp62c = cmamp62c;
	}

	public String getCmavad62() {
		return cmavad62;
	}

	public void setCmavad62(String cmavad62) {
		this.cmavad62 = cmavad62;
	}

	public String getCmavac62() {
		return cmavac62;
	}

	public void setCmavac62(String cmavac62) {
		this.cmavac62 = cmavac62;
	}

	public String getCmamp62d() {
		return cmamp62d;
	}

	public void setCmamp62d(String cmamp62d) {
		this.cmamp62d = cmamp62d;
	}

	public String getCmavce62() {
		return cmavce62;
	}

	public void setCmavce62(String cmavce62) {
		this.cmavce62 = cmavce62;
	}

	public String getCmavgc62() {
		return cmavgc62;
	}

	public void setCmavgc62(String cmavgc62) {
		this.cmavgc62 = cmavgc62;
	}

	public String getCmamp62e() {
		return cmamp62e;
	}

	public void setCmamp62e(String cmamp62e) {
		this.cmamp62e = cmamp62e;
	}

	public String getCmavcf62() {
		return cmavcf62;
	}

	public void setCmavcf62(String cmavcf62) {
		this.cmavcf62 = cmavcf62;
	}

	public String getCmamp62f() {
		return cmamp62f;
	}

	public void setCmamp62f(String cmamp62f) {
		this.cmamp62f = cmamp62f;
	}

	public String getCmavda62() {
		return cmavda62;
	}

	public void setCmavda62(String cmavda62) {
		this.cmavda62 = cmavda62;
	}

	public String getCmamp62g() {
		return cmamp62g;
	}

	public void setCmamp62g(String cmamp62g) {
		this.cmamp62g = cmamp62g;
	}

	public int getCmaio162() {
		return cmaio162;
	}

	public void setCmaio162(int cmaio162) {
		this.cmaio162 = cmaio162;
	}

	public Long getCmalo162() {
		return cmalo162;
	}

	public void setCmalo162(Long cmalo162) {
		this.cmalo162 = cmalo162;
	}

	public Long getCmajo162() {
		return cmajo162;
	}

	public void setCmajo162(Long cmajo162) {
		this.cmajo162 = cmajo162;
	}

	public int getCmaio262() {
		return cmaio262;
	}

	public void setCmaio262(int cmaio262) {
		this.cmaio262 = cmaio262;
	}

	public Long getCmalo262() {
		return cmalo262;
	}

	public void setCmalo262(Long cmalo262) {
		this.cmalo262 = cmalo262;
	}

	public Long getCmajo262() {
		return cmajo262;
	}

	public void setCmajo262(Long cmajo262) {
		this.cmajo262 = cmajo262;
	}

	public int getCmaio362() {
		return cmaio362;
	}

	public void setCmaio362(int cmaio362) {
		this.cmaio362 = cmaio362;
	}

	public Long getCmalo362() {
		return cmalo362;
	}

	public void setCmalo362(Long cmalo362) {
		this.cmalo362 = cmalo362;
	}

	public Long getCmajo362() {
		return cmajo362;
	}

	public void setCmajo362(Long cmajo362) {
		this.cmajo362 = cmajo362;
	}

	public String getCmamp62h() {
		return cmamp62h;
	}

	public void setCmamp62h(String cmamp62h) {
		this.cmamp62h = cmamp62h;
	}

	public String getCmacis62() {
		return cmacis62;
	}

	public void setCmacis62(String cmacis62) {
		this.cmacis62 = cmacis62;
	}

	public int getCmafas62() {
		return cmafas62;
	}

	public void setCmafas62(int cmafas62) {
		this.cmafas62 = cmafas62;
	}

	public String getCmaval62() {
		return cmaval62;
	}

	public void setCmaval62(String cmaval62) {
		this.cmaval62 = cmaval62;
	}

	public String getCmavvc62() {
		return cmavvc62;
	}

	public void setCmavvc62(String cmavvc62) {
		this.cmavvc62 = cmavvc62;
	}

	public String getCmacif62() {
		return cmacif62;
	}

	public void setCmacif62(String cmacif62) {
		this.cmacif62 = cmacif62;
	}

	public String getCmams95() {
		return cmams95;
	}

	public void setCmams95(String cmams95) {
		this.cmams95 = cmams95;
	}

	public String getCmacrfem() {
		return cmacrfem;
	}

	public void setCmacrfem(String cmacrfem) {
		this.cmacrfem = cmacrfem;
	}

	public String getCmamdpr2() {
		return cmamdpr2;
	}

	public void setCmamdpr2(String cmamdpr2) {
		this.cmamdpr2 = cmamdpr2;
	}

	public String getCmavdpr2() {
		return cmavdpr2;
	}

	public void setCmavdpr2(String cmavdpr2) {
		this.cmavdpr2 = cmavdpr2;
	}

	public String getCmamdtv2() {
		return cmamdtv2;
	}

	public void setCmamdtv2(String cmamdtv2) {
		this.cmamdtv2 = cmamdtv2;
	}

	public String getCmavdtv2() {
		return cmavdtv2;
	}

	public void setCmavdtv2(String cmavdtv2) {
		this.cmavdtv2 = cmavdtv2;
	}

	public String getCmambfra() {
		return cmambfra;
	}

	public void setCmambfra(String cmambfra) {
		this.cmambfra = cmambfra;
	}

	public String getCmamfrau() {
		return cmamfrau;
	}

	public void setCmamfrau(String cmamfrau) {
		this.cmamfrau = cmamfrau;
	}

	public String getCmamcerr() {
		return cmamcerr;
	}

	public void setCmamcerr(String cmamcerr) {
		this.cmamcerr = cmamcerr;
	}

	public String getCmacerro() {
		return cmacerro;
	}

	public void setCmacerro(String cmacerro) {
		this.cmacerro = cmacerro;
	}

	public String getCmamregi() {
		return cmamregi;
	}

	public void setCmamregi(String cmamregi) {
		this.cmamregi = cmamregi;
	}

	public String getCmacrgad() {
		return cmacrgad;
	}

	public void setCmacrgad(String cmacrgad) {
		this.cmacrgad = cmacrgad;
	}

	public String getCmacrgre() {
		return cmacrgre;
	}

	public void setCmacrgre(String cmacrgre) {
		this.cmacrgre = cmacrgre;
	}

	public String getCmampaie() {
		return cmampaie;
	}

	public void setCmampaie(String cmampaie) {
		this.cmampaie = cmampaie;
	}

	public String getC86calf3() {
		return c86calf3;
	}

	public void setC86calf3(String c86calf3) {
		this.c86calf3 = c86calf3;
	}

	public String getCmamdpf2() {
		return cmamdpf2;
	}

	public void setCmamdpf2(String cmamdpf2) {
		this.cmamdpf2 = cmamdpf2;
	}

	public String getCmavdpf2() {
		return cmavdpf2;
	}

	public void setCmavdpf2(String cmavdpf2) {
		this.cmavdpf2 = cmavdpf2;
	}

	public String getCmamdtem() {
		return cmamdtem;
	}

	public void setCmamdtem(String cmamdtem) {
		this.cmamdtem = cmamdtem;
	}

	public String getCmavdtem() {
		return cmavdtem;
	}

	public void setCmavdtem(String cmavdtem) {
		this.cmavdtem = cmavdtem;
	}

	public String getCmammoca() {
		return cmammoca;
	}

	public void setCmammoca(String cmammoca) {
		this.cmammoca = cmammoca;
	}

	public Long getCmajimca() {
		return cmajimca;
	}

	public void setCmajimca(Long cmajimca) {
		this.cmajimca = cmajimca;
	}

	public int getCmaicmca() {
		return cmaicmca;
	}

	public void setCmaicmca(int cmaicmca) {
		this.cmaicmca = cmaicmca;
	}

	public Long getCe0lmon3() {
		return ce0lmon3;
	}

	public void setCe0lmon3(Long ce0lmon3) {
		this.ce0lmon3 = ce0lmon3;
	}

	public String getCmamcupr() {
		return cmamcupr;
	}

	public void setCmamcupr(String cmamcupr) {
		this.cmamcupr = cmamcupr;
	}

	public Long getCmaltcp1() {
		return cmaltcp1;
	}

	public void setCmaltcp1(Long cmaltcp1) {
		this.cmaltcp1 = cmaltcp1;
	}

	public int getCmajcup1() {
		return cmajcup1;
	}

	public void setCmajcup1(int cmajcup1) {
		this.cmajcup1 = cmajcup1;
	}

	public Long getCmaltcp2() {
		return cmaltcp2;
	}

	public void setCmaltcp2(Long cmaltcp2) {
		this.cmaltcp2 = cmaltcp2;
	}

	public int getCmajcup2() {
		return cmajcup2;
	}

	public void setCmajcup2(int cmajcup2) {
		this.cmajcup2 = cmajcup2;
	}

	public Long getCmaltcp3() {
		return cmaltcp3;
	}

	public void setCmaltcp3(Long cmaltcp3) {
		this.cmaltcp3 = cmaltcp3;
	}

	public int getCmajcup3() {
		return cmajcup3;
	}

	public void setCmajcup3(int cmajcup3) {
		this.cmajcup3 = cmajcup3;
	}

	public Long getCmaltcp4() {
		return cmaltcp4;
	}

	public void setCmaltcp4(Long cmaltcp4) {
		this.cmaltcp4 = cmaltcp4;
	}

	public int getCmajcup4() {
		return cmajcup4;
	}

	public void setCmajcup4(int cmajcup4) {
		this.cmajcup4 = cmajcup4;
	}

	public String getCmamp11o() {
		return cmamp11o;
	}

	public void setCmamp11o(String cmamp11o) {
		this.cmamp11o = cmamp11o;
	}

	public int getCmaqidbo() {
		return cmaqidbo;
	}

	public void setCmaqidbo(int cmaqidbo) {
		this.cmaqidbo = cmaqidbo;
	}

	public String getCmam6216() {
		return cmam6216;
	}

	public void setCmam6216(String cmam6216) {
		this.cmam6216 = cmam6216;
	}

	public Long getCa3llpac() {
		return ca3llpac;
	}

	public void setCa3llpac(Long ca3llpac) {
		this.ca3llpac = ca3llpac;
	}

	public String getCmactarc() {
		return cmactarc;
	}

	public void setCmactarc(String cmactarc) {
		this.cmactarc = cmactarc;
	}

	public Long getCmafcadc() {
		return cmafcadc;
	}

	public void setCmafcadc(Long cmafcadc) {
		this.cmafcadc = cmafcadc;
	}

	public Long getCa5lsrtc() {
		return ca5lsrtc;
	}

	public void setCa5lsrtc(Long ca5lsrtc) {
		this.ca5lsrtc = ca5lsrtc;
	}

	public String getCmamdtch() {
		return cmamdtch;
	}

	public void setCmamdtch(String cmamdtch) {
		this.cmamdtch = cmamdtch;
	}

	public int getC0dlcie6() {
		return c0dlcie6;
	}

	public void setC0dlcie6(int c0dlcie6) {
		this.c0dlcie6 = c0dlcie6;
	}

	public Long getCmalcsbe() {
		return cmalcsbe;
	}

	public void setCmalcsbe(Long cmalcsbe) {
		this.cmalcsbe = cmalcsbe;
	}

	public String getCmavdtch() {
		return cmavdtch;
	}

	public void setCmavdtch(String cmavdtch) {
		this.cmavdtch = cmavdtch;
	}

	public String getCmampefr() {
		return cmampefr;
	}

	public void setCmampefr(String cmampefr) {
		this.cmampefr = cmampefr;
	}

	public Long getCmaqpefr() {
		return cmaqpefr;
	}

	public void setCmaqpefr(Long cmaqpefr) {
		this.cmaqpefr = cmaqpefr;
	}

	public String getCmanterm() {
		return cmanterm;
	}

	public void setCmanterm(String cmanterm) {
		this.cmanterm = cmanterm;
	}

	public String getCmamnsec() {
		return cmamnsec;
	}

	public void setCmamnsec(String cmamnsec) {
		this.cmamnsec = cmamnsec;
	}

	public Long getCmaqnsec() {
		return cmaqnsec;
	}

	public void setCmaqnsec(Long cmaqnsec) {
		this.cmaqnsec = cmaqnsec;
	}

	public String getCmamcrpe() {
		return cmamcrpe;
	}

	public void setCmamcrpe(String cmamcrpe) {
		this.cmamcrpe = cmamcrpe;
	}

	public String getCmamcrip() {
		return cmamcrip;
	}

	public void setCmamcrip(String cmamcrip) {
		this.cmamcrip = cmamcrip;
	}

	public String getCmamcrpt() {
		return cmamcrpt;
	}

	public void setCmamcrpt(String cmamcrpt) {
		this.cmamcrpt = cmamcrpt;
	}

	public String getCmamscri() {
		return cmamscri;
	}

	public void setCmamscri(String cmamscri) {
		this.cmamscri = cmamscri;
	}

	public String getCmamecom() {
		return cmamecom;
	}

	public void setCmamecom(String cmamecom) {
		this.cmamecom = cmamecom;
	}

	public String getCmavsetc() {
		return cmavsetc;
	}

	public void setCmavsetc(String cmavsetc) {
		this.cmavsetc = cmavsetc;
	}

	public String getCmavsett() {
		return cmavsett;
	}

	public void setCmavsett(String cmavsett) {
		this.cmavsett = cmavsett;
	}

	public String getCmamiaid() {
		return cmamiaid;
	}

	public void setCmamiaid(String cmamiaid) {
		this.cmamiaid = cmamiaid;
	}

	public String getCmaviaid() {
		return cmaviaid;
	}

	public void setCmaviaid(String cmaviaid) {
		this.cmaviaid = cmaviaid;
	}

	public String getCmamdttj() {
		return cmamdttj;
	}

	public void setCmamdttj(String cmamdttj) {
		this.cmamdttj = cmamdttj;
	}

	public String getCmavdttj() {
		return cmavdttj;
	}

	public void setCmavdttj(String cmavdttj) {
		this.cmavdttj = cmavdttj;
	}

	public String getCmamddtj() {
		return cmamddtj;
	}

	public void setCmamddtj(String cmamddtj) {
		this.cmamddtj = cmamddtj;
	}

	public String getCmavddtj() {
		return cmavddtj;
	}

	public void setCmavddtj(String cmavddtj) {
		this.cmavddtj = cmavddtj;
	}

	public String getCmamddsh() {
		return cmamddsh;
	}

	public void setCmamddsh(String cmamddsh) {
		this.cmamddsh = cmamddsh;
	}

	public String getCmavddsh() {
		return cmavddsh;
	}

	public void setCmavddsh(String cmavddsh) {
		this.cmavddsh = cmavddsh;
	}

	public String getCmamdtsl() {
		return cmamdtsl;
	}

	public void setCmamdtsl(String cmamdtsl) {
		this.cmamdtsl = cmamdtsl;
	}

	public String getCmavdtsl() {
		return cmavdtsl;
	}

	public void setCmavdtsl(String cmavdtsl) {
		this.cmavdtsl = cmavdtsl;
	}

	public String getCmamcrpr() {
		return cmamcrpr;
	}

	public void setCmamcrpr(String cmamcrpr) {
		this.cmamcrpr = cmamcrpr;
	}

	public String getCmavcrpr() {
		return cmavcrpr;
	}

	public void setCmavcrpr(String cmavcrpr) {
		this.cmavcrpr = cmavcrpr;
	}

	public String getCmamdgce() {
		return cmamdgce;
	}

	public void setCmamdgce(String cmamdgce) {
		this.cmamdgce = cmamdgce;
	}

	public String getCmavdgce() {
		return cmavdgce;
	}

	public void setCmavdgce(String cmavdgce) {
		this.cmavdgce = cmavdgce;
	}

	public String getCmamlsam() {
		return cmamlsam;
	}

	public void setCmamlsam(String cmamlsam) {
		this.cmamlsam = cmamlsam;
	}

	public String getCmavlsam() {
		return cmavlsam;
	}

	public void setCmavlsam(String cmavlsam) {
		this.cmavlsam = cmavlsam;
	}

	public String getCmamslem() {
		return cmamslem;
	}

	public void setCmamslem(String cmamslem) {
		this.cmamslem = cmamslem;
	}

	public String getCmavslem() {
		return cmavslem;
	}

	public void setCmavslem(String cmavslem) {
		this.cmavslem = cmavslem;
	}

	public String getCmamcrre() {
		return cmamcrre;
	}

	public void setCmamcrre(String cmamcrre) {
		this.cmamcrre = cmamcrre;
	}

	public String getCmavcrre() {
		return cmavcrre;
	}

	public void setCmavcrre(String cmavcrre) {
		this.cmavcrre = cmavcrre;
	}

	public String getCmamactr() {
		return cmamactr;
	}

	public void setCmamactr(String cmamactr) {
		this.cmamactr = cmamactr;
	}

	public String getCmacactr() {
		return cmacactr;
	}

	public void setCmacactr(String cmacactr) {
		this.cmacactr = cmacactr;
	}

	public String getCmamcmsr() {
		return cmamcmsr;
	}

	public void setCmamcmsr(String cmamcmsr) {
		this.cmamcmsr = cmamcmsr;
	}

	public String getCmamtcsr() {
		return cmamtcsr;
	}

	public void setCmamtcsr(String cmamtcsr) {
		this.cmamtcsr = cmamtcsr;
	}

	public int getCmajcmsr() {
		return cmajcmsr;
	}

	public void setCmajcmsr(int cmajcmsr) {
		this.cmajcmsr = cmajcmsr;
	}

	public Long getCe0lcmsr() {
		return ce0lcmsr;
	}

	public void setCe0lcmsr(Long ce0lcmsr) {
		this.ce0lcmsr = ce0lcmsr;
	}

	public String getCmamdatPrf() {
		return cmamdatPrf;
	}

	public void setCmamdatPrf(String cmamdatPrf) {
		this.cmamdatPrf = cmamdatPrf;
	}

	public String getCmavdatPrf() {
		return cmavdatPrf;
	}

	public void setCmavdatPrf(String cmavdatPrf) {
		this.cmavdatPrf = cmavdatPrf;
	}

	public String getCmamdatPrc() {
		return cmamdatPrc;
	}

	public void setCmamdatPrc(String cmamdatPrc) {
		this.cmamdatPrc = cmamdatPrc;
	}

	public String getCmammoduPrc() {
		return cmammoduPrc;
	}

	public void setCmammoduPrc(String cmammoduPrc) {
		this.cmammoduPrc = cmammoduPrc;
	}

	public int getCmaqtarePrc() {
		return cmaqtarePrc;
	}

	public void setCmaqtarePrc(int cmaqtarePrc) {
		this.cmaqtarePrc = cmaqtarePrc;
	}

	public Long getCe0lladqPrc() {
		return ce0lladqPrc;
	}

	public void setCe0lladqPrc(Long ce0lladqPrc) {
		this.ce0lladqPrc = ce0lladqPrc;
	}

	public Long getCe0llresPrc() {
		return ce0llresPrc;
	}

	public void setCe0llresPrc(Long ce0llresPrc) {
		this.ce0llresPrc = ce0llresPrc;
	}

	public int getCmaqms89Prc() {
		return cmaqms89Prc;
	}

	public void setCmaqms89Prc(int cmaqms89Prc) {
		this.cmaqms89Prc = cmaqms89Prc;
	}

	public int getCmartasaPrc() {
		return cmartasaPrc;
	}

	public void setCmartasaPrc(int cmartasaPrc) {
		this.cmartasaPrc = cmartasaPrc;
	}

	public String getC41ctrmoPrc() {
		return c41ctrmoPrc;
	}

	public void setC41ctrmoPrc(String c41ctrmoPrc) {
		this.c41ctrmoPrc = c41ctrmoPrc;
	}

	public String getC43ccaePrc() {
		return c43ccaePrc;
	}

	public void setC43ccaePrc(String c43ccaePrc) {
		this.c43ccaePrc = c43ccaePrc;
	}

	public String getCmampsusPrc() {
		return cmampsusPrc;
	}

	public void setCmampsusPrc(String cmampsusPrc) {
		this.cmampsusPrc = cmampsusPrc;
	}

	public String getCmamrsprPrc() {
		return cmamrsprPrc;
	}

	public void setCmamrsprPrc(String cmamrsprPrc) {
		this.cmamrsprPrc = cmamrsprPrc;
	}

	public String getCmacrsprPrc() {
		return cmacrsprPrc;
	}

	public void setCmacrsprPrc(String cmacrsprPrc) {
		this.cmacrsprPrc = cmacrsprPrc;
	}

	public String getCmamdatMer() {
		return cmamdatMer;
	}

	public void setCmamdatMer(String cmamdatMer) {
		this.cmamdatMer = cmamdatMer;
	}

	public String getCmacoptvMer() {
		return cmacoptvMer;
	}

	public void setCmacoptvMer(String cmacoptvMer) {
		this.cmacoptvMer = cmacoptvMer;
	}

	public String getCmavdatMer() {
		return cmavdatMer;
	}

	public void setCmavdatMer(String cmavdatMer) {
		this.cmavdatMer = cmavdatMer;
	}

	public String getCmamtpoHsm() {
		return cmamtpoHsm;
	}

	public void setCmamtpoHsm(String cmamtpoHsm) {
		this.cmamtpoHsm = cmamtpoHsm;
	}

	public Long getCmaitaccHsm() {
		return cmaitaccHsm;
	}

	public void setCmaitaccHsm(Long cmaitaccHsm) {
		this.cmaitaccHsm = cmaitaccHsm;
	}

	public int getCmaittotHsm() {
		return cmaittotHsm;
	}

	public void setCmaittotHsm(int cmaittotHsm) {
		this.cmaittotHsm = cmaittotHsm;
	}

	public String getCmaccommHsm() {
		return cmaccommHsm;
	}

	public void setCmaccommHsm(String cmaccommHsm) {
		this.cmaccommHsm = cmaccommHsm;
	}

	public String getCmamdatOnl() {
		return cmamdatOnl;
	}

	public void setCmamdatOnl(String cmamdatOnl) {
		this.cmamdatOnl = cmamdatOnl;
	}

	public String getCmavdatOnl() {
		return cmavdatOnl;
	}

	public void setCmavdatOnl(String cmavdatOnl) {
		this.cmavdatOnl = cmavdatOnl;
	}

	public String getCmamcriPre() {
		return cmamcriPre;
	}

	public void setCmamcriPre(String cmamcriPre) {
		this.cmamcriPre = cmamcriPre;
	}

	public String getCmavcriPre() {
		return cmavcriPre;
	}

	public void setCmavcriPre(String cmavcriPre) {
		this.cmavcriPre = cmavcriPre;
	}

	public String getCmamcriRes() {
		return cmamcriRes;
	}

	public void setCmamcriRes(String cmamcriRes) {
		this.cmamcriRes = cmamcriRes;
	}

	public String getCmavcriRes() {
		return cmavcriRes;
	}

	public void setCmavcriRes(String cmavcriRes) {
		this.cmavcriRes = cmavcriRes;
	}

	public String getCmace8aRes() {
		return cmace8aRes;
	}

	public void setCmace8aRes(String cmace8aRes) {
		this.cmace8aRes = cmace8aRes;
	}

	public String getCmamcriScr() {
		return cmamcriScr;
	}

	public void setCmamcriScr(String cmamcriScr) {
		this.cmamcriScr = cmamcriScr;
	}

	public String getCmacresScr() {
		return cmacresScr;
	}

	public void setCmacresScr(String cmacresScr) {
		this.cmacresScr = cmacresScr;
	}

	public String getCmamopeEsp() {
		return cmamopeEsp;
	}

	public void setCmamopeEsp(String cmamopeEsp) {
		this.cmamopeEsp = cmamopeEsp;
	}

	public String getCmacoptvEsp() {
		return cmacoptvEsp;
	}

	public void setCmacoptvEsp(String cmacoptvEsp) {
		this.cmacoptvEsp = cmacoptvEsp;
	}

	public String getCmavoptvEsp() {
		return cmavoptvEsp;
	}

	public void setCmavoptvEsp(String cmavoptvEsp) {
		this.cmavoptvEsp = cmavoptvEsp;
	}

	public String getCmamprfCom() {
		return cmamprfCom;
	}

	public void setCmamprfCom(String cmamprfCom) {
		this.cmamprfCom = cmamprfCom;
	}

	public String getCmamadccCom() {
		return cmamadccCom;
	}

	public void setCmamadccCom(String cmamadccCom) {
		this.cmamadccCom = cmamadccCom;
	}

	public String getCmampropCom() {
		return cmampropCom;
	}

	public void setCmampropCom(String cmampropCom) {
		this.cmampropCom = cmampropCom;
	}

	public String getCmampreaCom() {
		return cmampreaCom;
	}

	public void setCmampreaCom(String cmampreaCom) {
		this.cmampreaCom = cmampreaCom;
	}

	public String getCmamtaxfCom() {
		return cmamtaxfCom;
	}

	public void setCmamtaxfCom(String cmamtaxfCom) {
		this.cmamtaxfCom = cmamtaxfCom;
	}

	public Long getCe0lliquCom() {
		return ce0lliquCom;
	}

	public void setCe0lliquCom(Long ce0lliquCom) {
		this.ce0lliquCom = ce0lliquCom;
	}

	public String getCmamfdigCom() {
		return cmamfdigCom;
	}

	public void setCmamfdigCom(String cmamfdigCom) {
		this.cmamfdigCom = cmamfdigCom;
	}

	public String getCmamtprvCom() {
		return cmamtprvCom;
	}

	public void setCmamtprvCom(String cmamtprvCom) {
		this.cmamtprvCom = cmamtprvCom;
	}

	public String getCmamdatNtr() {
		return cmamdatNtr;
	}

	public void setCmamdatNtr(String cmamdatNtr) {
		this.cmamdatNtr = cmamdatNtr;
	}

	public String getCmavdatNtr() {
		return cmavdatNtr;
	}

	public void setCmavdatNtr(String cmavdatNtr) {
		this.cmavdatNtr = cmavdatNtr;
	}

	public String getCmamdatIsl() {
		return cmamdatIsl;
	}

	public void setCmamdatIsl(String cmamdatIsl) {
		this.cmamdatIsl = cmamdatIsl;
	}

	public String getCmavdatIsl() {
		return cmavdatIsl;
	}

	public void setCmavdatIsl(String cmavdatIsl) {
		this.cmavdatIsl = cmavdatIsl;
	}

	public String getCmacvvcaPrc() {
		return cmacvvcaPrc;
	}

	public void setCmacvvcaPrc(String cmacvvcaPrc) {
		this.cmacvvcaPrc = cmacvvcaPrc;
	}

	public Long getCmaqvcaPrc() {
		return cmaqvcaPrc;
	}

	public void setCmaqvcaPrc(Long cmaqvcaPrc) {
		this.cmaqvcaPrc = cmaqvcaPrc;
	}

	public Long getC00lcsbaAgr() {
		return c00lcsbaAgr;
	}

	public void setC00lcsbaAgr(Long c00lcsbaAgr) {
		this.c00lcsbaAgr = c00lcsbaAgr;
	}

	public Long getC00qlesq() {
		return c00qlesq;
	}

	public void setC00qlesq(Long c00qlesq) {
		this.c00qlesq = c00qlesq;
	}

	public int getC0dlcie3T01() {
		return c0dlcie3T01;
	}

	public void setC0dlcie3T01(int c0dlcie3t01) {
		c0dlcie3T01 = c0dlcie3t01;
	}

	public String getCmaclynxRes() {
		return cmaclynxRes;
	}

	public void setCmaclynxRes(String cmaclynxRes) {
		this.cmaclynxRes = cmaclynxRes;
	}

	public String getCmamddto() {
		return cmamddto;
	}

	public void setCmamddto(String cmamddto) {
		this.cmamddto = cmamddto;
	}

	public Long getCd1ltdtoSol() {
		return cd1ltdtoSol;
	}

	public void setCd1ltdtoSol(Long cd1ltdtoSol) {
		this.cd1ltdtoSol = cd1ltdtoSol;
	}

	public Long getCa0lmarcSol() {
		return ca0lmarcSol;
	}

	public void setCa0lmarcSol(Long ca0lmarcSol) {
		this.ca0lmarcSol = ca0lmarcSol;
	}

	public Long getC00lcsbSol() {
		return c00lcsbSol;
	}

	public void setC00lcsbSol(Long c00lcsbSol) {
		this.c00lcsbSol = c00lcsbSol;
	}

	public Long getCe2ltdidSol() {
		return ce2ltdidSol;
	}

	public void setCe2ltdidSol(Long ce2ltdidSol) {
		this.ce2ltdidSol = ce2ltdidSol;
	}

	public String getCmacidfiSol() {
		return cmacidfiSol;
	}

	public void setCmacidfiSol(String cmacidfiSol) {
		this.cmacidfiSol = cmacidfiSol;
	}

	public Long getCd1ltdtoRes() {
		return cd1ltdtoRes;
	}

	public void setCd1ltdtoRes(Long cd1ltdtoRes) {
		this.cd1ltdtoRes = cd1ltdtoRes;
	}

	public Double getCmajifijRes() {
		return cmajifijRes;
	}

	public void setCmajifijRes(Double cmajifijRes) {
		this.cmajifijRes = cmajifijRes;
	}

	public Double getCmajipctRes() {
		return cmajipctRes;
	}

	public void setCmajipctRes(Double cmajipctRes) {
		this.cmajipctRes = cmajipctRes;
	}

	public Long getCmajidtoRes() {
		return cmajidtoRes;
	}

	public void setCmajidtoRes(Long cmajidtoRes) {
		this.cmajidtoRes = cmajidtoRes;
	}

	public Long getSvInternalId() {
		return svInternalId;
	}

	public void setSvInternalId(Long svInternalId) {
		this.svInternalId = svInternalId;
	}

	public Long getOriginalSvId() {
		return originalSvId;
	}

	public void setOriginalSvId(Long originalSvId) {
		this.originalSvId = originalSvId;
	}

	public Boolean getIsNewField() {
		return isNewField;
	}

	public void setIsNewField(Boolean isNewField) {
		this.isNewField = isNewField;
	}

}
