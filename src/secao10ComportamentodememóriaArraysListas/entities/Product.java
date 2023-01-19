package secao10ComportamentodememóriaArraysListas.entities;

public class Product {

    //botão direito: Generate : Getter and Setter, Constructor

    //public String name; //começa com letra minúscula nome de atributos e métodos
    //public double price;
    //public int quantity;

    /* Encapsulamento
    TRANSFORMANDO DE PUBLIC PRA PRIVATE ?? PQ??
        • É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações
          seguras e que mantenham os objetos em um estado consistente.
     */
    private String name; //começa com letra minúscula nome de atributos e métodos
    private double price;
    private int quantity;

    public Product() {
    }

    //CRIANDO UM CONSTRUTOR
    public Product(String name, double price, int quantity) {
        this.name = name; //this: referencia para o proprio objeto
        this.price = price;
        this.quantity = quantity;
        /* THIS:
            • É uma referência para o próprio objeto
            • Usos comuns:
                • Diferenciar atributos de variáveis locais
                • Passar o próprio objeto como argumento na chamada de um método ou construtor
         */
    }

    /*
    Sobrecarga
        • É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes
        listas de parâmetros
    O exemplo a seguir mostra isso!
     */
    public Product(String name, double price) {
        this.name = name; //this: referencia para o proprio objeto
        this.price = price;
        //this.quantity = 0; //como não tem um atributo aqui que se chama quantity, nao precisa colocar um this aqui
        //Alem disso o zero é inicializado automaticamente, não precisa ter essa informação
    }

    //ENCAPSULAMENTO ---------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    // FIM ENCAPSULAMENTO ----------------------------------------------------------------------------------------------
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) { //isso nao é o atributo da classe, é um parâmetro da função
        this.quantity += quantity; //por isso que coloca o this. pois é um argumento da classe, nao o "public int quantity;"
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() { //sobreposição
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
