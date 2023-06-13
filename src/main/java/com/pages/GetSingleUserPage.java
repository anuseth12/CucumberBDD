package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class GetSingleUserPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By Getsingleuserbtn = By.xpath("//li[@data-id='users-single-not-found' and @data-key='endpoint' and @data-http='get']");
	private By requestelement = By.xpath("//span[@class='url' and @data-key='url']");
	private By responseelement = By.xpath("//span[@class='response-code bad']");
	private By responseelementdata=By.xpath("//pre[@data-key='output-response']");

	// 2. Constructor of the page class:
	public GetSingleUserPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void clickGetSingleUserbtn() {
		driver.findElement(Getsingleuserbtn).click();
	}

	public  String getRequestText() {
		 return driver.findElement(requestelement).getText();
	}

	public String getResponseText() throws InterruptedException {
		
		//Object responseElement = Wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(responseelement)));
        Thread.sleep(3000);
		return driver.findElement(responseelement).getText();
	}

	public  String getResponseTextdata() {
		
		return driver.findElement(responseelementdata).getText();
	}

}
