package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class DeleteAPIUIPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By deletebtn = By.xpath("//li[@data-id='delete' and @data-key='endpoint' and @data-http='delete']");
	private By requestelement = By.xpath("//span[@class='url' and @data-key='url']");
	private By responseelement = By.xpath("//span[@class='response-code bad']");
	

	// 2. Constructor of the page class:
	public DeleteAPIUIPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void clickDeleteButton() {
		driver.findElement(deletebtn).click();
	}

	public  String getRequestText() {
		 return driver.findElement(requestelement).getText();
	}

	public String getResponseText() throws InterruptedException {
		
		//Object responseElement = Wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(responseelement)));
	        Thread.sleep(3000);
		return driver.findElement(responseelement).getText();
	}

	

}
