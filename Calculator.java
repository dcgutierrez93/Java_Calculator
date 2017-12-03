// Create a public class Calculator
public class Calculator {
    // Create constructor.
    public Calculator() {

    }
    // Create add method
    public int add(int a, int b) {
        return a + b;
    }
    // Create subtract method.
    public int subtract(int a, int b) {
        return a - b;
    }
    // Create a multiply method.
    public int multiply(int a, int b) {
        return a * b;
    }
    // Create a divide method.
    public int divide(int a, int b) {
        // Check error do see if dividing by 0
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return a / b;
        }
    }
    // Create a modulo method.
    public int modulo(int a, int b) {
        // Check error to see if modulo by 0
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return a % b;
        }
    }

    public static void main(String[] args) {
        // Create a Calculator object called myCalculator
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}
