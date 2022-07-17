package practiceexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNGExample1 {
	WebDriver driver;

	@BeforeSuite
	public void suite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void c() {
		System.out.println("before class");
	}

	@BeforeTest(groups = { "betas", "Alphas" })
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method got executed");
	}

	@BeforeGroups(groups = "betas")
	public void methid1() {
		System.out.println("You have executed before method");
	}

	@Test(groups = "betas")
	public void method() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		// Assert.assertEquals("Hello".equals(title),"Softassertfailure");
//		Assert.assertEquals("Go", title);
//		Assert.assertEquals(title.equals("xyz"),"Softassert");
//		Assert.assertEquals("he","he","Check-02");
		System.out.println("kl");
		// softassert.assertAll("let me know the assertion failure");

	}

	@Test(testName = "check-01")
	public void me() {
		System.out.println("check-01");
	}

	@Test(groups = "new")
	@Parameters({ "name", "age" })
	public void newcheck(String name, String age) {
		System.out.println(name);
		System.out.println(age);
	}

	@Test(dataProvider = "test")
	public void mymethod12(String name) {
		System.out.println(name);
	}
	
	@DataProvider(name="test")
	public Object[][] data() {
		return new Object[][] {{"shrijith"},{"anil"}};
	}

	@Test(groups = "Alphas")
	public void mymethod() {
		System.out.println("ALPHA TEST1");
	}

	@Test(groups = "Alphas")
	public void mymethod1() {
		System.out.println("ALPHA TEST1");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
		System.out.println("after Test got executed");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod method got executed");
	}
}
