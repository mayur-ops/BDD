package com.BDD.PageObject;

import com.BDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement searchButton;


    public void doSearch(String item) {
        SearchTextBox.sendKeys(item);
    }

    public void searchButtonClick() {
        searchButton.click();
    }

    public String getCurrentUrl() {
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        return currentURL;
    }

    public String getTitle() {
        String nikeProductListTitle = driver.getTitle();
        System.out.println(nikeProductListTitle);
        return nikeProductListTitle;
    }
}