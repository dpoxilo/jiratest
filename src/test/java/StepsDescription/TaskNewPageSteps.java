package StepsDescription;

import PageObject.TaskNewPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskNewPageSteps extends TaskNewPage {
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

    public static void setFixInVersions() {
        fixInVersions.doubleClick();
    }

    public static void setPriority() {
        prior.click();
        prior.sendKeys("Low");
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

    public static void setVersionsAffected() {
        versionsAffected.doubleClick();
    }

    public static void clickToAssignMe() {
        assignMe.click();
    }

    public static void clickSubmit() {
        submit.click();
    }

    //Assert
    public static void taskNewPageAssertion() {
        newTaskAssert.shouldHave(Condition.visible);
    }
}
