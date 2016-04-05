package com.danco.bpc.service.impl.SERVICES;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtMovActcTeDao;
import com.danco.bpc.dao.impl.TMA.TmtMovActcTeDaoImpl;
import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;

@Service
@Transactional
public class TmtMovActcTeServiceImpl implements ITmtMovActcTeService {

	private ITmtMovActcTeDao tmtMovActcTeDao = new TmtMovActcTeDaoImpl();

	@Override
	public Long addRecord(TmtMovActcTe entity) {
		return tmtMovActcTeDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {
		tmtMovActcTeDao.deleteRecord(id);
	}

	@Override
	public void updateRecord(TmtMovActcTe entity) {
		tmtMovActcTeDao.updateRecord(entity);
	}

	@Override
	public TmtMovActcTe getRecordById(Long id) {
		return tmtMovActcTeDao.getRecordById(id);
	}

	@Override
	public List<TmtMovActcTe> getAll() {
		return tmtMovActcTeDao.getAll();
	}

	@Override
	public List<TmtMovActcTe> getRecordsPage(Integer startPage, Integer pageSize) {
		return tmtMovActcTeDao.getRecordsPage(startPage, pageSize);
	}

	@Override
	public Integer count() {
		return tmtMovActcTeDao.count();
	}

	@Override
	public TmtMovActcTe copyTmtMovActcTe() {
		TmtMovActcTe tmtMovActcTe = this.getRecordsPage(1, 1).get(0);
		tmtMovActcTe.setCmtqnmov(tmtMovActcTe.getCmtqnmov() + 1);
		tmtMovActcTe.setSvInternalId(null);
		return tmtMovActcTe;
	}

}
