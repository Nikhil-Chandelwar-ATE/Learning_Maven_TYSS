package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page {

	public Books_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortByDropdown;

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public void setSortByDropdown(WebElement sortByDropdown) {
		this.sortByDropdown = sortByDropdown;
	}
	
	@FindBy(xpath = "//select[@id='products-pagesize'])")
	private WebElement displayDropdown;

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public void setDisplayDropdown(WebElement displayDropdown) {
		this.displayDropdown = displayDropdown;
	}
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement viewAsDropdown;

	public WebElement getViewAsDropdown() {
		return viewAsDropdown;
	}

	public void setViewAsDropdown(WebElement viewAsDropdown) {
		this.viewAsDropdown = viewAsDropdown;
	}
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")
	private WebElement addToCartButton;
	
	public void clickAddToCartButton() {
		addToCartButton.click();
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}
	
}
