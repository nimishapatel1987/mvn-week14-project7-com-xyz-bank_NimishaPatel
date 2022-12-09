package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    //click on "Customer Login" Tab
    By clickOnCustomerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnCustomerLoginTab() {
        getTextFromElement(clickOnCustomerLoginTab);
    }

    /*search customer that you created.
        By searchCustomer3 = By.xpath("//select[@name = 'userSelect']");
        public void searchCustomer3(){
        selectByVisibleTextFromDropDown(searchCustomer3,"Harry Potter");
         }*/
    //click on "Login" Button
    By clickOnLoginButton = By.xpath("//button[@type = 'submit']");

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    //click on "Deposit" Tab
    By clickOnDepositTab = By.xpath("//button[@ng-class = 'btnClass2']");

    public void clickOnDepositTab() {
        clickOnElement(clickOnDepositTab);
    }

    //Enter amount 100
    By enteramount = By.xpath("//input[@type = 'number']");

    public void enteramount() {
        sendTextToElement(enteramount, "100");
    }

    //click on "Deposit" Button
    By clickOnDepositButton = By.xpath("//button[@type = 'submit']");

    public void clickOnDepositButton() {
        clickOnElement(clickOnDepositButton);
    }

    //verify message "Deposit Successful"
    By verifymessageDepositSuccessful = By.xpath("//span[@class = 'error ng-binding']");

    public String getverifymessageDepositSuccessful() {
        return getTextFromElement(verifymessageDepositSuccessful);
    }
}
