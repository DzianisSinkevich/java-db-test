package db.utils;

import java.io.IOException;
import java.util.Properties;

/*
 * Class that extracts properties from the prop file.
 * 
 * @author Sebastiano Armeli-Battana
 */
public class PropertyLoaderJenkins {

	private static final String PROP_FILE = "/jenkins.properties";

	public static String loadProperty(String name) {
		Properties props = new Properties();
		try {
			props.load(PropertyLoaderJenkins.class.getResourceAsStream(PROP_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = "";

		if (name != null) {
			value = props.getProperty(name);
		}
		return value;
	}
}