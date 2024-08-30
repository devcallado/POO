import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double x = 5.64; 
         Scanner scanner = new Scanner(System.in);       
         //System.out.print("Digite o valor em dólares: ");
         System.out.print("Digite o valor em reais: ");
         //double vdolar = scanner.nextDouble();
         double vreais = scanner.nextDouble();
         //double vreais = vdolar * x;
         double vdolar = vreais/x;
         //System.out.printf("O valor de dólares é igual a %.2f em reais.\n", vreais);
         System.out.printf("O valor de reais é igual a %.2f em dólar.\n", vdolar);
     scanner.close();
    }
}