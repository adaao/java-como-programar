import java.util.Scanner;
import java.lang.*;

public class Pg54_2_32{
   public static void main(String[] args){
      //int [4] inteiros;
      int np, nn, z, console;
      np=0; nn=0; z=0;
      Scanner input = new Scanner(System.in);

      for(int i=0; i<5; i++){
         console = input.nextInt();
	 if(console > 0){
	    np++;
	 }else{
	    if(console < 0){
	       nn++;
	    }else{
	       z++;
	    }
	 }
      }
      
      System.out.printf("np = %d, nn = %d, z = %d%n", np, nn, z);
   }
}
