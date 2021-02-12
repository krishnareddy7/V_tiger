package vtiger_crm_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspom {

WebDriver driver;
	
	public Productspom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product;
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createproductBtn;
	
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement saveBtn;
	
	public void setProduct()
	{
		product.click();
	}
	public void setCreateProductBtn(){
		createproductBtn.click();
	}
	public void setProductName(String name)
	{
		productName.sendKeys(name);
	}
	public void setSaveBtn()
	{
		saveBtn.click();
	}
	
}
