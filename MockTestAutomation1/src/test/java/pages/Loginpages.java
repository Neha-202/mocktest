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
public void login() {
	String expectedurl="https://www.facebook.com/";
	String currenturl=driver.getCurrentUrl();
	if (currenturl.contains(expectedurl)) {
		System.out.println("reached to homepage");
	}
	else {
		System.out.println("Login failed");
	}
}
public void  CreateAccount() {
	WebElement createbtn= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	createbtn.click();
}
public void Firstname(String firstnm) {
	WebElement firstname= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstname.sendKeys(firstnm);
}
public void Surname(String surname) {
	WebElement srname= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	srname.sendKeys(surname);
}
public void Dateofbirth() {
	WebElement dob= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select selobj=new Select(dob);
	selobj.selectByValue("27");
}
public void Month() {
	WebElement mon= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select selobj=new Select(mon);
	selobj.selectByValue("5");
}
public void Year() {
	WebElement yer= driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select selobj=new Select(yer);
	selobj.selectByValue("2000");
}
public void Gender() {
	WebElement gend= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gend.click();
}
public void Phonenumber(String phonenumber) {
	WebElement phn= driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	phn.sendKeys(phonenumber);}
public void Password(String password) {
	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys(password);}

public void Signup() {
	WebElement sgn= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	sgn.click();
}
public void Facebookpage() {
	String expectedurl="https://www.facebook.com/";
	String currenturl=driver.getCurrentUrl();
	if (currenturl.contains(expectedurl)) {
		System.out.println("Login successful ,reached in");
	}
	else {
		System.out.println("Login failed");
	}

	
}









}