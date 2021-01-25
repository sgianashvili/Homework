
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//Import org.junit.ComparisonFailure;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Rooms extends ChromeRunner {

        @Test
    public void test()  {



        $(byText("Tbilisi")).shouldBe(Condition.visible);
        $(byText("Kazbegi")).shouldBe(Condition.visible);
        $(byText("Kokhta")).shouldBe(Condition.visible);


        $(".module-intro__headline").shouldHave(Condition.text("Old City. New City. "));
        $(byText("#Tbilisi")).shouldBe(Condition.visible);


        $(byText("Kazbegi")).click();
        $(".module-intro__headline").shouldHave(Condition.text("I woke up like this"));
        $(".module-intro__text-container").$(By.tagName("h3")).shouldHave(Condition.text("#Kazbegi"));
        System.out.println($(".module-intro__text-container").$(By.tagName("h3")).getText());


        Assert.assertEquals("არ ემთხვევა","#Kazbegi", $(".module-intro__text-container").$(By.tagName("h3")).getText());
        $(byText("Kokhta")).hover();


        $(byText("Tbilisi")).shouldBe(Condition.visible);
        $(".header__top__submenu", 2).shouldHave(Condition.text("Rooms Overview"));

    }



}

