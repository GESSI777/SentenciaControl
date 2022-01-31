/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.Vista;

import ec.edu.intsuperior.controlador.Pais;

/**
 *
 * @author Windows 10
 */
public class Aplicacion {
    public static void main (String []args) { 
        Pais pais1 = new Pais("p001","Argentina");
        Pais pais2 = new Pais("p002","Brazil");
        Pais pais3 = new Pais("p002","bolibia");
        Pais pais4= new pais("p003","chile");
        
        System.out.println (pais1.getCodigoPais() +"  - " +pais1.getNombrePais());
        System.out.println(pais2.tosString());
                
                
        
                
                
               
                
                
                
    }
}
