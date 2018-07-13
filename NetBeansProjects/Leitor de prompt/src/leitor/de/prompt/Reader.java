/*
 * Explorando uma aboradgem diferente, 
 * estou criando esta classe para tentar aplicar os conceitos que aprendi 
 * durante o estudo da linguagem Haskell e o paradigma funcional, 
 * misturando com os conceitos do livro Código Limpo.
 */
package leitor.de.prompt;

/**
 *
 * @author adaao
 * 
 * O objetivo desta classe é ser um leitor de prompt para os exercícios
 * que fazer uso da classe Scanner do java.util
 */

import java.util.Scanner;

public class Reader {
    public static Scanner reader(){
        return new Scanner(System.in);
    }
    public static int intReader(){
        return reader().nextInt();
    }
        
}
