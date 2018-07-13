/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparison;

/**
 *
 * @author adaao
 */

import leitor.de.prompt.Reader;

public class Comparison {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.printf("-- Comparator!!! --%n%n");
        comparator(fstNumberReader(), sndNumberReader());
    }
    
    private static void comparator(int fst, int snd){
        if (fst == snd)
            System.out.printf("%d == %d%n", fst, snd);
        if (fst != snd)
            System.out.printf("%d != %d%n", fst, snd);
        
        String s = Reader.stringReader();
        System.out.println(s);
    }
    
    private static int fstNumberReader(){
        System.out.print("Digite o primeiro numero: ");
        return Reader.intReader();
    }
    
    private static int sndNumberReader(){
        System.out.print("Digite o segundo numero: ");
        return Reader.intReader();
    }
    
}
