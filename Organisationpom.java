package vtiger_crm_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationpom {
	
WebDriver driver;
	
	public Organisationpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organisationBtn;

	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrganisationBtn;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationNametxt;
	@FindBy(xpath="//input[@onclick='toggleAssignType(this.value)'][1]")
	private WebElement assignedToBtn;
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
    private	WebElement saveBtn ;
	
	
	public void setOrganisationBtn() {
		organisationBtn.click();
	}

	public void setCreateOrganisationBtn() {
		createOrganisationBtn.click();
	}
	
	public void setorganisationNametxt(String orgName) {
		organisationNametxt.sendKeys(orgName);
		
	}

	public void setAssignedToBtn() {
		assignedToBtn.click();
	}
	public void setSaveBtn() {
		saveBtn.click();
	}
	
	
	
}
