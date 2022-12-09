package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    //click on "Customer Login" Tab
    By clickOnCustomerLoginTab = By.xpath("//button[@ng-click = 'customer()']");
    public void clickOnCustomerLoginTab(){
        clickOnElement(clickOnCustomerLoginTab);
    }
    //search customer that you created.
    By searchcustomer1 = By.xpath("//select[@name = 'userSelect']");
    public void searchcustomer1(){
        // clickOnElement(searchCustomer);
        selectByVisibleTextFromDropDown(searchcustomer1,"Harry Potter");
    }
    //click on "Login" Button
    By clickOnLoginButton = By.xpath("//button[@type = 'submit']");
    public void clickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }
    //verify "Logout" Tab displayed.
    By verifyLogoutTabdisplayed = By.xpath("//button[@class = 'btn logout']");
    public String getverifyLogoutdisplayed(){
        return getTextFromElement(verifyLogoutTabdisplayed);
    }
    //click on "Logout"
    By clickOnLogout = By.xpath("//button[@class = 'btn logout']");
    public void clickOnLogOut(){
        clickOnElement(clickOnLogout);
    }
    By verifyYourNameDisplayed = By.xpath("//label[@xpath = '1']");
    public String getverifyYourNameDisplayed(){
        return getTextFromElement(verifyYourNameDisplayed);
    }


}
