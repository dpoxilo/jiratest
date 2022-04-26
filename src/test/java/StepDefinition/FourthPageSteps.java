package StepDefinition;

import PageObjectJira.FourthPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class FourthPageSteps extends FourthPage {
    public static void clickToFindTask() {
        findTask.click();
        findTask.setValue("Похило").pressEnter();
    }
    public static void clickToCheckStatus() {
        statusCheck.click();
        statusCheck.shouldHave(Condition.text("Сделать"));
    }
    public static void clickToSetReady() {
        setReady.click();
        $x("//span[text()='Выполнено']").click();
    }
    public static void clickToCheckFinalStatus() {
        taskStatusCheck.shouldHave(Condition.text("Готово"));
    }
}
