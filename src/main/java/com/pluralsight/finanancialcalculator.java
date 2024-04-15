package com.pluralsight;
import java.util.Scanner;
public class finanancialcalculator {
    public static void main(String[] args) {
        final int monthsINYear = 12;

        Scanner scanner = new Scanner(System.in);





        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the current interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the term in years: ");
        int monthlyLoanlength = scanner.nextInt();

        // monthly payment

        double compoundInterst =  principal * math.pow(interestRate * (1 + interestRate));

        (interestRate * Math.pow((1+interestRate),monthlyLoanlength))
        /  (Math.pow(1+ interestRate, monthlyLoanlength));


        System.out.printf("Total Monthly Payment: %2f", monthlyPayments);



    }


    /**
     * the deposit data double
     *
     *
     * else if (calcType == 2) {
     *
     *
     *     System.out.println("This is your CD calculator");
     *     System.out.print("");
     *
     *     double deposti = scanner.nextDouble();
     *
     *     System.out.print("please enter your interst rate: ");
     *     double cdInterestRate = scannner.nextdouble(O;
     *
     *     System.out.print();
     *
     *     cdInterestRate /= 100;
     * double futureValue = Math.pow((1 + InterestRate), yearsToMature);
     * double endingBalance = deposit * futrureValue;
     *
     * double earnedInterest = endingBalance - deposit;
     *
     * System.out.printf("Our future value: %.2f with a earned interest of: %.2f, endingBalance , )
     * }
     * */
}
