package com.carbonite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.carbonite.Browser.ProxyDriver;
import com.carbonite.utils.entities.LocalizedString;

public class FreeTrialPage extends Page {

	public FreeTrialPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static By MAIN_HEADER = By.cssSelector("div>h1");
	private static By SUB_HEADER = By.cssSelector("div[class=header-subhead]");

	public static class Localisation {
		public static final LocalizedString PAGE_TITLE = new LocalizedString(
				"Select a trial | Carbonite");
		public static final LocalizedString MAIN_HEADER_TEXT = new LocalizedString("Select a free trial");
		public static final LocalizedString SUB_HEADER_TEXT = new LocalizedString(
				"Start a free trial today and learn why more than 1.1 million customers use Carbonite to protect their most important data.");

	}

	public String getMainHeaderText() {
		return ((ProxyDriver) wd).getText(MAIN_HEADER);
	}

	public String getBoostText() {
		return ((ProxyDriver) wd).getText(SUB_HEADER);
	}

	public String titleofThePage() {
		return ((ProxyDriver) wd).getTitle();
	}

}
