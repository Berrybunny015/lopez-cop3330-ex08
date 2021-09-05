package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nHow many people? "); //output #1
        Scanner numPeopleInput = new Scanner(System.in); //scan for number of people
        int numPeople = numPeopleInput.nextInt();

        System.out.println("\nHow many pizzas do you have? "); //output #2
        Scanner numPizzasInput = new Scanner(System.in); //scan for number of pizzas
        int numPizzas = numPizzasInput.nextInt();

        System.out.println("\nHow many slices per pizza? "); //output #3
        Scanner numSlicesInput = new Scanner(System.in); //scan for number of slices per pizza
        int numSlices = numSlicesInput.nextInt();

        int totalNumSlices = numPizzas * numSlices; //calculate the total number of slices

        System.out.println("\n" + numPeople + " people with " + numPizzas + " pizzas (" + totalNumSlices + " slices)"); //output #4

        int pizzaQuotient = totalNumSlices / numPeople; //calculate how many slices per person

        System.out.println("Each person gets " + pizzaQuotient + " pieces of pizza."); //output #5

        int pizzaRemainder = totalNumSlices % numPeople; //calculate how many remaining slices of pizza

        System.out.println("There are " + pizzaRemainder + " leftover pieces."); //output #6

    }
}
