package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	//declaration
	@FindBy(id="username")
	private WebElement un;
	@FindBy(how=How.NAME,using="pwd")
	@CacheLookup
	private WebElement pwd;
	@FindBy(how=How.ID,using="loginButton")
	@CacheLookup
	private WebElement butt;
public Loginpage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
}
public void login(String un1,String pass) {
	
	un.sendKeys(un1);
	pwd.sendKeys(pass);
	butt.click();
	
	
	
}
	
	
	
}
