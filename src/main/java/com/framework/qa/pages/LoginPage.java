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
public class LoginPage extends BasePage {

	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginBtn = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");//

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// public getters
	/**
	 * @return the username
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginPageTitle() {
		return getPageTitles();
	}

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}

	public HomePage doLogin(String username, String pwd) {

		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginBtn().click();

		return getInstance(HomePage.class);

	}

	public void doLogin() {

		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginBtn().click();

		// return getInstance(HomePage.class);

	}

	public void doLogin(String userCred) {

		if (userCred.contains("username")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
			getPassword().sendKeys("");

		} else if (userCred.contains("password")) {

			{
				getEmailId().sendKeys(userCred.split(":")[1].trim());
				getPassword().sendKeys("");

			}

			getLoginBtn().click();
		}

	}

}
