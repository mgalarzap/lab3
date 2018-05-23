/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author Maria Fernanda
 */
public class Producto {
    
    private String nombre;
    private String codigoBarras;
    private int cantidad;
    private double precio;
    private double dineroAportado=0;

    public Producto(String nombre, String codigoBarras, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.cantidad = cantidad;
        this.precio = precio;
        this.dineroAportado = dineroAportado;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
      public double getDineroAportado() {
        return dineroAportado;
      }

    public void setDineroAportado(double dineroAportado) {
        this.dineroAportado = dineroAportado;
    }
      
      

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
      
      
    
    
    public String mostrarInfo(){
        return "Nombre: " + this.nombre + ", Código de Barras: " + this.codigoBarras + ", cantidad: " + this.cantidad + ", Precio Venta: " + this.precio;
    }
    
    
}
