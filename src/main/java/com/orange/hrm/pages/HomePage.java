package com.orange.hrm.pages;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {

By featuresLink = By.xpath("//a[contains(text(),'Features')]");
By servicesLink = By.xpath("//a[@class='link'][contains(text(),'Services')]");
By successStoriesLink = By.xpath("//a[contains(text(),'Success Stories')]");
By partnersLink = By.xpath("//a[@class='link'][contains(text(),'Partners')]");
By blogLink = By.xpath("//a[@class='link'][contains(text(),'Blog')]");

public void clickOnFeatureLink(){
    clickOnElement(featuresLink);

}
public void clickOnServicesLink(){
    clickOnElement(servicesLink);
}
public void clickOnSuccessStoriesLink(){
    clickOnElement(successStoriesLink);
}
public void clickOnPartnersLink(){
    clickOnElement(partnersLink);
}
public void clickOnBlogLink(){
    clickOnElement(blogLink);
}
}
