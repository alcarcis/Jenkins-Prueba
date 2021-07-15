package com.tsoft.bot.frontend.steps.cart;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.pages.cart.CartPage;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver driver;
    private final CartPage cart = new CartPage(driver);

    public CartSteps() {
        this.driver = Hook.getDriver();
    }

    @Dado("^Usuario ingresa pagina selecciona My Account-Login \"([^\"]*)\"$")
    public void usuarioIngresaPaginaSeleccionaMyAccountLogin(String setNumberUrl) throws Throwable {
        cart.enterUrl(setNumberUrl);
    }

    @Cuando("^Usuario ingresa su usuario y contrasena \"([^\"]*)\"$")
    public void usuarioIngresaSuUsuarioYContrasena(String setNumberCredentials) throws Throwable {
        cart.login(setNumberCredentials);
    }

    @Y("^Ingreso al apartado Laptos & Notebooks$")
    public void ingresoAlApartadoLaptosNotebooks() throws Throwable{
        cart.clickLaptopsNotebooks();
    }

    @Y("^Agrega dos laptos al carrito$")
    public void agregaDosLaptosAlCarrito() throws Throwable{
        cart.agregarCarritoLaptops();
    }

    @Y("^Agrega una camara al carrito$")
    public void agregaUnaCamaraAlCarrito() throws Throwable{
        cart.agregarCarritoCamara();
    }

    @Y("^Ingreso al apartado Shopping Cart$")
    public void ingresoAlApartadoShoppingCart() throws Throwable{
        cart.clickcarrito();
    }

    @Y("^Procede a realizar el checkout$")
    public void procedeARealizarElCheckout() throws Throwable{
        cart.checkoutcarrito();
    }

    @Y("^Procede a llenar el detalle \"([^\"]*)\"$")
    public void procedeALlenarElDetalle(String setPurchase) throws Throwable {
        cart.detalleCompra(setPurchase);
    }

    @Entonces("^Se valida la compra$")
    public void seValidaLaCompra() throws Throwable{
        cart.validaCompra();
    }
}
