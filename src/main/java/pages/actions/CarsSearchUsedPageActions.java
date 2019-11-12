package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchedPageLocators;
import pages.locators.UserdCarsPageLocators;
import utils.SeleniumDriver;

public class CarsSearchUsedPageActions {

	UserdCarsPageLocators userdCarsPageLocators = null;

	public CarsSearchUsedPageActions() {

		this.userdCarsPageLocators = new UserdCarsPageLocators();

		PageFactory.initElements(SeleniumDriver.getDriver(), userdCarsPageLocators);
	}

	/*
	 * public void switchToFrame(){
	 * 
	 * SeleniumDriver.getDriver().switchTo().frame("LOCSTORAGE"); }
	 */

	public void selectAnyMakeDrowdown(String carBrand) {

		Select slt = new Select(userdCarsPageLocators.carsMakeDropdown);

		slt.selectByVisibleText("Audi");

	}

	public void selectAnyModelDrowdown(String carModel) {

		Select slt = new Select(userdCarsPageLocators.carsModelDropdown);

		slt.selectByVisibleText("A4");

	}

	public void selectAnyLocationDrowdown(String carLocation) {

		Select slt = new Select(userdCarsPageLocators.carsLocationDropdown);

		slt.selectByVisibleText("NSW - Hunter");

	}

	public void selectAnyPriceDrowdown(String carPrice) {

		Select slt = new Select(userdCarsPageLocators.carsPriceDropdown);

		slt.selectByVisibleText("$2,000");

	}

	public void clickFinNextButton() {

		userdCarsPageLocators.carsFindByNextbtn.click();

		// SeleniumDriver.getDriver().switchTo().defaultContent();

	}

}
