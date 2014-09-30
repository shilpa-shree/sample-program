package abc;
import java.util.*;


public class abc {
	
	    public static void main(String[] args) 
	    {
	        Scanner pm = new Scanner(System.in);

	        System.out.println("\n Enter a number: ");
	        int num = pm.nextInt();
	        
	        abc primeNum = new abc();

	        if ( primeNum.isPrime(num) ) {
	            System.out.printf("\n  The number %d is Prime", +num);
	        } else {
	            System.out.printf("\n  The number %d is not Prime", +num);
	        }
	    }
	  
	    public boolean isPrime(int num) {
	        if ( num < 2 ) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if ( num % i == 0 ) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
