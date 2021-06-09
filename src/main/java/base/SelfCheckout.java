package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ann Binus

* Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

* Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

* Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

* Challenges
Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class SelfCheckout {

    public static double subtotal (double item, double quatity){

        return item*quatity;
    }

    public static void output(double subtotal, double rate){

        double tax = (rate/100*subtotal);
        System.out.println("Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + (tax+subtotal));
    }

    public static void main(String[] args) {

        double subtotal = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of the item 1: ");
        double item1 = scan.nextInt();

        System.out.print("Enter th quatity of item 1: ");
        double quatity1 = scan.nextInt();

        subtotal += subtotal(item1, quatity1);

        System.out.print("Enter the price of the item 2: ");
        double item2 = scan.nextInt();

        System.out.print("Enter th quatity of item 2: ");
        double quatity2 = scan.nextInt();

        subtotal += subtotal(item2, quatity2);

        System.out.print("Enter the price of the item 3: ");
        double item3 = scan.nextInt();

        System.out.print("Enter th quatity of item 3: ");
        double quatity3 = scan.nextInt();

        subtotal += subtotal(item3, quatity3);

        output(subtotal, 5.5);
    }
}
