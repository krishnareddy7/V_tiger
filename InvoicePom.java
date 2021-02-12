package vtiger_crm_pomclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePom {

	WebDriver driver;

	public InvoicePom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreBtn;

	@FindBy(xpath = "//a[@id='more' and @name='Invoice']")
	private WebElement invoiceBtn;

	@FindBy(xpath = "//img[@title='Create Invoice...']")
	private WebElement createInvoiceBtn;

	@FindBy(xpath = "//input[@class='detailedViewTextBox' and @name='subject']")
	private WebElement subBtn;
	
	@FindBy(xpath="//img[@title='Select' and @onclick='selectSalesOrder();']")
	private WebElement salesSelectBtn;
	
	@FindBy(xpath="//img[@title='Select' and contains(@onclick,'selectCon')]")
	 private WebElement contactSeleBtn;
	
	
	@FindBy(xpath="//img[@title='Select' and contains(@onclick,'return')]")
	  private WebElement orgCreateBtn;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billAdd;
	
	@FindBy(xpath="//input[@name='cpy' and contains(@onclick,'Right')]")
	private WebElement copyBill;
	
	@FindBy(xpath="//td[@class='small']/img[@title='Products']")
	private WebElement iteamNameproducticon;
	@FindBy(name="qty1")
	private WebElement qty;
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement saveBtn;
	
	
	public void setSaveBtn() {
		saveBtn.click();
	}
	
	public void setIteamNameproducticon() {
		iteamNameproducticon.click();
//		String main = driver.getWindowHandle();
//		Set<String> han = driver.getWindowHandles();
//		for(String ha:han) {
//		if(!ha.equals(main))
//			driver.switchTo().window(ha);
//		WebElement pro = driver.findElement(By.xpath("//a[@id='popup_product_15']"));
//		pro.click();
//	}
		
		String main = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		for (String wi : win) {
			if (!wi.equals(main)) {
				driver.switchTo().window(wi);
				WebElement path = driver.findElement(By.linkText("oven"));
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

				path.click();

//				Alert al = driver.switchTo().alert();
//				al.accept();
				driver.switchTo().window(main);
			}
		}
		
	}
	
	public void setQty() {
		qty.sendKeys("220");
	}
	
	
	public void setCopyBill() {
		copyBill.click();
	}
	
	
	public void setBillAdd(String address){
		billAdd.sendKeys(address);
	}
	
	public void setOrgCreateBtn() throws Throwable
	{
		orgCreateBtn.click();
		String main = driver.getWindowHandle();
     	Set<String> han = driver.getWindowHandles();
     	for(String ha:han) {
     		if(!ha.equals(main)) {
     		driver.switchTo().window(ha);
     		WebElement path = driver.findElement(By.linkText("jaelfi"));
     		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     		path.click();
     		Alert al = driver.switchTo().alert();
     		al.accept();
     		driver.switchTo().window(main);
     	}
	}
     	
}
	
	public void setContactSeleBtn() {
		contactSeleBtn.click();
	Set<String> han = driver.getWindowHandles();
		for(String ha:han) {
		driver.switchTo().window(ha);
		driver.findElement(By.xpath("//tr[@class='lvtColData']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Alert al = driver.switchTo().alert();
		    al.accept();
		}
	}
	
	public void setSalesSelectBtn() {
		salesSelectBtn.click();
		Set<String> han = driver.getWindowHandles();
		for (String ha:han) {
		driver.switchTo().window(ha);
		
		}
	}
	

	public void setMoreBtn() {
		moreBtn.click();
	}

	public void setInvoiceBtn() {
		invoiceBtn.click();
	}

	public void setCreateInvoiceBtn() {
		createInvoiceBtn.click();
	}
	
	public void setSubBtn(String name)
	{
		subBtn.sendKeys(name);
	}
	

}
