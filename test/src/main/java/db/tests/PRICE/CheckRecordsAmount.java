package db.tests.PRICE;

import org.testng.annotations.Test;

import com.danco.bpc.service.impl.SERVICES.PrcRawMessagesServiceImpl;

import pages.TestBaseAll;

public class CheckRecordsAmount extends TestBaseAll {
	private PrcRawMessagesServiceImpl prcRawMessagesService = new PrcRawMessagesServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		System.out.println("Rows count = " + prcRawMessagesService.countRowsForSendToSv());
	}
}
