package com.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingFrames {


		public static void main(String[] args) {
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver(option);
			
			driver.get("https://letcode.in/frame");
			
			WebElement frame1=driver.findElement(By.id("firstFr"));
			driver.switchTo().frame(frame1);
			
			driver.findElement(By.name("fname")).sendKeys("Zubair");
			driver.findElement(By.name("lname")).sendKeys("Rahaman");

			WebElement inframe=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
			
			driver.switchTo().frame(inframe);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Zubairrahaman66@gmail.com");
		
			driver.switchTo().parentFrame();

			driver.findElement(By.name("lname")).sendKeys("Hello Selenium");

	}

}
