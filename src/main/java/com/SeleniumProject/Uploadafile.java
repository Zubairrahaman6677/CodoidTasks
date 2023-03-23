package com.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadafile {

	public static void main(String[] args) {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.foundit.in/");
	  
	driver.findElement(By.xpath("//div[normalize-space (text()='         Upload Resume       ')and @class='heroSection-buttonContainer_secondaryBtn__text']")).click();
	driver.findElement(By.id("file-upload")).sendKeys("E:\\downlodes\\Zubair 2019 Civil Updated Resume (final).pdf");
	//sendkeys methods work while type == file
	
	}

}
