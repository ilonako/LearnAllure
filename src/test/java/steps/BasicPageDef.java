package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {

    private BasicPage page = new BasicPage();

    @Then("Click Sign In button")
    public void clickSignInButton() {
        page.clickSingIn();
    }

    @Then("Content with {string} is visible")
    public void contentWithIsVisible(String text) {
        page.contentByTextIsVisible(text);
    }
}
