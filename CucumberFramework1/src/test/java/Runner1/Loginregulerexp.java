package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\OneDrive\\Desktop\\11\\CucumberFramework1\\src\\main\\java\\Features\\loginregulerexp.feature",glue= {"stepdefinitoninja"},
plugin= {"pretty","html:target/login1.html"})


public class Loginregulerexp {

}
