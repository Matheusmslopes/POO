/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

/**
 *
 * @author alunolab08
 */

import java.util.Date;
import java.util.Scanner;

public class Funcionario {
    
    // ATRIBUTOS
    private String nome;
    private int matriula;
    Pedido pedido;
    Loja loja;
    
    // MÉTODOS PERSONALIZADOS
    
    

    public Funcionario() {
    }

    public Funcionario(String nome, int matriula) {
        this.nome = nome;
        this.matriula = matriula;
    }
    
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatriula() {
        return matriula;
    }

    public void setMatriula(int matriula) {
        this.matriula = matriula;
    }

   

    
    
    
}

/*

    private int cpf;
    private String endereco;
    private Date dataNascimento;

    public void curriculoFuncionario(){
        System.out.println("[CURRÍCULO DA(O) FUNIONÁRIA(O)]");
        System.out.println("Matrícula: " + this.getMatriula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("Endereço: " + this.getEndereco());
    }
     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

*/
