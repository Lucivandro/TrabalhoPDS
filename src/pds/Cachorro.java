/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds;

/**
 * classe chamada cachorro que tem como intuito salvar o nome dos cachorros, cor
 * e raca.
 *
 * @author Lucivandro Barbosa
 * @deprecated metodos salvarnome, salvarcor, salvarraca
 * @param 
 */
public class Cachorro {
        public static void main(String[] args) {
        
    }
    String nome;
    String raca;
    String cor;
    
    public String salvarcachorro() {
        System.out.println("salvar nome dos cachorros" + nome);
        return this.nome;
        /* metodo salvar cachorro tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/

    }

    public String inserircachorro() {
        System.out.println("salvar raca dos cachorros" + raca);
        return this.raca;
        /* metodo inserir cachorro tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/
        
    }

    public String deletarcachorro() {
        System.out.println("salvar nome dos cor" + cor);
        return this.cor;
        /* metodo deletar cachorro tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/
    }
}
