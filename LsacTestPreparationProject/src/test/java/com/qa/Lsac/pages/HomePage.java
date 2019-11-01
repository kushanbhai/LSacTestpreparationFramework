package com.qa.Lsac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;

	HomePage(WebDriver ldriver, WebDriver driver) {
		this.driver = driver;
	}

	public HomePage() {

	}

	@FindBy(xpath = "//a[@id='practiceTestLink' and contains(text(),'The Official LSAT PrepTest')]")
	WebElement testlibrary;

	@FindBy(xpath = "//h1[@class='libraryHeader']")
	WebElement libraryheader;

	
	
	@FindBy(xpath = "//a[@id='tutorialsLink']")
	WebElement tutorials;
	
	
	@FindBy(xpath = "//h1[@class='tutorialsHeader']")
	WebElement tutorialsheader;
	
	@FindBy(xpath = "//img[@alt='LSAC']")
	List<WebElement> LSACimage;
	
	
	@FindBy(xpath = "//a[text()='The Official LSAT PrepTest 71']")
	WebElement linkpreptest;
	
	
	@FindBy(xpath = "//button[@class='ToolbarButton']")
	List<WebElement> sections;
	
	
	@FindBy(xpath = "//a[@id='practiceTestLink' and contains(text(),'The Official LSAT PrepTest')]")
	List<WebElement> preptestlinks;
	
	@FindBy(xpath = "//a[@id='videoLink']")
	List<WebElement> tutoriallinks;
	
	public void checknooftests() {

		String testname = testlibrary.getText();
		System.out.println("The test name is: " + testname);
		Assert.assertTrue(libraryheader.isDisplayed());
		int LSACimagecnt = LSACimage.size();
		System.out.println("The no of images in the library section are: "+LSACimagecnt);
		
		}
	
	
	public void checktutorials() {
		tutorials.click();
		Assert.assertTrue(tutorialsheader.isDisplayed());
	}
	
	public void checknoofsections() {
		linkpreptest.click();
		int noofsections = sections.size();
		System.out.println("no of sections in the test link are: "+noofsections);
	}
	
	public void gettestnames() {
		
		int preptests = preptestlinks.size();
		for(int i=0; i<preptests; i++) {

			System.out.println(preptestlinks.get(i).getAttribute("text"));
		}
	}
	
	public void gettutrialnames() {
		int tutorials = tutoriallinks.size();
		for(int i=0 ; i<tutorials; i++) {
			System.out.println(tutoriallinks.get(i).getAttribute("text"));
		}
	}
}
