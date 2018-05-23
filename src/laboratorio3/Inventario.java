/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author Maria Fernanda
 */
public class Inventario {
    
    private ArrayList<Producto> productos;
    private Producto producto;

    public Inventario(){
        this.productos =new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Producto getProducto() {
        return producto;
    }
    
    
    public boolean addProducto(String nombre, String cB, int cantidad, double precio){
    return this.productos.add(new Producto(nombre,cB, cantidad, precio));
    
    }
    
    public boolean removeProducto(String codigoBarras){
        boolean a= false;
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigoBarras().equals(codigoBarras)){
             a=this.productos.remove(productos.get(i));             
            break;
            }
            else{
            
            a=false;                    
        }
        } return a;     
    }
    
    public boolean replaceProducto(String codigoBarras, String nombre, String cB, int cantidad, double precio, double dineroAportado){
         boolean a= true;
         Producto e= new Producto(nombre, cB, cantidad,precio);
         for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigoBarras().equals(codigoBarras)){
               productos.set(i, e);  //21072 extension de informatica        
            break;
            }
            else{
            
            a=false;          
            
        }
        } return a;   
    }
    
    public void verInvetario(){
        PrintWriter flujosalida= null;
        Producto a;
        try{
        File salida = new File ("escritura.txt");
        FileWriter fw = new FileWriter (salida, false); // si false sobreescribe
        flujosalida = new PrintWriter(fw);
                       
        for(int i=0; i<productos.size(); i++){
        a= productos.get(i);

          flujosalida.println( a.mostrarInfo());
          System.out.println("\n");

        }
        }
        catch (FileNotFoundException ex){
                    System.out.println("no existe archivo");
        } catch (IOException ex) {
            System.out.println("No se pede escribir");
        }
        finally{
        flujosalida.close();
               }
               
        System.out.println("se cierra");
        }
    
    public double montoTotal(){
        double z=0;
        for (int i=0; i<productos.size(); i++){
            z= z+productos.get(i).getDineroAportado();
        }
        return z;
    }
    
        
    
    public Producto buscarProducto(String cod){
        Producto e= null;
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCodigoBarras().equals(cod)){
                e= productos.get(i);
                     
                break;
            } 
            
        }return e;
  
    }
    }


