/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.proyect.dao;

/**
 *
 * @author Marco
 */

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.com.proyect.domain.Usuario;


@Stateless
public class UsuarioDaoImpl implements UsuarioDao{
    
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getId());
    }
    
    @Override
    public Usuario login(Usuario usuario) {
         return (Usuario) em.createQuery("SELECT u FROM usuario u WHERE u.nick :nick")
        .setParameter("nick", usuario.getNick())
        .getSingleResult();
//        return em.find(Usuario.class, usuario.getId());
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        em.merge(usuario);
        em.remove(usuario);
    }
    
}
