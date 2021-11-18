/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanatreino1dia;

import semanatreino1dia.classes.Cliente;
import semanatreino1dia.classes.Usuario;

/**
 *
 * @author evandroarmando
 */
public class SemanaTreino1Dia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Cliente cliente [] = new Cliente[6];
        Usuario  usuario [] = new Usuario[6];
        usuario[0]= new Usuario("adm", "evandro", 18);
        cliente[0]= new Cliente("kilamba", "masculino", usuario[0]);
        
        
        
    }
    
}
