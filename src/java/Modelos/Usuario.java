/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author vryam
 */
public class Usuario 
{
    private int RGM;
    private String nome;
    private String email;
    private String senha;
    private String tipoUsuario;
    private String curso;

    public String getCurso() {
        return curso;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getRGM() {
        return RGM;
    }


    public String getSenha() {
        return senha;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRGM(int RGM) {
        this.RGM = RGM;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
 }
