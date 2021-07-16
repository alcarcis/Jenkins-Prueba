package com.tsoft.bot.frontend.pages.pages.cart;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.ExcelDataObjects;
import com.tsoft.bot.frontend.pages.objects.OpenCartObjects;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;

public class CartPage extends BaseClass {
    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();
    String mensaje;
    Actions actions;

    public CartPage(WebDriver driver){
        super(driver);
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME);
    }


    public void enterUrl(String urlTestCase) throws Throwable {
        mensaje = "Se ingresa a la URL y seleccionas My Account-Login";
        try {
            int countPage = Integer.parseInt(urlTestCase) - 1;
            String url = getData().get(countPage).get(ExcelDataObjects.COLUMN_URL);
            driver.get(url);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println(mensaje);
            click(driver, OpenCartObjects.BTN_SIGNIN);
            sleep(3000);
            click(driver, OpenCartObjects.BTN_LOGIN);
            sleep(3000);
            stepPass(driver, mensaje);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }

    }

    public void login(String casoPrueba) throws Throwable {
        mensaje = "Se ingresa el email y contraseña";
        try {
            sleep(3000);
            int countPage = Integer.parseInt(casoPrueba) - 1;
            String email = getData().get(countPage).get(ExcelDataObjects.COLUMN_USER);
            String passwd = getData().get(countPage).get(ExcelDataObjects.COLUMN_PASWWORD);

            typeText(driver, OpenCartObjects.INPUT_EMAIL, email);
            typeText(driver, OpenCartObjects.INPUT_PASSWORD, passwd);
            click(driver, OpenCartObjects.BUTTON_LOGIN);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            sleep(5000);
            stepPass(driver, mensaje);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            System.out.println("Fallo en tiempo de respuesta: " + we.getMessage());
            stepFail(driver, "Fallo en tiempo de respuesta: " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void clickLaptopsNotebooks() throws Throwable {
        mensaje = "Hacemos click en Show all Laptops & Notebooks";
        try {
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((OpenCartObjects.HOVER_LAPTOP)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(OpenCartObjects.CLICK_ALL_LAPTOP).click();
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }

    }

    public void agregarCarritoLaptops() throws Throwable {
        mensaje = "Agregamos al carrito 2 Laptops";
        try {
            Thread.sleep(3000);
            scroll(driver,0,400);
            Thread.sleep(500);;
            click(driver, OpenCartObjects.CLICK_LAPTOP_HP);
            sleep(3000);
            scroll(driver,0,550);
            click(driver, OpenCartObjects.ADD_LAPTOP_HP);
            sleep(3000);
            actions = new Actions(driver);
            Thread.sleep(500);;
            WebElement element = driver.findElements((OpenCartObjects.HOVER_LAPTOP)).get(0);
            actions.moveToElement(element).perform();
            element.findElement(OpenCartObjects.CLICK_ALL_LAPTOP).click();
            sleep(3000);
            scroll(driver,0,400);
            Thread.sleep(500);;
            click(driver, OpenCartObjects.CLICK_MACKBOOK);
            sleep(3000);
            scroll(driver,0,500);
            click(driver, OpenCartObjects.ADD_MACKBOOK);
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);

        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void agregarCarritoCamara() throws Throwable {
        mensaje = "Agregamos al carrito 1 Camara";
        try {
            click(driver, OpenCartObjects.CLICK_CAMERAS);
            sleep(3000);
            scroll(driver,0,400);
            click(driver, OpenCartObjects.CLICK_CAMERA);
            sleep(3000);
            scroll(driver,0,500);
            click(driver, OpenCartObjects.ADD_CAMERA);
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);

        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }

    }

    public void clickcarrito() throws Throwable {
        mensaje = "Hacemos click en el carrito";
        try {
            click(driver, OpenCartObjects.CLICK_SHOPPING_CART);
            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void checkoutcarrito() throws Throwable {
        mensaje = "Hacemos click en el carrito";
        try {
            scroll(driver,0,600);

            click(driver, OpenCartObjects.BTN_CHECKOUT);
            sleep(1000);
            click(driver, OpenCartObjects.CHECKBOX_DETAILS);


            sleep(3000);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void detalleCompra(String caso) throws Throwable {
        mensaje = "Se ingresa los datos del detalle de la compra";
        try {


            scroll(driver,0,400);
            int countPage = Integer.parseInt(caso) - 1;
            String name = getData().get(countPage).get(ExcelDataObjects.COLUMN_NAME);
            String lastname = getData().get(countPage).get(ExcelDataObjects.COLUMN_LASTNAME);
            String address = getData().get(countPage).get(ExcelDataObjects.COLUMN_ADDRESS);
            String city = getData().get(countPage).get(ExcelDataObjects.COLUMN_CITY);
            String country = getData().get(countPage).get(ExcelDataObjects.COLUMN_COUNTRY);
            String state = getData().get(countPage).get(ExcelDataObjects.COLUMN_STATE);

            typeText(driver, OpenCartObjects.INPUT_NAME, name);
            sleep(2000);
            typeText(driver, OpenCartObjects.INPUT_LASTNAME, lastname);
            sleep(2000);
            typeText(driver, OpenCartObjects.INPUT_ADDRESS, address);
            sleep(2000);
            typeText(driver, OpenCartObjects.INPUT_CITY, city);
            sleep(2000);
            typeText(driver, OpenCartObjects.INPUT_COUNTRY, country);
            sleep(2000);
            typeText(driver, OpenCartObjects.INPUT_STATE, state);
            sleep(3000);

            click(driver, OpenCartObjects.BTN_CONTINUE);
            sleep(2000);
            click(driver, OpenCartObjects.BTN_CONTINUE1);
            sleep(2000);
            click(driver, OpenCartObjects.BTN_CONTINUE2);
            sleep(2000);
            click(driver, OpenCartObjects.CHECKBOX_TERMS);
            sleep(2000);
            click(driver, OpenCartObjects.BTN_CONTINUE3);
            sleep(2000);

            click(driver, OpenCartObjects.BTN_CONFIRM);
            sleep(3000);


            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void validaCompra() throws Throwable {
        mensaje = "Hacemos click en el carrito";
        try {
            if(isDisplayed(driver,OpenCartObjects.CONFIRM_ORDER))
                System.out.println("Compra realizada con exito");

                sleep(3000);
                stepPass(driver, mensaje);
                generateWord.sendText(mensaje);
                generateWord.addImageToWord(driver);
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjects.EXCEL_DOC, ExcelDataObjects.PAGE_NAME, 1, 19, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
        driver.quit();
    }



}
