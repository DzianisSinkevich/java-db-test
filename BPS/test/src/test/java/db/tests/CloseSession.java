package db.tests;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;
import com.danco.bpc.service.api.TMA.ITmtMovActcTrService;
import com.danco.bpc.service.impl.TMA.TmtMovActcTeServiceImpl;
import com.danco.bpc.service.impl.TMA.TmtMovActcTrServiceImpl;

import pages.TestBase;

public class CloseSession extends TestBase {

	private ITmtMovActcTeService tmtMovActcTeService = new TmtMovActcTeServiceImpl();
	private ITmtMovActcTrService tmtMovActcTrService = new TmtMovActcTrServiceImpl();

	@Test
	public void testUntitled() throws InterruptedException {
		TmtMovActcTe tmtMovActcTe = new TmtMovActcTe();
		TmtMovActcTr tmtMovActcTr = new TmtMovActcTr();
		tmtMovActcTe.setCmtqsead(new Long("161801"));
		tmtMovActcTr.setCmtqsead(new Long("161801"));
		tmtMovActcTeService.addRecord(tmtMovActcTe);
		tmtMovActcTrService.addRecord(tmtMovActcTr);
	}
}
