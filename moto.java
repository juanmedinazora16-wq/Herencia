public class moto extends vehiculo {
    boolean tieneMaletero;

    public moto(String marca, int velocidadMax, boolean tieneMaletero) {
        super(marca, velocidadMax);
        this.tieneMaletero = tieneMaletero;
    }public void mostrarMoto() {
        mostrarDatos();
        System.out.println("Tiene maletero: " + (tieneMaletero? "Sí" : "No"));
    }
    }