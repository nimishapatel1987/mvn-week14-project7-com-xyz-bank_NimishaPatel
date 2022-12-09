package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    //click On "Bank Manager Login" Tab
    By clickOnTab = By.xpath("//button[@ng-click = 'manager()']");
    public void clickOnTab(){
        clickOnElement(clickOnTab);
    }
    //click On "Open Account" Tab
    By clickOpenAccount = By.xpath("//button[@ng-class = 'btnClass2']");
    public void clickOpenAccount(){
        clickOnElement(clickOpenAccount);
    }
    //Search customer that created in first test
    By searchCustomer = By.xpath("//select[@name = 'userSelect']");
    public void searchCustomer(){
       // clickOnElement(searchCustomer);
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
    //Select currency "Pound"
    By selectPound = By.xpath("//select[@name = 'currency']");
    public void selectPound(){
      //  clickOnElement(selectPound);
        selectByVisibleTextFromDropDown(selectPound,"Pound");
    }
    //click on "process" button
    By clickProcessButton = By.xpath("//button[@type = 'submit']");
    public void clickProcessButton(){
        clickOnElement(clickProcessButton);
    }
    //popup displayed
    //verify message "Account created successfully"
    By verifyAccountCreatedSuccessfully = By.xpath("");
    public String getverifyAccountCreatedSuccessfully(){
        return getTextFromElement(verifyAccountCreatedSuccessfully);
    }
    //click on "ok" button on popup.
    By popupDisplay = By.id("PopUp");
    public void acceptAlertpopupDisplay() {
        driver.switchTo().alert().accept();
    }

    //5).
    //click on "Customer Login" Tab
    By clickOnCustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogin(){
        clickOnElement(clickOnCustomerLogin);
    }
    //search customer that you created.
    By searchcustomer2 = By.xpath("//select[@name = 'userSelect']");
    public void searchcustomer2(){
        selectByVisibleTextFromDropDown(searchcustomer2,"Harry Potter");
    }
    //click on "Login" Button
    By clickOnLoginButton = By.xpath("//button[@class = 'btn btn-default']");
    public void clickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }
    //click on "Withdrawl" Tab
    By clickOnWithdrawlTab = By.xpath("//button[@ng-class = 'btnClass3']");
    public void clickOnWithdrawlTab(){
        clickOnElement(clickOnWithdrawlTab);
    }
    //Enter amount 50
    By enteramout50 = By.xpath("//input[@type = 'number']");
    public void enteramount50(String amount){
        sendTextToElement(enteramout50,"50");
    }
    //click on "Withdraw" Button
    By clickOnWithdrawlButtonAfterEnterAmount = By.xpath("//button[@type = 'submit']");
    public void clickOnWithdrawlButtonAfterEnterAmount(){
        clickOnElement(clickOnWithdrawlButtonAfterEnterAmount);
    }
    //verify message "Transaction Successful"
    By verifyTransactionsuccessfulMessage = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String getverifyTransactionSuccessfulMessage(){
        return getTextFromElement(verifyTransactionsuccessfulMessage);
    }

}
