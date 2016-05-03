package com.danco.bpc.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitLoadAndDisplayed {
	private static Logger log = Logger.getLogger("file");	
	
	public static void wait(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		new WebDriverWait(driver, 1000).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return jQuery.active == 0");
			};
		});
	}
	
	public static void fullCicleWait(WebDriver driver, WebElement el) throws InterruptedException{
		log.info("-- Start Wait Visibility load icon");
		waitVisibility(driver, el);
		log.info("-- Wait Visibility is finisht");
		log.info("-- Start Wait Invisibility load icon");
		waitInvisibility(driver, el);
		log.info("-- Wait Invisibility is finisht");
	}

	public static void waitVisibility(WebDriver driver, WebElement el) throws InterruptedException {
		Boolean flag = false;
		for (int i = 0; i < 300; i++) {
			flag = isVisibility(driver, el);
			Thread.sleep(100);
			if (flag) {
//				System.out.println("Is visibility");
				break;
			}
//			System.out.println("In invisibility");
		}
	}

	public static void waitInvisibility(WebDriver driver, WebElement el) throws InterruptedException {
		Boolean flag = false;
		for (int i = 0; i < 300; i++) {
			flag = isInvisibility(driver, el);
			Thread.sleep(100);
			if (flag) {
//				System.out.println("In invisibility");
				break;
			}
//			System.out.println("Is visibility");
		}
	}

	private static boolean isVisibility(WebDriver driver, WebElement el) {
		try {
			return el.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private static Boolean isInvisibility(WebDriver driver, WebElement el) {
		try {
			return !el.isDisplayed();
		} catch (NoSuchElementException e) {
			return true;
		}
	}

	// public static void isLoadIconVisibility(WebDriver driver) {
	// (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	// public Boolean apply(WebDriver d) {
	// try {
	// return d.findElement(By.xpath("//*[@id='statusIndicator']")).isDisplayed();
	// } catch (NoSuchElementException e) {
	// return false;
	// }
	// }
	// });
	// }
	//
	// public static void isLoadIconInvisibility(WebDriver driver) {
	// (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	// public Boolean apply(WebDriver d) {
	// try {
	// return !d.findElement(By.xpath("//*[@id='statusIndicator']")).isDisplayed();
	// } catch (NoSuchElementException e) {
	// return true;
	// }
	// }
	// });
	// }
}
