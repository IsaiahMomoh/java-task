import java.util.Scanner;
public class FactorsOfNumbers {
  public static void main (String[] args) { 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter numbers: ");
    long number = input.nextLong();
     
     long factorial = 1;
    for(long count = 1; count <= number; count++) {
     factorial = count * factorial; {   
       System.out.print(factorial + "   ");
            }
        }
    }
}





