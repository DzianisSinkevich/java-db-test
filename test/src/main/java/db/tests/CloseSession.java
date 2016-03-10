package db.tests;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;
import com.danco.bpc.service.api.TMA.ITmtMovActcTrService;
import com.danco.bpc.service.impl.TMA.TmtMovActcTeServiceImpl;
import com.danco.bpc.service.impl.TMA.TmtMovActcTrServiceImpl;
import com.danco.bpc.util.SessionPropertyReader;

import pages.TestBaseRecon;

public class CloseSession extends TestBaseRecon {

	private ITmtMovActcTeService tmtMovActcTeService = new TmtMovActcTeServiceImpl();
	private ITmtMovActcTrService tmtMovActcTrService = new TmtMovActcTrServiceImpl();

	@Test
	public void testUntitled() throws InterruptedException {
		SessionPropertyReader pr = new SessionPropertyReader();
		TmtMovActcTe tmtMovActcTe = new TmtMovActcTe();
		TmtMovActcTr tmtMovActcTr = new TmtMovActcTr();
		
		tmtMovActcTe.setCmtqsead(new Long(pr.getS220444()));
		tmtMovActcTr.setCmtqsead(new Long(pr.getS220444()));
		tmtMovActcTeService.addRecord(tmtMovActcTe);
		tmtMovActcTrService.addRecord(tmtMovActcTr);
	}
}
