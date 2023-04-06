package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.StudyMateLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class StudyMateLogin_steps {

    StudyMateLoginPage studyMateLoginPage = new StudyMateLoginPage();


    @Given("user on study mate application")
    public void user_on_study_mate_application() {
       Driver.getDriver().get(Config.getValue("studyMateURL"));



    }
    @Given("user enters credentials {string} and {string} and clicks login")
    public void user_enters_credentials_and_and_clicks_login(String email, String password) {
        studyMateLoginPage.emailInputBox.sendKeys("studymate@gmail.com");
        studyMateLoginPage.passwordInputBox.sendKeys("123123");
        studyMateLoginPage.loginButtonS.click();
        Flow.wait(500);

    }
    @Then("user should be successfully login to application")
    public void user_should_be_successfully_login_to_application() {



    }
}
