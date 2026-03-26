public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	private String categoria;
	
	public Producto(String nombre, String categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	
    public void mostrarInfo() {
		System.out.println("Producto: "+ this.nombre + "\nCategoría: "+ this.categoria+"\nPrecio: $"+ this.precio+"\nStock: "+ this.stock+" unidades");
	}

    public void aplicarDescuento(double porcentaje) {
		
		double montoDescontado = this.precio * (porcentaje / 100);
		double precioFinal = this.precio - montoDescontado;
		
		System.out.println("Descuento del 15.0% : -$"+montoDescontado);
		System.out.println("Precio con descuento: $"+precioFinal);
	}

    public void verificarStock(int cantidad) {
		
		if(cantidad <= this.stock) {
			System.out.println("Disponible");
		}else {
			System.out.println("Stock insuficiente. Disponible: "+this.stock+" unidades.");
		}
	}
}