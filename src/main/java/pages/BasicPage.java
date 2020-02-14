package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void contentByTextIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).isDisplayed();
    }

    public void clickSingIn() {
        $(By.xpath("//p[@class='header-auth__signin']")).click();
    }
}
