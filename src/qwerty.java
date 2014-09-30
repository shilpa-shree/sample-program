package qwerty;
import java.util.Scanner;
public class qwerty {
	   public static void main(String[] args)
	   {
	      System.out.println("Enter an integer to print it's multiplication table");
	      Scanner in = new Scanner(System.in);
	      int num = in.nextInt();
	      System.out.println("Multiplication table of "+num+" is :-");
	 
	      for (int i = 1 ; i <= 10 ; i++ )
	         System.out.println(num+"*"+i+" = "+(num*i));
	   }
	}
	 

