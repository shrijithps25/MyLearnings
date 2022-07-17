package practiceexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://getbootstrap.com/docs/5.2/components/dropdowns/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton1\"]"));
			element.click();
			List<WebElement> list = driver.findElements(By.xpath("//button[@id=\"dropdownMenuButton1\"]//parent::div//ul//li"));
			String che = "Another action";
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getText());
			}
//			for(WebElement a: list) {
//				System.out.println((a.getAttribute("innerHTML")));
//				if(a.getAttribute("innerHTML").contains("Action")){
//					Thread.sleep(2000);
//					a.click();
//				}
//			}
		}
	}