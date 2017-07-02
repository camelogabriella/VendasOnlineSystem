/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author NALDO
 */
public class Produto {
    private String nomeProduto;
    private int idProduto;
    private double precoProduto;

    public Produto(String nomeProduto, int idProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.precoProduto = precoProduto;
    }

    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getidProduto() {
        return idProduto;
    }

    public void setidProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
}
