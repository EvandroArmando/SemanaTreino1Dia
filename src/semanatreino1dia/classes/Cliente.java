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
public class Cliente  {
    String morada;
    String sexo;
    Usuario adicionadopor;

    public Cliente(String morada, String sexo, Usuario adicionadopor) {
        this.morada = morada;
        this.sexo = sexo;
        this.adicionadopor = adicionadopor;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Usuario getAdicionadopor() {
        return adicionadopor;
    }

    public void setAdicionadopor(Usuario adicionadopor) {
        this.adicionadopor = adicionadopor;
    }

    
    
    
    
    
}
