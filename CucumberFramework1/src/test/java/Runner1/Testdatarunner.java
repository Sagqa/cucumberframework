package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\OneDrive\\Desktop\\11\\CucumberFramework1\\src\\main\\java\\Features\\testdatascenario.feature",glue= {"stepdefinitoninja"},
plugin= {"pretty","html:target/login.html"})







public class Testdatarunner {

}
