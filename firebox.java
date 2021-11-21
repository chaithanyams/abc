package com.java.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\chaithanyatm\\eclipse-workspace\\testng homework\\jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("chaithanya");
		driver.findElement(By.id("lastName")).sendKeys("T");
		driver.findElement(By.id("userEmail")).sendKeys("chaithanyareddy247@gmail.com");

		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7993505472");

		driver.findElement(By.id("dateOfBirthInput")).sendKeys("");
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("June");
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1999");
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--003']")).click();
		WebElement Sub = driver.findElement(By.id("subjectsInput"));
		Sub.sendKeys("Chemistry");
		Thread.sleep(1000);
		Sub.sendKeys(Keys.ENTER);
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.id("uploadPicture"))
				.sendKeys("C:\\Users\\chaithanyatm\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.id("currentAddress")).sendKeys("chittoor");
		WebElement State = driver.findElement(By.id("react-select-3-input"));
		State.sendKeys("Haryana");
		//Thread.sleep(2000);
		State.sendKeys(Keys.ENTER);
		WebElement City = driver.findElement(By.id("react-select-4-input"));
		City.sendKeys("Karnal");
		Thread.sleep(2000);
		City.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();
		
		

		
	}

}
