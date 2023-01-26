// Name of programmer: Angel Alvarez
// Name of program: Hello World
// Date started: 1/26/2023
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        // Variable declaration section.
        String userName = "";
        String greeting = "";
        Scanner userInput = new Scanner(System.in);
        // Input: get user name
        System.out.println("\nHi there! What is yor name? ");
        userName = userInput.nextLine();
        userInput.close();
        // Processing: Create a greeting
        greeting = "Hello " + userName + ", I hope you have a wonderful day!";
        // Output:
        System.out.println("\n" + greeting + "\n");

    }
}