package StepsDescription;

import PageObject.TaskStatusPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TaskStatusPageSteps extends TaskStatusPage {
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

    //Assert
//    public static void checkFinalStatus1() {
//        while (!taskStatusCheck.getText().equals("ГОТОВО")) {
//            taskStatusCheck.getText();
//        }
//        Assert.assertEquals("Статус задачи не верный", "ГОТОВО", taskStatusCheck.getText());
//    }

    public static void checkFinalStatus2() {
        switch (taskStatusCheck.getText()) {
            case ("СДЕЛАТЬ"):
                sleep(4000);
            case ("ГОТОВО"):
                System.out.println("Статус задачи: ГОТОВО");
                break;
            default:
                System.out.println("Статус задачи не изменился, ОШИБКА!!!");
                break;
        }
    }

    public static void checkFinalStatus3() {
        taskStatusCheck.shouldHave(Condition.text("ГОТОВО"));
    }
}
