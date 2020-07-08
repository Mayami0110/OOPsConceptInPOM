/**
 * 
 */
package com.framework.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Mayami
 *
 */
public class HomePage extends BasePage {

	//private By header = By.className("private-header__title");
	
	private By header = By.xpath("//*[@id='uiabstractdropdown-button-5']/span/span[1]/h1");
	
	
	////*[@id="uiabstractdropdown-button-5"]/span/span[1]/h1

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public String getHomePageTitle() {
		return getPageTitles();
	}

	public String getHomePageHeader() {
		return getPageHeader(header);

	}
}
