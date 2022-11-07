package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgProgram {

	WebDriver driver;

	@BeforeTest

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/index.html?e=1");

	}

	@Test

	public void titleTest() {

		String title = driver.getTitle();

		System.out.println(title);
		
		System.out.println("i love programming");
	}

	@AfterTest

	public void closedBrowser() {

		driver.close();

	}

}
