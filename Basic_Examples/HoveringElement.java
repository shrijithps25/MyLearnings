package practiceexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoveringElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Actions action = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]"));
		action.moveToElement(target).perform();
	}

}
