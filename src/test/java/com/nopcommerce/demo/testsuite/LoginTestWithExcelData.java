package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginTestWithExcelData extends BaseTest {

    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyErrorMessageWithInvalidCredentials() {

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");
    }

}
