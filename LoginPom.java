package vtiger_crm_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom  {

public WebDriver driver;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

@FindBy(name="user_name")
private WebElement userNametxt;

@FindBy(name="user_password")
WebElement PasswordTxt;

@FindBy(id="submitButton")
WebElement loginBtn;


public void setUserNametxt( String name) {
	userNametxt.sendKeys(name);
}

public void setPasswordTxt(String password) {
	PasswordTxt.sendKeys(password);
}

public void setLoginBtn() {
	loginBtn.click();
}


	
	
}
