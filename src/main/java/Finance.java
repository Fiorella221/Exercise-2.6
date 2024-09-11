import java.util.Scanner;

public class Finance {
  public static void main(String[] args) {
    double subtotal; 
    double gratuityRate;
    double gratuity;
    double total;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the subtotal and a gratuity rate: ");
    subtotal = input.nextDouble();
    gratuityRate = input.nextDouble();

    gratuity = subtotal * (gratuityRate / 100);
    total = subtotal + gratuity;
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total); 
    input.close();
  }
}
      
  