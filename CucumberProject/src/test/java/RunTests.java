import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(format = {"pretty", "html:build/cucumber-html-report"}, tags="@check")
public class RunTests {

}