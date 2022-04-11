package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage {
	
	public LaunchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='✕']") private WebElement loginCloseButton;

	public WebElement getLoginCloseButton() {
		return loginCloseButton;
	}
}
