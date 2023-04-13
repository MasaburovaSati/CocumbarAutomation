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

    @FindBy (xpath = "//button[.='Add an announcement']")
    public WebElement addAnAnnouncement;

     @FindBy (xpath = "//p[.='Add an announcement']")
    public WebElement textAddAnnouncement;


     @FindBy (xpath = "//textarea[@name='text']")
    public WebElement textOfAnnouncement;

     @FindBy (id = "mui-component-select-groups")
    public WebElement groupOption;

     @FindBy (xpath = "(//ul[@role='listbox'])/li")
    public List<WebElement> listGroupName;

     @FindBy (xpath = "//button[.='Add']")
    public WebElement addBtn;

     @FindBy (xpath = "(//button)[4]")
    public  WebElement threeDotsBtn;

     @FindBy (xpath = "(//ul)[2]")
    public List<WebElement> threeDotDropdown;

    @FindBy(xpath = "//p[.='pagination.show']/../p[2]")
    public WebElement totalAmountResult;

    @FindBy (xpath = "//button[.='Save']")
    public WebElement saveBtn;

    @FindBy (xpath = "(//div/p)[2]")
    public WebElement firstAnnouncementText;





    public int getAnAnnouncement() {
        String totalResultStr = totalAmountResult.getText();
        String totalNum = totalResultStr.substring(totalResultStr.indexOf(" ") + 1);
        int totalNumInt = Integer.parseInt(totalNum.trim());
        return totalNumInt;
    }

















}
