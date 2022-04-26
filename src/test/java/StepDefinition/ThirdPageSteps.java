package StepDefinition;

import PageObjectJira.ThirdPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ThirdPageSteps extends ThirdPage {
    public static void clickToCreateNewTask() {
        createNewTask.click();
    }
    public static void setIssueType() {
        issueType.sendKeys("Ошибка");
        issueType.pressEnter();
    }
    public static void setErrorTheme() {
        errorTheme.click();
        errorTheme.setValue("Ошибка jiratest \"Похило\"");
    }
    public static void setErrInfo() {
        Selenide.switchTo().defaultContent();
        SelenideElement iframe = errorInfo;
        Selenide.switchTo().frame(iframe);
        $x("//body[@id='tinymce']/p").sendKeys("Описание бага jiratest");
        Selenide.switchTo().defaultContent();
    }
    public static void setOption() {
        option.doubleClick();
    }
    public static void setPriority() {
        prior.sendKeys("Medium");
        prior.pressEnter();
    }
    public static void setHashTag() {
        hashTag.sendKeys("jiratest");
        hashTag.pressEnter();
    }
    public static void setMoreInfo() {
        Selenide.switchTo().defaultContent();
        SelenideElement iframe = moreInfo;
        Selenide.switchTo().frame(iframe);
        $x("//body[@id='tinymce']/p").sendKeys("Стандартное");
        Selenide.switchTo().defaultContent();
    }
    public static void clickToAssignMe() {
        assignMe.click();
    }
    public static void clickSubmit() {
        submit.click();
    }
    public static void thirdPageAssertion() {
        newTaskAssert.shouldHave(Condition.visible);
    }
}
