package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {

	public Checkout_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingAddressContinueButton;
	
	public void clickBillingAddressContinueButton() {
		billingAddressContinueButton.click();
	}
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingAddressContinueButton;
	
	public void clickShippingAddressContinueButton() {
		shippingAddressContinueButton.click();
	}
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinueButton;
	
	public void clickShippingMethodContinueButton() {
		shippingMethodContinueButton.click();
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinueButton;
	
	public void clickPaymentMethodContinueButton() {
		paymentMethodContinueButton.click();
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInformationContinueButton;
	
	public void clickPaymentInformationContinueButton() {
		paymentInformationContinueButton.click();
	}
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;
	
	public void clickConfirmOrderButton() {
		confirmOrderButton.click();
	}
	
}
