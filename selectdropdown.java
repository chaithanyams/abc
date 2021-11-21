package com.java.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectdropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chaithanyatm\\eclipse-workspace\\Seleniumtraining\\jar\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        
        
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

	}

}
