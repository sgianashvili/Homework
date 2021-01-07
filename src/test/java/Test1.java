import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;


public class Test1 {
    @Test
    public void test () throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://redmed.ge/ka");
        $(byXpath("//*[@id=\"header\"]/div/div/div[3]/div[3]/div/b")).click();
        $(".login-link-main-page").click();
        //$(By.tagName("h1")).$(byText("შესვლა")).shouldBe(Condition.visible);
        $("#telLogin").setValue("571001205").sendKeys(Keys.ENTER);
        $(byText("მონაცემები არასწორია")).shouldBe(Condition.visible);







    }


}
