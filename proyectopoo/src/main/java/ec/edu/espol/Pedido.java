/* 


package ec.edu.espol;
import java.util.Date;

public class Pedido {
     public static int contadorPedido;
    private Date fecha;
    private String codigoProducto;
    private Double valorPagado;
    public String codigoPedido;
    public String estadoPedido;
    public Cliente cliente;
    public Repartidor repartidor;

    //Constructor
    public Pedido(Date fecha, String codigoProducto, Double valorPagado,
     String codigoPedido, String estadoPedido, Cliente cliente, Repartidor repartidor){
        Pedido.contadorPedido++;
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.valorPagado = valorPagado;
        this.codigoPedido = codigoPedido;
        this.estadoPedido = estadoPedido;
        this.cliente = cliente;
        this.repartidor = repartidor;

     }

     //getters
     public int getContadorPedido(){
        return contadorPedido;
     }

     public Date getFecha(){
        return this.fecha;
     }

     public String getCodigoProducto(){
        return this.codigoProducto;
     }

     public Double getValorPagado(){
        return this.valorPagado;
     }

     public String getCodigoPedido(){
        return this.codigoPedido;
     }

     public String getEstadoPedido(){
        return this.estadoPedido;
     }

     public Cliente getCliente(){
        return this.cliente;
     }

     public Repartidor getRepartidor(){
        return this.repartidor;
     }

     //Setters
     public void setFecha(Date fecha){
        this.fecha = fecha;
     }

     public void setCodigoProducto(String codigoProducto){
        this.codigoProducto = codigoProducto;
     }

     public void setValorPagado(Double valorPagado){
        this.valorPagado = valorPagado;
     }

     public void setCodigoPedido(String codigoPedido){
        this.codigoPedido = codigoPedido;
     }

     public void setEstadoPedido(String estadoPedido){
        this.estadoPedido = estadoPedido;
     }

     public void setCliente(Cliente cliente){
        this.cliente = cliente;
     }

     public void setRepartidor(Repartidor repartidor){
        this.repartidor = repartidor;
     }

     public String crearIdPedido(int contadorPedido){
        return "Pedido" + contadorPedido;
     }

}
*/