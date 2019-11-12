package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions (){
		
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	
	public void movetobuyPlusSellmenu(){
		
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyplusSellLink).perform();
		
		
	}
	
	public void clickonSearchCarsLinkInbuyPlusMenu(){
		carsGuideHomePageLocators.searchCarsLink.click();
		
		
	}
	
	public void clickonUsedcarsLinkInbuyPlusMenu(){
		
		carsGuideHomePageLocators.usedCarsLink.click();
		
	}
	public void movetoReviewMenu(){
		
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyplusSellLink).click().perform();
		
	}

}
