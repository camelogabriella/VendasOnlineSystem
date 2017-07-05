/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NALDO
 */
@Entity
@Table
public class Produto {
    @Id
    @GeneratedValue
    private int idProduto;
    
    @Column
    private String nomeProduto;
    
    @Column
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
