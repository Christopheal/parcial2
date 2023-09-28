class Juego {
    private Boton boton;
    private Ventana ventana;
    private CuadroTexto cuadroTexto;

    public Juego(FabricaUI fabricaUI) {
        boton = fabricaUI.crearBoton();
        ventana = fabricaUI.crearVentana();
        cuadroTexto = fabricaUI.crearCuadroTexto();
    }

    public void jugar() {
        boton.renderizar();
        ventana.renderizar();
        cuadroTexto.renderizar();
    }
}
