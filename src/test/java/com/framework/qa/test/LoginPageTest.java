/**
 * 
 */
package com.framework.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.qa.pages.HomePage;
import com.framework.qa.pages.LoginPage;

/**
 * @author Mayami
 *
 */
public class LoginPageTest extends BaseTest {

	@Test(priority = 0)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	@Test(priority = 1)
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}

	@Test(priority = 3)
	public void doLoginTest() {

		HomePage homepage = page.getInstance(LoginPage.class).doLogin("mayami0110@gmail.com", "Lazy@heart1");

		String headerhome = homepage.getHomePageHeader();
		System.out.println(headerhome);
		Assert.assertEquals(headerhome, "Sales Dashboard");

	}

}
