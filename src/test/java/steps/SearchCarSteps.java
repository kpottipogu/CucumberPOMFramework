package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchByPageActions;
import utils.SeleniumDriver;

public class SearchCarSteps {
	//git testing
	
	public static WebDriver driver=null;
	
	CarsGuideHomePageActions CarsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchByPageActions  carsSearchByPageActions=new CarsSearchByPageActions();
	
	@Given("^Iam on the HomePage \"([^\"]*)\" of CarsGuide website$")
	public void iam_on_the_HomePage_of_CarsGuide_website(String websiteURL) throws Throwable {
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String>list) throws Throwable {
		
		String menu=list.get(1);
		
		System.out.println("Menu list::"+menu);
		CarsGuideHomePageActions.movetobuyPlusSellmenu();
	    
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
		
		CarsGuideHomePageActions.clickonSearchCarsLinkInbuyPlusMenu();
	    
	}

	@And("^Select Carbrand \"([^\"]*)\" from AnyMake dropdwon$")
	public void select_Carbrand_from_AnyMake_dropdwon(String carBrand) throws Throwable {
	    
		carsSearchByPageActions.selectAnyMakeDrowdown(carBrand);
	}

	@And("^Select Carmodel \"([^\"]*)\" from AnyModel dropdown$")
	public void select_Carmodel_from_AnyModel_dropdown(String carModel) throws Throwable {
	    
		carsSearchByPageActions.selectAnyModelDrowdown(carModel);
	}

	@And("^Select Location \"([^\"]*)\" from AnyLocatin dropdown$")
	public void select_Location_from_AnyLocatin_dropdown(String carLocation) throws Throwable {
	   
		carsSearchByPageActions.selectAnyLocationDrowdown(carLocation);
	}

	@And("^Select Price \"([^\"]*)\"  from Price\\(max\\) dropdown$")
	public void select_Price_from_Price_max_dropdown(String carPrice) throws Throwable {
	    
		carsSearchByPageActions.selectAnyPriceDrowdown(carPrice);
	}

	@And("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String findnext) throws Throwable {
		carsSearchByPageActions.clickFinNextButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    
	}

	@And("^the page should be displayed \"([^\"]*)\"$")
	public void the_page_should_be_displayed(String arg1) throws Throwable {
	    
	}


}
