package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtMovActcTeDao;
import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;

@Service
@Transactional
public class TmtMovActcTeServiceImpl implements ITmtMovActcTeService {

	@Autowired
	private ITmtMovActcTeDao tmtMovActcTeDao;

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

}
