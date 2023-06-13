package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI {

	private WebDriver driver;

	private By Requestsection = By.cssSelector("div.endpoints li a");
	private By supportbtn =By.xpath("//a[text()='Support ReqRes']");

	public HomePageUI(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public int getRequestSectionCount() {
		return driver.findElements(Requestsection).size();
	}

	public List<String> getRequestSectionsList() {

		List<String> RequestnameList = new ArrayList<>();
		List<WebElement> RequestHeaderList = driver.findElements(Requestsection);

		for (WebElement e : RequestHeaderList) {
			String text = e.getText();
			System.out.println(text);
			RequestnameList.add(text);
		}

		return RequestnameList;

	}

	
	public boolean supportbtnpresent()
	{
		return driver.findElement(supportbtn).isDisplayed();
	}



	
}
