package com.orange.hrm.testsuit;

import com.orange.hrm.pages.HomePage;
import com.orange.hrm.pages.SuccessStoriesPage;
import com.orange.hrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class SuccessStoriesPageTest extends TestBase {
    HomePage homePage = new HomePage();
    SuccessStoriesPage successStoriesPage = new SuccessStoriesPage();

    @Test

    public void userShouldNavigateToSuccessStoriePage(){
    homePage.clickOnSuccessStoriesLink();
        String expectedText = "Success Stories";
        String actualText = successStoriesPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

}
