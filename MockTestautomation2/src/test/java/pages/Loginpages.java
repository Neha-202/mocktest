package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Loginpages {

	WebDriver driver;
		public Loginpages(WebDriver driver) {
			this.driver=driver;
		}	
	
public void enterproduct(String product)	
{
	WebElement entprd=driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	entprd.sendKeys(product);
}
public void dropdown() {
	WebElement drp=driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
	Select selobj=new Select(drp);
	selobj.selectByValue("281");//span[@class='gh-search-button__label']
}
public void search() {
	WebElement srh=driver.findElement(By.xpath("//span[@class='gh-search-button__label']"));
			srh.click();
}
	
}
