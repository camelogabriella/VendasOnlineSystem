/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;

/**
 *
 * @author gcame
 */
public interface RepositorioGenerico <T> {
    public void inserir (T t);
      public void atualizar (T t);
      public void apagar (T t);
      public T recuperar ( int id);
      public List<T> recuperarTodos ();
}
