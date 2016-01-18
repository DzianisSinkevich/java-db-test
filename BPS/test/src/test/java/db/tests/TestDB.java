package db.tests;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;
import com.danco.bpc.service.api.TMA.ITmtMovActcTrService;
import com.danco.bpc.service.impl.TMA.TmaMovActcServiceImpl;
import com.danco.bpc.service.impl.TMA.TmtMovActcTeServiceImpl;
import com.danco.bpc.service.impl.TMA.TmtMovActcTrServiceImpl;

import pages.TestBase;

public class TestDB extends TestBase {

	private ITmaMovActcService tmaMovActcService = new TmaMovActcServiceImpl();
	private ITmtMovActcTeService tmtMovActcTeService = new TmtMovActcTeServiceImpl();
	private ITmtMovActcTrService tmtMovActcTrService = new TmtMovActcTrServiceImpl();

	@Test
	public void testUntitled() throws InterruptedException {
		System.out.println();
		app.getUserHelper().loginAs(ADMIN);
		app.getNavigationHelper().menuSessionClick();
		TmtMovActcTe tmtMovActcTe = new TmtMovActcTe();
		TmtMovActcTr tmtMovActcTr = new TmtMovActcTr();
		tmtMovActcTe.setCmtqsead(new Long("161801"));
		tmtMovActcTr.setCmtqsead(new Long("161801"));
		tmtMovActcTeService.addRecord(tmtMovActcTe);
		tmtMovActcTrService.addRecord(tmtMovActcTr);
		// TmaMovActc tmaMovActc = new TmaMovActc();
		// Long id = tmaMovActcService.addRecord(tmaMovActcService.copyTmaMovActc());
		// assert(!app.getSessionHelper().checkSessionInTableNegative("22_0444-161801"));
		// tmaMovActc.setCmaqsere(161801);
		// Long id = tmaMovActcService.addRecord(tmaMovActc);
		// System.out.println(id);
		// assert(app.getSessionHelper().checkSessionInTablePositive("22_0444-161801"));
	}
}
