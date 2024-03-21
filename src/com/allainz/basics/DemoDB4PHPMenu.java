package com.allainz.basics;


import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDB4PHPMenu {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();
        
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        
        driver.findElement(By.id("input_username")).sendKeys("admin");
        driver.close();
        
        driver.switchTo().window(windows.get(0));
        
        System.out.println(driver.getTitle());
        
        
        //click on phpMyAdmin »

	}

}
