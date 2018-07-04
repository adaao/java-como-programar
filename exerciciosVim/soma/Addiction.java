/*
 * exercicio da pagina 36, soma de dois numeros
 * feito com base em paradigma funcional
 */
import java.util.Scanner;

public class Addiction{

   public static Scanner intReader(){
      return (new Scanner(System.in));
   }
   

   public static int num1(){
      System.out.println("Digite o primeiro int: ");
      return intReader().nextInt();
   }

   public static int num2(){
      System.out.println("Digite o segundo int: ");
      return intReader().nextInt();
   }

   public static int sum(int fst, int snd){
      return (fst + snd);
   } 

   public static void main(String[] args){
      System.out.printf("A soma é %d ", sum(num1(), num2()));

   }
}
