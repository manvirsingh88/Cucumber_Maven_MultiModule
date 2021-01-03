package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.AllProductPage;
import com.carbonite.Pages.BuisnessSolutionPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BuisnessSolutionPageSteps extends CustomeBase {

	private CustomeBase base;
	private HomePage homepage;
	private BuisnessSolutionPage buisnessSolutionPage;

	public BuisnessSolutionPageSteps(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}

	@And("User Click on Buisness Solution hyperlink")
	public void user_click_on_compare_back_up_plan_hyperlink() {
		buisnessSolutionPage = homepage.buisnessSolutionPage();
	}

	@Then("Verify the title of Buisness Solution page {string}")
	public void verify_the_title_of_buisness_solution_page(String titleOfPage) {
		titleOfPage = buisnessSolutionPage.titleofThePage();
		Assert.assertEquals(titleOfPage, BuisnessSolutionPage.Localisation.PAGE_TITLE.get());
	}

	@Then("Verify the main Header Text of Buisness Solution page {string}")
	public void verify_the_main_header_text_of_buisness_solution_page(String mainHeaderText) {
		mainHeaderText = buisnessSolutionPage.getMainHeaderText().replaceAll("\n", " ");
		Assert.assertEquals(mainHeaderText, BuisnessSolutionPage.Localisation.MAIN_HEADER_TEXT.get());
	}

	@Then("Verify the Sub Header Text of Buisness Solution page {string}")
	public void verify_the_sub_header_text_of_buisness_solution_page(String subHeaderText) {
		subHeaderText = buisnessSolutionPage.getSubHeaderText();
		Assert.assertEquals(subHeaderText, BuisnessSolutionPage.Localisation.SUB_HEADER_TEXT.get());
	}

	@Then("Verify the  image on Buisness Solution page")
	public void verify_the_image_on_buisness_solution_page() {
		Assert.assertTrue(buisnessSolutionPage.isImageDisplayed());
	}

}
