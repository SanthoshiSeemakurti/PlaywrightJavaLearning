package playwrightLearning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {
    public static void main(String[] args)
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(150));

        Page page = browser.newPage();
        page.navigate("https://playwright.dev");

        String title = page.title();
        System.out.println("The page title: "+title);
        browser.close();
    }
}
