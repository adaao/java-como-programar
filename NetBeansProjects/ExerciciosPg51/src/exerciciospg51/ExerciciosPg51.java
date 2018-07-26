/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciospg51;

/**
 *
 * @author adaao
 */

import java.util.Scanner;
import java.lang.*;
import leitor.de.prompt.Reader;


public class ExerciciosPg51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String opc = new String();
        String VAZIA = " ";
        
        opc = VAZIA;
        
        while (opc == VAZIA){
            System.out.println("digite uma opcao: ");
            System.out.printf("1 - circulo;%n2 - modulo;%n3 - quadrados e cubos;%n");
            opc = console.next();
            switch (opc){
                case "1":
                    circulo();
                    break;
                case "2":
                    module();
                    break;
                case "3":
                    quadradosECubos();
                    break;
                default:
                    System.out.println("Opcao inválida!!!");
            }
        }
        
        
        
    }
    
    private static void circulo(){
        int a = 0;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Agora, vamos às fórmulas...");
        
        System.out.print("Diginte um valor para Raio: ");
        a = console.nextInt();
        
        System.out.printf("Diâmetro: %d%n", diametro(a));
        
        System.out.printf("Circunferencia: %f%n", circunferencia(a));
        
        System.out.printf("Área: %f%n", area(a));
    }
    
    private static int diametro(int i){
           return 2 * i;
    }
    
    private static double circunferencia(int i){
        return 2 * Math.PI * i; 
    }
    
    private static double area (int i){
        return Math.pow(Math.PI * i, 2); 
    }
    
    public static void module(){
        int a, b, c;
        
        System.out.println("Digite o primeiro termo: ");
        a = Reader.intReader();
        
        System.out.println("Digite o segundo termo: ");
        b = leitorDeSegundoTermoParaDivisao();
        
        System.out.printf("%d by %d = %d%n", a, b, a/b);
        
        System.out.printf("mod %d %d = %d%n", a, b, a%b);
        
        b = (int) Math.pow(10, potenciaDeDezCerta(a));
        c = a/b;
                
        System.out.printf("Teste da potenciacao automatica de dez: %n%d by %d = %d%n", a, b, c);
        
        System.out.println("---- Separador de numeros ----");
        
        separadorDeNumeros(a);
   
    }
    
    private static int leitorDeSegundoTermoParaDivisao(){
        int i = 0;
        
        do{
            i = Reader.intReader();
            if (i == 0){
                System.out.println("O segundo termo deve ser diferente de 0 (ZERO), tente novamente...");
            }
        }while (i == 0);
        
        return i;
    }
    
    private static int potenciaDeDezCerta(int n){
        int x = 0;
        
        do{
            x++;
        }while(Math.pow(10, x) < n);
        
        x--;
        
        return x;
    }
    
    public static void separadorDeNumeros(int numerador){
        int denominador = (int) Math.pow(10, potenciaDeDezCerta(numerador));        
        int numeroSeparado = numerador/denominador;
        int resto = numerador % denominador;
        
        System.out.printf("%d ", numeroSeparado);
        
        if(resto < 10){
            if(resto != 0){
                System.out.printf("%d%n", resto);
            }
        }else{
            separadorDeNumeros(resto);
        }
    }
    
    public static void quadradosECubos(){
        int n;
        
        System.out.println("---- Qadrados e Cubos dos numeros de 0 a 10 ----");
        System.out.printf("%nnumber   square   cube%n");
        for (int i = 0; i < 11; i++){
            System.out.printf("%d", i);
            printaEspacos(i);      
            System.out.printf("%.0f", Math.pow(i, 2));
            n = (int) Math.pow(i, 2);
            printaEspacos(n);
            System.out.printf("%.0f%n", Math.pow(i, 3));
            
        }
    }
    
    public static void printaEspacos(int i){
        if(i<10){
            System.out.printf("%s", retornaEspacos(8));
        }
        if(i > 9 && i < 100){
            System.out.printf("%s", retornaEspacos(7));
        }
        if(i > 99){
            System.out.printf("%s", retornaEspacos(6));
        }
    }
    
    public static String retornaEspacos(int b){
        String s = "";
        for(int i = 0; i < b; i++){
            s += " ";
        }
        return s;
    }
}
