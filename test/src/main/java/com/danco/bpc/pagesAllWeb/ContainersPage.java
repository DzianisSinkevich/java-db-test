package com.danco.bpc.pagesAllWeb;

import java.util.ArrayList;
import java.util.List;

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
	public static final String SSID = ".//*[@id='containerLaunchModalPanelForm:containerLaunchStructure']/tbody/tr/td/div/table[2]/tbody/tr/td/div/div/table/tbody/tr/td[5]";

	@FindBy(xpath = SEARCH_BUTTON)
	private WebElement searchButton;

	@FindBy(xpath = NAME_FILTER)
	private WebElement nameFilter;

	@FindBy(xpath = LAUNCH_BUTTON)
	private WebElement launchButton;

	@FindBy(xpath = CANCEL_BUTTON)
	private WebElement cancelButton;

	@FindBy(xpath = LAUNCH_IN_FORM_BUTTON)
	private WebElement launchInFormButton;

	@FindBy(xpath = SSID)
	private List<WebElement> ssidList;

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

	public ContainersPage launchInFormButtonClick() {
		launchInFormButton.click();
		ensureDataLoaded();
		return pages.containersPage;
	}

	public String checkContainerSession() throws InterruptedException {
		String ssid = null;

		for (int i = 0; i < 1200; i++) {
			if ((ssidList.size() > 0)
					&& (ssidList.get(0).getText().length() == 16)) {
				ssid = ssidList.get(0).getText();
				System.out.println("SSID = " + ssid);
				break;
			}
			Thread.sleep(1000);
		}
		if (ssid.equals("")) {
			System.out.println("SSID is not detected");
			return null;
		}
		return ssid;
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
