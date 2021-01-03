package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;
import com.carbonite.utils.entities.LocalizedString;

public class CompareBackUpPlanPage extends Page {

	public CompareBackUpPlanPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By SUB_HEADER = By.cssSelector("div[class=header-subhead]");
	private static By IMAGE = By.cssSelector("span>div[class=responsive-image]>img[loading='lazy']");

	public static class Localisation {
		public static final LocalizedString PAGE_TITLE = new LocalizedString(
				"Personal Cloud Backup Pricing, Plans & Features | Carbonite");
		public static final LocalizedString MAIN_HEADER_TEXT = new LocalizedString(
				"Choose the protection that's right for you");
		public static final LocalizedString SUB_HEADER_TEXT = new LocalizedString(
				"Help us determine the right personal cloud backup or business backup plan for your needs.");

	}

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getBoostText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public Boolean isImageDisplayed() {
		return ((ProxyDriver) wd).findElement(IMAGE).isDisplayed();
	}

	public String titleofThePage() {
		return ((ProxyDriver) wd).getTitle();
	}
}
