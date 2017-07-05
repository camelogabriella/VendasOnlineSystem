/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persistencia.implementacao;

import dao.DaoManagerHiber;
import java.util.List;
import model.Produto;
import model.persistencia.RepositorioGenerico;

/**
 *
 * @author gcame
 */
public class RepositorioProduto implements RepositorioGenerico <Produto> {

    @Override
    public void inserir(Produto t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void atualizar(Produto t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public void apagar(Produto t) {
        DaoManagerHiber.getInstance().delete(t); 
    }

    @Override
    public Produto recuperar(int id) {
        try{
            return (Produto) DaoManagerHiber.getInstance().recover("from Produto where id=" + id);
        } 
        catch(IndexOutOfBoundsException in){
        return null;
               }
    }
    @Override
    public List<Produto> recuperarTodos() {
        return DaoManagerHiber.getInstance().recoverSQL("from Produto");
    }
    
}
