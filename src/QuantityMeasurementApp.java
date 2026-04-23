/**
 * QuantityMeasurementApp
 * UC3: Generic Quantity Length (DRY Principle)
 */

class Quantity {

    private double value;
    private String unit;

    // Conversion constants
    private static final double FEET_TO_INCH = 12.0;

    public Quantity(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert everything to a common unit (inches)
    private double toInches() {
        if (unit.equalsIgnoreCase("feet")) {
            return value * FEET_TO_INCH;
        } else if (unit.equalsIgnoreCase("inch")) {
            return value;
        }
        throw new IllegalArgumentException("Invalid unit");
    }

    public boolean equals(Quantity other) {
        return this.toInches() == other.toInches();
    }
}

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1, "feet");
        Quantity q2 = new Quantity(12, "inch");

        boolean result = q1.equals(q2);

        System.out.println("Are quantities equal? " + result);
    }
}