package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobApplying {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careers.zohocorp.com/jobs/careers");

		// View Openings
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		// QA Engineers
		driver.findElement(By.xpath(
				"//p[text()='Experience in manual and automation testing. Knowledge of Java Programming (data types, variables, operators, flow control statements, methods (built-...']"))
				.click();
		Thread.sleep(2000);
		// I'am Interest
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(2000);
		// Name
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Salutation']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-value='Mr.']")).click();
		driver.findElement(By.xpath("(//input[@maxlength='125'])[1]")).sendKeys("A.Alagu");
		driver.findElement(By.xpath("(//input[@maxlength='125'])[2]")).sendKeys("Nitheesh Kanna");
		// Email
		driver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys("nitheeshkannan03@gmail.com");
		// PhoneNo
		driver.findElement(By.xpath("//input[@maxlength='30']")).sendKeys("8681019655");
		// Year of Graduation
		driver.findElement(By.xpath("(//input[@maxlength='250'])[1]")).sendKeys("2017");
		// Gender
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Gender1']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-value='Male']")).click();
		// Experience
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_International_Calling_Experience']"))
				.click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-value='Fresher']")).click();
		// current Employer
		driver.findElement(By.xpath("//input[@maxlength='100']")).sendKeys("Not in Work");
		// Current CTC
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Current_CTC_In_Lakhs_Per_Annum']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-value='Not Applicable']")).click();

		// Excepted CTC
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Expected_CTC_In_Lakhs_Per_Annum']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-zcqa='Expected CTC (In Lakhs Per Annum)_5-7']")).click();

		// Notice Period
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Notice_Period1']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[@data-value='Immediate']")).click();

		// SkillSet
		driver.findElement(By.xpath("//input[@id='addSkills']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='lyte-radiobutton-label-5']")).click();

		// Come Across This Vacancy
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_How_Do_You_Know_About_This_Vacancy']"))
				.click();
		driver.findElement(By.xpath("//lyte-drop-item[text()='Instagram']")).click();

		// Current Location
		driver.findElement(By.xpath("(//input[@maxlength='250'])[2]")).sendKeys("Theni");

		// Location
		driver.findElement(By.xpath("//lyte-drop-button[@data-zcqa='manual_Preferred_Location']")).click();
		driver.findElement(By.xpath("//lyte-drop-item[text()='Chennai']")).click();

		// Submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
