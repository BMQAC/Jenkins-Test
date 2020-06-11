package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/a[2]")
	private WebElement backToDashboard;
	
	public ProjectPage(WebDriver driver) {
		setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectBackToDashboard() {
		this.backToDashboard.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
