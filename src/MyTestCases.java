import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

WebDriver driver= new ChromeDriver ();

String myWebsite = "https://magento.softwaretestingboard.com/";
String signupPage="https://magento.softwaretestingboard.com/customer/account/create/";
	
	
	
	
@BeforeTest
public void Mysetup () throws InterruptedException {
	driver.get(myWebsite); 
	driver.manage().window().maximize();
	//driver.get(myWebsite2);

	driver.navigate().to(myWebsite);
//	driver.navigate().back();
//	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl().toUpperCase());
	System.out.println(driver.getTitle().toUpperCase());
	Thread.sleep(5000);
	driver.navigate().refresh();
}


@Test (priority=1)
public void	signUp () throws InterruptedException {
	driver.findElement(By.partialLinkText("Create an Account")).click();
	Thread.sleep(5000);
	 driver.navigate().refresh();
	driver.findElement(By.partialLinkText("Create an Account")).click();
	WebElement FirstName= driver.findElement(By.id("firstname"));
	FirstName.sendKeys("baraa");
	Thread.sleep(2000);
	WebElement LastName=driver.findElement(By.id("lastname"));
	LastName.sendKeys("nasr");
	Thread.sleep(2000);
	WebElement Email=driver.findElement(By.id("email_address"));
	Email.sendKeys("baraanasr58@gmail.com");
	Thread.sleep(2000);
	WebElement Password= driver.findElement(By.id("password"));
	Password.sendKeys("Baraa1234*");
	Thread.sleep(2000);
	WebElement ConfirmPaswword=driver.findElement(By.id("password-confirmation"));
	ConfirmPaswword.sendKeys("Baraa1234*");
	Thread.sleep(2000);
	WebElement CreateanAccount=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
	CreateanAccount.click();
}






	
	
	
	
	
}
