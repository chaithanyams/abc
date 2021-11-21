package com.java.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\chaithanyatm\\eclipse-workspace\\Seleniumtraining\\jar\\chromedriver.exe");  
		  //  WebDriver driver=new ChromeDriver();  
		    System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\chaithanyatm\\eclipse-workspace\\Seleniumtraining\\jar\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

	}

}
