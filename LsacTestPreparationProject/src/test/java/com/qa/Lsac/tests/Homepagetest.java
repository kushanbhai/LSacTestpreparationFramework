package com.qa.Lsac.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Lsac.pages.BaseClass;
import com.qa.Lsac.pages.HomePage;
import com.qa.Lsac.utility.BrowserFactory;

public class Homepagetest extends BaseClass {

	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestUrl());
	}

	@Test(priority = 1)
	public void countlibraries() throws InterruptedException {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(3000);
		homepage.checknooftests();
		homepage.checktutorials();

	}

	@Test(priority = 2)
	public void counttestsections() throws InterruptedException {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(3000);
		homepage.checknooftests();
		homepage.checknoofsections();
	}

	@Test(priority = 3)
	public void checktestnames() throws InterruptedException {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(3000);
		homepage.checknooftests();
		homepage.gettestnames();
	}

	@Test(priority = 4)
	public void checktutorialnames() throws InterruptedException {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(3000);
		homepage.checknooftests();
		homepage.checktutorials();
		homepage.gettutrialnames();
	}

	@AfterMethod
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
}