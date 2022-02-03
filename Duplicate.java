package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("ssss143@gmail.com");
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@ href='/crmsfa/control/viewLead?partyId=10119'])")).click();
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.name("submitButton")).click();
	    driver.close();
	    
	    
		
	}

}
