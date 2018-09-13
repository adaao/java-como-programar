import java.util.Scanner;
import java.util.*;

public class Pg54_2_33{
   public static void main(String[] args){
   	Scanner consoleInput = new Scanner(System.in);
	int peso,
	    altura,
	    imc,
	    alturaQ;

	System.out.printf("CALCULO DE IMC%n");
   	System.out.printf("Digite seu peso em Quilos: %n");
	peso = consoleInput.nextInt();
	System.out.printf("%nDigite sua altura: %n");
	altura = consoleInput.nextInt();
	alturaQ = altura * altura;
	System.out.println("teste");
	imc = peso / alturaQ;

	System.out.printf("Seu imc é %d", imc);
   }

}
