import WebHooks.WebHooks;
import org.junit.jupiter.api.Test;

import static StepsDescription.TaskStatusPageSteps.*;
import static StepsDescription.LoginSteps.authorizeAssertion;
import static StepsDescription.LoginSteps.login;
import static StepsDescription.MainPageSteps.*;
import static StepsDescription.TaskNewPageSteps.*;
import static com.codeborne.selenide.Selenide.open;

public class RunnerTest extends WebHooks {
    //Авторизация
    @Test
    public void testLoginPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
    }

    //Переход в проект TestProject и задачу TestSelenium
    @Test
    public void testMainPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
        clickToBrowse();
        clickToMainProj();
        clickToAllTasks();
        findTotalNumberOfTasks();
        findTaskTestSelenium();
        checkingStatus();
        checkingVersion();
        mainPageAssertion();
    }

    //Новый баг с заполнением
    @Test
    public void testTaskNewPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
        clickToCreateNewTask();
        setIssueType();
        setErrorTheme();
        setErrInfo();
        setFixInVersions();
        setPriority();
        setHashTag();
        setMoreInfo();
        setVersionsAffected();
        clickToAssignMe();
        clickSubmit();
        taskNewPageAssertion();
    }

    //Изменения статуса задачи
    @Test
    public void testTaskStatusPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
        clickToFindTask();
        clickToCheckStatus();
        clickToSetReady();
//      проверка через цикл while
//      checkFinalStatus1();

//      проверка через switch case
        checkFinalStatus2();

//      проверка через shouldHave
        checkFinalStatus3();
    }
}
