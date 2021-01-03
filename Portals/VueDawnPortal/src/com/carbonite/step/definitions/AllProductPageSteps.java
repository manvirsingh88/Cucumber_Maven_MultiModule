package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.AllProductPage;
import com.carbonite.Pages.CompareBackUpPlanPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AllProductPageSteps extends CustomeBase {

	private CustomeBase base;
	private HomePage homepage;
	private AllProductPage allProductPage;

	public AllProductPageSteps(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}

	@And("User Click on All Product hyperlink")
	public void user_click_on_compare_back_up_plan_hyperlink() {
		allProductPage = homepage.allProductPage();
	}

	@Then("Verify the title of All Product page {string}")
	public void verify_the_title_of_all_product_page(String titleOfPage) {
		titleOfPage = allProductPage.titleofThePage();
		Assert.assertEquals(titleOfPage, AllProductPage.Localisation.PAGE_TITLE.get());

	}

	@Then("Verify the main Header of All Product Page {string}")
	public void verify_the_main_header_of_all_product_page(String mainHeaderText) {
		mainHeaderText = allProductPage.getMainHeaderText();
		Assert.assertEquals(mainHeaderText, AllProductPage.Localisation.MAIN_HEADER_TEXT.get());

	}

	@Then("Verify the Sub Header Text of All Product Page {string}")
	public void verify_the_sub_header_text_of_all_product_page(String subHeaderText) {
		subHeaderText = allProductPage.getBoostText();
		Assert.assertEquals(subHeaderText, AllProductPage.Localisation.SUB_HEADER_TEXT.get());

	}

}
