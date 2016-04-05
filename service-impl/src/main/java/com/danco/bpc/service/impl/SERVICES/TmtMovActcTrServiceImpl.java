package com.danco.bpc.service.impl.SERVICES;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtMovActcTrDao;
import com.danco.bpc.dao.impl.TMA.TmtMovActcTrDaoImpl;
import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.TMA.ITmtMovActcTrService;

@Service
@Transactional
public class TmtMovActcTrServiceImpl implements ITmtMovActcTrService {

	private ITmtMovActcTrDao tmtMovActcTrDao = new TmtMovActcTrDaoImpl();

	@Override
	public Long addRecord(TmtMovActcTr entity) {
		return tmtMovActcTrDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {
		tmtMovActcTrDao.deleteRecord(id);
	}

	@Override
	public void updateRecord(TmtMovActcTr entity) {
		tmtMovActcTrDao.updateRecord(entity);
	}

	@Override
	public TmtMovActcTr getRecordById(Long id) {
		return tmtMovActcTrDao.getRecordById(id);
	}

	@Override
	public List<TmtMovActcTr> getAll() {
		return tmtMovActcTrDao.getAll();
	}

	@Override
	public List<TmtMovActcTr> getRecordsPage(Integer startPage, Integer pageSize) {
		return tmtMovActcTrDao.getRecordsPage(startPage, pageSize);
	}

	@Override
	public Integer count() {
		return tmtMovActcTrDao.count();
	}

	@Override
	public TmtMovActcTr copyTmtMovActcTr() {
		TmtMovActcTr tmtMovActcTr = this.getRecordsPage(1, 1).get(0);
		tmtMovActcTr.setCmtqnmov(tmtMovActcTr.getCmtqnmov() + 1);
		tmtMovActcTr.setSvInternalId(null);
		return tmtMovActcTr;
	}

}
