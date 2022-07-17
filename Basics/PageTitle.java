package playwright;
import com.microsoft.playwright.*;

public class PageTitle {
	public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch();
	      Page page = browser.newPage();
	      page.navigate("http://www.google.com");
	      System.out.println(page.title());
	    }
	  }
}
