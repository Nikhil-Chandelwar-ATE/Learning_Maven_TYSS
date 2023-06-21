package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailtextField;
	
	public void enterEmail(String email) {
		emailtextField.sendKeys(email);
	}

	public WebElement getEmailtextField() {
		return emailtextField;
	}

	public void setEmailtextField(WebElement emailtextField) {
		this.emailtextField = emailtextField;
	}
	
	@FindBy(id = "Password")
	private WebElement passwordtextField;
	
	public void enterPassword(String password) {
		passwordtextField.sendKeys(password);
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public void setPasswordtextField(WebElement passwordtextField) {
		this.passwordtextField = passwordtextField;
	}
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	public void clickRememberMeCheckBox() {
		rememberMeCheckBox.click();
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public void setRememberMeCheckBox(WebElement rememberMeCheckBox) {
		this.rememberMeCheckBox = rememberMeCheckBox;
	}
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginButton;
	
	public void clickLoginButton() {
		loginButton.click();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
}
