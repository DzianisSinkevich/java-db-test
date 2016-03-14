package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContainersPage extends AnyPage {

	public ContainersPage(PageManager pages) {
		super(pages);
	}

	public static final String SEARCH_BUTTON = ".//*[@id='containersSearchForm:searchBtn']";
	public static final String NAME_FILTER = ".//*[@id='containersSearchForm:searchBtn']";
	public static final String WAIT_INDICATOR = ".//*[@id='waitDiv']";
	public static final String LAUNCH_BUTTON = ".//*[@id='containersBtnForm:btn_launch_process']";

	@FindBy(xpath = SEARCH_BUTTON)
	private WebElement searchButton;
	
	@FindBy(xpath = NAME_FILTER)
	private WebElement nameFilter;
	
	@FindBy(xpath =  LAUNCH_BUTTON)
	private WebElement launchButton;

	public ContainersPage searchButtonClick() {
		searchButton.click();
		return pages.containersPage;
	}
	
	public ContainersPage insertDataToNameField() {
		nameFilter.sendKeys("%price%");
		return pages.containersPage;
	}

	public ContainersPage launchButtonClick() {
		launchButton.click();
		return pages.containersPage;
	}
	
	public ContainersPage ensureDataLoaded() {
		WaitPageDataLoad.isVisibility(driver, WAIT_INDICATOR);
		WaitPageDataLoad.isInvisibility(driver, WAIT_INDICATOR);
		return this;
	}
}
