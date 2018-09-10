package com.ontestautomation.jgiven.tests;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ontestautomation.jgiven.tests.steps.GivenTest;
import com.ontestautomation.jgiven.tests.steps.ThenTest;
import com.ontestautomation.jgiven.tests.steps.WhenTest;
import com.tngtech.jgiven.testng.ScenarioTest;

public class TestJGiven extends ScenarioTest<GivenTest, WhenTest, ThenTest> {
	
	{
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@BeforeTest
	public void init() {

	}
	
	@Test
	public void firstTest() {
		
		given().testingGiven("");
		when().testingWhen("");
		then().testingThen("");
	}
	
	@AfterTest
	public void tearDown() {
		
	}
}
