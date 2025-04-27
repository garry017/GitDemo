package Cucumber;

@CucumberOptions(feature="src\\test\\java\\Cucumber",glue= "cricket.stepdefination",
monochrome=true, tags = "@Regression" , plugin= {"html:target/Cucumber/.html")

public class TestNGR  extends AbstractTestNgCucumberTests {
	
}