


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.proyect.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marco
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nombres")
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;
    @Column(name = "numeroContacto1")
    private String numeroContacto1;
    @Column(name = "numeroContacto2")
    private String numeroContacto2;
    @Column(name = "email")
    private String email;
    @Column(name = "nick")
    private String nick;
    @Column(name = "password")
    private String password;
    @Column(name = "rol")
    private int rol;
 
    public Usuario() {
    }
 
    public Usuario(String nombre, String apellido, String numeroContacto1, String numeroContacto2, 
            String email, String nick, String password, int rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroContacto1 = numeroContacto1;
        this.numeroContacto2 = numeroContacto2;
        this.email = email;
        this.nick = nick;
        this.password = password;
        this.rol = rol;
 
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the numeroContacto1
     */
    public String getNumeroContacto1() {
        return numeroContacto1;
    }

    /**
     * @param numeroContacto1 the numeroContacto1 to set
     */
    public void setNumeroContacto1(String numeroContacto1) {
        this.numeroContacto1 = numeroContacto1;
    }

    /**
     * @return the numeroContacto2
     */
    public String getNumeroContacto2() {
        return numeroContacto2;
    }

    /**
     * @param numeroContacto2 the numeroContacto2 to set
     */
    public void setNumeroContacto2(String numeroContacto2) {
        this.numeroContacto2 = numeroContacto2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the rol
     */
    public int getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
}
