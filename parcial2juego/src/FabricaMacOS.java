class FabricaMacOS implements FabricaUI {
    public Boton crearBoton() {
        return new BotonMacOS();
    }

    public Ventana crearVentana() {
        return new VentanaMacOS();
    }

    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoMacOS();
    }
}

class BotonMacOS implements Boton {
    public void renderizar() {
        System.out.println("Botón de macOS");
    }
}

class VentanaMacOS implements Ventana {
    public void renderizar() {
        System.out.println("Ventana de macOS");
    }
}

class CuadroTextoMacOS implements CuadroTexto {
    public void renderizar() {
        System.out.println("Cuadro de texto de macOS");
    }
}

