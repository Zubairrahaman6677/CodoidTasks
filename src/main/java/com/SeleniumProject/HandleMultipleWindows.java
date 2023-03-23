package com.SeleniumProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {

	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight'][1]")).click();
		
		String Windowid =driver.getWindowHandle();
		  
		System.out.println(Windowid);
		
//		driver.switchTo().window(Windowid);
		
		Set <String> Windowids = driver.getWindowHandles();

		
		List<String> WindowidsList = new ArrayList <String>(Windowids);

		String ParentWindow = WindowidsList.get(0);
		String ChildWindow = WindowidsList.get(1);
		driver.switchTo().window(ChildWindow);
		System.out.println(Windowids);
		System.out.println(ParentWindow+ChildWindow);

		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
	}
}
