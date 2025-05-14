package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Loginpages;

public class Testcase extends Testbase{
	public Loginpages logas;
	@BeforeClass
	public void objit() {
		logas=new Loginpages(driver);
	}
	@Test
public void posttest() {

		logas.enterproduct("Apple watches");
		logas.dropdown();
		logas.search();
}

}







