package com.framework.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);

	}

	@Override
	public String getPageTitles() {

		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {

		return getElement(locator).getText();

	}

	@Override
	public WebElement getElement(By locator) {

		WebElement element = null;
		try {
			waitForElement(locator);
			element = driver.findElement(locator);
			// return element;
		} catch (Exception e) {
			System.out.println("Error occurs while element is creating" + locator.toString());
			e.printStackTrace();
		}
		return element;

	}

	@Override
	public void waitForElement(By locator) {

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("some exception occurs during waiting for element" + locator.toString());
		}

	}

	@Override
	public void waitForPageTitle(String title) {

		try {
			wait.until(ExpectedConditions.titleContains(title));
		}

		catch (Exception e) {
			System.out.println("some exception occurs during waiting for title" + title);
		}

	}

}
