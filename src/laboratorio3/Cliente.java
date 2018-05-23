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
public class Cliente {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private int edad;
    private double puntos;
    private String direccion;

    public Cliente(String nombre, String apellido, int cedula, int edad, double puntos, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.puntos = puntos;
        this.direccion = direccion;
    }
    
    
}
