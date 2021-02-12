package vtiger_crm_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customerpom {
	
	WebDriver driver;
	
	public Customerpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactBtn;

	@FindBy(xpath="//img[contains(@title,'Create')]")
	WebElement createContactBtn;
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastNametxt;
	@FindBy(xpath="//input[@onclick='toggleAssignType(this.value)'][1]")
	WebElement assignedToBtn;
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	WebElement saveBtn ;
	
	public void setContactBtn() {
		contactBtn.click();
	}

	public void setCreateContactBtn() {
		createContactBtn.click();
	}
	
	public void setlastNametxt(String lname) {
		lastNametxt.sendKeys(lname);
	}

	public void setAssignedToBtn() {
		assignedToBtn.click();
	}
	public void setSaveBtn() {
		saveBtn.click();
		
	}
	
	
}
