package com.orange.hrm.pages;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class SuccessStoriesPage extends Utility {

    By successStoriesText = By.xpath("//h1[contains(text(),'Success Stories')]");

    public String getWelcomeText(){

        return getTextFromElement(successStoriesText);

    }
}
