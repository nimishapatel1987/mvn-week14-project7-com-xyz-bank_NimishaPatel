package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;


public class BankManagerLoginPage extends Utility {

    //click On "Bank Manager Login" Tab
    By clickOnTab = By.xpath("//button[@ng-click = 'manager()']");

    public void clickOnTab() {
        clickOnElement(clickOnTab);
    }

    //click On "Add Customer" Tab
    By clickOnAddCustomerTab = By.xpath("//button[@ng-class = 'btnClass1']");

    public void clickOnAddCustomerTab() {
        clickOnElement(clickOnAddCustomerTab);
    }

    //enter FirstName
    By sendTextToFirstName = By.xpath("//input[@placeholder = 'First Name']");

    public void sendTextToFirstNameField(String firstname) {
        sendTextToElement(sendTextToFirstName, firstname);
    }

    //enter LastName
    By sendTextToLastName = By.xpath("//input[@placeholder='Last Name']");

    public void sendTextToLastNameField(String lastname) {
        sendTextToElement(sendTextToLastName, lastname);
    }

    //enter PostCode
    By sendTextToPostCode = By.xpath("//input[@placeholder = 'Post Code']");

    public void sendTextToPostCodeField(String postcode) {
        sendTextToElement(sendTextToPostCode, postcode);
    }

    //click On "Add Customer" Button
    By clickOnButton = By.xpath("//button[@type = 'submit']");

    public void clickOnButton() {
        clickOnElement(clickOnButton);
    }

    //popup display
    By popupDisplay = By.id("PopUp");

    public void acceptAlertpopupDisplay() {
        driver.switchTo().alert().accept();
    }

    //verify message "Customer added successfully"
    By verifyCustomeraddedSuccessfully = By.xpath("");

    public String getverifyCustomeraddedSuccessfully() {
        return getTextFromElement(verifyCustomeraddedSuccessfully);
    }

    //click on "ok" button on popup.

}
