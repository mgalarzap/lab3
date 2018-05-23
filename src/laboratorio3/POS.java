/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.ArrayList;
/**
 *
 * @author Maria Fernanda
 */
public class POS {
    
    private Inventario inventario;
    private Caja caja;
    private ArrayList<Usuario> usuarios;

    public POS(Inventario inventario, Caja caja, ArrayList<Usuario> usuarios) {
        this.inventario = inventario;
        this.caja = caja;
        this.usuarios = usuarios;
    }
    
    
    
}
