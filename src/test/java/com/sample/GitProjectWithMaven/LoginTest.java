package com.sample.GitProjectWithMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Secure shell cryptography

public class LoginTest {

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushi\\Downloads\\new folder\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	      
		System.out.println("Launching Browser");

	}

	@Test
	public void doLogin() {
		System.out.println("Executing Login Test");
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

		System.out.println("Entring Username");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ladosalvi@gmail.com");

		System.out.println("Entring password");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("lado2017@#");

		System.out.println("Clicking on login Button");
		driver.findElement(By.name("login")).click();

		System.out.println("Loginning ito facebook account");

	}

	@AfterTest
	public void QuitDriver() {
		if (driver != null)
			driver.close();
	}

}
