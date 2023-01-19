import entities.Product;
import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ComportamentodememóriaArraysListas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Indique a quantidade de produtos: ");
        int n = sc.nextInt();

        //double[] vect = new double[n];
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) { //for (int i=0; i<n; i++)
            sc.nextLine(); //apenas pulando uma linha
            System.out.print("Qual o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Qual o preço desse produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            //vect[i] = sc.nextDouble(); OU FAZIA DESSA FORMA
        }

        double sum = 0.0;

        for (int i=0; i<vect.length; i++) { //for (int i=0; i<n; i++)
            sum += vect[i].getPrice();
            //sum += vect[i]; OU FAZIA DESSA FORMA
        }

        //double avg = sum / n;
        double avg = sum / vect.length;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
         */

        //EXERCICIO DE FIXAÇÃO -----------------------------------------------------------------------------------------
        /*
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Os número negativos são: ");
        for (int i = 0; i<n; i++){
            if (vet[i]<0){
                System.out.println(vet[i]);
            }
        }
        */

        //EXERCICIO DE FIXAÇÃO -----------------------------------------------------------------------------------------
        /*
        System.out.print("Quantos pessoas serão inseridas no sistema? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        double soma = 0.0;

        for (int i = 0; i<n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++){
            soma += alturas[i];
        }

        double mediaAlturas = soma/n;
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int contador = 0;
        for (int i =0;i<n;i++) {
            if (idades[i] < 16 ) {
                contador =+ 1;
            }
        }
        double percent = contador * 100.0/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        */
        //EXERCICIO DE FIXAÇÃO -----------------------------------------------------------------------------------------
        /*
        Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("\n" + "Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.println("\n" + "Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
         */
        //Boxing, unboxing e wrapper classes----------------------------------------------------------------------------



        sc.close();
    }
}
