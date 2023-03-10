package Secao14HerancaPolimorfismo;

import Secao14HerancaPolimorfismo.entities.ImportedProduct14;
import Secao14HerancaPolimorfismo.entities.Product14;
import Secao14HerancaPolimorfismo.entities.UsedProduct14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Secao14_ExercicioResolvido3 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product14> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'c') {
                list.add(new Product14(name, price));
            }
            else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct14(name, price, date));
            }
            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct14(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product14 prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
