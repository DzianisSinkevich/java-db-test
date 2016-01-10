package db.operations;

import java.util.Date;
import java.util.List;

public interface IDao<T> {
	T getById(int id);

	void update(T entity);

	void delete(T entity);

	void deleteById(int id);

	void insert(T entity);

	void setFieldValue(int id, String nameOfColumn, String value);

	List<T> getList();

	List<T> getSortedList(String nameOfColumn);

	List<T> getListByValueOfField(String nameOfColumn, String value,
			Date date1, Date date2);

	List<T> getListByValueOfField(String nameOfColumn, String value);

	String getSumm(String nameOfColumn, String value, Date date1, Date date2);

	String getCount(String nameOfColumn, String value, Date date1, Date date2);

}
