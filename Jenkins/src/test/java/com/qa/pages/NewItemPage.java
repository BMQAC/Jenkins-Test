package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewItemPage {
	
	private WebDriver driver;
	
	@FindBy(id = "name")
	private WebElement itemNameInput;

	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/form/div[2]/div[1]/ul/li[1]")
	private WebElement freestyleProjectButton;
	
	@FindBy(id = "ok-button")
	private WebElement okButton;
	
	public NewItemPage(WebDriver driver) {
		setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void input(String name) {
		this.itemNameInput.sendKeys(name);
	}
	
	public void selectFreestyleProject() {
		this.freestyleProjectButton.click();
	}
	
	public void selectOk() {
		this.okButton.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
