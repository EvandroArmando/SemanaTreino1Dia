/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanatreino1dia.classes;

/**
 *
 * @author evandroarmando
 */
public class Factura {

  Producto productosnalista;
  Cliente clientePagou;
  Funcionarios funcionarioFacturou;
  Loja lojaaondeComprou;
  int qtdProductos;
  int saldo;
  int total;

    public Factura(Producto productosnalista, Cliente clientePagou, Funcionarios funcionarioFacturou, Loja lojaaondeComprou, int saldo) {
        this.productosnalista = productosnalista;
        this.clientePagou = clientePagou;
        this.funcionarioFacturou = funcionarioFacturou;
        this.lojaaondeComprou = lojaaondeComprou;
        this.qtdProductos = qtdProductos;
        this.saldo = saldo;
    }
  

  
  
  public String pagar(){
       
      if (this.qtdProductos >=1 && this.total >0) {
           this.setSaldo(this.getTotal()-this.getSaldo());
           return " Pagamento realizado com sucesso!";
      } else {
          return " Pagamento não realizado com sucesso!, sem productos ou saldo suficiente";
      }
      
  }
  
  
  
  public String adicionarProductos (Producto producto){
        if (this.saldo>= producto.preco) {
         this.setTotal(this.getTotal()+producto.getPreco());
          qtdProductos ++; 
          return "Total: "+this.total+" , producto adiconado: "+producto.getNome();
      } else {
          return "não é possivel adicionar productos a factura, preço superior"
                    + "ao saldo";
      }
    
        
        
        
        
      
  }

    public String Relátorio() {
        return "Factura{" + "numero de productos=" + this.getQtdProductos() + ", clientePagou=" + this.getClientePagou().nome + ", funcionario que facturou=" + this.funcionarioFacturou.nome + ", lojaaondeComprou=" + this.lojaaondeComprou.nome_loja +  ", saldo=" + this.saldo + ", total=" + this.total +'}';
    }
  
  
  
  

    public Producto getProductosnalista() {
        return productosnalista;
    }

    public void setProductosnalista(Producto productosnalista) {
        this.productosnalista = productosnalista;
    }

    public Cliente getClientePagou() {
        return clientePagou;
    }

    public void setClientePagou(Cliente clientePagou) {
        this.clientePagou = clientePagou;
    }

    public Funcionarios getFuncionarioFacturou() {
        return funcionarioFacturou;
    }

    public void setFuncionarioFacturou(Funcionarios funcionarioFacturou) {
        this.funcionarioFacturou = funcionarioFacturou;
    }

    public Loja getLojaaondeComprou() {
        return lojaaondeComprou;
    }

    public void setLojaaondeComprou(Loja lojaaondeComprou) {
        this.lojaaondeComprou = lojaaondeComprou;
    }

    public int getQtdProductos() {
        return qtdProductos;
    }

    public void setQtdProductos(int qtdProductos) {
        this.qtdProductos = qtdProductos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
  
  
   
    
}
