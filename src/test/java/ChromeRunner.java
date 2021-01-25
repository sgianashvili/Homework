import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static java.lang.Thread.sleep;

public class ChromeRunner {

        @BeforeTest
    public  void setUp()  {

        Configuration.browser = "chrome";
        sleep(3000);
        Configuration.baseUrl = "https://roomshotels.com/tbilisi/";
        System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://roomshotels.com/tbilisi/");
    }

        @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.close();
    }


    }

