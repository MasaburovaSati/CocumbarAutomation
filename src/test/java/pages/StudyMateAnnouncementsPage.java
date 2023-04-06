package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StudyMateAnnouncementsPage {
    public StudyMateAnnouncementsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//nav/a")
    public List<WebElement> sidebarOptions;

    @FindBy (id = "mui-component-select-groupId")
    public WebElement searchGroupFilter;

    @FindBy (xpath = "(//ul[@role='listbox'])/li")
    public  List<WebElement> dropdownListGroupName;

    @FindBy(xpath = "((//div/header)[2]/..//div/span/../div)")
    public List<WebElement> groupsName;

    @FindBy (xpath = "((//div/header)[2]/..//div/span/../div)/div[2]")
    public List<WebElement> announcementsInsideGroup;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public List<WebElement> paginationList;














}
