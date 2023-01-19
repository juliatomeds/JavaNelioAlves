import entities.Account;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ConstrutoresThisSobrecargaEncapsulamento {
    /*
    Construtor
    • É uma operação especial da classe, que executa no momento da instanciação do objeto
    • Usos comuns:
        • Iniciar valores dos atributos
        • Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
    • Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
        Product p = new Product();
    • É possível especificar mais de um construtor na mesma classe (sobrecarga)
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        //Product product = new Product(); como foi criado um construtor não precisa mais disso

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        //product.name = sc.nextLine();
        String name2 = sc.nextLine();

        System.out.print("Price: ");
        //product.price = sc.nextDouble();
        double price2 = sc.nextDouble();

        //System.out.print("Quantity in stock: ");
        //product.quantity = sc.nextInt();
        // int quantity2 = sc.nextInt();

        //Product product = new Product(name2,price2,quantity2);
        Product product = new Product(name2,price2); //como tem sobrecarga pode utilizar para escolher qual dos 3 modelos será utilizado

        product.setName("Computer");
        System.out.println("Product data: " + product.getName()  + "\n");
        product.setPrice(1200.00);
        System.out.println("Product data: " + product.getPrice()  + "\n");
        System.out.println("Product data: " + product.getPrice()  + "\n");

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product + "\n");

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
     */
        // EXERCÍCIO DE FIXAÇÃO --------------------------------------------------------------------------------------------
        Account account; //inicializo antes pra nao ser local do if

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n) ? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            //Account account = new Account(number,holder,initialDeposit); // não pode declarar ela dentro se não ela fica local do if
            account = new Account(number,holder,initialDeposit);
        }
        else {
            account = new Account(number,holder);
        }
        System.out.println("\n" + "Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value:  ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        sc.close();
    }
}