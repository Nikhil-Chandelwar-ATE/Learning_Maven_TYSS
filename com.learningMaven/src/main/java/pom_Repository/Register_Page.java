package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	public Register_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	public void clickMaleRadioButton() {
		maleRadioButton.click();
	}
	
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	public void clickFemaleRadioButton() {
		femaleRadioButton.click();
	}
	
	public WebElement getfemaleRadioButton() {
		return femaleRadioButton;
	}

	public void setFemaleRadioButton(WebElement femaleRadioButton) {
		this.femaleRadioButton = femaleRadioButton;
	}

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	public void enterFirstName(String firstName) {
		firstNameTextField.sendKeys(firstName);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(WebElement firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	public void enterlastName(String lastName) {
		lastNameTextField.sendKeys(lastName);
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
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
	
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	public void enterConfirmPassword(String confirmPassword) {
		ConfirmPasswordTextField.sendKeys(confirmPassword);
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		ConfirmPasswordTextField = confirmPasswordTextField;
	}
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public void clickRegisterButton() {
		registerButton.click();
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
}