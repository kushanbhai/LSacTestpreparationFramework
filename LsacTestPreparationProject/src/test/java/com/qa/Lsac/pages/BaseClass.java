package com.qa.Lsac.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.Lsac.utility.BrowserFactory;
import com.qa.Lsac.utility.ConfigDataProvider;

public class BaseClass {
	public ConfigDataProvider config;
	public WebDriver driver;

	@BeforeSuite
	public void setupSuite() {

		config = new ConfigDataProvider();
	}

	


}
