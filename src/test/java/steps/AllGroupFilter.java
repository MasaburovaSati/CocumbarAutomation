package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.StudyMateAnnouncementsPage;
import utilities.Flow;

public class AllGroupFilter {
    StudyMateAnnouncementsPage studyMateAnnouncementsPage = new StudyMateAnnouncementsPage();
    int groupName;

    @When("user choose all group name")
    public void user_choose_all_group_name() {
        groupName = studyMateAnnouncementsPage.dropdownListGroupName.size();
       studyMateAnnouncementsPage.dropdownListGroupName.get(0).click();
        Flow.wait(500);
    }
    @Then("user should see only the announcements related all group")
    public void user_should_see_only_the_announcements_related_all_group() {
        int announcementGroupNamesSize = studyMateAnnouncementsPage.dropdownListGroupName.size();
        Assert.assertEquals("Search information by all group not match in group  name", groupName, announcementGroupNamesSize);
    }
    }

