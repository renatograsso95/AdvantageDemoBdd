package br.com.rsinet.HUB_BDD.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	public static WebDriver AbrirSite() {
			driver = new ChromeDriver();
			driver.get("https://www.advantageonlineshopping.com/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return  driver;
	}

	public static void fecharChrome(WebDriver driver) {
		if (driver != null)
			driver.quit();
	}
}
