package StepsDescription;

import PageObject.MainPage;

import static com.codeborne.selenide.Condition.*;

public class MainPageSteps extends MainPage {
    public static void clickToBrowse() {
        browseLink.click();
    }

    public static void clickToMainProj() {
        mainProj.click();
    }

    public static void clickToAllTasks() {
        allTasks.click();
    }

    public static void findTotalNumberOfTasks() {
        findText.shouldHave(text("1"));
        System.out.println("Общее количество заведенных задач в проекте:" + " " + findText.getText());
    }

    public static void findTaskTestSelenium() {
        enterTextElement.click();
        enterTextElement.setValue("TestSelenium").pressEnter();
    }

    public static void checkingStatus() {
        checkStatus.shouldBe(visible);
        System.out.println("Задача TestSelenium имеет статус:" + " " + checkStatus.getText());
    }

    public static void checkingVersion() {
        versionCheck.shouldBe(visible);
        System.out.println("Задача TestSelenium имеет привязку в затронутой версии:" + " " + versionCheck.getText());
    }

    //Assert
    public static void mainPageAssertion() {
        findText.shouldBe(visible);
        checkStatus.shouldHave(text("В работе"));
        versionCheck.shouldHave(text("Version 2.0"));
    }
}
