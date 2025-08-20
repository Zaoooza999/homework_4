package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchcodeinpageTest {

    @BeforeAll
    static void setupEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        String codeExample = """
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");
                
                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }
                """;
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $$("li").findBy(text("Soft assertions")).shouldHave(text("Soft assertions"));
        $$("li").findBy(text("Soft assertions")).$("A").click();
        sleep(5000);
        $$(".markdown-heading").findBy(text("JUnit5")).sibling(0).shouldBe(visible);
        $$(".markdown-heading").findBy(text("JUnit5")).sibling(0).shouldHave(text(codeExample));





    }

}
