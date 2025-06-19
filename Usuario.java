package proyectopoo1_10;

public abstract class Usuario {
    private String codigoUnico;
    private String cedula;
    private String nombre;
    private String apellido;

    public Usuario(String codigoUnico, String cedula, String nombre, String apellido){ //constructor
        this.codigoUnico=codigoUnico;
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
    } 

    //getters
    public String getCode(){
        return this.codigoUnico;
    }
    public String getCed(){
        return this.cedula;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    //setters
    public void setCode(String codigoUnico){
        this.codigoUnico=codigoUnico;
    }
    public void setCed(String cedula){
        this.cedula=cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }



    //método de Usuario
    public void gestionarPedido(String codigo){

    }
}