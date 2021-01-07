
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Visible;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;


public class Homework5 {
    @Test
    public void test() throws InterruptedException {

        Configuration.browser = "chrome";
        Thread.sleep(3000);
        Configuration.baseUrl = "https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.facebook.com/");

        $("#u_0_2").click();
        $("#reg").shouldBe(Condition.visible);
        $(By.name("firstname")).setValue("სოფიო");
        $(By.name("lastname")).setValue("გიანაშვილი");

        $(By.name("reg_email__")).setValue("darkangeeel@mail.ru");
        $(By.name("reg_email_confirmation__")).shouldBe(Condition.visible).setValue("darkangeeel@mail.ru");

        $("#password_step_input").setValue("darkagel22");
        $("#month").selectOption("Nov");
        $("#day").selectOptionContainingText("16");
        $("#year").selectOptionContainingText("1992");

        $(by("data-name", "gender_wrapper")).lastChild().click();
        $(byName("preferred_pronoun")).selectOptionContainingText("She: \"Wish her a happy birthday!\"");
        $(byName("custom_gender")).shouldBe(Condition.visible).setValue("HelloWorld");

        $(by("data-name", "gender_wrapper")).lastChild().click();
        sleep(3000);
    }








}