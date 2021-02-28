package com.BDD.PageObject;

import com.BDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountButton extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"haas-v2\"]/div[2]/div/div[4]/a[2]")
    WebElement accountButton;

    public void accountButtonClick(){
        accountButton.click();
    }

    public String accountButtonAssertion(){
       String accountPageTitle = driver.getTitle();
        System.out.println(accountPageTitle);
        return accountPageTitle;
    }
}
