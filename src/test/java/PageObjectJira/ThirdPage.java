package PageObjectJira;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ThirdPage {
    public static SelenideElement createNewTask = $x("//*[@id='create_link']");
    public static SelenideElement issueType = $x("//*[@id='issuetype-field']");
    public static SelenideElement errorTheme = $x("//*[@id='summary']");
    public static SelenideElement errorInfo = $x("(//iframe[contains(@id, 'mce')])[1]");
    public static SelenideElement option = $x("//option[@value='10001']");
    public static SelenideElement prior = $x("//input[@id='priority-field']");
    public static SelenideElement hashTag = $x("//*[@id='labels-textarea']");
    public static SelenideElement moreInfo = $x("(//iframe[contains(@id, 'mce')])[2]");
    public static SelenideElement assignMe = $x("//*[@id='assign-to-me-trigger']");
    public static SelenideElement submit = $x("//*[@id='create-issue-submit']");
    public static SelenideElement newTaskAssert = $x("//*[@id='aui-flag-container']/div/div/a");
}
