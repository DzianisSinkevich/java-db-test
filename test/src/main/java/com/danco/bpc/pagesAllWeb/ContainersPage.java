package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContainersPage extends AnyPage {

	public ContainersPage(PageManager pages) {
		super(pages);
	}
	
	public static final String SEARCH_BUTTON = ".//*[@id='containersSearchForm:searchBtn']";
	public static final String NAME_FILTER = ".//*[@id='containersSearchForm:nameFilter']";
	public static final String WAIT_INDICATOR = ".//*[@id='waitDiv']";
	public static final String LAUNCH_BUTTON = ".//*[@id='containersBtnForm:btn_launch_process']";
	public static final String CANCEL_BUTTON = ".//*[@id='containerLaunchModalPanelForm:cancelBtn']";
	public static final String LAUNCH_IN_FORM_BUTTON = ".//*[@id='containerLaunchModalPanelForm:launchBtn']";
	
	@FindBy(xpath = SEARCH_BUTTON)
	private WebElement searchButton;
	
	@FindBy(xpath = NAME_FILTER)
	private WebElement nameFilter;
	
	@FindBy(xpath =  LAUNCH_BUTTON)
	private WebElement launchButton;
	
	@FindBy(xpath =  CANCEL_BUTTON)
	private WebElement cancelButton;
	
	@FindBy(xpath =  LAUNCH_IN_FORM_BUTTON)
	private WebElement launchInFormButton;

	public ContainersPage searchButtonClick() {
		searchButton.click();
		ensureDataLoaded();
		return pages.containersPage;
	}
	
	public ContainersPage insertDataToNameField(String containerName) {
		nameFilter.sendKeys(containerName);
		return pages.containersPage;
	}

	public ContainersPage launchButtonClick() {
		launchButton.click();
		ensureDataLoaded();
		return pages.containersPage;
	}
	
	public ContainersPage cancelButtonClick() {
		cancelButton.click();
		return pages.containersPage;
	}
	
	public ContainersPage ensureDataLoaded() {
		WaitPageDataLoad.isVisibility(driver, WAIT_INDICATOR);
		WaitPageDataLoad.isInvisibility(driver, WAIT_INDICATOR);
		return this;
	}
}
