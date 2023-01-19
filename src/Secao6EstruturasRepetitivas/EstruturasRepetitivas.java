import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepetitivas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*

        System.out.println("escreva a largura: ");
        double largura = sc.nextDouble();

        System.out.println("escreva a comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.println("escreva a metroQuadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();
         /*

         */
        System.out.println("Escreva um número! E quando não quiser mais escreva zero");
        int x = sc.nextInt();
        int soma = 0;
        while  ( x!= 0){
            soma += x;
            x = sc.nextInt();
        }

        //Contagem regressiva  for ( início; condição ; incremento)
        for (int i=4; i>=0; i--) {
            System.out.println("Valor de i: " + i);
        }

        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }

        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}