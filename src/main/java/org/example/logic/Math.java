package org.example.logic;

public class Math {
    public double stringToAction(String valOne, String valTwo, char operator) {
        double dOne = Double.parseDouble(valOne);
        double dTwo = Double.parseDouble(valTwo);

        switch (operator) {
            case '+':
                return add(dOne, dTwo);
            case '-':
                return sub(dOne, dTwo);
            case '/':
                return div(dOne, dTwo);
            case 'x':
                return mul(dOne, dTwo);
        }
        return -0;
    }

    public double add(double valOne, double valTwo) {
        return valOne + valTwo;
    }

    public double sub(double valOne, double valTwo) {
        return valOne - valTwo;
    }

    public double div(double valOne, double valTwo) {
        return valOne / valTwo;
    }

    public double mul(double valOne, double valTwo) {
        return valOne * valTwo;
    }

    public double sqr(double val){
        return java.lang.Math.sqrt(val);
    }

}
