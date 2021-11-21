package com.java.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplorer{
	public static void main(String args[]) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\chaithanyatm\\eclipse-workspace\\Seleniumtraining\\jar\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	//driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
}}
