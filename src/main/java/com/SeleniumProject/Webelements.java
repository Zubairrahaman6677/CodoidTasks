package com.SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
	driver.get("https://letcode.in/dropdowns");
		
		List<WebElement> hero=driver.findElements(By.tagName("select"));
		
	//	Select opt = new Select((WebElement) hero);
		
		int count=hero.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			System.out.println(i);
		}
		
		
	}

}
