package denis.trening.util;

import com.thoughtworks.selenium.CommandProcessor;
import com.thoughtworks.selenium.DefaultSelenium;

public class CustomSelenium extends DefaultSelenium {
	public CustomSelenium(String serverHost, int serverPort,
			String browserStartCommand, String browserURL) {
		super(serverHost, serverPort, browserStartCommand, browserURL);
	}

	public CustomSelenium(CommandProcessor processor) {
		super(processor);
	}

	/**
	 * Waits for all active AJAX requests to finish during specified timeout.
	 * Works only for AJAX requests which are instantiated using one of the
	 * following frameworks: jQuery, Prototype, Dojo. Don't work (immediately
	 * returns without any errors) if standard AJAX API is used to send request.
	 *
	 * @param timeout
	 *            Timeout in milliseconds.
	 */
	public void waitForAjaxRequests(final int timeout) {
		commandProcessor.doCommand("waitForAjaxRequests",
				new String[] { String.valueOf(timeout) });
	}
}