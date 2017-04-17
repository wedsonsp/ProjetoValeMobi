/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wedson
 */
public class Cliente_Conta {

    // Atributos
    // private ListaObj lista;
    // Atributos
    // private ListaObj lista;
    private ArrayList<Conta> listas = new ArrayList();

    //ArrayList criado para utilizar na ordenação da Lista pelo ValorTotal.
    private ArrayList<Conta> ordenaListas = new ArrayList();

    // Construtor
    /*
    public Cliente_Conta(int tam) {
        lista = new ListaObj(tam);
    }
     */
    //Metodos para Adicionar o Cliente
    public void adicionarCliente(Conta c) {
        //lista.adicionar(c);
        this.listas.add(c);

    }

    public void adicionarOrdenaCliente(Conta c) {
        //lista.adicionar(c);
        this.ordenaListas.add(c);

    }

    //Método para exibir todos os itens da Lista.
    public void exibirTodos() {
        String lista = "";

        for (Cliente lista1 : listas) {

            System.out.printf(" %s", lista1);
            System.out.println();//posiciona na próxima linha
            System.out.println();//posiciona na próxima linha
        }
    }

    float soma = 0;
    float media = 0;
    int contador = 0;

    //Método para exibir o Total da Média dos Itens.
    public void exibirTotal() {
        System.out.println("Calculo de Ganho somente dos selecionados");
        //Nomes que estão dentro da condição do Calculo.

        for (Conta lista : listas) {
            if (lista != null && lista.getVl_total() > 560 && (lista.getId_costumer() > 1500 && lista.getId_costumer() < 2700)) {
                soma += lista.getVl_total();
                contador++;
                media = soma / contador;
            }
        }
        System.out.println("\nTamanho da Lista: " + contador);
        System.out.println("\nValot Total dos Itens é: " + soma);
        System.out.println("\nA média do Total dos Itens é: " + media);
    }

    public String exibirTotalSelecionados() {
        for (Conta lista1 : listas) {
            if (lista1 != null && lista1.getVl_total() > 560 && (lista1.getId_costumer() > 1500 && lista1.getId_costumer() < 2700)) {
                System.out.printf(" %s", lista1);
                System.out.println();//posiciona na próxima linha
            }
        }
        return listas.toString();
    }

    public void ordenaTotalSelecionados() {
        System.out.println("Ordena pelo Valor Total");

    }

    private static void imprimir(List<Conta> lista) {
        for (Conta pessoa : lista) {
            System.out.println(pessoa.getId_costumer());
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getCpf_cnpj());
            System.out.println(pessoa.getVl_total());

            System.out.print("Nome : " + pessoa.getNome() + " CPF : "
                    + pessoa.getCpf_cnpj() + " Valor Total : " + pessoa.getVl_total());
        }
    }

}
