package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass2;

@CucumberOptions(features= {"src/test/java/features/TC_04_DynParamSales.feature"},glue = {"stepDefinition"},
                  publish=true,monochrome=true)

public class RunnerDynParamSales extends BaseClass2 {

}
