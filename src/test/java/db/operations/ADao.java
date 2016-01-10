package db.operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import entity.IEntity;

public abstract class ADao<T> implements IDao<T> {
	protected static final Logger log = Logger.getLogger(ADao.class);
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;

	public abstract T getById(int id);

	public List<T> getList() {
		getListPreparedStatement();
		List<T> list = new ArrayList<T>();
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			while (rs.next()) {
				list.add(createObject(rs));
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return list;
	}

	public List<T> getSortedList(String nameOfColumn) {
		getSortedListPreparedStatement(nameOfColumn);
		List<T> list = new ArrayList<T>();
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			while (rs.next()) {
				list.add(createObject(rs));
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return list;
	}

	public void update(T entity) {
		doAction(getUpdatePreparedStatement(entity));
	}

	public void delete(T entity) {
		deleteById(((IEntity) entity).serialVersionUID());
	}

	public void deleteById(int id) {
		doAction(getDeletePreparedStatement(id));
	}

	public void insert(T entity) {
		doAction(getInsertPreparedStatement(entity));
	}

	private void doAction(PreparedStatement pst) {
		try (PreparedStatement pst2 = pst;) {
			pst2.executeUpdate();
		} catch (SQLException e) {
			log.error(e);
		}
	}

	public List<T> getListByValueOfField(String nameOfColumn, String value,
			Date date1, Date date2) {
		getListByFieldPreparedStatement(nameOfColumn, value, date1, date2);
		List<T> list = new ArrayList<T>();
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			while (rs.next()) {
				list.add(createObject(rs));
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return list;
	}

	public List<T> getListByValueOfField(String nameOfColumn, String value) {
		getListByFieldPreparedStatement(nameOfColumn, value);
		List<T> list = new ArrayList<T>();
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			while (rs.next()) {
				list.add(createObject(rs));
			}
		} catch (SQLException e) {
			log.error(e);
		}
		return list;
	}

	public String getSumm(String nameOfColumn, String value, Date date1,
			Date date2) {
		getSummPreparedStatement(nameOfColumn, value, date1, date2);
		String sum = "";
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			sum = String.valueOf(rs.getDouble(1));
		} catch (SQLException e) {
			log.error(e);
		}
		return sum;
	}

	public String getCount(String nameOfColumn, String value, Date date1,
			Date date2) {
		getCountPreparedStatement(nameOfColumn, value, date1, date2);
		String count = "";
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
		try {
			count = String.valueOf(rs.getDouble(1));
		} catch (SQLException e) {
			log.error(e);
		}
		return count;
	}

	public void setFieldValue(int id, String nameOfColumn, String value) {
		getSetFieldValuePreparedStatement(id, nameOfColumn, value);
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.error(e);
		}
	}

	protected abstract T createObject(ResultSet rs);

	protected abstract PreparedStatement getSetFieldValuePreparedStatement(
			int id, String nameOfColumn, String value);

	protected abstract PreparedStatement getListPreparedStatement();

	protected abstract PreparedStatement getSortedListPreparedStatement(
			String nameOfColumn);

	protected abstract PreparedStatement getUpdatePreparedStatement(T entity);

	protected abstract PreparedStatement getDeletePreparedStatement(int id);

	protected abstract PreparedStatement getInsertPreparedStatement(T entity);

	protected abstract PreparedStatement getListByFieldPreparedStatement(
			String nameOfColumn, String value, Date date1, Date date2);

	protected abstract PreparedStatement getListByFieldPreparedStatement(
			String nameOfColumn, String value);

	protected abstract PreparedStatement getCountPreparedStatement(
			String nameOfColumn, String value, Date date1, Date date2);

	protected abstract PreparedStatement getSummPreparedStatement(
			String nameOfColumn, String value, Date date1, Date date2);
}
