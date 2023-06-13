package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SupportPageUI {

	private WebDriver driver;

	// 1. By Locators: OR
	private By supportbtn =By.xpath("//a[text()='Support ReqRes']");
	private By onetimepayment = By.xpath("//label[text()='One-time payment ($)']");
	private By monthlysupport = By.xpath("//label[text()='Monthly support ($5/month)']");
	private By upgradebtn=By.id("trigger-pro");
	private By upgradesection=By.cssSelector("h3>strong");
	private By supportoptionlist=By.id("supportForm");
	

	// 2. Constructor of the page class:
	public SupportPageUI(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void clickSupportbtn() {
		driver.findElement(supportbtn).click();
	}

	public  String onetimepaymentText() {
		 return driver.findElement(onetimepayment).getText();
	}

	public String monthlysupportText() {
		
		return driver.findElement(monthlysupport).getText();
	}

   public void clickupgradebtn() {
		
		driver.findElement(upgradebtn).click();
	}
	
	public  String getupgradesectionText() {
		
		return driver.findElement(upgradesection).getText();
		
	}

	public boolean verifySupportOptions() {
		
	
        List<WebElement> supportOptions = driver.findElements(supportoptionlist);
        System.out.println("Support options are:"+supportOptions);
        boolean hasOneTimeSupport = false;
        boolean hasMonthlySupport = false;
        
        for (WebElement option : supportOptions) {
            String optionText = option.getText();
            if (optionText.equals("One-time payment ($)")) {
                hasOneTimeSupport = true;
            } else if (optionText.contains("Monthly support")) {
                hasMonthlySupport = true;
            }
        }
	
	
	 return hasOneTimeSupport && hasMonthlySupport;
}
}
