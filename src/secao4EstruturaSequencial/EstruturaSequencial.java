import java.util.Locale;
import java.util.Scanner;
import static java.util.Locale.*;

public class EstruturaSequencial {
    public static void main(String[] args) {
        int idade = 25;
        double x = 10.35784;
        System.out.println("Hello world!");
        System.out.println(idade); //25
        System.out.printf("%.2f%n",x); //10,36
        Locale.setDefault(US);
        System.out.printf("%.4f%n",x); //10.3578
        System.out.println("Sua idade é " + idade); //Sua idade é 25
        System.out.printf("Resultado = %.2f metros%n",x); //Resultado = 10.36 metros

        String nome = "Maria";
        int idade2 = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade2, renda); //Maria tem 31 anos e ganha R$ 4000.00 reais
        //%f ponto flutuante
        //%d inteiro
        //%s texto
        //%n quebra linha

        int x1;
        double y1;
        x1 = 5;
        y1 = 2*x1;
        System.out.println("O valor de x é " + x1); //O valor de x é 5
        System.out.println("O valor de y é " + y1); //O valor de y é 10.0

        double b,B,h,area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println("A área é " + area); //A área é 35.0

        int a1,b1;
        double resultado;
        a1 = 5;
        b1 = 2;
        resultado = a1 / b1;
        System.out.println("O resultado é " + resultado); //O resultado é 2.0

        double a2 ;
        int b2;
        a2 = 5.0;
        b2 = (int) a2;
        System.out.println("Casting: trocando o tipo da variável " + b2); //Casting: trocando o tipo da variável 6.0

        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(US);
        /*
        System.out.println("Digite um número inteiro");
        int digitar;
        digitar = sc.nextInt();
        System.out.println("Você digitou " + digitar);
        */

        /*
        System.out.println("Digite um número double");
        double digitar2;
        digitar2 = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", digitar2);
        */

        /*
        System.out.println("Digite apenas UMA letra");
        char digitar3;
        digitar3 = sc.next().charAt(0);
        System.out.println("Você digitou " + digitar3);
        */

        /*
        String digitar4;
        int digitar5;
        double digitar6;
        System.out.println("Digite um nome");
        digitar4 = sc.next(); //Só da pra escrever um nome
        System.out.println("Digite um número");
        digitar5 = sc.nextInt();
        System.out.println("Digite um número do tipo double");
        digitar6 = sc.nextDouble();
        System.out.println("Nome digitado " + digitar4  + "\nNúmero digitado " + digitar5
                + "\nDouble digitado " + digitar6);
        sc.close();
        */

        /*
        System.out.println("Digite um número inteiro");
        int x4;
        String s1, s2, s3;
        x4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite textos e coloque enter quando finalizar cada frase");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Os dados digitados foram:");
        System.out.println(x4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
        */

        double x2 = 3.0;
        double y2 = 4.0;
        double z2 = -5.0;
        double A, B2, C;

        A = Math.sqrt(x2);
        B2 = Math.sqrt(y2);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x2 + " = " + A);
        System.out.println("Raiz quadrada de " + y2 + " = " + B2);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x2,y2);
        B2 = Math.pow(x2,2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y2 + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B2);
        System.out.println(" 5 elevado ao quadrado = " + C);

        A = Math.abs(y2);
        B2 = Math.abs(z2);
        System.out.println("O valor absoluto de " + y2 + " = " + A);
        System.out.println("O valor absoluto de " + y2 + " = " + B2);
    }
}