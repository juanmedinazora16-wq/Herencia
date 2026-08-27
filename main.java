public class main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase hija Auto
        auto miAuto = new auto("Chevrolet", 200, 4);
        
        // Creamos un objeto de la clase hija Moto
        moto miMoto = new moto("Yamaha", 150, false);

        System.out.println("INFORMACIÓN DEL AUTO");
        miAuto.mostrarAuto();

        System.out.println("INFORMACIÓN DE LA MOTO");
        miMoto.mostrarMoto();
    }
}