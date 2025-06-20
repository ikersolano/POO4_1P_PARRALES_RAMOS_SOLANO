package ec.edu.espol;

public class Cliente extends Usuario {
    private String numeroCelular;
    private String direccion;

    public Cliente(String codigoUnico, String cedula, String nombre, String apellido, String numeroCelular, String direccion) {
        super(codigoUnico, cedula, nombre, apellido);
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void comprar() {
        System.out.println(getNombre() + " está comprando.");
    }

    public void ingresarCategoria() {
        System.out.println("Ingresando categoría para el cliente " + getNombre());
    }

    

}
