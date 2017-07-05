/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistencia.implementacao;

import model.persistencia.RepositorioGenerico;

/**
 *
 * @author gcame
 */
public class FactoryRepositorios {
     public static final int CLIENTE = 1;
     public static final int PRODUTO = 2;
     public static final int VENDA = 3;
     
      
     public static final int BANCODEDADOS= 1;
     public static final int MEMORIA= 2;


    public static RepositorioGenerico FabricarRepositorio (int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia == BANCODEDADOS){
            switch(tipoNegocio){
                case CLIENTE:
                    return new RepositorioCliente();
                case PRODUTO:
                    return new RepositorioProduto();
                case VENDA:
                    return new RepositorioVenda();
                default:
                   break;
                    
            }
            
        }
               return null;
    }
    
    
}
