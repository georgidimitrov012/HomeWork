package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        System.out.println("First exercise:");
        calcAvg(1,2,3);
        System.out.println("Second exercise:");
        annualPayment(10.51);
        System.out.println("Third exercise:");
        monthlyPayment(120, 10);

    }
    public static void calcAvg(double firstNum, double secNum, double thirdNum){
        double calcAvg = (firstNum + secNum + thirdNum) / 3;
        System.out.println("The average of " + firstNum + ", " + secNum + " and " + thirdNum + " is " + calcAvg);
    }

    public static void annualPayment(double monthlyPayment){
        double annualPayment = monthlyPayment * 12;
        System.out.println("The annual payment will be " + annualPayment);
    }

    public static void monthlyPayment(double amount, int months){
        double perMonth = amount / months;
        System.out.println("The monthly payment will be " + perMonth);
        double interest = amount * 0.07 * months;
        System.out.println("The interest will be " + interest);
        double totalReturned = amount + interest;
        System.out.println("The total returned amount for the period will be " + totalReturned);
    }

}