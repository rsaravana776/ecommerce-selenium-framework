
package com.automation.stepdefinitions;

import io.cucumber.java.en.When;

import com.automation.utils.ExcelUtil;

public class LoginStepDefinition {

    @When("User login")
    public void login()
            throws Exception {

        String email =
                ExcelUtil.getData(1, 0);

        String password =
                ExcelUtil.getData(1, 1);

        System.out.println(email);

        System.out.println(password);
    }
}

