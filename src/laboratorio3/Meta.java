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
public class Meta {
    
    private double metaFija;
    private double avance;
    private String mes;
    private ArrayList<Venta> ventas;

    public Meta(double metaFija, double avance, String mes) {
        this.metaFija = metaFija;
        this.avance = avance;
        this.mes = mes;
        this.ventas = new ArrayList<>();
          
    }
    
        
    
    
}
