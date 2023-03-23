package com.SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement hero=driver.findElement(By.cssSelector("#superheros"));
		
		Select opt = new Select(hero);
		
		opt.selectByVisibleText("Ant-Man");
		boolean mul = opt.isMultiple();
		
		System.out.println(mul);
		
		opt.selectByIndex(2);
		opt.selectByValue("bt");
		opt.selectByVisibleText("Daredevil");
	
		opt.deselectByIndex(2);
		
		driver.quit();
		}
		
	}


