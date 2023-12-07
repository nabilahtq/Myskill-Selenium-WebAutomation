package runner;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDef",
        tags = "@register", //bisa diganti sesuai yang akan dirun (@Login, @TDD, @register, @negative @register)
        plugin = {"pretty", "html:target/RegressionReport.html"}
)
public class RunTest {

}
