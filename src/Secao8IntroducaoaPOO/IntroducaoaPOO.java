import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class IntroducaoaPOO {
    public static final double PI = 3.14159; //Padrão de nome pra constante é letra maíscula

    public static void main(String[] args) { //O método main por padrão é estático, e não pode chamar um método que não
        // é estático em um método estático

        /*
        Classe
        • É um tipo estruturado que pode conter (membros):
            • Atributos (dados / campos)
            • Métodos (funções / operações)
        • A classe também pode prover muitos outros recursos, tais como:
            • Construtores
            • Sobrecarga
            • Encapsulamento
            • Herança
            • Polimorfismo
        • Exemplos:
            • Entidades: Produto, Cliente, Triangulo
            • Serviços: ProdutoService, ClienteService, EmailService, StorageService
            • Controladores: ProdutoController, ClienteController
            • Utilitários: Calculadora, Compactador
            • Outros (views, repositórios, gerenciadores, etc.)
         */

        /*
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //double xA, xB, xC, yA, yB, yC;
        Triangle x,y; //nomeando duas classes
        x = new Triangle(); //instanciar o objeto
        y = new Triangle(); //instanciar o objeto

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        // xA = sc.nextDouble();
        // xB = sc.nextDouble();
        // xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        // yA = sc.nextDouble();
        // yB = sc.nextDouble();
        // yC = sc.nextDouble();

        //double p = (xA + xB + xC) / 2.0;
        //double p = (x.a + x.b + x.c) / 2.0;

        //double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        //double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        //p = (yA + yB + yC) / 2.0;
        //p = (y.a + y.b + y.c) / 2.0;

        //double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        //double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
        }
         */
        // -----------------------------------------------------------------------------------------------------------------
        /*
        //COMEÇANDO A RESOLVER UM SEGUNDO PROBLEMA EXEMPLO
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); //instanciar o objeto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println("Product data: " + product + "\n");

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product + "\n");

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product + "\n");
        sc.close();
        */

        // -----------------------------------------------------------------------------------------------------------------
        /*
        Membros estáticos
            • Também chamados membros de classe
                • Em oposição a membros e instância
        • São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados.
        São chamados a partir do próprio nome da classe.
        • Aplicações comuns:
            • Classes utilitárias Por exemplo a classe "Math"
            • Declaração de constantes
        • Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá
         ser instanciada.
         */

        Calculator calc = new Calculator(); //instanciar o objeto
        //como os membros da classe Calculator não são estáticos é obrigado a INSTANCIAR O OBJETO

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //double c = circumference(radius);
        double c = calc.circumference(radius);
        //double c = Calculator.circumference(radius); //SE A CLASSE FOSSE STATIC NÃO PRECISA INSTANCIAR
        //double v = volume(radius);
        double v = calc.volume(radius);
        //double v = Calculator.volume(radius); //SE A CLASSE FOSSE STATIC NÃO PRECISA INSTANCIAR

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        //System.out.printf("PI value: %.2f%n", PI);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}