package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {

    private SignInPage page = new SignInPage();

    @Then("Input login and password")
    public void inputLoginAndPassword() {
        page.inputLogin(UserConfig.USER_LOGIN);
        page.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Login User")
    public void loginUser() {
        page.clickSignIn();
    }
}
