package com.java.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;  
  
public class First {  
  
    public static void main(String[] args) {  
        
     
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\chaithanyatm\\eclipse-workspace\\testng homework\\jar\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();

    

   /* driver.get("https://duckduckgo.com");
    
    driver.findElement(By.id("search_form_input_homepage")).sendKeys ("Maveric Systems");



    driver.findElement(By.id("search_form_input_homepage")).sendKeys (Keys.ENTER);



    driver.findElement(By.className("result__url__domain")).click();




    String  str= driver.getTitle();



    String out = "Accelerating banking transformation";



    if (str.contains (out)) 
    {



    System.out.println("Test Successful");



    } 
    else 
    {



    System.out.println("Test Failed");
    }



    driver.close();*/
    	
	
      
    }  
  
} 