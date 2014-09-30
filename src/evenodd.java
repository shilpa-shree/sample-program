package evenodd;
import java.util.Scanner;

public class evenodd {
	 public static void main(String[] args){               
	        
	        Scanner ab = new Scanner(System.in); 
	        System.out.printf("\nEnter a number : "); 
	       	int num = ab.nextInt();  
	        if((num %2)==0){ 
	            System.out.printf("\nNumber %d is even number" , num); 
	            
	        } 
	        else{ 
	            System.out.printf("\nNumber %d is odd number", num); 
	        }           
	        System.out.printf("\nFinding number if its even or odd using bitwise AND operator"); 
	        
	        if( (num&1) == 0){ 
	            System.out.printf("\n Number %d is even number" , num); 
	        }
	        else{ 
	            System.out.printf("\n Number %d is odd number", num); 
	        } 
	       	    } 
	    
	  	} 
