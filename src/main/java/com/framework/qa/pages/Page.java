package com.framework.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;

	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);

	}

	// abstarct methods

	public abstract String getPageTitles();

	public abstract String getPageHeader(By locator);

	public abstract WebElement getElement(By locator);

	public abstract void waitForElement(By locator);

	public abstract void waitForPageTitle(String title);

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {

		try {

			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		

	}

}
