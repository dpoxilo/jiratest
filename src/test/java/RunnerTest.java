import Hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static StepDefinition.FourthPageSteps.*;
import static StepDefinition.LoginFormSteps.authorizeAssertion;
import static StepDefinition.LoginFormSteps.login;
import static StepDefinition.SecondPageSteps.*;
import static StepDefinition.ThirdPageSteps.*;
import static com.codeborne.selenide.Selenide.open;

public class RunnerTest extends WebHooks {
    //Авторизация
    @Test
    public void testLoginForm() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
    }

    //Переход в проект TestProject и задачу TestSelenium
    @Test
    public void testSecondPage() {
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
        secondPageAssertion();
    }

    //Новый баг с заполнением
    @Test
    public void testThirdPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
        clickToCreateNewTask();
        setIssueType();
        setErrorTheme();
        setErrInfo();
        setOption();
        setPriority();
        setHashTag();
        setMoreInfo();
        clickToAssignMe();
        clickSubmit();
        thirdPageAssertion();
    }
    //Изменения статуса задачи
    @Test
    public void testFourthPage() {
        open("https://edujira.ifellow.ru/");
        login();
        authorizeAssertion();
        clickToFindTask();
        clickToCheckStatus();
        clickToSetReady();
        clickToCheckFinalStatus();
    }
}
