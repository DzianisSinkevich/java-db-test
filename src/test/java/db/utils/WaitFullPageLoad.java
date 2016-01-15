package db.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFullPageLoad {

	public static void Wait(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		new WebDriverWait(driver, 1000).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return jQuery.active == 0");
			};
		});
	}
}