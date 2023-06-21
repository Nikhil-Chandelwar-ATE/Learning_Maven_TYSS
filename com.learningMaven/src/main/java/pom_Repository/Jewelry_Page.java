package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry_Page {

	public Jewelry_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Black & White Diamond Heart']")
	WebElement diamondHeartProductLink;
	
	public void clickDiamondHeartProductLink()
	{
		diamondHeartProductLink.click();
	}

	public WebElement getDiamondHeartProductLink() {
		return diamondHeartProductLink;
	}

	public void setDiamondHeartProductLink(WebElement diamondHeartProductLink) {
		this.diamondHeartProductLink = diamondHeartProductLink;
	}
	
}
