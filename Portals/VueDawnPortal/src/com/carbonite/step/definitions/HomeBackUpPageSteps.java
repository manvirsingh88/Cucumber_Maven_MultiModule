package com.carbonite.step.definitions;

import org.testng.Assert;

import com.carbonite.Pages.HomeBackUpPage;
import com.carbonite.Pages.HomePage;
import com.carbonite.base.CustomeBase;

import io.cucumber.java.en.Then;

public class HomeBackUpPageSteps extends CustomeBase {

	
	private CustomeBase base;
	private HomePage homepage;
	private HomeBackUpPage homeBackUpPage;

	public HomeBackUpPageSteps(CustomeBase base) {
		this.base = base;
		homepage = new HomePage(base.wd, false);
	}
	
	@Then("User Click on Home Back Up hyperlink")
	public void user_click_home_backup_hyperlink() {
		System.out.println("Clicking on Home Back Up Hyperlink");
		homeBackUpPage=homepage.homeBackUpPage();

	}
	
	@Then("Verify the title of Home Back Up page {string}")
	public void verify_the_title_of_home_back_up_page(String titleOfPage) {
		System.out.println("Verifying Home Back Up Page Title");
		titleOfPage = homeBackUpPage.titleofThePage();
		System.out.println("Title of Home back Up page is: " + titleOfPage);
		Assert.assertEquals(titleOfPage, HomeBackUpPage.Localisation.PAGE_TITLE.get());
	}
	
	@Then("Verify the main Header Text of Home Back Up {string}")
	public void verify_the_main_header_text_of_home_back_up(String mainHeaderText) {
		System.out.println("Verifying Main Header Text of Home Back Up Page");
		mainHeaderText= homeBackUpPage.getMainHeaderText();
		System.out.println("Main Header of Home back Up page is: " + mainHeaderText);
		Assert.assertEquals(mainHeaderText, HomeBackUpPage.Localisation.MAIN_HEADER_TEXT.get());
	}
	
	@Then("Verify the Sub Header Text of Home Back Up {string}")
	public void verify_the_sub_header_text_of_home_back_up(String subHeaderText) {
		System.out.println("Verifying Sub header of Home Back Up Page");
		subHeaderText = homeBackUpPage.getSubHeaderText().replace("\n", "");
		System.out.println("Sub header text of Home back Up page is: " + subHeaderText);
		Assert.assertEquals(subHeaderText, HomeBackUpPage.Localisation.SUB_HEADER_TEXT.get());
	}
	
	@Then("Verify the  image on Home Back Up")
	public void verify_the_image_on_home_back_up() {
		System.out.println("Verifying Image on Home Back Up Page");
		Assert.assertTrue(homeBackUpPage.isImageDisplayed());
	}


}
