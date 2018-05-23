/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Maria Fernanda
 */
public class Venta {
    
    private Date fecha;
    private int cantidad;
    private String codProducto;
    String z ="GVVGVG";
  

    public Venta(int cantidad, String codProducto,Inventario inventario) {

      Producto i;
      boolean b= false;
     
        i= inventario.buscarProducto(codProducto);
        if (i== null){
            z="no existe ese codigo";
        }
        else if(i.getCantidad()>= cantidad){
            b=true;
            
        } else{
            b=false;
            z="no hay tantos";
        } 
        
        if (b=true){
        this.fecha = new Date(11,11,11);
        this.cantidad = cantidad;
        this.codProducto = codProducto;
        
        
      Producto e;
      boolean a= false;
      e= inventario.buscarProducto(codProducto);
      e.setDineroAportado(e.getDineroAportado()+(cantidad*e.getPrecio()));
        
        } else{
            z= "error";
        }
       // System.out.println(z);
    } 
    
    
    
//    
//    public boolean ActualizarAportes(Inventario inventario){
//      Producto e;
//      e= inventario.buscarProducto(codProducto);
//      e.setDineroAportado(e.getDineroAportado()+(cantidad*e.getPrecio()));
//        
//    return true;
//    }
//    
//    public boolean verificarCantidad(Inventario inventario){
//        Producto i;
//        boolean a= false;
//        i= inventario.buscarProducto(codProducto);
//        if(i.getCantidad()>= cantidad){
//            a=true;
//        } else{
//            a=false;
//        } return a;
//    } 

    public String getZ() {
        return z;
    }

}



    

