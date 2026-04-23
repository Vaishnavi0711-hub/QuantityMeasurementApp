/**
 * QuantityMeasurementApp
 * UC2: Feet and Inches Equality Check
 */

class Feet {
    private double value;

    public Feet(double value) {
        this.value = value;
    }

    public boolean equals(Feet other) {
        return this.value == other.value;
    }
}

class Inches {
    private double value;

    public Inches(double value) {
        this.value = value;
    }

    public boolean equals(Inches other) {
        return this.value == other.value;
    }
}

public class QuantityMeasurementApp {

    public static boolean compareFeet(double value1, double value2) {
        Feet f1 = new Feet(value1);
        Feet f2 = new Feet(value2);
        return f1.equals(f2);
    }

    public static boolean compareInches(double value1, double value2) {
        Inches i1 = new Inches(value1);
        Inches i2 = new Inches(value2);
        return i1.equals(i2);
    }

    public static void main(String[] args) {

        double feet1 = 5.0;
        double feet2 = 5.0;

        double inch1 = 12.0;
        double inch2 = 12.0;

        boolean feetResult = compareFeet(feet1, feet2);
        boolean inchResult = compareInches(inch1, inch2);

        System.out.println("Feet equal? " + feetResult);
        System.out.println("Inches equal? " + inchResult);
    }
}