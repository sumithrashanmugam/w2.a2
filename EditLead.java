package assign2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("firstName")).sendKeys("shree");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead/partyId=10120'])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	
	
	

	
}
}