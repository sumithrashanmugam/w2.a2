package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
    	WebElement elementFirstname=driver.findElement(By.id("firstNameField"));
		elementFirstname.sendKeys("riya");
		driver.findElement(By.id("lastNameField")).sendKeys("s");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("rinu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sumi");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("fresher");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rinusumi0905@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj = new Select(state);
		obj.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
        driver.findElement(By.id("createContactForm_importantNote")).sendKeys("officeUseOnly");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(" page title is : " + title);
        driver.close();
	}

}
