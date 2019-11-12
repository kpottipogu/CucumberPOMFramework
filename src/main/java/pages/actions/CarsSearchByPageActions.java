package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchedPageLocators;
import utils.SeleniumDriver;

public class CarsSearchByPageActions {

	CarSearchedPageLocators carSearchedPageLocators = null;

	public CarsSearchByPageActions() {

		this.carSearchedPageLocators = new CarSearchedPageLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchedPageLocators);
	}

	/*
	 * public void switchToFrame(){
	 * 
	 * SeleniumDriver.getDriver().switchTo().frame("LOCSTORAGE"); }
	 */

	public void selectAnyMakeDrowdown(String carBrand) {
		System.out.println("Car Search Page");

		Select slt = new Select(carSearchedPageLocators.carsMakeDropdown);

		slt.selectByVisibleText("BMW");

	}

	public void selectAnyModelDrowdown(String carModel) {

		Select slt = new Select(carSearchedPageLocators.carsModelDropdown);

		slt.selectByVisibleText("1 Series");

	}

	public void selectAnyLocationDrowdown(String carLocation) {

		Select slt = new Select(carSearchedPageLocators.carsLocationDropdown);

		slt.selectByVisibleText("NSW - Hunter");

	}

	public void selectAnyPriceDrowdown(String carPrice) {

		Select slt = new Select(carSearchedPageLocators.carsPriceDropdown);

		slt.selectByVisibleText("$5,000");

	}

	public void clickFinNextButton() {

		carSearchedPageLocators.carsFindByNextbtn.click();

		// SeleniumDriver.getDriver().switchTo().defaultContent();

	}

}
