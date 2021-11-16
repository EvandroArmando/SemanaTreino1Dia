/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanatreino1dia.classes;

/**
 *
 * @author Tequerro
 */
public class Loja {
    String dono;
    String nome_loja;

    public Loja(String dono, String nome_loja) {
        this.dono = dono;
        this.nome_loja = nome_loja;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }
    
    
    
}
