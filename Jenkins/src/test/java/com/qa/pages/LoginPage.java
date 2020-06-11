package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public final static String URL = "http://localhost:8080/";
	
	@FindBy(id = "j_username")
	private WebElement usernameInput;
	
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement passwordInput;
	
	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver) {
		setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void username(String input) {
		this.usernameInput.sendKeys(input);
	}
	
	public void password(String input) {
		this.passwordInput.sendKeys(input);
	}
	
	public void signIn() {
		this.signInButton.click();
	}
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
