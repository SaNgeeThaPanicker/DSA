package com.SeleniumProject.testCases;


import com.SeleniumProject.pages.BaseTest;
import com.SeleniumProject.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() throws IOException, InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.loginToPortal();
//        String username ="Demo12";
//        String password ="Test123456$";
//        lp.loginToPortal(username, password);
//
//        if(username.equals("Demo12") && password.equals("Test123456$"))
//        {
//            System.out.println("Test Passed");
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            captureScreenShot(driver,"VerifyLogin");
//            Assert.assertTrue(false);
//        }
    }
}
