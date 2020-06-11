package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
//	public final static String URL = "http://localhost:8080/";
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/a[2]")
	private WebElement newItemButton;
	
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[3]/a")
	WebElement itemName;
	
	public HomePage(WebDriver driver) {
		setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void newItemPage() {
		this.newItemButton.click();
	}
	
	public String itemName() {
		return this.itemName.getText();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
