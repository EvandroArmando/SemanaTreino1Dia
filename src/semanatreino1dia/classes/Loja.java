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
public class Loja  {
    
    Dono  donoloja;
    String nome_loja;

    public Loja(Dono donoloja, String nome_loja) {
        this.donoloja = donoloja;
        this.nome_loja = nome_loja;
    }
    
    public Dono getDonoloja() {
        return donoloja;
    }

    public void setDonoloja(Dono donoloja) {
        this.donoloja = donoloja;
    }

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    
}
