package com.danco.bpc.pagesAllWeb;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class InternalPage extends AnyPage {
	public static final String HOME_LINK = "nav a[href = 'http://10.7.32.216:9080/sv/login.jsf']";
	
	public static final String MENU_GENERAL_VIEW_OPERATIONS = "//*[text()='General View Operations']";
	public static final String MENU_GENERAL_VIEW_OPERATIONS_ACQUIRING_OPERATIONS = "//*[text()='Acquiring Operations']";
	public static final String MENU_GENERAL_VIEW_OPERATIONS_ISSUING_OPERATIONS = "//*[text()='Issuing Operations']";
	
	public static final String MENU_GENERAL_VIEW_CONFIGURATION = "//*[text()='General View Configuration']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_INSTITUTIONS_BANK_STRUCTURE = "//*[text()='Institutions Bank Structure']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_ISSUING_PRODUCTS = "//*[text()='Issuing Products']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_BIN_RANGES = "//*[text()='BIN ranges']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_ACQUIRING_PRODUCTS = "//*[text()='Acquiring Products']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_MERCHANTS = "//*[text()='Merchants']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_NETWORKS = "//*[text()='Networks']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_SETTLEMENT_TYPE = "//*[text()='Settlement Type']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES = "//*[@class='rich-tree-node-children']//*[text()='Card types']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES_CARD_TYPES = "//*[@class='rich-tree-node-children']//*[@class='rich-tree-node-children']//*[text()='Card types']";
	public static final String MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES_CARD_TYPES_MAP = "//*[text()='Card types map']";
	
	public static final String MENU_FEE_CONFIGURATION = "//*[text()='Fee Configuration']";
	public static final String MENU_FEE_CONFIGURATION_FEES = "//*[text()='Fees']";
	
	public static final String MENU_INPUT_OUTPUT_OPERATIONS = "//*[text()='Input/Output Operations']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_TMA = "//*[text()='TMA input operations']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_TMT = "//*[text()='TMT input totals']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_PRICE = "//*[text()='Format: PRICE']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_VISA = "//*[text()='Format: VISA ']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_MC = "//*[text()='Format: MasterCard']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_BILATERAL = "//*[text()='Format: Bilateral']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_MUS = "//*[text()='Format: MUS']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_AEAT = "//*[text()='Format: AEAT-Diesel']";
	public static final String MENU_INPUT_OUTPUT_OPERATIONS_UNION_PAY = "//*[text()='Format: Union Pay']";
	
	public static final String MENU_PAYMENT_SYSTEM = "//*[text()='Payment system']";
	public static final String MENU_PAYMENT_SYSTEM_MC = "//*[text()='MasterCard']";
	public static final String MENU_PAYMENT_SYSTEM_MC_FILES = "//*[text()='Files']";
	public static final String MENU_PAYMENT_SYSTEM_MC_FEE_SETTINGS = "//*[text()='Fee settings']";
	public static final String MENU_PAYMENT_SYSTEM_MC_FEE_CRITERIA = "//*[text()='Fee criteria']";
	public static final String MENU_PAYMENT_SYSTEM_MC_OPERATIONS = "//*[text()='Operations']";
	public static final String MENU_PAYMENT_SYSTEM_MC_PROCESS_LOG = "//*[text()='Process log']";
	public static final String MENU_PAYMENT_SYSTEM_MC_GENERAL_SETTINGS = "//*[text()='General settings']";
	public static final String MENU_PAYMENT_SYSTEM_MC_AGGREGATION = "//*[text()='Aggregation']";
	public static final String MENU_PAYMENT_SYSTEM_MC_REJECTED = "//*[text()='Rejected']";
	public static final String MENU_PAYMENT_SYSTEM_VISA = "//*[text()='VISA']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_FEE_SETTINGS = "//*[text()='Fee settings']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_FEE_CRITERIA = "//*[text()='Fee criteria']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_OPERATIONS = "//*[text()='Operations']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_PROCESS_LOG = "//*[text()='Process log']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_GENERAL_SETTINGS = "//*[text()='General settings']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_AGGREGATION = "//*[text()='Aggregation']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_REJECTED = "//*[text()='Rejected']";
	public static final String MENU_PAYMENT_SYSTEM_VISA_VSS_REPORTS = "//*[text()='VSS reports']";	
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY = "//*[text()='Union Pay']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_SESSIONS = "//*[text()='Sessions']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_FEE_SETTINGS = "//*[text()='Fee settings']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_FEE_CRITERIA = "//*[text()='Fee criteria']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_OPERATIONS = "//*[text()='Operations']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_GENERAL_SETTINGS = "//*[text()='General settings']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_AGGREGATION = "//*[text()='Aggregation']";
	public static final String MENU_PAYMENT_SYSTEM_UNION_PAY_DISPUTES = "//*[text()='Disputes']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS = "//*[text()='American Express']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_FEE_SETTINGS = "//*[text()='Fee settings']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_FEE_CRITERIA = "//*[text()='Fee criteria']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_OPERATIONS = "//*[text()='Operations']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_PROCESS_LOG = "//*[text()='Process log']";
	public static final String MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_AGGREGATION = "//*[text()='Aggregation']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB = "//*[text()='Diners Club']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB_FEE_SETTINGS = "//*[text()='Fee settings']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB_FEE_CRITERIA = "//*[text()='Fee criteria']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB_OPERATIONS = "//*[text()='Operations']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB_PROCESS_LOG = "//*[text()='Process log']";
	public static final String MENU_PAYMENT_SYSTEM_DINERS_CLUB_AGGREGATION = "//*[text()='Aggregation']";
	
	public static final String MENU_MONITORING = "//*[text()='Monitoring']";
	public static final String MENU_MONITORING_PROCESS_FILES = "//*[text()='Process files']";
	public static final String MENU_MONITORING_LOTES = "//*[text()='Lotes']";
	public static final String MENU_MONITORING_PROCESS_LOGS = "//*[text()='Process logs']";
	public static final String MENU_MONITORING_AUDIT_LOGS = "//*[text()='Audit logs']";
	public static final String MENU_MONITORING_REPORT_RUNS = "//*[text()='Report runs']";
	public static final String MENU_MONITORING_USER_SESSIONS = "//*[text()='User sessions']";
	public static final String MENU_MONITORING_ATM_MONITORIZACION = "//*[text()='ATM monitorización']";
	public static final String MENU_MONITORING_ALERTS = "//*[text()='Alerts']";
	
	public static final String MENU_ADMINISTRATION = "//*[text()='Administration']";
	public static final String MENU_ADMINISTRATION_PROCESSES = "//*[text()='Processes']";
	public static final String MENU_ADMINISTRATION_PROCESSES_FILE_SAVERS = "//*[text()='File savers']";
	public static final String MENU_ADMINISTRATION_PROCESSES_CONTAINERS = "//*[text()='Containers']";
	public static final String MENU_ADMINISTRATION_PROCESSES_PROCESSES = "//*[@class='rich-tree-node-children']//*[@class='rich-tree-node-children']//*[text()='Processes']";
	public static final String MENU_ADMINISTRATION_PROCESSES_PARAMETERS = "//*[text()='Parameters']";
	public static final String MENU_ADMINISTRATION_PROCESSES_GROUPS = "//*[text()='Groups']";
	public static final String MENU_ADMINISTRATION_PROCESSES_DIRECTORIES = "//*[text()='Directories']";
	public static final String MENU_ADMINISTRATION_PERMISSIONS = "//*[text()='Permissions']";
	public static final String MENU_ADMINISTRATION_PERMISSIONS_USERS = "//*[text()='Users']";
	public static final String MENU_ADMINISTRATION_PERMISSIONS_ROLES = "//*[text()='Roles']";
	public static final String MENU_ADMINISTRATION_PERMISSIONS_PRIVILEGIES = "//*[text()='Privileges']";
	public static final String MENU_ADMINISTRATION_COMMUNICATION = "//*[text()='Communication']";
	public static final String MENU_ADMINISTRATION_HSM = "//*[text()='HSM']";
	public static final String MENU_ADMINISTRATION_SECURITY = "//*[text()='Security']";
	public static final String MENU_ADMINISTRATION_INTERFACE = "//*[text()='Interface']";
	public static final String MENU_ADMINISTRATION_SETTINGS = "//*[text()='Settings']";
	public static final String MENU_ADMINISTRATION_SETTINGS_SETTINGS = "//*[@class='rich-tree-node-children']//*[@class='rich-tree-node-children']//*[text()='Settings']";
	public static final String MENU_ADMINISTRATION_SETTINGS_DICTIONARIES = "//*[text()='Dictionaries']";
	public static final String MENU_ADMINISTRATION_SETTINGS_AUDIT = "//*[text()='Audit']";
	public static final String MENU_ADMINISTRATION_SETTINGS_DASHBOARDS = "//*[text()='Dashboards']";
	public static final String MENU_ADMINISTRATION_SETTINGS_ARCHIVING = "//*[text()='Archiving']";
	
	public static final String MENU_SESSION_LINK = "Sessions";
	public static final String MENU_RECONCILIATION_CASES_LINK = "Reconciliation Cases";
	public static final String MENU_DATASOURCES_LINK = "Datasources";
	public static final String MENU_ROUTING_LINK = "Routing";
	public static final String MENU_LOGOUT_LINK = "Logout";

	public static final String DASHBOARD_MENU = ".//*[@id='links_form:dashboardsMenu']/div[1]/a";
	
	public InternalPage(PageManager pages) {
		super(pages);
	}

	public InternalPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.cssSelector("nav")));
		return this;
	}

	public int afterAmountFilms;

	@FindBy(css = HOME_LINK)
	private WebElement homeLink;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_OPERATIONS)
	private WebElement menuGeneralViewOperations;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_OPERATIONS_ACQUIRING_OPERATIONS)
	private WebElement menuGeneralViewOperationsAcq;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_OPERATIONS_ISSUING_OPERATIONS)
	private WebElement menuGeneralViewOperationsIss;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION)
	private WebElement menuGeneralViewConfiguration;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_INSTITUTIONS_BANK_STRUCTURE)
	private WebElement menuGeneralViewConfigurationInstitutions;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_ISSUING_PRODUCTS)
	private WebElement menuGeneralViewConfigurationIssuing;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_BIN_RANGES)
	private WebElement menuGeneralViewConfigurationBin;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_ACQUIRING_PRODUCTS)
	private WebElement menuGeneralViewConfigurationAcquiring;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_MERCHANTS)
	private WebElement menuGeneralViewConfigurationMarchnts;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_NETWORKS)
	private WebElement menuGeneralViewConfigurationNetworks;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_SETTLEMENT_TYPE)
	private WebElement menuGeneralViewConfigurationSettlement;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES)
	private WebElement menuGeneralViewConfigurationCardTypes;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES_CARD_TYPES)
	private WebElement menuGeneralViewConfigurationCardTypesCardTypes;
	
	@FindBy(xpath = MENU_GENERAL_VIEW_CONFIGURATION_CARD_TYPES_CARD_TYPES_MAP)
	private WebElement menuGeneralViewConfigurationCardTypesCardTypesMap;
	
	@FindBy(xpath = MENU_FEE_CONFIGURATION)
	private WebElement menuFeeConfiguration;
	
	@FindBy(xpath = MENU_FEE_CONFIGURATION_FEES)
	private WebElement menuFeeConfigurationFees;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS)
	private WebElement menuInputOutputOperations;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_TMA)
	private WebElement menuInputOutputOperationsTma;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_TMT)
	private WebElement menuInputOutputOperationsTmt;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_PRICE)
	private WebElement menuInputOutputOperationsPrice;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_VISA)
	private WebElement menuInputOutputOperationsVisa;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_MC)
	private WebElement menuInputOutputOperationsMc;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_BILATERAL)
	private WebElement menuInputOutputOperationsBilateral;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_MUS)
	private WebElement menuInputOutputOperationsMus;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_AEAT)
	private WebElement menuInputOutputOperationsAeat;

	@FindBy(xpath = MENU_INPUT_OUTPUT_OPERATIONS_UNION_PAY)
	private WebElement menuInputOutputOperationsUnionPay;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM)
	private WebElement menuPaymentSystem;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC)
	private WebElement menuPaymentSystemMc;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_FILES)
	private WebElement menuPaymentSystemMcFiles;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_FEE_SETTINGS)
	private WebElement menuPaymentSystemMcFeeSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_FEE_CRITERIA)
	private WebElement menuPaymentSystemMcFeeCriteria;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_OPERATIONS)
	private WebElement menuPaymentSystemMcOperations;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_PROCESS_LOG)
	private WebElement menuPaymentSystemMcProcessLog;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_GENERAL_SETTINGS)
	private WebElement menuPaymentSystemMcGeneralSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_AGGREGATION)
	private WebElement menuPaymentSystemMcAggregation;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_REJECTED)
	private WebElement menuPaymentSystemMcRejected;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA)
	private WebElement menuPaymentSystemVisa;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_FEE_SETTINGS)
	private WebElement menuPaymentSystemVisaFeeSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_FEE_CRITERIA)
	private WebElement menuPaymentSystemVisaFeeCriteria;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_OPERATIONS)
	private WebElement menuPaymentSystemVisaOperations;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_PROCESS_LOG)
	private WebElement menuPaymentSystemVisaProcessLog;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_GENERAL_SETTINGS)
	private WebElement menuPaymentSystemVisaGeneralSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_AGGREGATION)
	private WebElement menuPaymentSystemVisaAggregation;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_MC_REJECTED)
	private WebElement menuPaymentSystemVisaRejected;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_VISA_VSS_REPORTS)
	private WebElement menuPaymentSystemVisaVssReports; 
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY)
	private WebElement menuPaymentSystemUnionPay;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_SESSIONS)
	private WebElement menuPaymentSystemUnionPaySessions;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_FEE_SETTINGS)
	private WebElement menuPaymentSystemUnionPayFeeSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_FEE_CRITERIA)
	private WebElement menuPaymentSystemUnionPayFeeCriteria;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_OPERATIONS)
	private WebElement menuPaymentSystemUnionPayOperations;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_GENERAL_SETTINGS)
	private WebElement menuPaymentSystemUnionPayGeneralSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_AGGREGATION)
	private WebElement menuPaymentSystemUnionPayAggregation;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_UNION_PAY_DISPUTES)
	private WebElement menuPaymentSystemUnionPayDisputes;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS)
	private WebElement menuPaymentSystemAmericanExpress;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_FEE_SETTINGS)
	private WebElement menuPaymentSystemAmericanExpressFeeSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_FEE_CRITERIA)
	private WebElement menuPaymentSystemAmericanExpressFeeCriteria;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_OPERATIONS)
	private WebElement menuPaymentSystemAmericanExpressOperations;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_PROCESS_LOG)
	private WebElement menuPaymentSystemAmericanExpressProcessLog;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_AMERICAN_EXPRESS_AGGREGATION)
	private WebElement menuPaymentSystemAmericanExpressAggregation;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB)
	private WebElement menuPaymentSystemDinersClub;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB_FEE_SETTINGS)
	private WebElement menuPaymentSystemDinersClubFeeSettings;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB_FEE_CRITERIA)
	private WebElement menuPaymentSystemDinersClubFeeCriteria;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB_OPERATIONS)
	private WebElement menuPaymentSystemDinersClubOperations;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB_PROCESS_LOG)
	private WebElement menuPaymentSystemDinersClubProcessLog;
	
	@FindBy(xpath = MENU_PAYMENT_SYSTEM_DINERS_CLUB_AGGREGATION)
	private WebElement menuPaymentSystemDinersClubAggregation;
	
	@FindBy(xpath = MENU_MONITORING)
	private WebElement menuMonitoring;
	
	@FindBy(xpath = MENU_MONITORING_PROCESS_FILES)
	private WebElement menuMonitoringProcessFiles;
	
	@FindBy(xpath = MENU_MONITORING_LOTES)
	private WebElement menuMonitoringLotes;
	
	@FindBy(xpath = MENU_MONITORING_PROCESS_LOGS)
	private WebElement menuMonitoringProcessLogs;
	
	@FindBy(xpath = MENU_MONITORING_AUDIT_LOGS)
	private WebElement menuMonitoringAuditLogs;
	
	@FindBy(xpath = MENU_MONITORING_REPORT_RUNS)
	private WebElement menuMonitoringReportRuns;
	
	@FindBy(xpath = MENU_MONITORING_USER_SESSIONS)
	private WebElement menuMonitoringUserSessions;
	
	@FindBy(xpath = MENU_MONITORING_ATM_MONITORIZACION)
	private WebElement menuMonitoringAtmMonitorization;
	
	@FindBy(xpath = MENU_MONITORING_ALERTS)
	private WebElement menuMonitoringAlerts;

	@FindBy(xpath = MENU_ADMINISTRATION)
	private WebElement menuAdministration;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES)
	private WebElement menuAdministrationProcesses;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_FILE_SAVERS)
	private WebElement menuAdministrationProcessesFileSavers;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_CONTAINERS)
	private WebElement menuAdministrationProcessesContainers;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_PROCESSES)
	private WebElement menuAdministrationProcessesProcesses;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_PARAMETERS)
	private WebElement menuAdministrationProcessesParameters;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_GROUPS)
	private WebElement menuAdministrationProcessesGroups;

	@FindBy(xpath = MENU_ADMINISTRATION_PROCESSES_DIRECTORIES)
	private WebElement menuAdministrationProcessesDirectories;

	@FindBy(xpath = MENU_ADMINISTRATION_PERMISSIONS)
	private WebElement menuAdministrationPermissions;

	@FindBy(xpath = MENU_ADMINISTRATION_PERMISSIONS_USERS)
	private WebElement menuAdministrationPermissionsUsers;

	@FindBy(xpath = MENU_ADMINISTRATION_PERMISSIONS_ROLES)
	private WebElement menuAdministrationPermissionsRoles;

	@FindBy(xpath = MENU_ADMINISTRATION_PERMISSIONS_PRIVILEGIES)
	private WebElement menuAdministrationPermissionsPrivilegies;

	@FindBy(xpath = MENU_ADMINISTRATION_COMMUNICATION)
	private WebElement menuAdministrationCommunication;

	@FindBy(xpath = MENU_ADMINISTRATION_HSM)
	private WebElement menuAdministrationHsm;

	@FindBy(xpath = MENU_ADMINISTRATION_SECURITY)
	private WebElement menuAdministrationSecurity;

	@FindBy(xpath = MENU_ADMINISTRATION_INTERFACE)
	private WebElement menuAdministrationInterface;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS)
	private WebElement menuAdministrationSettings;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS_SETTINGS)
	private WebElement menuAdministrationSettingsSettings;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS_DICTIONARIES)
	private WebElement menuAdministrationSettingsDictionaries;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS_AUDIT)
	private WebElement menuAdministrationSettingsAudit;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS_DASHBOARDS)
	private WebElement menuAdministrationSettingsDashboards;

	@FindBy(xpath = MENU_ADMINISTRATION_SETTINGS_ARCHIVING)
	private WebElement menuAdministrationSettingsArchiving;

	@FindBy(linkText = MENU_SESSION_LINK)
	private WebElement menuSessionLink;

	@FindBy(linkText = MENU_RECONCILIATION_CASES_LINK)
	private WebElement menuReconciliationCasesLink;

	@FindBy(linkText = MENU_DATASOURCES_LINK)
	private WebElement menuDatasourcesLink;

	@FindBy(linkText = MENU_ROUTING_LINK)
	private WebElement menuRoutingLink;

	@FindBy(css = "nav a[href $= '?go=profile']")
	private WebElement userProfileLink;

	@FindBy(css = "nav a[href $= '?go=users']")
	private WebElement userManagementLink;

	@FindBy(css = "nav a[href = './?go=add']")
	private WebElement filmAddLink;

	@FindBy(linkText = MENU_LOGOUT_LINK)
	private WebElement logoutLink;

	@FindBy(xpath = "/html/body/div[@id='container']/div[@id='wrapper']/div[@id='content']/section/div[@id='results']/*/*/div[@class='movie_cover']/div[@class='nocover']")
	private List<WebElement> forAmountFilms;

	@FindBy(xpath = "/html/body/div[@id='container']/div[@id='wrapper']/div[@id='content']/section/div[@id='results']/a[1]")
	private WebElement firstFilm;
	
	@FindBy(xpath = DASHBOARD_MENU)
	private WebElement dashboardMenu;

	public InternalPage clickHomePage() {
		homeLink.click();
		return pages.internalPage;
	}

	public InternalPage clickAdministration() {
		menuAdministration.click();
		return pages.internalPage;
	}
	
	public InternalPage clickAdministrationProcesses() {
		menuAdministrationProcesses.click();
		return pages.internalPage;
	}

	public InternalPage clickAdministrationProcessesContainers() {
		menuAdministrationProcessesContainers.click();
		return pages.internalPage;
	}
	
	public InternalPage clickDatasourcesLink() {
		menuDatasourcesLink.click();
		return pages.internalPage;
	}

	public InternalPage clickReconciliationCasesLink() {
		menuReconciliationCasesLink.click();
		return pages.internalPage;
	}

	public InternalPage clickRoutingLink() {
		menuRoutingLink.click();
		return pages.internalPage;
	}

	public InternalPage clickSessionLink() {
		menuSessionLink.click();
		return pages.internalPage;
	}

	public UserProfilePage clickUserProfilePage() {
		userProfileLink.click();
		return pages.userProfilePage;
	}

	public UserManagementPage clickUserManagementLink() {
		userManagementLink.click();
		return pages.userManagementPage;
	}

	public LoginPage clickLogoutLink() {
		logoutLink.click();
		return pages.loginPage;
	}

	public InternalPage openDashboardMenu() {
		Actions actions = new Actions(driver);
		actions.moveToElement(dashboardMenu).build().perform();
		return pages.internalPage;
	}
	
	public boolean confirmAmountsAdd() {
		System.out.println("afterAmountFilms " + afterAmountFilms);
		System.out.println("forAmountFilms " + forAmountFilms.size());
		if (afterAmountFilms + 1 == forAmountFilms.size()) {
			return true;
		}
		return false;
	}

	public FilmManagementPage clickToFirstFilm() {
		firstFilm.click();
		return pages.filmManagementPage;
	}

	public boolean confirmAmountsDelete() {
		driver.navigate().refresh();
		pages.internalPage.ensurePageLoaded();
		System.out.println("afterAmountFilms " + afterAmountFilms);
		System.out.println("forAmountFilms " + forAmountFilms.size());
		if (afterAmountFilms - 1 == forAmountFilms.size()) {
			return true;
		}
		return false;
	}
}
