import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/GitHubGetRepos.feature"},
        glue={"src/test/java"}
)
public class CucumberTestRunner {
}
