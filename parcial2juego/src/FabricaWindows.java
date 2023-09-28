class FabricaWindows implements FabricaUI {
    public Boton crearBoton() {
        return new BotonWindows();
    }

    public Ventana crearVentana() {
        return new VentanaWindows();
    }

    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoWindows();
    }
}

class BotonWindows implements Boton {
    public void renderizar() {
        System.out.println("Botón de Windows");
    }
}

class VentanaWindows implements Ventana {
    public void renderizar() {
        System.out.println("Ventana de Windows");
    }
}

class CuadroTextoWindows implements CuadroTexto {
    public void renderizar() {
        System.out.println("Cuadro de texto de Windows");
    }
}
