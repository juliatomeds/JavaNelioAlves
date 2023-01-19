import java.util.Locale;
import java.util.Scanner;
import static java.util.Locale.US;

public class EstruturaCondicional {
    public static void main(String[] args) {

        /*
        int hora;
        System.out.println("Que horas são");
        hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("Boa dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        //ou colocava dessa forma:
        else { //hora >=12
            if (hora < 18){
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }
        */

        /*
        Operadores de atribuição cumulativa
        a += b;    a = a + b;
        a i= b;    a = a - b;
        a *= b;    a = a * b;
        a /= b;    a = a / b;
        a %= b;    a = a % b;
         */

        System.out.printf("Escreva um número");
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(US);

        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            //conta = conta + (minutos - 100)*2.0;
            conta+=(minutos - 100)*2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        int x = sc.nextInt();
        System.out.println("Digite um número de 1 a 7");
        String dia;
        if (x == 1){
            dia = "domingo";
        } else if ( x == 2) {
            dia = "segunda";
        } else if ( x == 3) {
            dia = "terça";
        } else if ( x == 4) {
            dia = "quarta";
        } else if ( x == 5) {
            dia = "quinta";
        } else if ( x == 6) {
            dia = "sexta";
        } else if ( x == 7) {
            dia = "sábado";
        } else if ( x == 8) {
            dia = "domingo";
        } else {
            dia = "valor inválido";
        }

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);

        //Expressão conficional tenária:
        //Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma confição
        //Sintaxe: ( confição ) ? valor_se_verdadeiro : valor_se_falso

        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }

        double desconto2 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        /*
        todas as variaveis que existirem dentro de uma estrutura, mesmo que if, elas existem apenas naquele lugar
        e fora ela é inexistente como o exemplo a seguir
        double price = sc.nextDouble();
        if (price > 100.0) {
            double discount = price * 0.1;
        }
        System.out.println(discount); // retorna um erro, pois ela existe apenas dentro do if,


        // retorna um erro: a variavel loval pode nao ter sido inicializada
        double price = sc.nextDouble();
        double discount;
        if (price > 100.0) {
            discount = price * 0.1;
        }
        System.out.println(discount);

        // inicializar uma variavel com um valor pra nao retornar os erros anteriores
        double price = sc.nextDouble();
        double discount = 0;
        if (price > 100.0) {
            discount = price * 0.1;
        }
        System.out.println(discount);

        // para ter uma garantia de que ela vai ser iniciada, faz o seguinte:
        double price = sc.nextDouble();
        double discount;
        if (price > 100.0) {
            discount = price * 0.1;
        } else {
            discount = 0;
        }
        System.out.println(discount);
         */

    }
}
