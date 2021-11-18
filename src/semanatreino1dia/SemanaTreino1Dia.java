/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanatreino1dia;

import semanatreino1dia.classes.Cliente;
import semanatreino1dia.classes.Funcionarios;
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
        
        
        //instaciamento das classes
        Cliente cliente [] = new Cliente[6];
        Usuario  usuario [] = new Usuario[6];
        Funcionarios funcionario []= new Funcionarios[6];
        
        
        //setar as classes
        usuario[0]= new Usuario("Chefe", "evandro", 18);
        usuario[2]= new Usuario("Cliente", "Irineia Lukombo", 18);
        //lojas
        usuario[1]= new Usuario("Funcionario", "Abel", 18);
        funcionario[0]= new Funcionarios("kilamba", "Atendente de caixa",usuario[0], usuario[0].getNome(), usuario[1].getNome(), usuario[0].getIdade());  
        cliente[0]= new Cliente("kilamba", "masculino", usuario[2]);
        
        
        
    }
    
}
