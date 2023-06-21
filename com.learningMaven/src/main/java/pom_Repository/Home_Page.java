package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Log out")
	WebElement logoutLink;
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	
}
