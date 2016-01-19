package db.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitLoadAndDisplayed {

	public static void wait(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		new WebDriverWait(driver, 1000).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return jQuery.active == 0");
			};
		});
	}

	public static void waitNoFoundVisibility(WebDriver driver) throws InterruptedException {
		Boolean flag = false;
		for (int I = 0; I < 10; I++) {
			flag = isNoFoundVisibility(driver);
			Thread.sleep(100);
			if (flag) {
				break;
			}
		}
	}

	public static void waitNoFoundInvisibility(WebDriver driver) throws InterruptedException {
		Boolean flag = false;
		for (int I = 0; I < 10; I++) {
			flag = isNoFoundInvisibility(driver);
			Thread.sleep(100);
			if (flag) {
				break;
			}
		}
	}

	public static boolean isNoFoundVisibility(WebDriver driver) {
		try {
			return driver.findElement(By.xpath("//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[2]"))
					.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static Boolean isNoFoundInvisibility(WebDriver driver) {
		try {
			return !driver.findElement(By.xpath("//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[2]"))
					.isDisplayed();
		} catch (NoSuchElementException e) {
			return true;
		}
	}

	public static void isLoadIconVisibility(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				try {
					return d.findElement(By.xpath("//*[@id='statusIndicator']")).isDisplayed();
				} catch (NoSuchElementException e) {
					return false;
				}
			}
		});
	}

	public static void isLoadIconInvisibility(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				try {
					return !d.findElement(By.xpath("//*[@id='statusIndicator']")).isDisplayed();
				} catch (NoSuchElementException e) {
					return true;
				}
			}
		});
	}
}
