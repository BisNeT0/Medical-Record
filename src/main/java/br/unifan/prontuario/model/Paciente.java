/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifan.prontuario.model;

/**
 *
 * @author root_
 */
public class Paciente {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomePlanoSaude() {
        return nomePlanoSaude;
    }

    public void setNomePlanoSaude(String nomePlanoSaude) {
        this.nomePlanoSaude = nomePlanoSaude;
    }

    public Integer getNumeroPlanoSaude() {
        return numeroPlanoSaude;
    }

    public void setNumeroPlanoSaude(Integer numeroPlanoSaude) {
        this.numeroPlanoSaude = numeroPlanoSaude;
    }

    public Paciente(String cpf, String nome, String dataNascimento, String endereco, String email, String nomePlanoSaude, Integer numeroPlanoSaude) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
        this.nomePlanoSaude = nomePlanoSaude;
        this.numeroPlanoSaude = numeroPlanoSaude;
    }
    private String email;
    private String nomePlanoSaude;
    private Integer numeroPlanoSaude;
    
    
}
