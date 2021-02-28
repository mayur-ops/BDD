package com.BDD.PageObject;

import com.BDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceRangeCheckBox extends DriverFactory {

    @FindBy(xpath = "//body/main[@id='app']/div[1]/div[3]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]")
    WebElement priceRange;

    public void priceRangeCheckBox(){
        priceRange.click();
    }

}


