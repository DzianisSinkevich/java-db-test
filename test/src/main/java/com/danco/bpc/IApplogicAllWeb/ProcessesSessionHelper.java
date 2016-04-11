package com.danco.bpc.IApplogicAllWeb;

public interface ProcessesSessionHelper {

	public String waitForProcessFinished(String pid) throws Exception;

	public void checkAllParameters();
}
