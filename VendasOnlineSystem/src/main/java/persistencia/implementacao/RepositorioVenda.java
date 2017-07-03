/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implementacao;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Venda;
import persistencia.RepositorioGenerico;

/**
 *
 * @author gcame
 */
public class RepositorioVenda implements RepositorioGenerico <Venda> {

    @Override
    public void inserir(Venda t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void atualizar(Venda t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public void apagar(Venda t) {
        DaoManagerHiber.getInstance().delete(t); 
    }

    @Override
    public Venda recuperar(int id) {
        try{
            return (Venda) DaoManagerHiber.getInstance().recover("from Venda where id=" + id);
        } 
        catch(IndexOutOfBoundsException in){
        return null;
               }
    }
    @Override
    public List<Venda> recuperarTodos() {
        return DaoManagerHiber.getInstance().recoverSQL("from Venda");
    }
    
}
