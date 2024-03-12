package com.allainz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6SFSignup {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		 //Select Job title as “IT Manager”
		  //Select Employees as “101-500 employees”
		 //Select country as “United Kingdom”
		Select SelectJobTitle=new  Select (driver.findElement(By.xpath("//select[@name='UserTitle']")));
		SelectJobTitle.selectByVisibleText("IT Manager");
		//CompanyEmployees
		Select Employees=new  Select (driver.findElement(By.xpath("//select[@name='CompanyEmployees']")));
		Employees.selectByVisibleText("101 - 200 employees");
		//CompanyCountry
		Select Country=new  Select (driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
		Country.selectByVisibleText("United Kingdom");
		
	}

}
