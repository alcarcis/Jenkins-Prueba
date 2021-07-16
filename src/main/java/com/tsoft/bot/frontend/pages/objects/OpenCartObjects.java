package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;

public class OpenCartObjects {
    //Home Page
    public static final By BTN_SIGNIN =By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
    public static final By BTN_LOGIN =By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");

    //Login Page
    public static final By INPUT_EMAIL =By.name("email");
    public static final By INPUT_PASSWORD =By.name("password");
    public static final By BUTTON_LOGIN =By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

    //Account Page
    public static final By HOVER_LAPTOP =By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a");
    public static final By CLICK_ALL_LAPTOP =By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a");
    public static final By CLICK_CAMERAS =By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");

    //Product Page

    //Agrega Primer Producto
    public static final By CLICK_LAPTOP_HP =By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img");
    public static final By ADD_LAPTOP_HP =By.xpath("//*[@id=\"button-cart\"]");

    //Agrega Segundo Producto
    public static final By CLICK_MACKBOOK =By.xpath("//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img");
    public static final By ADD_MACKBOOK =By.xpath("//*[@id=\"button-cart\"]");

    //Agrega Tercer Producto
    public static final By CLICK_CAMERA =By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img");
    public static final By ADD_CAMERA=By.xpath("//*[@id=\"button-cart\"]");

    //Click en el carrito
    public static final By CLICK_SHOPPING_CART=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a");



    //Boton Checkout
    public static final By BTN_CHECKOUT=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
    public static final By CHECKBOX_DETAILS=By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input");





    //Detalle compra
    public static final By INPUT_NAME=By.xpath("//*[@id=\"input-payment-firstname\"]");
    public static final By INPUT_LASTNAME=By.xpath("//*[@id=\"input-payment-lastname\"]");
    public static final By INPUT_ADDRESS=By.xpath("//*[@id=\"input-payment-address-1\"]");
    public static final By INPUT_CITY=By.xpath("//*[@id=\"input-payment-city\"]");
    public static final By INPUT_POST_CODE=By.xpath("//*[@id=\"input-payment-postcode\"]");
    //public static final By INPUT_COUNTRY=By.xpath("//*[@id=\"input-payment-country\"]/option[178]");
    public static final By INPUT_COUNTRY=By.name("country_id");

    //public static final By INPUT_STATE=By.xpath("//*[@id=\"input-payment-zone\"]/option[16]");
    public static final By INPUT_STATE=By.name("zone_id");
    //*[@id="button-payment-address"]
    public static final By BTN_CONTINUE=By.cssSelector("#button-payment-address");

    public static final By BTN_CONTINUE1=By.xpath("//*[@id=\"button-shipping-address\"]");
    public static final By BTN_CONTINUE2=By.xpath("//*[@id=\"button-shipping-method\"]");
    public static final By CHECKBOX_TERMS=By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
    public static final By BTN_CONTINUE3=By.xpath("//*[@id=\"button-payment-method\"]");
    public static final By BTN_CONFIRM=By.xpath("//*[@id=\"button-confirm\"]");
    public static final By CONFIRM_ORDER=By.xpath("//*[@id=\"content\"]/h1");
































}
