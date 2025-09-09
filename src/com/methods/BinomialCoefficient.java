package com.methods;

public class BinomialCoefficient {
    public static void main(String[] args) {
        var n = 5;
        var r = 2;

        System.out.println(binomialCoefficient(n, r));
    }

    public static double binomialCoefficient(int n, int r) {
        int n_fact = FactorialOfNumber.factorialOfNumber(n);
        int r_fact = FactorialOfNumber.factorialOfNumber(r);

        int n_minus_r = FactorialOfNumber.factorialOfNumber(n - r);

        return (double) n_fact / (r_fact * n_minus_r);
    }

}
