import java.util.Scanner;

public class OutrosTopicosBasicosdeJava {
    public static void main(String[] args) { //TODA CLASSE EXECUTÁVEL PRECISA NECESSARIAMENTE DE UMA MAIN
        Scanner sc = new Scanner(System.in);
        /*
        Restrições para nomes de variáveis
            • Não pode começar com dígito: use uma letra ou _
            • Não usar acentos ou til
            • Não pode ter espaço em branco
            • Sugestão: use nomes que tenham um significado

        Convenções
            • Camel Case: lastName
                • pacotes
                • atributos
                • métodos
                • variáveis e parâmetros
            • Pascal Case: ProductService
                • classes
         */

        //Operadores bitwise
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2); //24: Operação "E" bit a bit
        System.out.println(n1 | n2); //125: Operação "OU" bit a bit
        System.out.println(n1 ^ n2); //121: Operação "OU-exclusivo" bit a bit

        /*
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }
        sc.close();
        */

         /*
        Checklist
            • Formatar: toLowerCase(), toUpperCase(), trim()
            • Recortar: substring(inicio), substring(inicio, fim)
            • Substituir: Replace(char, char), Replace(string, string)
            • Buscar: IndexOf, LastIndexOf
            • str.Split(" ")
          */

        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); //remover espaços
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        System.out.println("A primeira palavra é: " + word1); //A primeira palavra é: potato
        String word2 = vect[1];
        System.out.println("A segunda palavra é: " + word2); //A segunda palavra é: apple
        String word3 = vect[2];
        System.out.println("A terceira palavra é: " + word3); //A terceira palavra é: lemon

        /*
        //Comentários em Java (básico)
        double a1, b1, c1, delta;
        System.out.println("Digite os valores dos coeficientes:");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();
        delta = b1 * b1 - 4 * a1 * c1; // cálculo do valor de delta
        */

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }
        sc.close();

        int higher = max(a, b, c); //criou uma funçao pra trazer o valor máximo
        showResult(higher);
        sc.close();
    } //FECHANDO A FUNÇÃO MAIN

    public static int max(int x, int y, int z) { //PUBLIC: fica disponível em outras classes e static: função pode ser chamada
        //independente de criar um objeto
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}