package com.BDD.PageObject;

import com.BDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement searchButton;

    public void multipleProduct(String item) {
        searchButton.sendKeys(item);
        searchButton.click();
    }
}
