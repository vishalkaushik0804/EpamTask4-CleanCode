package com.vishalkaushik.epamtask4.InterestProgram;

import java.util.Scanner;

public class InterestApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = 0;
        double rate = 0;
        int time = 0;
        int numberOfTimesInterestApplied = 0;

        System.out.println("Enter the Principle Amount : ");
        principle = sc.nextDouble();
        System.out.println("Enter the Rate of Interest : ");
        rate = sc.nextDouble();
        System.out.println("Enter the Time period : ");
        time = sc.nextInt();
        System.out.println("Enter the number Of Times Interest Applied per time period: ");
        numberOfTimesInterestApplied = sc.nextInt();

        SimpleInterest sInterest = new SimpleInterest(principle, rate, time);
        CompoundInterest cInterest = new CompoundInterest(principle, rate, time, numberOfTimesInterestApplied);
        System.out.println("Simple Interest : " + sInterest.getSimpleInterest());
        System.out.println("Compound Interest : " + cInterest.getCompoundInterest());
    }
}
