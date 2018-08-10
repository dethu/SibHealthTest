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
        long timeout_def = 10000;

        open("https://ru.siberianhealth.com/ru/");
        $(By.cssSelector("#navbar_main__collapse > ul:nth-child(1) > li:nth-child(2) > a")).waitUntil(visible,timeout_def).click();
        $(byText("Масло-скульптор")).waitUntil(visible, timeout_def).click();
        $(By.cssSelector("[ng-if] .product-spinner-button__container .ng-binding")).waitUntil(visible, timeout_def).click();
        $(By.cssSelector("#navbar_main > div.navbar_main__top > div.navbar_main__inner-container > div > a")).waitUntil(appears, timeout_def).click();
        $(byText("Оформить заказ")).waitUntil(visible, timeout_def).click();
        $(byName("userLoginNameCart")).waitUntil(appears, timeout_def).click();
        $(byId("field-userLoginNameCart")).waitUntil(visible, timeout_def).val("2031342617");
        $(By.name("userLoginPassCart")).waitUntil(appears, timeout_def).click();
        $(By.name("userLoginPassCart")).waitUntil(visible, timeout_def).sendKeys("TZ887715");
        $(byText("Войти")).waitUntil(visible, timeout_def).click();
        $(byText("Самовывоз")).exists();


    }
}
