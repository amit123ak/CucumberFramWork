package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".//Features/Login.feature",
                 glue="StepDefinition",
                 dryRun=false, //if check feature file Implemention in the stepDef File 
                 monochrome=false,
                 plugin= {"pretty","html:target/Cucumber-report/report1.html"}
                	)
public class TestRunner {

}

//plugin= {"pretty","json:target/Cucumber-report/report2.json"}
//plugin= {"pretty","junit:target/Cucumber-report/report3.xml"}
