package denis.trening.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SessionPage extends InternalPage {

	public SessionPage(PageManager pages) {
		super(pages);
	}

	public SessionPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.cssSelector("[name='name']")));
		return this;
	}

	@FindBy(xpath = "//table[@class='SessionFilterPanelGrid']/tbody/tr[3]/td[@class='padding-bottom-10 width20 align-middle']/*[1]")
	private WebElement searchField;

	@FindBy(name = "name")
	private WebElement title;

	@FindBy(name = "year")
	private WebElement year;

	@FindBy(xpath = "//table[@class='SessionFilterPanelGrid']/tbody/tr[3]/td[@class='width10 padding-bottom-10 align-middle padding-right-10']/*[1]")
	private WebElement findButton;

	@FindBy(xpath = "/html/body/div[@id='window']/div[@id='area']/div[@id='EverythingOnSession']/form[@id='SessionDatatableForm']/div[@id='SessionDatatableForm:sessions']/div[@class='ui-datatable-scrollable-body']/table/tbody[@id='SessionDatatableForm:sessions_data']/tr[@class='ui-widget-content ui-datatable-even ui-datatable-selectable ui-state-hover']/td[@class='width15']")
	private List<WebElement> searchedSessions;

	public List<WebElement> getSearchedSessions() {
		return searchedSessions;
	}

	public SessionPage clickSearchLink(String ssid) {
		searchField.click();
		// clearingSearchField();
		searchField.sendKeys(ssid);
		findButton.click();
		// driver.navigate().refresh();
		return pages.sessionPage;
	}

	public WebElement findSearchSsidField(WebElement staticField) {
		String cssSelector = ".ui-inputfield ui-inputtext ui-widget";
		return staticField.findElement(By.xpath(String.format(cssSelector)));
	}

	public SessionPage clearingSearchField() {
		searchField.click();
		String selectAll = Keys.chord(Keys.CONTROL + "a");
		searchField.sendKeys(selectAll + Keys.DELETE);
		findButton.click();
		return pages.sessionPage;
	}
}
