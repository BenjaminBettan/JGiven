package com.ontestautomation.jgiven.tests.steps;

import com.tngtech.jgiven.Stage;

public class GivenTest extends Stage<GivenTest>{
	
	public GivenTest testingGiven(String string) {
		return self();
	}
}
