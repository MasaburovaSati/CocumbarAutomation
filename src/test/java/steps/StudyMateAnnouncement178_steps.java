package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.StudyMateAnnouncementsPage;
import pages.StudyMateLoginPage;
import utilities.Flow;

public class StudyMateAnnouncement178_steps {

    StudyMateAnnouncementsPage studyMateAnnouncementsPage = new StudyMateAnnouncementsPage();
    AdminPage adminPage = new AdminPage();
    int groupNumber;
    String groupName;



    @Given("user click on the announcement page located on the left side bar")
    public void user_click_on_the_announcement_page_located_on_the_left_side_bar() {
        groupNumber = adminPage.getTotalGroups();
        studyMateAnnouncementsPage.sidebarOptions.get(4).click();
        Flow.wait(500);

    }
    @When("user click on the group dropdown menu")
    public void user_click_on_the_group_dropdown_menu() {

        studyMateAnnouncementsPage.searchGroupFilter.click();
        Flow.wait(500);

    }
    @Then("user should see a list of all groups on the platform")
    public void user_should_see_a_list_of_all_groups_on_the_platform() {
        int announcementGroupNamesSize = studyMateAnnouncementsPage.dropdownListGroupName.size()-1;
        Assert.assertEquals("Search information by group not match in group page", groupNumber, announcementGroupNamesSize);
            }


    @Then("user choose any one group")
    public void user_choose_any_one_group() {
        groupName = studyMateAnnouncementsPage.dropdownListGroupName.get(1).getText() ;
        studyMateAnnouncementsPage.dropdownListGroupName.get(1).click();
        Flow.wait(500);

    }
    @Then("user should see only the announcements related to that group")
    public void user_should_see_only_the_announcements_related_to_that_group() {
        studyMateAnnouncementsPage.paginationList.get(27).click();
        for(WebElement announcementCarts: studyMateAnnouncementsPage.announcementsInsideGroup){
            Assert.assertEquals(groupName, announcementCarts.getText());
        }









    }

}
