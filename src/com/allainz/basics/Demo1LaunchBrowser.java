package com.allainz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {
	
	public static void main(String[]args) {
		
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		WebDriver driver=null;
		String browser="edge";
		if(browser.equalsIgnoreCase("ch"))
		{
		driver=new ChromeDriver();
	}
		else
		{
			driver= new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		
}
}
