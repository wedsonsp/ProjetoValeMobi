/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

/**
 *
 * @author wedson
 */
public abstract class Cliente {

    //Atributos
    private int id_costumer;
    private String cpf_cnpj;
    private String nome;

    public Cliente(int id_costumer, String cpf_cnpj, String nome) {
        this.id_costumer = id_costumer;
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
    }

    public int getId_costumer() {
        return id_costumer;
    }

    public void setId_costumer(int id_costumer) {
        this.id_costumer = id_costumer;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Abstrato calculaMedia
    // public abstract float calculaMedia();
    // Sobrescreve o método toString para exibir os valores dos atributos.
    @Override
    public String toString() {
        return "\nCliente{" + "ID = " + id_costumer + ", CPF = " + cpf_cnpj + " NOME = " + nome + '}';
    }

}
