public class Main {

    public static void main(String[] args) {
        System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();

        // --- Integrante 1: Producto ---
        // Crear una instancia de Producto con datos reales.
        Producto producto1 = new Producto("Audífonos Bluetooth", 89.99, 50, "Electrónica");
        
        // Llamar a: mostrarInfo(), aplicarDescuento() y verificarStock().
        producto1.mostrarInfo();
        producto1.aplicarDescuento(15.0);
        producto1.verificarStock(10);
        System.out.println();


        // --- Integrante 2: Cliente ---
        // Crear una instancia de Cliente con datos reales.
        Cliente cliente1 = new Cliente("María López", "maria@email.com", 250.00);
        
        // Llamar a: mostrarPerfil(), realizarCompra() y mostrarSaldo().
        cliente1.mostrarPerfil();
        cliente1.realizarCompra(89.99);
        cliente1.mostrarSaldo();
        System.out.println();


        // --- Integrante 3: Carrito ---
        // Crear una instancia de Carrito.
        Carrito carrito1 = new Carrito("María López");
        
        // Agregar al menos 2 productos con agregarProducto().
        carrito1.agregarProducto("Audífonos Bluetooth", 89.99);
        carrito1.agregarProducto("Cargador USB", 15.00);
        
        // Llamar a calcularTotal() y mostrarResumen().
        carrito1.calcularTotal();
        carrito1.mostrarResumen();


        System.out.println();
        System.out.println("===== Fin del programa =====");
    }
}
