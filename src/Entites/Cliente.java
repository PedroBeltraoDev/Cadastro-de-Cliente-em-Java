package Entites;

public class Cliente {

    private String nome;
    private long cpf;
    private long numero;

    public Cliente(){
        this.cpf = 0;
        this.nome = "";
        this.numero = 0;
    }

    public Cliente(String nome, long cpf, long numero){
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public long getCpf(){
        return cpf;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public long getNumero(){
        return numero;
    }
    public void setNumero(long numero){
        this.numero = numero;
    }

}
