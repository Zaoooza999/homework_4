package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class searchcodeinpage {

    @BeforeAll
    static void setupEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $$("li").findBy(text("Soft assertions")).shouldHave(text("Soft assertions"));
        $$("li").findBy(text("Soft assertions")).$("A").click();
        $$(".markdown-heading").findBy(text("JUnit5")).sibling(0).shouldHave(text("ExtendWith"));
        sleep(5000);









    }

}
