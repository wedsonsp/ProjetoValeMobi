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
public class Conta extends Cliente implements Comparable<Conta> {

    //Atributos
    private boolean is_active;
    private float vl_total;

    //Construtor
    public Conta(int id_costumer, String cpf_cnpj, String nome, boolean is_active, float vl_total) {
        super(id_costumer, cpf_cnpj, nome);
        this.is_active = is_active;
        this.vl_total = vl_total;
    }

    //Métodos Getter´s e Setter´s
    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public float getVl_total() {
        return vl_total;
    }

    public void setVl_total(float vl_total) {
        this.vl_total = vl_total;
    }

    //Implementação do Método Calcula Média.
    /* @Override
    public float calculaMedia() {
        float media = vl_total / 4;
        return media;
    }
     */
    //Sobrescreve o Método toString().
    @Override
    public String toString() {

        return "\nConta do Cliente " + super.toString()
                + String.format("\nAtivo: %.5b"
                        + "\nValor Total: %.2f", is_active,
                        vl_total);
    }

    /*Implementação do método abstrato compareTo da Interface Comparable que recebe a Conta para ordenar 
     a lista pelo valor total.*/
    @Override
    public int compareTo(Conta c) {

        if (this.vl_total == c.vl_total) {
            return 0;
        }

        if (c.vl_total > this.vl_total) {
            return 1;
        } else {
            return -1;
        }

    }

}
