package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Testbase {
	protected WebDriver driver=null;
	//public WebDriver driver;
	 public Properties prop;
	public void loadprop() throws IOException  {
	FileInputStream propo=new FileInputStream("C:\\mavenproject\\MockTestautomation2\\src\\test\\resources\\config.properties");
	prop=new Properties();
	prop.load(propo);
	}
	@BeforeTest
	public void SetConfig() throws IOException {
		loadprop();
		
		String browser=prop.getProperty("browser").toLowerCase();{
			if(browser.equalsIgnoreCase("chrome")) {
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			}else if(browser.equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			}


	}


	}}
