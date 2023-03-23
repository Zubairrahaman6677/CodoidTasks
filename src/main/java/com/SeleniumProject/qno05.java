package com.SeleniumProject;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qno05 {
	//Automate Menu and Sub Menu and click on a link in Sub Menu and 
	//navigate to the page and click on an element

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		act.moveToElement(ele).perform();
		
		WebElement game= driver.findElement(By.xpath("//a[text()='Gaming']"));
		
		game.click();
		
		driver.findElement(By.xpath("//a[@title='Gaming Laptops']")).click();
		
		String title=driver.getTitle();
		
		if(title.contains("Gaming - Buy Gaming Online at Best Prices in India")) {
			System.out.println("User landed on Gaming Page:" + title);
		
		}
		else {
			System.out.println("Error occered");
		}
		

		driver.quit();

	}
	
}
