package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPageDataLoad {
	public static void isVisibility(WebDriver driver, final String selector) {
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				try {
					return d.findElement(By.xpath(selector)).isDisplayed();
				} catch (NoSuchElementException e) {
					return false;
				}
			}
		});
	}

	public static void isInvisibility(WebDriver driver, final String selector) {
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				try {
					return !d.findElement(By.xpath(selector)).isDisplayed();
				} catch (NoSuchElementException e) {
					return true;
				}
			}
		});
	}
}
