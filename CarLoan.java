/*
In this project, I write a program that will calculate the monthly car payment
a user should expect to make after taking out a car loan. 
*/
package bwilliams512.carloan;

public class CarLoan {
    public static void main(String[] args) {
                int carLoan = 10000;
        // represent a loan length in years
        int loanLength = 3;
        // represent an interest rate percentage 
        int interestRate = 5;
        // represent the down payment
        int downPayment = 2000;

        // build some requirements that would prevent a buyer from taking out an invalid car loan
        if (loanLength <= 0 || interestRate <= 0) {
            
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            // convert loan lenth from years to months 
            int months = loanLength * 12;
            // represent the monthly payment without interest
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}
    
