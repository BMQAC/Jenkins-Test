package com.qa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.pages.ConfigureItemPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NewItemPage;
import com.qa.pages.ProjectPage;

public class JenkinsTest {
	
	private ChromeDriver driver;
	
	@Before
	public void init() {
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(false);
		driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
	}
	
	@Test
	public void jenkinsPOM() {
		driver.get(LoginPage.URL);
		
		final String projectName = "First Jenkins Project";
		final String usernameInput = "brijenkins";
		final String passwordInput = "Sd3$@vbT7";
		
		LoginPage loginPage = new LoginPage(driver); 
		HomePage homePage = new HomePage(driver);
		NewItemPage itemPage = new NewItemPage(driver);
		ConfigureItemPage configPage = new ConfigureItemPage(driver);
		ProjectPage projectPage = new ProjectPage(driver);
	
		loginPage.username(usernameInput);
		loginPage.password(passwordInput);
		loginPage.signIn();
		homePage.newItemPage();
		itemPage.input(projectName);
		itemPage.selectFreestyleProject();
		itemPage.selectOk();
		configPage.selectSave();
		projectPage.selectBackToDashboard();
		String item = homePage.itemName();
		
		assertEquals(projectName,item);
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
}
