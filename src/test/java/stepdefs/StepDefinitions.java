package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;


class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is (String today){
        this.today = today;
    }

    @When("I ask whether its Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told the {string}")
    public void i_should_be_told_the(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }



}

//public class StepDefinitions {
//    String today=null;
//    String actualAnswer = "";
//    @Given("today is Sunday")
//    public void today_is_Sunday() {
//        today = "Sunday";
//    }
//
//    @When("I ask whether its Friday yet")
//    public void i_ask_whether_its_Friday_yet() {
//        actualAnswer = find_whats_today.what_day_is_today(today);
//    }
//
//    @Then("I should be told {String}")
//    public void i_should_be_told(String expectedAnswer) {
//        Assert.assertEquals(expectedAnswer,actualAnswer);
//
//    }
//}
//class find_whats_today {
//    static String what_day_is_today(String today) {
//        return null;
//    }
//}
