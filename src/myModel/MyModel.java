package myModel;

public class MyModel {
    public static void main(String[] args) {

        //adding Supply Constraints...
        for (int i = 0; i < supplyLocations.length; i++) {
            double[] coefficients = new double[supplyLocations.length * demandLocations.length];
            coefficients[i * demandLocations.length] = 1;
            constraints.addConstraint(new LinearConstraint(coefficients, Relationship.LEQ, supplyCapacities[i]));
        }
    }
}
