public class Main {
    public static void main(String[] args) {
        FabricaUI fabricaWindows = new FabricaWindows();
        Juego juegoWindows = new Juego(fabricaWindows);
        juegoWindows.jugar();

        FabricaUI fabricaMacOS = new FabricaMacOS();
        Juego juegoMacOS = new Juego(fabricaMacOS);
        juegoMacOS.jugar();

        FabricaUI fabricaLinux = new FabricaLinux();
        Juego juegoLinux = new Juego(fabricaLinux);
        juegoLinux.jugar();
    }
}
