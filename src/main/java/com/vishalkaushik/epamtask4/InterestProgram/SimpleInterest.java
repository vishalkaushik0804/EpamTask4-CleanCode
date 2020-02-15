package com.vishalkaushik.epamtask4.InterestProgram;

public class SimpleInterest {

    private double principle;
    private double rate;
    private int time;

    public SimpleInterest(double principle, double rate, int time){
        this.principle=principle;
        this.rate=rate;
        this.time=time;
    }

    public double getSimpleInterest(){
        return (principle*rate*time)/100;
    }
}    

