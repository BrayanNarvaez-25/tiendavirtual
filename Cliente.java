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

    

    //METODOS GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTotalCompras() {
        return totalCompras;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }

    //METODO MOSTRAR PERFIL
    public void mostrarPerfil() {
        System.out.println("Cliente='" + nombre + '\'' +
                ", Correo='" + correo + '\'' +
                ", Saldo=" + saldo +
                ", Compras realizadas=" + totalCompras);
    }
        //METODO REALIZAR COMPRA
    public void realizarCompra(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo actual " + saldo);
        } else {
            saldo -= monto;
            totalCompras++;
            System.out.println("Compra exitosa por " + monto);
            System.out.println("Saldo restante: " + saldo);
        }
    }

    //METODO MOSTRAR SALDO
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }


}
