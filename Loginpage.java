package vtiger_crm_pomclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;



public class Loginpage extends BaseTestcls {
	@Test
	public void login() throws Throwable {

		openBrowser();

		LoginPom lp = new LoginPom(driver);
		lp.setUserNametxt("admin");
		lp.setPasswordTxt("root");
		lp.setLoginBtn();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Customerpom cp = new Customerpom(driver);
		cp.setContactBtn();
		cp.setCreateContactBtn();
		cp.setlastNametxt("krishna");
		cp.setAssignedToBtn();
		cp.setSaveBtn();

		Organisationpom op = new Organisationpom(driver);
		op.setOrganisationBtn();
		Thread.sleep(2000);
		op.setCreateOrganisationBtn();
		Thread.sleep(2000);
		op.setorganisationNametxt("qspider");
		Thread.sleep(2000);
		op.setAssignedToBtn();
		Thread.sleep(2000);
		op.setSaveBtn();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();
	     
	     
	     
		Productspom pp = new Productspom(driver);
		pp.setProduct();
		Thread.sleep(2000);

		pp.setCreateProductBtn();
		Thread.sleep(2000);
		pp.setProductName("oven");
		Thread.sleep(2000);
		pp.setSaveBtn();

		  Salespom sp=new Salespom(driver); 
		  sp.setMoreBtn(); 
		  sp.setSalesOrderBtn(); 
		  sp.setCreateSalesOrderBtn();
		  sp.setSubjectTxt("krishna");
		  sp.invoicemethods(); 
		  sp.setAssignedBtn();
		  sp.invoicemethods();
		  sp.setOrgNamedBtn(driver);
		  sp.setBillingAddTxt("helo this is my address");
		  sp.setCopyBillingAdd(); 
    	  sp.setItemNameProductIcon();
    	  sp.setQty();
    	  sp.setSaveBtn();
		 

		InvoicePom ip = new InvoicePom(driver);
		ip.setMoreBtn();
		ip.setInvoiceBtn();
		ip.setCreateInvoiceBtn();
		ip.setSubBtn("krishna");
		ip.setOrgCreateBtn();
		ip.setBillAdd("this is some address");
		ip.setCopyBill();
		ip.setIteamNameproducticon();
		ip.setQty();
		ip.setSaveBtn();
//		
//		Close();

	}

}
