package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserdCarsPageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id='makes']")
	public WebElement carsMakeDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='models']")
	public WebElement carsModelDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='locations']")
	public WebElement carsLocationDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='priceTo']")
	public WebElement carsPriceDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='search-submit']")
	public WebElement carsFindByNextbtn;


}
