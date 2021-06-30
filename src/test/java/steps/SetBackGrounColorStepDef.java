package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ToDoListPage;
import util.BrowserFactory;

public class SetBackGrounColorStepDef {

	WebDriver driver;
	ToDoListPage listPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		listPage = PageFactory.initElements(driver, ToDoListPage.class);
		driver.get("https://techfios.com/test/101/");
	}

	@Given("^\"Set SkyBlue Background\" button exists$")
	public void set_SkyBlue_BackGround_button_exists() {
		listPage.verifySetBlueButtonIsVisible();
	}
	
	@When("^user click on the button$")
	public void user_click_on_the_button() {
	    listPage.userClickOnSkyBlueButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
	    listPage.verifyBackgroundColorIsBlue();
	}
	
	@Given("^\"Set White Background\" button exists$")
	public void set_White_BackGround_button_exists() {
		listPage.verifySetWhiteIsVisible();
	}
	
	@When("^user click on the white button$")
	public void user_click_on_the_white_button() {
	    listPage.userClickOnWhiteButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
	    listPage.verifyBackgroundColorIsWhite();
	}

}
