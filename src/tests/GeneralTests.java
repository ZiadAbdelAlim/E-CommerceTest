package tests;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class GeneralTests {
	
	ChromeDriver driver;
	String Main;
	String TempMail;
	
	@BeforeTest
	public void SetupEnv()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ziad\\Documents\\Automation\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
		
	}
	public void InvokeBrowser()
	{	
		
		driver.get("https://www.amazon.com/");
		
	}
	
	//Simple Functionality Test "Shopping by Department"
	@Test(priority = 1)
	public void Test1() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[4]/div[1]/a[1]/i[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[11]/a[1]")).click();
		driver.findElement(By.cssSelector("body.a-m-us.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate.lock-position:nth-child(2) div.celwidget.nav-sprite-v1.hmenu-visible:nth-child(3) div.nav-ignore-pinning.hmenu-translateX div:nth-child(3) ul.hmenu.hmenu-visible:nth-child(1) ul.hmenu-compress-section:nth-child(11) li:nth-child(6) > a.hmenu-item")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Watches")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("$25 to $50")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Casio Men's G-Shock Quartz Watch with Resin Strap")).click();
		
	}
	
	//Email Generating Test
	@Test(priority = 2)
	public void Test2() throws InterruptedException
	{
		driver.findElement(By.id("nav-logo-sprites")).click();;
		Main = driver.getWindowHandle();
	

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://temp-mail.org/en/");
		
		WebElement CpyBtn = driver.findElement(By.id("click-to-copy"));
		while(CpyBtn.isEnabled() == false) {}
		
		CpyBtn.click();
		Thread.sleep(2000);
		
	
		
		driver.switchTo().window(Main);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		
			
	}
	
	//Positive Account Creation Test
	@Test(priority = 3)
	public void Test3()
	{	
		
		String Name = "TestName1234";
		String Pass = "Abc123!@";
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(Name);
		driver.findElement(By.id("ap_email")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.id("ap_password")).sendKeys(Pass);
		driver.findElement(By.id("ap_password_check")).sendKeys(Pass);
		
		driver.findElement(By.id("continue")).click();
		
		
	}
	
	
	@AfterTest
	public void TestEnd()
	{
		
		driver.close();
		driver.quit();
		
		
	}
	

}
