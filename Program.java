//import stuff here
import java.util.Scanner;
//Your code here
public class Program{
  public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    n1 = x.nextInt();
    System.out.println();
    System.out.print("Enter number 2: ");
    n2 = x.nextInt();
    System.out.println();
    System.out.println("Original numbers are " + n1 + "and" + n2);
    System.out.println("Sum = " + (n1 + n2)); 
    System.out.println("Difference = " + (n1-n2));
    System.out.println("Product = " + (n1 * n2));
    System.out.println("Average = " + ((n1 + n2)/ 2.0));
    if (n1 > n2) {
      System.out.println("Absolute value = " + (n1-n2));
      System.out.println("Maximum = " + n1);
      System.out.println("Mininum = " + n2);
    }else {
      System.out.println("Absolute value = " + (n2-n1));
      System.out.println("Maximum = " + n2);
      System.out.println("Mininum = " + n1);
    }
  }
}
//Paste console output below:
/*


*/
