package com.BDD.PageObject;

import com.BDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListButton extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"haas-v2\"]/div[2]/div/div[4]/a[3]")
    WebElement wishlist;


    public void wishList (){
        wishlist.click();
    }

    public String wishListAssertion(){
       String title =  driver.getTitle();
        System.out.println(title);
        return title;
    }
}
