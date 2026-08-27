public class vehiculo {
    String marca;
    int velocidadMax;

    
    public vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
        
    }
    public void mostrarDatosBase() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMax + " km/h");
    }
}