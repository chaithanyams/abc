package com.java.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chaithanyatm\\eclipse-workspace\\testng homework\\jar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		
	}

}
