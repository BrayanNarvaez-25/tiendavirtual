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
	
}