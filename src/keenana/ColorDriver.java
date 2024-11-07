/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 10
 * Name: Andrew Keenan
 * Created: 11-1-23
 */
package src.keenana;

import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * driver to print out the different numbers
 */
public class ColorDriver {
    /**
     * validaes that a number is a number
     * @param num String that is entered
     * @return wether it is a number or not
     */
    public static boolean validate(String num){
        boolean number = true;
        for (int i = 0; i < num.length(); i++){
            char index = num.charAt(i);
            if (!isDigit(index)){
                number = false;
            }
        }
        return number;
    }

    /**
     * displays the numbers in the correct color
     * @param num the number the user enters
     */
    public static void display(int num){
        final int decimal = 10;
        final int binary = 2;
        final int hex = 16;
        System.out.println(Color.BLUE.color+"Decimal: "+Integer.toString(num, decimal));
        System.out.println(Color.RED.color+"Hexadecimal: "+Integer.toString(num, hex));
        System.out.println(Color.GREEN.color+"Binary: "+Integer.toString(num, binary));
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome ot the number converter 3000");
        System.out.println("given a decimal number it will convert it to hexadecimal and ibnary");
        System.out.println(Color.BLUE.color+"Decimal will be in blue");
        System.out.println(Color.RED.color+"Hexadecimal is in red");
        System.out.println(Color.GREEN.color+"Binary is green");
        do {
            boolean valid = false;
            String num;
            do {
                System.out.println(Color.RESET.color + "Please enter a number to convert (or q to quit): ");
                num = scan.next();
                valid = validate(num);
            } while (!valid && !num.equals("q"));
            if (num.equals("q")){
                exit = true;
            } else {
                display(Integer.parseInt(num));
            }
        } while (!exit);
        System.out.println("Qutting have a nice day!");
    }
}
