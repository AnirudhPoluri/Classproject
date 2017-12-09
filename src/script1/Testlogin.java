package script1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Lib;
import pompages.Loginpage;

public class Testlogin extends BaseTest {
	@Test
	public void testlogin() {
		
		Loginpage l =new Loginpage(driver);
		String un1 =Lib.getCellvalue(Excel_path,"validlogin", 1, 0);
		String pwd =Lib.getCellvalue(Excel_path,"validlogin", 1, 1);
		String ExpectedTitle =Lib.getCellvalue(Excel_path,"validlogin", 1, 2);
	
	l.login(un1,pwd);
	String acttitle = driver.getTitle();

	String actualtitle = driver.getTitle();
	SoftAssert s = new SoftAssert();
	s.assertEquals(actualtitle, ExpectedTitle);
	s.assertAll();

	
	
	}
	

}
