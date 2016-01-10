package db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Connector {
	private static final Logger log = Logger.getLogger(Connector.class);
	private Connection conn = null;
	private volatile static Connector instance = null;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String JDBC_URL_NPS = "jdbc:oracle:thin:@redsys.bt.bpc.in:1521/sv";
	private static final String JDBC_USERNAME_NPS = "nps";
	private static final String JDBC_PASSWORD_NPS = "nps1";

	private static final String JDBC_URL_TMA = "jdbc:oracle:thin:@redsys.bt.bpc.in:1521/sv";
	private static final String JDBC_USERNAME_TMA = "TMA_TMT";
	private static final String JDBC_PASSWORD_TMA = "Tma_TmT";

	private static final String JDBC_URL_PRICE = "jdbc:oracle:thin:@10.7.32.216:1521/sv";
	private static final String JDBC_USERNAME_PRICE = "price";
	private static final String JDBC_PASSWORD_PRICE = "price1";

	private Connector() {

	}

	public synchronized static Connector getInstance() {
		if (instance == null) {
			instance = new Connector();
		}
		return instance;
	}

	public Connection getConnNPS() {
		try {
			Class.forName(JDBC_DRIVER).newInstance();
			this.setConn(DriverManager.getConnection(JDBC_URL_NPS,
					JDBC_USERNAME_NPS, JDBC_PASSWORD_NPS));
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			log.error(e);
		} catch (SQLException e) {
			log.error(e);
		}
		return conn;
	}

	public Connection getConnTMA() {
		try {
			Class.forName(JDBC_DRIVER).newInstance();
			this.setConn(DriverManager.getConnection(JDBC_URL_TMA,
					JDBC_USERNAME_TMA, JDBC_PASSWORD_TMA));
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			log.error(e);
		} catch (SQLException e) {
			log.error(e);
		}
		return conn;
	}

	public Connection getConnPRICE() {
		try {
			Class.forName(JDBC_DRIVER).newInstance();
			this.setConn(DriverManager.getConnection(JDBC_URL_PRICE,
					JDBC_USERNAME_PRICE, JDBC_PASSWORD_PRICE));
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			log.error(e);
		} catch (SQLException e) {
			log.error(e);
		}
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

}