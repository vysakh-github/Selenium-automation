package com.allainz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		driver.quit();

	}

}
