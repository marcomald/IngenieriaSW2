/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.proyect.dao;

import java.util.List;
import ec.com.proyect.domain.Usuario;
/**
 *
 * @author Marco
 */
public interface UsuarioDao {
    
    	public List<Usuario> findAllUsuarios();

	public Usuario findUsuarioById(Usuario usuario);
        
        public Usuario login(Usuario usuario);

	public void insertUsuario(Usuario usuario);

	public void updateUsuario(Usuario usuario);

	public void deleteUsuario(Usuario usuario);
}
