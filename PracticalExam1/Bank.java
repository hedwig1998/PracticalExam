package PracticalExam1;

public class Bank {
    private double balance;
    private double annualInterestRate;
    public Bank(double balance, double annualInterestRate){
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public double calculateInterest(){
        double interest;
        interest = balance * (annualInterestRate / 1200);
        return interest;
    }
}
