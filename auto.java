public class auto extends vehiculo {
    int numero_Puertas;

    public auto(String marca, int velocidadMax, int numeroPuertas) {
        super(marca, velocidadMax); 
        this.numero_Puertas = numeroPuertas;
    }
}