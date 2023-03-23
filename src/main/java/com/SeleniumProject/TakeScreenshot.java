package com.SeleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {



		public static void main(String[] args) {
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver(option);
			
			driver.get("https://www.amazon.in/");

			TakesScreenshot screenshot = (TakesScreenshot)driver;

			File source = screenshot.getScreenshotAs(OutputType.FILE);

			File finaldestination = new File("./snaps/img.png");

			try {
				FileUtils.copyFile(source, finaldestination);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
