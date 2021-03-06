package com.rasinsky.garagestore;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests extends AbstractTestNGSpringContextTests {

	@Test
	public void contextLoads() {
		System.out.println("Context has been loaded.");
	}

}
