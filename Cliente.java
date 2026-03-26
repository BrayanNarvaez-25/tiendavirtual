package tiendavirtual;

public class Cliente {
    private String nombre; //nombre completo cliente
    private String correo; //correo electronico cliente
    private double saldo; //Dinero disponible de la cuenta del cliente
    private int totalCompras; //contador de cuantas compras ha realizado el cliente


    //CONSTRUCTOR VACIO
    public Cliente() {
        
    }

    //CONSRUCTOR CON PARAMETROS
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }
    


}
