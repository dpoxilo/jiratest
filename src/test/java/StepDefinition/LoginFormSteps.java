package StepDefinition;

import PageObjectJira.LoginForm;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class LoginFormSteps extends LoginForm {
    public static void login() {
        loginJira.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginJira.setValue("dpohilo");
        passwordJira.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordJira.setValue("123Qwerty");
        buttonLogIn.click();
    }

    public static void authorizeAssertion() {
        authorizeAssert.shouldBe(visible);
        authorizeAssert.shouldHave(attribute("alt", "Пользовательский профиль для dpohilo"));
    }
}
