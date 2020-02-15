package com.vishalkaushik.epamtask4.InterestProgram;

public class CompoundInterest {

    private double principleAmount;
    private double interestRate;
    private int timeOfInvestment;
    private int numberOfTimesInterestApplied;

    public CompoundInterest(double principle, double rate, int time, int n) {
        this.principleAmount = principle;
        this.interestRate = rate;
        this.timeOfInvestment = time;
        this.numberOfTimesInterestApplied = n;
    }

    public double getCompoundInterest() {
        double amount = principleAmount * (Math.pow(1 + interestRate / numberOfTimesInterestApplied, numberOfTimesInterestApplied * timeOfInvestment));
        double compoundInterest = amount- principleAmount;
        return compoundInterest;
    }

}
