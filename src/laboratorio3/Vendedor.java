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
public class Vendedor extends Usuario {
    
    private String nombre;
    private String apellido;
    private int id;
    private double ventasVendedor;

    public Vendedor(String nombre, String apellido, int id, double ventasVendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.ventasVendedor = ventasVendedor;
    }
    
    
           
}
