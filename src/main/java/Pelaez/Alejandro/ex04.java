/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args)
    {
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input.next();
        System.out.print("Enter a adjective: ");
        String adj = input.next();
        System.out.print("Enter a adverb: ");
        String adverb = input.next();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!%n", verb, adj, noun, adverb);
    }
}
