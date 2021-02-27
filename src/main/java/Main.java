import java.util.Scanner;

public class Main {

    private static final Calculator calculator = new Calculator();
    public static void main(String[] args) {
        System.out.println("welcome to the calculator");
        System.out.println("enter command:");
        
        while (true) {
            Scanner scanner = new Scanner(System.in);
    
            String[] command = scanner.nextLine().split(" ");
            String operation = command[0];
            String arg1 = command[1];
            String arg2 = "";
    
            if (command.length == 3) {
                arg2 = command[2];
            }
            
            String output = "";

            switch (operation) {
                case "add":
                    output = String.valueOf(calculator.add(Integer.parseInt(arg1), Integer.parseInt(arg2)));
                    break;
                case "subtract":
                    output = String.valueOf(calculator.subtract(Integer.parseInt(arg1), Integer.parseInt(arg2)));
                    break;
                case "multiply":
                    output = String.valueOf(calculator.multiply(Integer.parseInt(arg1), Integer.parseInt(arg2)));
                    break;
                case "divide":
                    output = String.valueOf(calculator.divide(Integer.parseInt(arg1), Integer.parseInt(arg2)));
                    break;
                case "fibonacci":
                    output = String.valueOf(calculator.fibonacciNumberFinder(Integer.parseInt(arg1)));
                    break;
                case "binary":
                    output = calculator.intToBinaryNumber(Integer.parseInt(arg1));
                    break;
                default:
                    output = "Error.";
                    break;
            }

            System.out.println(output);
            
        }
    }

    
}
