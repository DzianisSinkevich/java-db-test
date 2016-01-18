package com.danco.bpc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class SessionPropertyReader {

	private static final String FILE_NAME = "src/main/resources/sessions.properties";
	
	private static final String S22_0444 = "22_0444";
	private static final String S22_0444_TR = "22_0444.TR";
	private static final String S22_0444_TE = "22_0444.TE";
	private static final String S22_0444_TSV = "22_0444.TSV";
	private static final String S22_0444_TF = "22_0444.TF";
	private static Properties props = new Properties();
	private static OutputStream out;

	public SessionPropertyReader() {
		try {
			FileInputStream ins = new FileInputStream(FILE_NAME);
			props.load(ins);
			out = new FileOutputStream( FILE_NAME );
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("IO Error!");
			e.printStackTrace();
	    }
	}

	public void setS220444(String str) throws IOException {
		props.setProperty(S22_0444, str.toString());
		props.store(out, "no comment");
	}

	public void setS220444TR(Boolean str) {
		props.setProperty(S22_0444_TR, str.toString());
	}

	public void setS220444TE(Boolean str) {
		props.setProperty(S22_0444_TE, str.toString());
	}

	public void setS220444TSV(Boolean str) {
		props.setProperty(S22_0444_TSV, str.toString());
	}

	public void setS220444TF(Boolean str) {
		props.setProperty(S22_0444_TF, str.toString());
	}

	public String getS220444() {
		return props.getProperty(S22_0444);
	}

	public String getS220444TR() {
		return props.getProperty(S22_0444_TR);
	}

	public String getS220444TE() {
		return props.getProperty(S22_0444_TE);
	}

	public String getS220444TSV() {
		return props.getProperty(S22_0444_TSV);
	}

	public String getS220444TF() {
		return props.getProperty(S22_0444_TF);
	}
}
