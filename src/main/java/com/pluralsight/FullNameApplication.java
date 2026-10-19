package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hello there!");

//        Setting the variables to read what is returned from the other methods.
        String firstName = firstName(read);
        String middleName = middleName(read);
        String lastName = lastName(read);
        String suffix = suffix(read);
        String fullName; // purposely left this blank so that it can be adjusted in the conditionals.

//        This if statement is to determine if the user has set a middle name.
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        }
        else {
            fullName = firstName + " " + middleName + " " + lastName;
        }

//        This if statement checks for suffix
        if (suffix.isEmpty()) {
            fullName = fullName;
        }
        else {
            fullName = fullName + " " + suffix;
        }

        System.out.printf("Good afternoon %s", fullName);
    }

//    Checking on the users first name
    public static String firstName(Scanner read) {
        System.out.println("What is your first name?");
        String firstName = read.nextLine();
        firstName = firstName.trim();
        return firstName;
    }

//    Checking the users Last name
    public static String lastName(Scanner read) {
        System.out.println("What is your last name?");
        String lastName = read.nextLine();
        lastName = lastName.trim();
        return lastName;
    }

//    Checking for users middle name
    public static String middleName(Scanner read) {
        System.out.println("What is your middle name?");
        String middleName = read.nextLine();
        middleName = middleName.trim();
        return middleName;
    }

//    Checking for suffix
    public static String suffix(Scanner read) {
        System.out.println("What suffix do you have?");
        String suffix = read.nextLine();
        suffix = suffix.trim();
        return suffix;
    }

}
