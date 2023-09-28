class FabricaLinux implements FabricaUI {
    public Boton crearBoton() {
        return new BotonLinux();
    }

    public Ventana crearVentana() {
        return new VentanaLinux();
    }

    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoLinux();
    }
}

class BotonLinux implements Boton {
    public void renderizar() {
        System.out.println("Botón de Linux");
    }
}

class VentanaLinux implements Ventana {
    public void renderizar() {
        System.out.println("Ventana de Linux");
    }
}

class CuadroTextoLinux implements CuadroTexto {
    public void renderizar() {
        System.out.println("Cuadro de texto de Linux");
    }
}
