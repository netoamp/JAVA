/*Ao criar uam estrutura de pastas para os componentes do sistema,
 * são gerados pacotes */
package edu.alberto.segundasemana;
public class MinhaClasse {
    
    //metodo principal para classes que inicializam o sistema ou podem iniciair independentemente
        public static void main (String [] args) {

            //classe system que possui metodos de entrada e saida
            System.out.println ("Hello World!");

            //Para variaveis que não podem sofrer alteração, usa a palavra reservada "final" para garantir que não será alterada.
            //Váriaveis com nome maiusculo ou separada por _ também nçao devem ser alteradas
            /*  final String BR = "Brasil";
            double PI = 3.14;
            int ESTADOS_BRASILEIRO = 27;
            
            System.out.println(BR);
            System.out.println(PI);
            System.out.println(ESTADOS_BRASILEIRO);   

            String meuNome = "Alberto";
            int anoFabricacao = 2023;
            boolean verdadeira = false;*/

            /*Criei as variaveis que recebem os valores e serão os parameitros do metodo */
            String primeiroNome = "Alberto";
            String segundoNome = "Mattos";

            /*Criei uma variavel que recebe o metodo */
            String  nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

            /*Imprimi a varivael que recebeu o metodo */
            System.out.println(nomeCompleto);
            
    }

    /*Metodo que recebe dois parametros e retorna os valores concatenados */
    public static String nomeCompleto (String primerioNome, String segundoNome) {
        return "Resultado do Método: " + primerioNome.concat("" + " ").concat(segundoNome);
    }

}
