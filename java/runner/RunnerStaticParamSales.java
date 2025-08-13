package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass2;

@CucumberOptions(features= {"src/test/java/features/TC_03_StaticParamSales.feature"},glue={"stepDefinition"},
publish=true,monochrome=true)

public class RunnerStaticParamSales extends BaseClass2 {

}
