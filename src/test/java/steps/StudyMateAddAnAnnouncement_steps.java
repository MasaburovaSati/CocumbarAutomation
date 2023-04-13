package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;
import pages.StudyMateAnnouncementsPage;
import utilities.Flow;
import utilities.TempStorage;

import java.util.Random;

public class StudyMateAddAnAnnouncement_steps {

    String popUpsOptionText;
    String groupNumber;


    StudyMateAnnouncementsPage studyMateAnnouncementsPage = new StudyMateAnnouncementsPage();
    AdminPage adminPage = new AdminPage();
    Faker faker = new Faker();


    //201

    @When("user click on +Add announcement button")
    public void user_click_on_add_announcement_button() {
        studyMateAnnouncementsPage.addAnAnnouncement.click();
        Flow.wait(500);


    }

    @Then("user should see pup ups option")
    public void user_should_see_pup_ups_option() {
        popUpsOptionText = studyMateAnnouncementsPage.textAddAnnouncement.getText();
        Assert.assertTrue(popUpsOptionText, studyMateAnnouncementsPage.textAddAnnouncement.isDisplayed());

    }


    //202

    @When("user enter text and filling out all option")
    public void user_enter_text_and_filling_out_all_option() {
        studyMateAnnouncementsPage.textOfAnnouncement.sendKeys("Bug Saida  Good luck!");
        studyMateAnnouncementsPage.groupOption.click();
        studyMateAnnouncementsPage.listGroupName.get(3).click();
        Flow.wait(500);

    }

    @Then("user should click Add button and verify in announcement page")
    public void user_should_click_add_button_and_verify_in_announcement_page() {
        int beforeResult = studyMateAnnouncementsPage.getAnAnnouncement();
        studyMateAnnouncementsPage.addBtn.click();
        Flow.wait(500);
        int afterResult = studyMateAnnouncementsPage.getAnAnnouncement();
        Assert.assertEquals("Number of Pagination failed: " + beforeResult, afterResult, beforeResult + 1);
    }


    //203
    @When("user enter text an announcement")
    public void user_enter_text_an_announcement() {
        studyMateAnnouncementsPage.textOfAnnouncement.sendKeys("Saida Masaburova SDET");
        Flow.wait(500);


    }

    @Then("user should click Add button and verify this announcement in main page")
    public void user_should_click_add_button_and_verify_this_announcement_in_main_page() {
        int beforeResult = studyMateAnnouncementsPage.getAnAnnouncement();
        studyMateAnnouncementsPage.addBtn.click();
        Flow.wait(500);
        int afterResult = studyMateAnnouncementsPage.getAnAnnouncement();
        Assert.assertEquals("Number of Pagination failed: " + beforeResult, afterResult, beforeResult + 1);
    }




    //205
    @Then("user clicks three dots button on any announcement card")
    public void user_clicks_three_dots_button_on_any_announcement_card() {
        studyMateAnnouncementsPage.threeDotsBtn.click();



    }
    @Then("user clicks edit option")
    public void user_clicks_edit_option() {
        studyMateAnnouncementsPage.threeDotDropdown.get(0).click();
        Flow.wait(500);


    }
    @Then("user updates text of announcement")
    public void user_updates_text_of_announcement() {
        String text = faker.funnyName().name();
        TempStorage.addData("text" , text);
        studyMateAnnouncementsPage.textOfAnnouncement.clear();
        studyMateAnnouncementsPage.textOfAnnouncement.sendKeys(text);
        studyMateAnnouncementsPage.saveBtn.click();
        Flow.wait(500);
    }
    @Then("user verifies text of announcement is updated")
    public void user_verifies_text_of_announcement_is_updated() {
        String actualText = studyMateAnnouncementsPage.firstAnnouncementText.getText().trim();
        String expectedText = TempStorage.getData("text");
        Assert.assertEquals("Announcement text update failed", expectedText, actualText);

    }
}




