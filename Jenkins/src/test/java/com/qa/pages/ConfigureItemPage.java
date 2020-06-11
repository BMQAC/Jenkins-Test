package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigureItemPage {
	
	private WebDriver driver;
	
	@FindBy(id = "yui-gen38-button")
	private WebElement saveButton;
	
	public ConfigureItemPage(WebDriver driver) {
		setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectSave(){
		this.saveButton.click();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
