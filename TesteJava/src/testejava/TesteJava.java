/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wedson
 */
public class TesteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Criando o Objeto.
        Conta c1 = new Conta(2007, "35621485268", "José Felipe Martins", true, 590.90f);
        Conta c2 = new Conta(1950, "47821485297", "Maria Alice Barros", true, 700f);
        Conta c3 = new Conta(850, "25521485858", "Carlos Eduardo", true, 750f);
        Conta c4 = new Conta(2150, "32412587548", "Gev Alison", true, 400f);

        // System.out.println(c1);
        // System.out.println(c2);
        Cliente_Conta contaCliente = new Cliente_Conta();

        contaCliente.adicionarCliente(c1);
        contaCliente.adicionarCliente(c2);
        contaCliente.adicionarCliente(c3);
        contaCliente.adicionarCliente(c4);
        contaCliente.exibirTodos();

        contaCliente.exibirTotal();
        contaCliente.exibirTotalSelecionados();
        contaCliente.ordenaTotalSelecionados();

        //Instanciando um objeto da Classe Conta para ordenar com a Collection sort.
        List<Conta> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        System.out.println("Lista desordenada");
        imprimir(lista);
        Collections.sort(lista);
        System.out.println("\n Lista ordenada pelo 'Valor Total'");
        imprimir(lista);
    }

    //Método para imprimir a lista de valores do objeto da Conta na condiçãoo estabelecida.
    private static void imprimir(List<Conta> lista) {
        for (Conta conta : lista) {
            if (conta != null && conta.getVl_total() > 560 && (conta.getId_costumer() > 1500 && conta.getId_costumer() < 2700)) {
                System.out.println(conta);
            }
        }

    }

}
