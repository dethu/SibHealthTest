package com.sibHealthTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;


import static com.codeborne.selenide.Configuration.*;
import static org.junit.Assert.assertTrue;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class sibHealthTest {


    @BeforeClass
    public static void browserConf()
    {
        browser = "chrome";
        //browserSize = "800x900";
    }

    @Test
    public void test()
    {

        open("https://ru.siberianhealth.com/ru/");
        $(By.cssSelector("#navbar_main__collapse > ul:nth-child(1) > li:nth-child(2) > a")).waitUntil(visible,1000).click();
        $(byText("Масло-скульптор")).waitUntil(visible, 1000).click();
        $(By.cssSelector("[ng-if] .product-spinner-button__container .ng-binding")).waitUntil(visible, 1000).click();
        $(By.cssSelector("#navbar_main > div.navbar_main__top > div.navbar_main__inner-container > div > a")).waitUntil(appears, 1000).click();
        $(byText("Оформить заказ")).waitUntil(visible, 1000).click();
        $(By.id("field-userLoginNameCart")).val("2031342617");
        $(By.id("field-userLoginPassCart")).val("TZ887715");
        //testtstststs commit
        //gdfgdfgdfg


    }
}
