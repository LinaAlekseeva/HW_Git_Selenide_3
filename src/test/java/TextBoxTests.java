import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @Test
    void fillFormTest (){
        open("https://demoqa.com/text-box");
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName ").setValue("Pavel Lepet");
        $("#userEmail ").setValue("pavellepet@gmail.com");
        $("#currentAddress").setValue("2600 North Military Trail West Palm Beach FL 33409-0000 USA");
        $("#permanentAddress").setValue("186 Wikiup Dr Santa Rosa CA 95403 USA");
        $("#submit").shouldHave(text("Submit")).click();
        sleep(500);
        $("#output").shouldBe(visible);
        $("#output #email").shouldHave(text("pavellepet@gmail.com"));

    }
}
