/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds;

/** * classe chamada gato que tem como intuito salvar o nome dos cachorros, cor
 * e raca.
 *
 * @author Lucivandro Barbosa
 * @deprecated metodos salvarnome, salvarcor, salvarraca
 * @since 06/08/2019
 * 
 * 
 */

public class Gato {
        public static void main(String[] args) {
        
    }
    String nome;
        String raca;
        String cor;
        
        
    public void salvarnome (){
        System.out.println("salvar nome dos gato" + nome);  
        /* metodo salvar gato tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/
    }
    public void inserirgato(){
            System.out.println("salvar raca dos gatos" + raca);  
            /* metodo inserir gato tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/

}
       public void deletargato(){
        System.out.println("salvar cor dos gatos" + cor);  
        /* metodo deletar gato tem a funcionalidade de
        salvar todos os cachorros no banco de dados*/
       }
}

