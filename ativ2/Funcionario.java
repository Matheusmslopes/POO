package sistemapedidos;

import java.util.Date;
import java.util.Scanner;

public class Funcionario {
    
    // ATRIBUTOS
    private String nome;
    private int matriula;
    /* --- */
    private int cpf;
    private String endereco;
    private Date dataNascimento;
    
    // MÉTODOS PERSONALIZADOS
    
    Scanner scan = new Scanner(System.in);
    
    public void iniciarAtendimento(){
        System.out.println("Insira o horário do atendimento: ");
        float horario = scan.nextInt(); // scan
        
        if (horario > 7.30 && horario < 20.0){
            System.out.println("Atendimento iniciado.");
        } else{
            System.out.println("Funcionários já foram para casa. Tente seu atendimento novamente durante o horário de trabalho.");
        }
    }
   
    
    public void curriculoFuncionario(){
        System.out.println("[CURRÍCULO DA(O) FUNIONÁRIA(O)]");
        System.out.println("Matrícula: " + this.getMatriula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("Endereço: " + this.getEndereco());
    }
    
    // MÉTODOS ESPECIAIS
    
    // (GETTERS E SETTERS)
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

    
    
    
    // (CONSTRUTOR)

// vamos colocar o construtor quando tudo estiver pronto, para realmente incluirmos todos os atributos novos que possívelmente iremos colocar!

    
    
}
