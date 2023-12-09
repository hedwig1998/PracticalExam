package PracticalExam1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(2000, 10);
        double interest = bank.calculateInterest();
        System.out.println("Lãi được tính: " + interest + "$");
    }
}
