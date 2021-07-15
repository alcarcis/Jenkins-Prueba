#language: es
Característica: Compra en la pagina Open Cart

  @Testing
  Esquema del escenario: Compra en la pagina Open Cart
    Dado Usuario ingresa pagina selecciona My Account-Login "<caso_prueba>"
    Cuando Usuario ingresa su usuario y contrasena "<caso_prueba>"
    Y Ingreso al apartado Laptos & Notebooks
    Y Agrega dos laptos al carrito
    Y Agrega una camara al carrito
    Y Ingreso al apartado Shopping Cart
    Y Procede a realizar el checkout
    Y Procede a llenar el detalle "<caso_prueba>"
    Entonces Se valida la compra
    Ejemplos: :
      | caso_prueba |
      |           1 |