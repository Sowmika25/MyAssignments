package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/TC_05_Leaftaps_AccHooks.feature"},glue= {"stepDefinition","hooksimplementation"},
                 publish=true,monochrome=true,tags="@smoke or @regression",dryRun=false)


public class RunnerLeaftaps extends AbstractTestNGCucumberTests{

}



