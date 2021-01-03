package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.CompareBackUpPlanPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompareBackUpPlanPageSteps extends CustomeBase{
	
	private CustomeBase base;
	private HomePage homepage;
	private CompareBackUpPlanPage compareBackUpPlanPage;

	public CompareBackUpPlanPageSteps(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}
	
	@And("User Click on Compare Back Up Plan hyperlink")
	public void user_click_on_compare_back_up_plan_hyperlink() {
		compareBackUpPlanPage=homepage.compareBackUpPlanPage();
	}
	
	@Then("Verify the title of Compare Back Up Plan page {string}")
	public void verify_the_title_of_compare_back_up_plan_page(String titleOfPage) {
		titleOfPage=compareBackUpPlanPage.titleofThePage();
		Assert.assertEquals(titleOfPage, CompareBackUpPlanPage.Localisation.PAGE_TITLE.get());
	  
	}
	
	@Then("Verify the main Header of Compare Back Up Plan Page {string}")
	public void verify_the_main_header_of_compare_back_up_plan_page(String mainHeaderText) {
		mainHeaderText=compareBackUpPlanPage.getMainHeaderText();
		Assert.assertEquals(mainHeaderText, CompareBackUpPlanPage.Localisation.MAIN_HEADER_TEXT.get());
	}
	
	@Then("Verify the Sub Header Text of Compare Back Up Plan Page {string}")
	public void verify_the_sub_header_text_of_compare_back_up_plan_page(String subHeaderText) {
		subHeaderText=compareBackUpPlanPage.getBoostText();
		Assert.assertEquals(subHeaderText, CompareBackUpPlanPage.Localisation.SUB_HEADER_TEXT.get());
	}
	
	@Then("Verify the  image on Compare Back Up Plan")
	public void verify_the_image_on_compare_back_up_plan() {
		Assert.assertTrue(compareBackUpPlanPage.isImageDisplayed());
	   
	}


}
