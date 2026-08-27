public class auto extends vehiculo {
    int numeroPuertas;

    public auto(String marca, int velocidadMax, int numeroPuertas) {
        super(marca, velocidadMax); // Hereda los atributos de Vehiculo
        this.numeroPuertas = numeroPuertas;
    }
}