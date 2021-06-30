package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoListPage {
	WebDriver driver;

	public ToDoListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick = 'myFunctionSky()']")
	WebElement SET_BLUE_BUTTON;
	@FindBy(how = How.CSS, using = "button[onclick = 'myFunctionWhite()']")
	WebElement SET_WHITE_BUTTON;
	@FindBy(how = How.TAG_NAME, using = "body")
	WebElement BACK_GROUND_COLOR;

	public void verifySetBlueButtonIsVisible() {
		Assert.assertTrue(SET_BLUE_BUTTON.isDisplayed());
	}

	public void userClickOnSkyBlueButton() {
		SET_BLUE_BUTTON.click();
	}

	public void verifyBackgroundColorIsBlue() {
		Assert.assertTrue(BACK_GROUND_COLOR.getAttribute("style").contains("skyblue"));
	}

	public void verifySetWhiteIsVisible() {
		Assert.assertTrue(SET_WHITE_BUTTON.isDisplayed());
	}

	public void userClickOnWhiteButton() {
		SET_WHITE_BUTTON.click();
	}

	public void verifyBackgroundColorIsWhite() {
		Assert.assertTrue(BACK_GROUND_COLOR.getAttribute("style").contains("white"));
	}

}
