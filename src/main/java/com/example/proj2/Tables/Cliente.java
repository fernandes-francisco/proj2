package com.example.proj2.Tables;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "IdCliente", nullable = false)
    private Long idCliente;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "NIF")
    private String nif;

    @Column(name = "Contacto")
    private String contacto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCodPostal", referencedColumnName = "CodPostal")
    private CodPostal codPostal;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    // Getters and Setters
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public CodPostal getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(CodPostal codPostal) {
        this.codPostal = codPostal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", nif='" + nif + '\'' +
                ", contacto='" + contacto + '\'' +
                ", codPostal=" + codPostal +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
