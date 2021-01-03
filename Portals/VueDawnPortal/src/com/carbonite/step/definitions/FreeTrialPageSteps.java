package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.FreeTrialPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FreeTrialPageSteps extends CustomeBase {

	private CustomeBase base;
	private HomePage homepage;
	private FreeTrialPage freeTrialPage;

	public FreeTrialPageSteps(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}

	@And("User Click on Free Trials hyperlink")
	public void user_click_on_free_trials_hyperlink() {
		freeTrialPage = homepage.freeTrialPage();
	}

	@Then("Verify the title of Free Trials page {string}")
	public void verify_the_title_of_free_trials_page(String titleOfPage) {
		titleOfPage = freeTrialPage.titleofThePage();
		System.out.println("The Title of Page is:" + titleOfPage);
		Assert.assertEquals(titleOfPage, FreeTrialPage.Localisation.PAGE_TITLE.get());
	}

	@Then("Verify the main Header Text of Free Trials Page {string}")
	public void verify_the_main_header_text_of_free_trials_page(String mainHeaderText) {
		mainHeaderText = freeTrialPage.getMainHeaderText();
		Assert.assertEquals(mainHeaderText, FreeTrialPage.Localisation.MAIN_HEADER_TEXT.get());
	}

	@Then("Verify the Sub Header Text of Free Trials Page {string}")
	public void verify_the_sub_header_text_of_free_trials_page(String subHeaderText) {
		subHeaderText = freeTrialPage.getBoostText();
		Assert.assertEquals(subHeaderText, FreeTrialPage.Localisation.SUB_HEADER_TEXT.get());
	}

}
