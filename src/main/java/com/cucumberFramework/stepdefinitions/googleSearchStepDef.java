package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.pageObjects.googleSearchPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class googleSearchStepDef extends TestBase {

	googleSearchPage googlePage = new googleSearchPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Then("^I enter search item as \"([^\"]*)\"$")
	public void i_enter_search_item_as(String arg1) throws Throwable {
		waitHelper.WaitForElement(googlePage.searchBox, 60);
		googlePage.enterSearchData(arg1);
	}	
}