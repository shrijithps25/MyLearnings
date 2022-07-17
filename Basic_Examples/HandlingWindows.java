package practiceexamples;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String window1 = driver.getWindowHandle();
		driver.executeScript("window.open('https://www.google.com','_blank');");
		String window2 = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.switchTo().window(window1);
	}

}
