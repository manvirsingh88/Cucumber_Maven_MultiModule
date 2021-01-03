package com.carbonite.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GeneralPage extends LoadableComponent<GeneralPage> {

	private static final int DEFAULT_TIME_TO_WAIT_FOR_PAGE = 50;
	protected WebDriver wd;

	public GeneralPage(WebDriver wd, boolean waitForPageToLoad) {

		this.wd = wd;
		if (waitForPageToLoad) {
			this.waitforPageToload();
		}
	}

	@Override
	protected void load() {
		String pageURL = getPageURL();
		wd.get(pageURL);

	}

	@Override
	public GeneralPage get() {

		GeneralPage page = super.get();
		this.waitforPageToload();
		return page;
	}

	@Override
	protected abstract void isLoaded() throws Error;

	protected abstract String getPageURL();

	public void waitforPageToload() {
		this.waitForDocumentCompleteststate();

	}

	public void waitForDocumentCompleteststate() {
		System.out.println("Checking for Page Load state");
		waitForDocumentCompleteState(DEFAULT_TIME_TO_WAIT_FOR_PAGE);

	}

	public void waitForDocumentCompleteState(int secondsToWait) {
		new WebDriverWait(wd, secondsToWait).until((ExpectedCondition<Boolean>) driver -> {

			while (true) {
				String readyState = getDocumentReadyState();

				if (readyState.equals("complete")) {
					System.out.println("Document Ready State is : " + readyState);
					return true;
				} else {
					System.out.println("Document is not in Ready State : " + readyState);
				}

			}
		});

	}

	private String getDocumentReadyState() {
		try {
			return  ((JavascriptExecutor) wd).executeScript("return document.readyState").toString();
		} catch (WebDriverException e) {
			return null;
		}

	}

}
