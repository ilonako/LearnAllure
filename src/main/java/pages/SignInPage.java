package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement loginInput = $(By.id("signInEmail"));
    private SelenideElement passInput = $(By.id("signInPassword"));
    private SelenideElement signInButton = $(By.xpath("//input[@value='Sign in']"));

    public void inputLogin(String login) {
        this.loginInput.val(login);
    }

    public void inputPassword(String pass) {
        this.passInput.val(pass);
    }

    public void clickSignIn() {
        this.signInButton.click();
    }
}
