package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //BankManager Login
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnBankMangerLoginButton(){
        clickOnElement(bankManagerLogin);
    }
    //click on Home Tab
    By clickOnTab = By.xpath("//button[@class = 'btn home']");
    public void clickOnTab(){
        clickOnElement(clickOnTab);
    }
    //customer Login
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLoginButton(){
        clickOnElement(customerLogin);
    }
    //
    By verifyYourNameDisplayed = By.xpath("//label[@xpath = '1']");
    public String getverifyYourNameDisplayed(){
        return getTextFromElement(verifyYourNameDisplayed);
    }

}
