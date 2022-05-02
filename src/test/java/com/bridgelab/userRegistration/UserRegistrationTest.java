package com.bridgelab.userRegistration;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
/*
* @author atik
*  user registration test cases
* */

public class UserRegistrationTest {
    //True test case for First Name
    @Test
   public void givenFirstName_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Atik");
        Assert.assertTrue(result);
    }
    //False test case for First Name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnInvalid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("atik");
        Assert.assertFalse(result);
    }
    //True test case for Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("Ahmad");
        Assert.assertTrue(result);
    }
    //False test case for Last Name
    @Test
    public void givenLastName_WhenProper_ShouldReturnInvalid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("ahmad");
        Assert.assertFalse(result);

    }
    //True test case for Email
    @Test
   public void givenEmail_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.email("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    //False test case for Email
    @Test
    public void givenEmail_WhenProper_ShouldReturnInvalid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.email("ab.xyz@bl.co.in");
        Assert.assertFalse(result);
    }
    //True test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.mobileNumber("91 8657169656");
        Assert.assertTrue(result);
    }
    //False test case for Mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnInvalid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.mobileNumber("918657169656");
        Assert.assertFalse(result);
    }
    //True test case for password Rule1
    @Test
   public void givenRuleOne_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.ruleOne("abcdefghi");
        Assert.assertTrue(result);
    }
    //True test case for password Rule2
    @Test
   public void givenRuleTwo_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.ruleTwo("Abcdefghi");
        Assert.assertTrue(result);
    }
    //True test case for password Rule3
    @Test
   public void givenRuleThird_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.ruleThird("Abcdegh1");
        Assert.assertTrue(result);
    }
    //True test case for password Rule4
    @Test
   public void givenRuleFourth_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.ruleFourth("Abcdegh1@");
        Assert.assertTrue(result);
    }
}
