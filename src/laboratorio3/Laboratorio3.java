/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.Date;
/**
 *
 * @author Maria Fernanda
 */
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inventario inventario1 = new Inventario();
        
        inventario1.addProducto("nombre2", "codigo", 20, 3);
        
        inventario1.verInvetario();
        
        Venta venta1= new Venta(13,"cod", inventario1 );
        
   
        System.out.println(venta1.getZ()); 
    }
    
}
