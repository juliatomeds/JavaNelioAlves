package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //se a regra de depósito mudar não precisa trocar aqui tbm, então encapsula um ponto
    }

    //quando o balance é zero
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    /* O NÚMERO DA CONTA NÃO PODE SER APAGADO
    public void setNumber(int number) {
        this.number = number;
    }
    */

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    /* O BALANCE SÓ PODE SER ALTERADO POR SAQUE OU DEPÓSITO
    public void setBalance(double balance) {
        this.balance = balance;
    }
    */

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    //JÁ RETORNA ISSO AUTOMATICAMENTE QUANDO CHAMA O OBJETO ACCOUNT
    public String toString() { //sobreposição
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
