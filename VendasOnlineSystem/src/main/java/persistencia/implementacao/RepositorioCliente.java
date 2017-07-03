/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implementacao;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Cliente;
import persistencia.RepositorioGenerico;



/**
 *
 * @author gcame
 */
public class RepositorioCliente implements RepositorioGenerico<Cliente> {

    @Override
    public void inserir(Cliente t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void atualizar(Cliente t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public void apagar(Cliente t) {
       DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public Cliente recuperar(int id) {
        try {
            return (Cliente) DaoManagerHiber.getInstance().recover("from Cliente id=" + id);
        } catch (IndexOutOfBoundsException in) {
            return null;
        }
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Cliente");
    }
}
