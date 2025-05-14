package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Loginpages;

public class Testcase extends Testbase {
 public Loginpages logobj;
 @BeforeClass
 public void objinit() {
	 logobj= new Loginpages(driver);
 }
	@Test
	public void Posttest() {
		
		logobj.CreateAccount();
		logobj.login();
		logobj.Firstname("Neha");
		logobj.Surname("S");
		logobj.Dateofbirth();
		logobj.Month();
		logobj.Year();
		logobj.Gender();
		logobj.Phonenumber("9495119032");
		logobj.Password("Chottu@890");
		logobj.Signup();
		logobj.Facebookpage();
	}
}
