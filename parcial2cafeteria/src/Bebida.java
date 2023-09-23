import java.util.Scanner;

public abstract class Bebida {
    protected String descripcion;
    protected double costo;

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double calcularCosto();
}

class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
        costo = 5;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}

class Te extends Bebida {
    public Te() {
        descripcion = "Té";
        costo = 6;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}

class Leche extends Bebida {
    private Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
        descripcion = bebida.getDescripcion() + ", Leche";
        costo = bebida.calcularCosto() + 2;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}

class Chocolate extends Bebida {
    private Bebida bebida;

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
        descripcion = bebida.getDescripcion() + ", Chocolate";
        costo = bebida.calcularCosto() + 3;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}

class Canela extends Bebida {
    private Bebida bebida;

    public Canela(Bebida bebida) {
        this.bebida = bebida;
        descripcion = bebida.getDescripcion() + ", Canela";
        costo = bebida.calcularCosto() + 1;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}


