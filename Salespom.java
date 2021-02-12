package vtiger_crm_pomclass;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Salespom {

	WebDriver driver;

	public Salespom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreBtn;

	@FindBy(xpath = "//a[@id='more'and text()='Sales Order']")
	private WebElement salesOrderBtn;

	@FindBy(xpath = "//img[contains(@title,'Create')]")
	private WebElement createSalesOrderBtn;

	@FindBy(name = "subject")
	private WebElement subjectTxt;

	@FindBy(name = "sostatus")
	private WebElement statusBtn;

	@FindBy(xpath = "//input[@onclick='toggleAssignType(this.value)'][1]")
	private WebElement assignedToBtn;

	@FindBy(xpath = "(//img[@title='Select'])[4]")
	private WebElement orgNameSymbol;

	@FindBy(name = "invoicestatus")
	private WebElement invoiceStatusDrpdown;

	@FindBy(name = "bill_street")
	private WebElement billingAddTxt;

	@FindBy(xpath = "//b[text()='Copy Billing address']/..//input[@name='cpy']")
	private WebElement copyBillingAdd;

	@FindBy(xpath = "//td[@class='small']/img[@title='Products']")
	private WebElement iteamNameproducticon;

	@FindBy(xpath = "(//input[@value='  Save  '])[2]")
	private WebElement saveBtn;

	public void setMoreBtn() {
		moreBtn.click();
	}

	public void setSalesOrderBtn() {
		salesOrderBtn.click();
	}

	public void setCreateSalesOrderBtn() {
		createSalesOrderBtn.click();
	}

	public void setSubjectTxt(String name) {
		subjectTxt.sendKeys(name);
	}

	public void setAssignedBtn() {
		assignedToBtn.click();
	}

	@FindBy(name="qty1")
	private WebElement qty;
	
	public void setOrgNamedBtn(WebDriver driver) throws Throwable {
		orgNameSymbol.click();

		String main = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		for (String wi : win) {
			if (!wi.equals(main)) {
				driver.switchTo().window(wi);
				WebElement path = driver.findElement(By.linkText("qspider"));
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

				path.click();

				Alert al = driver.switchTo().alert();
				al.accept();
				driver.switchTo().window(main);

			}
		}

	}

	public void setBillingAddTxt(String add) {
		billingAddTxt.sendKeys(add);
	}

	public void setCopyBillingAdd() {
		copyBillingAdd.click();
	}

	public void setItemNameProductIcon() throws InterruptedException {
		iteamNameproducticon.click();
		String main1 = driver.getWindowHandle();
		Set<String> han = driver.getWindowHandles();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (String ha : han) {
			if (!ha.equals(main1)) {
				driver.switchTo().window(ha);
			
			WebElement pro = driver.findElement(By.id("popup_product_15"));
			Thread.sleep(3000);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(pro));
			pro.click();
			driver.switchTo().window(main1);
		}
		}
	}
	

	public void setSaveBtn() {
		saveBtn.click();
	}

	public void setQty() {
		qty.sendKeys("220");
	}
	public void invoicemethods() {
		Select s = new Select(invoiceStatusDrpdown);
		s.selectByValue("AutoCreated");

	}

	public void statusMethod() {
		Select s = new Select(statusBtn);
		s.selectByValue("sostatus");

	}
}
